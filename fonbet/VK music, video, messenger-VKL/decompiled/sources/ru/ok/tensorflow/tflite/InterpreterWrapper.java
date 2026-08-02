package ru.ok.tensorflow.tflite;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.tensorflow.tflite.InterpreterWrapper;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.async.ConditionLock;
import xsna.he6;
import xsna.m52;
import xsna.u8p;

/* loaded from: classes9.dex */
public class InterpreterWrapper implements Closeable {
    private SimpleGLProgram copyProgram;
    private GlThreadWithSharedContext glThread;
    private final WeakReference<ExceptionHandler> initErrorHandler;
    private volatile ContextedInterpreter interpreter;
    private InterpreterGPU interpreterGPU;
    private volatile Util.DelegateType lastDelegateType;
    private volatile ByteBuffer lastModelBuffer;
    private volatile int lastNumThread;
    private String modelHash;
    private final WeakReference<ExceptionHandler> runtimeErrorHandler;
    private volatile boolean triedFallback;
    private boolean useGPUPass;
    protected final Object lock = new Object();
    private final Object interpreterLock = new Object();
    private final AtomicReference<Future<?>> reinitFutureRef = new AtomicReference<>();
    private boolean createdGPU = false;
    private String TAG = "InterpreterWrapper";
    private volatile boolean initAfterCreate = false;
    private boolean forceUseGLBuffers = false;
    private int GPU_CACHE_VERSION = 1;
    private boolean usingGpuCache = false;
    private boolean useCPUPass = false;
    private volatile boolean closed = false;

    public interface Consumer<T> {
        void consume(T t);
    }

    public static class ContextedInterpreter {
        private static final Semaphore GPU_SEMAPHORE = new Semaphore(1);
        private volatile org.tensorflow.lite.a interpreter;
        private final ExecutorService interpreterThread;
        private final Object lock;

