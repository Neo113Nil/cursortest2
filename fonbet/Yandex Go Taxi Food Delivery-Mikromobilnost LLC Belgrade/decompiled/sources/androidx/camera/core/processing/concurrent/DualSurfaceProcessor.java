package androidx.camera.core.processing.concurrent;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.processing.util.GLUtils$InputFormat;
import androidx.concurrent.futures.b;
import defpackage.avm;
import defpackage.brs;
import defpackage.euy;
import defpackage.gl7;
import defpackage.hiv;
import defpackage.hsj0;
import defpackage.jud;
import defpackage.k6u;
import defpackage.l9;
import defpackage.mlh;
import defpackage.ny61;
import defpackage.ot7;
import defpackage.oxe;
import defpackage.p7h;
import defpackage.pnw0;
import defpackage.q8n;
import defpackage.qnw0;
import defpackage.sgb1;
import defpackage.snw0;
import defpackage.tnw0;
import defpackage.uhm;
import defpackage.vpa;
import defpackage.wnw0;
import defpackage.wqj;
import defpackage.x4e;
import defpackage.xqs;
import defpackage.yum;
import defpackage.znw0;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public class DualSurfaceProcessor implements tnw0, SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "DualSurfaceProcessor";
    private final Executor mGlExecutor;
    final Handler mGlHandler;
    private final yum mGlRenderer;
    final HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final Map<qnw0, Surface> mOutputSurfaces;
    private SurfaceTexture mPrimarySurfaceTexture;
    private SurfaceTexture mSecondarySurfaceTexture;

    public DualSurfaceProcessor(q8n q8nVar, Map<GLUtils$InputFormat, xqs> map, jud judVar, jud judVar2) {
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mIsReleaseRequested = new AtomicBoolean(false);
        this.mOutputSurfaces = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = new k6u(handler);
        this.mGlRenderer = new yum(judVar, judVar2);
        try {
            initGlRenderer(q8nVar, map);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    private void checkReadyToRelease() {
        if (this.mIsReleased && this.mInputSurfaceCount == 0) {
            Iterator<qnw0> it = this.mOutputSurfaces.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.h();
            this.mGlThread.quit();
        }
    }

    private void executeSafely(Runnable runnable, Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new p7h(8, this, runnable2, runnable));
        } catch (RejectedExecutionException unused) {
            sgb1.g(5, TAG);
            runnable2.run();
        }
    }

    private void initGlRenderer(q8n q8nVar, Map<GLUtils$InputFormat, xqs> map) {
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            Object lambda$initGlRenderer$6 = lambda$initGlRenderer$6(q8nVar, map, bVar);
            if (lambda$initGlRenderer$6 != null) {
                bVar.a = lambda$initGlRenderer$6;
            }
        } catch (Exception e) {
            gl7Var.a(e);
        }
        try {
            gl7Var.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            ny61.h("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$executeSafely$7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeSafely$8(Runnable runnable, Runnable runnable2) {
        if (this.mIsReleased) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGlRenderer$5(q8n q8nVar, Map map, b bVar) {
        try {
            this.mGlRenderer.e(q8nVar, map);
            bVar.b(null);
        } catch (RuntimeException e) {
            bVar.d(e);
        }
    }

    private /* synthetic */ Object lambda$initGlRenderer$6(q8n q8nVar, Map map, b bVar) throws Exception {
        executeSafely(new l9(this, q8nVar, map, bVar, 11));
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$0(SurfaceTexture surfaceTexture, Surface surface, wnw0 wnw0Var) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.mInputSurfaceCount--;
        checkReadyToRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onInputSurface$1(znw0 znw0Var) {
        this.mInputSurfaceCount++;
        yum yumVar = this.mGlRenderer;
        boolean z = znw0Var.f;
        Size size = znw0Var.b;
        brs.d(true, yumVar.a);
        brs.c(yumVar.c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(z ? yumVar.n : yumVar.o);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        znw0Var.b(surface, this.mGlExecutor, new avm(this, surfaceTexture, surface));
        if (znw0Var.f) {
            this.mPrimarySurfaceTexture = surfaceTexture;
        } else {
            this.mSecondarySurfaceTexture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this, this.mGlHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onOutputSurface$2(qnw0 qnw0Var, pnw0 pnw0Var) {
        qnw0Var.close();
        Surface remove = this.mOutputSurfaces.remove(qnw0Var);
        if (remove != null) {
            yum yumVar = this.mGlRenderer;
            brs.d(true, yumVar.a);
            brs.c(yumVar.c);
            yumVar.j(remove, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$3(qnw0 qnw0Var) {
        Executor executor = this.mGlExecutor;
        ot7 ot7Var = new ot7(3, this, qnw0Var);
        snw0 snw0Var = (snw0) qnw0Var;
        Surface c = snw0Var.c(executor, ot7Var);
        this.mGlRenderer.g(c);
        this.mOutputSurfaces.put(snw0Var, c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$4() {
        this.mIsReleased = true;
        checkReadyToRelease();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.mIsReleaseRequested.get() || (surfaceTexture2 = this.mPrimarySurfaceTexture) == null || this.mSecondarySurfaceTexture == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.mSecondarySurfaceTexture.updateTexImage();
        for (Map.Entry<qnw0, Surface> entry : this.mOutputSurfaces.entrySet()) {
            Surface value = entry.getValue();
            qnw0 key = entry.getKey();
            if (((snw0) key).c == 34) {
                try {
                    this.mGlRenderer.m(surfaceTexture.getTimestamp(), value, key, this.mPrimarySurfaceTexture, this.mSecondarySurfaceTexture);
                } catch (RuntimeException e) {
                    sgb1.e(TAG, "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    @Override // defpackage.tnw0
    public void onInputSurface(znw0 znw0Var) throws ProcessingException {
        if (this.mIsReleaseRequested.get()) {
            znw0Var.d();
            return;
        }
        wqj wqjVar = new wqj(12, this, znw0Var);
        Objects.requireNonNull(znw0Var);
        executeSafely(wqjVar, new mlh(znw0Var, 0));
    }

    @Override // defpackage.tnw0
    public void onOutputSurface(qnw0 qnw0Var) throws ProcessingException {
        if (this.mIsReleaseRequested.get()) {
            qnw0Var.close();
            return;
        }
        wqj wqjVar = new wqj(13, this, qnw0Var);
        Objects.requireNonNull(qnw0Var);
        executeSafely(wqjVar, new oxe(25, qnw0Var));
    }

    @Override // defpackage.tnw0
    public void release() {
        if (this.mIsReleaseRequested.getAndSet(true)) {
            return;
        }
        executeSafely(new uhm(3, this));
    }

    @Override // defpackage.tnw0
    public /* bridge */ /* synthetic */ euy snapshot(int i, int i2) {
        return hiv.c;
    }

    private void executeSafely(Runnable runnable) {
        executeSafely(runnable, new vpa(9));
    }

    public DualSurfaceProcessor(q8n q8nVar, jud judVar, jud judVar2) {
        this(q8nVar, Collections.EMPTY_MAP, judVar, judVar2);
    }
}
