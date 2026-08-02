package ru.ok.call_effects.internal.tensorflow;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.call_effects.CallEffects;
import ru.ok.call_effects.Configuration;
import ru.ok.call_effects.TensorflowModels;
import ru.ok.call_effects.TensorflowNativeDependencies;
import ru.ok.call_effects.internal.tensorflow.TensorflowConfigurator;
import ru.ok.face.entity.FaceFigure;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.factory.HandRecognitionFactory;
import ru.ok.gl.tf.gestures.Figure;
import ru.ok.gl.tf.gestures.FiguresConsumer;
import ru.ok.gl.tf.gestures.TensorflowGestureDetector;
import ru.ok.gl.util.Consumer;
import ru.ok.gl.util.Logger;
import ru.ok.tensorflow.entity.CompositeGesture;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.util.ExceptionHandler;
import xsna.bi5;
import xsna.ga40;
import xsna.i5s;
import xsna.osk0;
import xsna.p69;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: TensorflowConfigurator.kt */
/* loaded from: classes9.dex */
public final class TensorflowConfigurator {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "CallEffects";
    private static final int MIN_SEGM_FPS = 15;
    private static final long RETRY_TIME_MS = 200;
    private FiguresConsumer<Figure<CompositeGesture>> compositeGestureListener;
    private final Configuration configuration;
    private final Context context;
    private FiguresConsumer<FaceFigure> faceMesherListener;
    private Consumer<Bitmap> fullSegmentationListener;
    private FiguresConsumer<Figure<Gesture>> gestureListener;
    private final File gpuCacheFolder;
    private final Handler handler;
    private final HandlerThread handlerThread;
    private final CallEffects.InitializeListener initializeListener;
    private boolean isReleased;
    private final ReentrantLock lock;
    private final Logger logger;
    private Tensorflow tensorflow;
    private TensorflowGestureDetector tensorflowGestureDetector;
    private final TensorflowModels tensorflowModels;
    private final TensorflowNativeDependencies tensorflowNativeDependencies;
    private final TfExceptionHandler tfExceptionHandler;
    private boolean tfInitDone;
    private boolean tfInitFailed;

    /* compiled from: TensorflowConfigurator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: TensorflowConfigurator.kt */
    public final class TfExceptionHandler {
        private AtomicInteger iteration = new AtomicInteger(0);

        public TfExceptionHandler() {
        }

        public final int currentIteration() {
            return this.iteration.get();
        }