        private ContextedInterpreter() {
            this.interpreterThread = Executors.newSingleThreadExecutor();
            this.lock = new Object();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$close$2() {
            this.interpreter.close();
            this.interpreter = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$execute$1(Consumer consumer, Consumer consumer2) {
            synchronized (this.lock) {
                try {
                    consumer.consume(this.interpreter);
                } finally {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$init$0(Util.DelegateType delegateType, ByteBuffer byteBuffer, int i, Runnable runnable, Consumer consumer) {
            org.tensorflow.lite.a createInterpreter;
            try {
                try {
                    Util.DelegateType delegateType2 = Util.DelegateType.GPU;
                    if (delegateType == delegateType2) {
                        GPU_SEMAPHORE.acquire();
                    }
                    synchronized (byteBuffer) {
                        byteBuffer.rewind();
                        createInterpreter = Util.createInterpreter(byteBuffer, i, delegateType);
                    }
                    synchronized (this.lock) {
                        this.interpreter = createInterpreter;
                    }
                    runnable.run();
                    if (delegateType == delegateType2) {
                        GPU_SEMAPHORE.release();
                    }
                } catch (Exception e) {
                    consumer.consume(e);
                    if (delegateType == Util.DelegateType.GPU) {
                        GPU_SEMAPHORE.release();
                    }
                }
            } catch (Throwable th) {
                if (delegateType == Util.DelegateType.GPU) {
                    GPU_SEMAPHORE.release();
                }
                throw th;
            }
        }

        public void close() {
            synchronized (this.lock) {
                if (this.interpreter != null) {
                    this.interpreterThread.submit(new Runnable() { // from class: ru.ok.tensorflow.tflite.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterpreterWrapper.ContextedInterpreter.this.lambda$close$2();
                        }
                    });
                    this.interpreterThread.shutdown();
                    try {
                        this.interpreterThread.awaitTermination(500L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void execute(final Consumer<org.tensorflow.lite.a> consumer, final Consumer<Throwable> consumer2) {
            try {
                this.interpreterThread.submit(new Runnable() { // from class: ru.ok.tensorflow.tflite.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterpreterWrapper.ContextedInterpreter.this.lambda$execute$1(consumer, consumer2);
                    }
                }).get();
            } catch (InterruptedException | ExecutionException | RejectedExecutionException e) {
                e.printStackTrace();
            }
        }

        public Future<?> init(final ByteBuffer byteBuffer, final int i, final Util.DelegateType delegateType, boolean z, final Runnable runnable, final Consumer<Exception> consumer) {
            Future<?> submit = this.interpreterThread.submit(new Runnable() { // from class: ru.ok.tensorflow.tflite.l
                @Override // java.lang.Runnable
                public final void run() {
                    InterpreterWrapper.ContextedInterpreter.this.lambda$init$0(delegateType, byteBuffer, i, runnable, consumer);
                }
            });
            if (z) {
                try {
                    submit.get();
                    return submit;
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
            return submit;
        }
    }

    public static class InitFuture implements Future<Object> {
        private final ConditionLock lock;

        public InitFuture(ConditionLock conditionLock) {
            this.lock = conditionLock;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.concurrent.Future
        public Object get() throws ExecutionException, InterruptedException {
            this.lock.await(true);
            return null;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            throw new UnsupportedOperationException();
        }
    }

    @FunctionalInterface
    public interface RunnableOnGPU {
        void run(SimpleGLProgram simpleGLProgram);
    }

    public InterpreterWrapper(WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2) {
        this.initErrorHandler = weakReference;
        this.runtimeErrorHandler = weakReference2;
    }

    private boolean asyncCallInGLThread(Runnable runnable) {
        GlThreadWithSharedContext glThreadWithSharedContext = this.glThread;
        if (glThreadWithSharedContext == null) {
            return false;
        }
        glThreadWithSharedContext.asyncCall(runnable);
        return true;
    }

    private String getCacheFilename() {
        return this.modelHash + BundleUtil.UNDERLINE_TAG + this.GPU_CACHE_VERSION;
    }

    private ByteBuffer getOpenClCache(GpuCache gpuCache) {
        File file = new File(gpuCache.cacheDir, getCacheFilename());
        if (file.exists()) {
            return Util.readBinFile(file);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$12() {
        this.interpreterGPU.close();
        SimpleGLProgram simpleGLProgram = this.copyProgram;
        if (simpleGLProgram != null) {
            simpleGLProgram.release();
            this.copyProgram = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getInputTensorShape$7(AtomicReference atomicReference, int i, org.tensorflow.lite.a aVar) {
        synchronized (this.lock) {
            atomicReference.set(aVar.b(i).c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getInputTensorShape$8(AtomicReference atomicReference, int i, InterpreterGPU interpreterGPU) {
        synchronized (this.lock) {
            atomicReference.set(interpreterGPU.getInputsDim(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLastNativeInferenceDuration$2(AtomicLong atomicLong, org.tensorflow.lite.a aVar) {
        synchronized (this.lock) {
            atomicLong.set(aVar.m().longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getOutputTensorShape$10(AtomicReference atomicReference, int i, InterpreterGPU interpreterGPU) {
        synchronized (this.lock) {
            atomicReference.set(interpreterGPU.getOutputsDim(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getOutputTensorShape$9(AtomicReference atomicReference, int i, org.tensorflow.lite.a aVar) {
        synchronized (this.lock) {
            atomicReference.set(aVar.n(i).c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(ContextedInterpreter contextedInterpreter, ByteBuffer byteBuffer, int i, Util.DelegateType delegateType, boolean z, GpuCache gpuCache, ConditionLock conditionLock) {
        synchronized (this.interpreterLock) {
            try {
                ContextedInterpreter contextedInterpreter2 = this.interpreter;
                this.interpreter = contextedInterpreter;
                this.lastModelBuffer = byteBuffer;
                this.lastNumThread = i;
                this.lastDelegateType = delegateType;
                this.useGPUPass = z;
                if (contextedInterpreter2 != null) {
                    contextedInterpreter2.close();
                }
                if ((z || this.useCPUPass) && this.interpreterGPU == null) {
                    InterpreterGPU interpreterGPU = new InterpreterGPU();
                    this.interpreterGPU = interpreterGPU;
                    if (interpreterGPU.init(byteBuffer, 1)) {
                        if (gpuCache != null) {
                            this.modelHash = Util.calculateSha1Hash(byteBuffer);
                            ByteBuffer openClCache = getOpenClCache(gpuCache);
                            if (openClCache != null && openClCache.capacity() > 0) {
                                openClCache.capacity();
                                this.interpreterGPU.setOpenCLCache(openClCache);
                                this.usingGpuCache = true;
                                HashSet<String> hashSet = gpuCache.usedFiles;
                                if (hashSet != null) {
                                    hashSet.add(getCacheFilename());
                                }
                            }
                        }
                        if (this.initAfterCreate || this.interpreter == null) {
                            initGPU(gpuCache, null);
                        }
                    } else {
                        this.interpreterGPU.close();
                        this.interpreterGPU = null;
                    }
                }
                conditionLock.set(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Exception exc) {
        ExceptionHandler exceptionHandler = this.initErrorHandler.get();
        if (exceptionHandler != null) {
            exceptionHandler.accept(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPU$13(GpuCache gpuCache) {
        ByteBuffer openCLCache;
        synchronized (this.interpreterLock) {
            try {
                InterpreterGPU interpreterGPU = this.interpreterGPU;
                if (interpreterGPU != null && !this.createdGPU && interpreterGPU.needCreateGpu()) {
                    System.currentTimeMillis();
                    boolean createGpu = this.interpreterGPU.createGpu(this.forceUseGLBuffers, this.useCPUPass);
                    this.createdGPU = createGpu;
                    int i = 0;
                    if (!createGpu && this.usingGpuCache) {
                        this.interpreterGPU.setOpenCLCache(ByteBuffer.allocate(0));
                        this.usingGpuCache = false;
                        this.createdGPU = this.interpreterGPU.createGpu(this.forceUseGLBuffers, this.useCPUPass);
                    }
                    if (this.createdGPU && this.modelHash != null && gpuCache != null && !this.usingGpuCache && (openCLCache = this.interpreterGPU.getOpenCLCache()) != null) {
                        saveOpenClCache(gpuCache, openCLCache);
                        HashSet<String> hashSet = gpuCache.usedFiles;
                        if (hashSet != null) {
                            hashSet.add(getCacheFilename());
                        }
                        i = openCLCache.capacity();
                    }
                    if (i > 0) {
                        StringBuilder sb = new StringBuilder("(cache saved size ");
                        sb.append(i);
                        sb.append(") ");
                    }
                    System.currentTimeMillis();
                }
                if (this.interpreterGPU == null) {
                    this.initAfterCreate = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$run$3(Object obj, Object obj2, org.tensorflow.lite.a aVar) {
        synchronized (this.lock) {
            aVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(0, obj2);
            aVar.o(new Object[]{obj}, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runForMultipleInputsOutputs$4(Object[] objArr, Map map, org.tensorflow.lite.a aVar) {
        synchronized (this.lock) {
            aVar.o(objArr, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runForMultipleInputsOutputs$5(Object[] objArr, Map map) {
        synchronized (this.lock) {
            try {
                InterpreterGPU interpreterGPU = this.interpreterGPU;
                if (interpreterGPU != null) {
                    interpreterGPU.runForMultipleInputsOutputs(objArr, map);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runForMultipleInputsOutputsGPU$6(RunnableOnGPU runnableOnGPU, Object[] objArr, Map map, RunnableOnGPU runnableOnGPU2) {
        synchronized (this.lock) {
            try {
                try {
                    InterpreterGPU interpreterGPU = this.interpreterGPU;
                    if (interpreterGPU != null && !this.createdGPU && interpreterGPU.needCreateGpu()) {
                        this.createdGPU = this.interpreterGPU.createGpu(this.forceUseGLBuffers, this.useCPUPass);
                    }
                    if (runnableOnGPU != null) {
                        if (this.copyProgram == null) {
                            this.copyProgram = new SimpleGLProgram();
                        }
                        runnableOnGPU.run(this.copyProgram);
                    }
                    InterpreterGPU interpreterGPU2 = this.interpreterGPU;
                    if (interpreterGPU2 != null) {
                        interpreterGPU2.runForMultipleInputsOutputs(objArr, map);
                        GlUtil.syncGL();
                    }
                    if (runnableOnGPU2 != null) {
                        if (this.copyProgram == null) {
                            this.copyProgram = new SimpleGLProgram();
                        }
                        runnableOnGPU2.run(this.copyProgram);
                    }
                } catch (Exception e) {
                    Log.e(this.TAG, "Error while running TFL GPU:", e);
                    this.glThread.setReadyRunAsync(false);
                    ExceptionHandler exceptionHandler = this.runtimeErrorHandler.get();
                    if (exceptionHandler != null) {
                        exceptionHandler.accept(e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runTaskSync$11(Throwable th) {
        if (this.lastDelegateType != Util.DelegateType.GPU || this.triedFallback) {
            return;
        }
        this.triedFallback = true;
        this.initErrorHandler.clear();
        this.reinitFutureRef.set(init(this.lastModelBuffer, this.lastNumThread, Util.DelegateType.CPU, false, Util.Api2BufferType.None, null));
    }

    private void runTaskSync(Consumer<org.tensorflow.lite.a> consumer) {
        if (this.reinitFutureRef.get() != null) {
            return;
        }
        synchronized (this.interpreterLock) {
            try {
                if (this.interpreter != null) {
                    this.interpreter.execute(consumer, new Consumer() { // from class: ru.ok.tensorflow.tflite.f
                        @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.Consumer
                        public final void consume(Object obj) {
                            InterpreterWrapper.this.lambda$runTaskSync$11((Throwable) obj);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Future<?> future = this.reinitFutureRef.get();
        if (future != null) {
            try {
                future.get();
            } catch (InterruptedException | ExecutionException unused) {
            } catch (Throwable th2) {
                this.reinitFutureRef.set(null);
                throw th2;
            }
            this.reinitFutureRef.set(null);
        }
    }

    private void saveOpenClCache(GpuCache gpuCache, ByteBuffer byteBuffer) {
        Util.saveBinFile(new File(gpuCache.cacheDir, getCacheFilename()), byteBuffer);
    }

    private void syncCallInGLThread(Runnable runnable) {
        GlThreadWithSharedContext glThreadWithSharedContext = this.glThread;
        if (glThreadWithSharedContext != null) {
            glThreadWithSharedContext.syncCall(runnable);
        }
    }

    private void throwIfClosed() {
        if (this.closed) {
            throw new IllegalStateException("already closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Future<?> future = this.reinitFutureRef.get();
        if (future != null) {
            try {
                future.get(500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        synchronized (this.lock) {
            try {
                throwIfClosed();
                if (this.interpreter != null) {
                    this.interpreter.close();
                    this.interpreter = null;
                }
                if (this.lastModelBuffer != null) {
                    this.lastModelBuffer = null;
                }
                if (this.interpreterGPU != null) {
                    GlThreadWithSharedContext glThreadWithSharedContext = this.glThread;
                    if (glThreadWithSharedContext != null) {
                        glThreadWithSharedContext.forceReleaseCall(new m52(this, 4));
                        this.glThread = null;
                    }
                    this.interpreterGPU = null;
                }
                this.closed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int[] getInputTensorShape(final int i) {
        final AtomicReference atomicReference = new AtomicReference();
        throwIfClosed();
        runTaskSync(new Consumer() { // from class: ru.ok.tensorflow.tflite.i
            @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.Consumer
            public final void consume(Object obj) {
                InterpreterWrapper.this.lambda$getInputTensorShape$7(atomicReference, i, (org.tensorflow.lite.a) obj);
            }
        }, new Consumer() { // from class: ru.ok.tensorflow.tflite.j
            @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.Consumer
            public final void consume(Object obj) {
                InterpreterWrapper.this.lambda$getInputTensorShape$8(atomicReference, i, (InterpreterGPU) obj);
            }
        });
        return (int[]) atomicReference.get();
    }

    public long getLastNativeInferenceDuration() {
        final AtomicLong atomicLong = new AtomicLong();
        throwIfClosed();
        runTaskSync(new Consumer() { // from class: ru.ok.tensorflow.tflite.d
            @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.Consumer
            public final void consume(Object obj) {
                InterpreterWrapper.this.lambda$getLastNativeInferenceDuration$2(atomicLong, (org.tensorflow.lite.a) obj);
            }
        });
        return (long) (atomicLong.get() / 1000000.0d);
    }

    public int[] getOutputTensorShape(final int i) {
        final AtomicReference atomicReference = new AtomicReference();
        throwIfClosed();
        runTaskSync(new Consumer() { // from class: ru.ok.tensorflow.tflite.b
            @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.Consumer
            public final void consume(Object obj) {
                InterpreterWrapper.this.lambda$getOutputTensorShape$9(atomicReference, i, (org.tensorflow.lite.a) obj);
            }
        }, new Consumer() { // from class: ru.ok.tensorflow.tflite.c
            @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.Consumer
            public final void consume(Object obj) {
                InterpreterWrapper.this.lambda$getOutputTensorShape$10(atomicReference, i, (InterpreterGPU) obj);
            }
        });
        return (int[]) atomicReference.get();
    }

    public InitFuture init(final ByteBuffer byteBuffer, final int i, Util.DelegateType delegateType, boolean z, Util.Api2BufferType api2BufferType, final GpuCache gpuCache) {
        boolean z2 = false;
        final ConditionLock conditionLock = new ConditionLock(false);
        final boolean z3 = api2BufferType == Util.Api2BufferType.PassGPU;
        if (!z3 && api2BufferType == Util.Api2BufferType.PassCPU) {
            z2 = true;
        }
        this.useCPUPass = z2;
        Util.DelegateType delegateType2 = (z3 || z2) ? Util.DelegateType.CPU : delegateType;
        final ContextedInterpreter contextedInterpreter = new ContextedInterpreter();
        final Util.DelegateType delegateType3 = delegateType2;
        contextedInterpreter.init(byteBuffer, i, delegateType2, z, new Runnable() { // from class: ru.ok.tensorflow.tflite.a
            @Override // java.lang.Runnable
            public final void run() {
                InterpreterWrapper.this.lambda$init$0(contextedInterpreter, byteBuffer, i, delegateType3, z3, gpuCache, conditionLock);
            }
        }, new Consumer() { // from class: ru.ok.tensorflow.tflite.e
            @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.Consumer
            public final void consume(Object obj) {
                InterpreterWrapper.this.lambda$init$1((Exception) obj);
            }
        });
        return new InitFuture(conditionLock);
    }

    public boolean initGPU(GpuCache gpuCache, GlThreadWithSharedContext glThreadWithSharedContext) {
        if (this.glThread == null && glThreadWithSharedContext != null) {
            this.glThread = glThreadWithSharedContext;
        }
        return asyncCallInGLThread(new he6(2, this, gpuCache));
    }

    public boolean isGPUInited() {
        GlThreadWithSharedContext glThreadWithSharedContext;
        return this.createdGPU && (glThreadWithSharedContext = this.glThread) != null && glThreadWithSharedContext.isReadyRun();
    }

    public boolean needGpuInit() {
        return this.useGPUPass || this.useCPUPass;
    }

    public void run(final Object obj, final Object obj2) {
        throwIfClosed();
        runTaskSync(new Consumer() { // from class: ru.ok.tensorflow.tflite.g
            @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.Consumer
            public final void consume(Object obj3) {
                InterpreterWrapper.this.lambda$run$3(obj, obj2, (org.tensorflow.lite.a) obj3);
            }
        });
    }

    public void runForMultipleInputsOutputs(final Object[] objArr, @NonNull final Map<Integer, Object> map) {
        throwIfClosed();
        if (this.useCPUPass && this.glThread != null && isGPUInited()) {
            syncCallInGLThread(new u8p(this, objArr, map, 1));
        } else {
            runTaskSync(new Consumer() { // from class: ru.ok.tensorflow.tflite.h
                @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.Consumer
                public final void consume(Object obj) {
                    InterpreterWrapper.this.lambda$runForMultipleInputsOutputs$4(objArr, map, (org.tensorflow.lite.a) obj);
                }
            });
        }
    }

    public void runForMultipleInputsOutputsGPU(Object[] objArr, @NonNull Map<Integer, Object> map) {
        runForMultipleInputsOutputsGPU(objArr, map, null, null);
    }

    public void runGPU(Object obj, Object obj2) {
        throwIfClosed();
        HashMap hashMap = new HashMap();
        hashMap.put(0, obj2);
        runForMultipleInputsOutputsGPU(new Object[]{obj}, hashMap, null, null);
    }

    public void setForceUseGLBuffers(boolean z) {
        this.forceUseGLBuffers = z;
    }

    public void runForMultipleInputsOutputsGPU(final Object[] objArr, @NonNull final Map<Integer, Object> map, @Nullable final RunnableOnGPU runnableOnGPU, @Nullable final RunnableOnGPU runnableOnGPU2) {
        throwIfClosed();
        syncCallInGLThread(new Runnable() { // from class: xsna.znx
            @Override // java.lang.Runnable
            public final void run() {
                InterpreterWrapper.this.lambda$runForMultipleInputsOutputsGPU$6(runnableOnGPU, objArr, map, runnableOnGPU2);
            }
        });
    }

    private void runTaskSync(Consumer<org.tensorflow.lite.a> consumer, Consumer<InterpreterGPU> consumer2) {
        if (this.reinitFutureRef.get() != null) {
            return;
        }
        synchronized (this.interpreterLock) {
            try {
                if (this.interpreter != null && this.interpreter.interpreter != null) {
                    runTaskSync(consumer);
                } else {
                    InterpreterGPU interpreterGPU = this.interpreterGPU;
                    if (interpreterGPU != null) {
                        consumer2.consume(interpreterGPU);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