        public final ExceptionHandler getHandler(final String str) {
            final TensorflowConfigurator tensorflowConfigurator = TensorflowConfigurator.this;
            return new ExceptionHandler() { // from class: ru.ok.call_effects.internal.tensorflow.TensorflowConfigurator$TfExceptionHandler$getHandler$1
                private final int current;
                private boolean handled;

                {
                    AtomicInteger atomicInteger;
                    atomicInteger = TensorflowConfigurator.TfExceptionHandler.this.iteration;
                    this.current = atomicInteger.get();
                }

                @Override // ru.ok.tensorflow.util.ExceptionHandler
                public void accept(Exception exc) {
                    Logger logger;
                    AtomicInteger atomicInteger;
                    logger = tensorflowConfigurator.logger;
                    if (logger != null) {
                        logger.e("CallEffects", i5s.a(new StringBuilder("tensorflow "), str, " exception"), exc);
                    }
                    TensorflowConfigurator.TfExceptionHandler tfExceptionHandler = TensorflowConfigurator.TfExceptionHandler.this;
                    TensorflowConfigurator tensorflowConfigurator2 = tensorflowConfigurator;
                    synchronized (this) {
                        if (!this.handled) {
                            atomicInteger = tfExceptionHandler.iteration;
                            if (atomicInteger.get() == this.current) {
                                this.handled = true;
                                tensorflowConfigurator2.release();
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                    }
                }

                public final int getCurrent() {
                    return this.current;
                }

                public final boolean getHandled() {
                    return this.handled;
                }

                public final void setHandled(boolean z) {
                    this.handled = z;
                }
            };
        }

        public final void reset() {
            this.iteration.incrementAndGet();
        }
    }

    public TensorflowConfigurator(Context context, TensorflowModels tensorflowModels, TensorflowNativeDependencies tensorflowNativeDependencies, CallEffects.InitializeListener initializeListener, Logger logger, File file, Configuration configuration) {
        this.context = context;
        this.tensorflowModels = tensorflowModels;
        this.tensorflowNativeDependencies = tensorflowNativeDependencies;
        this.initializeListener = initializeListener;
        this.logger = logger;
        this.gpuCacheFolder = file;
        this.configuration = configuration;
        HandlerThread handlerThread = new HandlerThread("TensorflowConfigurator");
        this.handlerThread = handlerThread;
        this.lock = new ReentrantLock();
        this.tfExceptionHandler = new TfExceptionHandler();
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureWithRetryInternal() {
        try {
            if (tryConfigureTensorflow(false, 0, false)) {
                return;
            }
            this.handler.postDelayed(new p69(this, 8), 200L);
        } catch (Throwable th) {
            Logger logger = this.logger;
            if (logger != null) {
                logger.e(LOG_TAG, "Can't pre initialize tensorflow configurator", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryConfigureTensorflow$lambda-6$lambda-4, reason: not valid java name */
    public static final ModelDataProvider m398tryConfigureTensorflow$lambda6$lambda4(TensorflowConfigurator tensorflowConfigurator, TensorflowModel tensorflowModel) {
        return tensorflowConfigurator.tensorflowModels.getModelDataProvider(tensorflowModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryConfigureTensorflow$lambda-6$lambda-5, reason: not valid java name */
    public static final void m399tryConfigureTensorflow$lambda6$lambda5(TensorflowConfigurator tensorflowConfigurator) {
        CallEffects.InitializeListener initializeListener = tensorflowConfigurator.initializeListener;
        if (initializeListener != null) {
            initializeListener.onInitialized();
        }
    }

    public final void configureWithRetry() {
        this.handler.post(new bi5(this, 10));
    }

    public final Tensorflow getTensorflow() {
        return this.tensorflow;
    }

    public final void release() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            try {
                if (!this.isReleased) {
                    Tensorflow tensorflow = this.tensorflow;
                    if (tensorflow != null) {
                        tensorflow.release();
                    }
                    this.tensorflow = null;
                    TensorflowGestureDetector tensorflowGestureDetector = this.tensorflowGestureDetector;
                    if (tensorflowGestureDetector != null) {
                        tensorflowGestureDetector.release();
                    }
                    this.tensorflowGestureDetector = null;
                    this.isReleased = true;
                    this.handler.removeCallbacksAndMessages(null);
                    this.handlerThread.quit();
                }
            } finally {
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            }
            s3q0 s3q0Var2 = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
        }
    }

    public final void setFrameSize(Size size) {
        TensorflowGestureDetector tensorflowGestureDetector = this.tensorflowGestureDetector;
        if (tensorflowGestureDetector != null) {
            tensorflowGestureDetector.setSize(size);
        }
    }

    public final s3q0 setListeners(Consumer<Bitmap> consumer, FiguresConsumer<FaceFigure> figuresConsumer, FiguresConsumer<Figure<Gesture>> figuresConsumer2, FiguresConsumer<Figure<CompositeGesture>> figuresConsumer3) {
        s3q0 s3q0Var;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.fullSegmentationListener = consumer;
            Tensorflow tensorflow = this.tensorflow;
            if (tensorflow != null) {
                tensorflow.addSegmentationConsumer(consumer);
            }
            this.faceMesherListener = figuresConsumer;
            this.gestureListener = figuresConsumer2;
            this.compositeGestureListener = figuresConsumer3;
            TensorflowGestureDetector tensorflowGestureDetector = this.tensorflowGestureDetector;
            if (tensorflowGestureDetector != null) {
                tensorflowGestureDetector.addFaceConsumer(figuresConsumer);
                tensorflowGestureDetector.addFigureConsumer(figuresConsumer2);
                tensorflowGestureDetector.addCompositeFigureConsumer(figuresConsumer3);
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
            reentrantLock.unlock();
            return s3q0Var;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean tryConfigureTensorflow(boolean z, int i, boolean z2) {
        TensorflowGestureDetector tensorflowGestureDetector;
        TensorflowGestureDetector tensorflowGestureDetector2;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.tensorflowNativeDependencies.isReady()) {
                return false;
            }
            if (this.isReleased) {
                return false;
            }
            if (this.tfInitFailed) {
                return false;
            }
            if (this.tfInitDone) {
                Tensorflow tensorflow = this.tensorflow;
                if (tensorflow != null) {
                    tensorflow.changeSettings(z2, i, z, false, false, false, false, false, HandRecognitionFactory.RecognitionMode.DEFAULT, false, false, i > 0, null);
                }
                return true;
            }
            if (!this.tensorflowModels.isReady()) {
                Logger logger = this.logger;
                if (logger != null) {
                    logger.d(LOG_TAG, "models are not ready");
                }
                return false;
            }
            if (this.tfExceptionHandler.currentIteration() > 1) {
                Logger logger2 = this.logger;
                if (logger2 != null) {
                    logger2.d(LOG_TAG, "tensorflow init failed");
                }
                this.tfInitFailed = true;
                return false;
            }
            this.tfExceptionHandler.reset();
            Logger logger3 = this.logger;
            if (logger3 != null) {
                logger3.d(LOG_TAG, "tensorflow init called");
            }
            Tensorflow tensorflow2 = new Tensorflow(this.context, new ga40(this, 12), null, true, true, this.gpuCacheFolder, this.tfExceptionHandler.getHandler("init"), this.tfExceptionHandler.getHandler("runtime"), 15, null, new Tensorflow.FeatureRequirements(this.configuration.isGesturesRecognitionEnabled(), true, false, false, false, false, false, false, null), this.tensorflowModels.getTensorflowSegmentationType(), this.tensorflowModels.getTensorflowFaceLandmarksType(), new osk0(this, 4));
            tensorflow2.setSync(true);
            tensorflow2.changeSettings(false, 0, z, false, false, false, false, false, HandRecognitionFactory.RecognitionMode.DEFAULT, false, false, false, null);
            tensorflow2.enableDrawing(false);
            Consumer<Bitmap> consumer = this.fullSegmentationListener;
            if (consumer != null) {
                tensorflow2.addSegmentationConsumer(consumer);
            }
            this.tensorflow = tensorflow2;
            TensorflowGestureDetector build = new TensorflowGestureDetector.Builder(tensorflow2).build();
            this.tensorflowGestureDetector = build;
            FiguresConsumer<FaceFigure> figuresConsumer = this.faceMesherListener;
            if (figuresConsumer != null && build != null) {
                build.addFaceConsumer(figuresConsumer);
            }
            FiguresConsumer<Figure<Gesture>> figuresConsumer2 = this.gestureListener;
            if (figuresConsumer2 != null && (tensorflowGestureDetector2 = this.tensorflowGestureDetector) != null) {
                tensorflowGestureDetector2.addFigureConsumer(figuresConsumer2);
            }
            FiguresConsumer<Figure<CompositeGesture>> figuresConsumer3 = this.compositeGestureListener;
            if (figuresConsumer3 != null && (tensorflowGestureDetector = this.tensorflowGestureDetector) != null) {
                tensorflowGestureDetector.addCompositeFigureConsumer(figuresConsumer3);
            }
            this.tfInitDone = true;
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }
}
