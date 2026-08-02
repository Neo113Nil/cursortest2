package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.util.GLUtils$InputFormat;
import androidx.concurrent.futures.b;
import com.google.android.gms.gcm.Task;
import defpackage.ars;
import defpackage.brs;
import defpackage.d6z;
import defpackage.e90;
import defpackage.e9e;
import defpackage.euy;
import defpackage.gl7;
import defpackage.hsj0;
import defpackage.jjb1;
import defpackage.k6u;
import defpackage.l9;
import defpackage.lw01;
import defpackage.mlh;
import defpackage.ni91;
import defpackage.nlh;
import defpackage.ny61;
import defpackage.ot7;
import defpackage.oxe;
import defpackage.p7h;
import defpackage.plh;
import defpackage.pnw0;
import defpackage.q8n;
import defpackage.qnw0;
import defpackage.sgb1;
import defpackage.snw0;
import defpackage.tnw0;
import defpackage.vpa;
import defpackage.w570;
import defpackage.w84;
import defpackage.wnw0;
import defpackage.x4e;
import defpackage.xnw0;
import defpackage.xqs;
import defpackage.z54;
import defpackage.znw0;
import defpackage.zqs;
import defpackage.zvg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;

/* loaded from: classes10.dex */
public class DefaultSurfaceProcessor implements tnw0, SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "DefaultSurfaceProcessor";
    private final Executor mGlExecutor;
    final Handler mGlHandler;
    private final w570 mGlRenderer;
    final HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final Map<qnw0, Surface> mOutputSurfaces;
    private final List<plh> mPendingSnapshots;
    private final float[] mSurfaceOutputMatrix;
    private final float[] mTextureMatrix;

    public DefaultSurfaceProcessor(q8n q8nVar, Map<GLUtils$InputFormat, xqs> map) {
        this.mIsReleaseRequested = new AtomicBoolean(false);
        this.mTextureMatrix = new float[16];
        this.mSurfaceOutputMatrix = new float[16];
        this.mOutputSurfaces = new LinkedHashMap();
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mPendingSnapshots = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = new k6u(handler);
        this.mGlRenderer = new w570();
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
            Iterator<plh> it2 = this.mPendingSnapshots.iterator();
            while (it2.hasNext()) {
                ((z54) it2.next()).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.h();
            this.mGlThread.quit();
        }
    }

    private void executeSafely(Runnable runnable, Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new p7h(3, this, runnable2, runnable));
        } catch (RejectedExecutionException unused) {
            sgb1.g(5, TAG);
            runnable2.run();
        }
    }

    private void failAllPendingSnapshots(Throwable th) {
        Iterator<plh> it = this.mPendingSnapshots.iterator();
        while (it.hasNext()) {
            ((z54) it.next()).c.d(th);
        }
        this.mPendingSnapshots.clear();
    }

    private Bitmap getBitmap(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        jjb1.e(fArr2, i);
        jjb1.f(fArr2);
        Size i2 = lw01.i(i, size);
        w570 w570Var = this.mGlRenderer;
        w570Var.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2.getHeight() * i2.getWidth() * 4);
        d6z.m("ByteBuffer capacity is not equal to width * height * 4.", allocateDirect.capacity() == (i2.getHeight() * i2.getWidth()) * 4);
        d6z.m("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = brs.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        brs.b("glGenTextures");
        int i3 = iArr2[0];
        GLES20.glActiveTexture(33985);
        brs.b("glActiveTexture");
        GLES20.glBindTexture(3553, i3);
        brs.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, i2.getWidth(), i2.getHeight(), 0, 6407, 5121, null);
        brs.b("glTexImage2D");
        GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        brs.b("glGenFramebuffers");
        int i4 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i4);
        brs.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
        brs.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        brs.b("glActiveTexture");
        GLES20.glBindTexture(36197, w570Var.m);
        brs.b("glBindTexture");
        w570Var.i = null;
        GLES20.glViewport(0, 0, i2.getWidth(), i2.getHeight());
        GLES20.glScissor(0, 0, i2.getWidth(), i2.getHeight());
        zqs zqsVar = w570Var.k;
        zqsVar.getClass();
        if (zqsVar instanceof ars) {
            GLES20.glUniformMatrix4fv(((ars) zqsVar).f, 1, false, fArr2, 0);
            brs.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        brs.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, i2.getWidth(), i2.getHeight(), 6408, 5121, allocateDirect);
        brs.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i3}, 0);
        brs.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i4}, 0);
        brs.b("glDeleteFramebuffers");
        int i5 = w570Var.m;
        GLES20.glActiveTexture(33984);
        brs.b("glActiveTexture");
        GLES20.glBindTexture(36197, i5);
        brs.b("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(i2.getWidth(), i2.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.f(createBitmap, allocateDirect, i2.getWidth() * 4);
        return createBitmap;
    }

    private void initGlRenderer(q8n q8nVar, Map<GLUtils$InputFormat, xqs> map) {
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            Object lambda$initGlRenderer$10 = lambda$initGlRenderer$10(q8nVar, map, bVar);
            if (lambda$initGlRenderer$10 != null) {
                bVar.a = lambda$initGlRenderer$10;
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
    public static /* synthetic */ void lambda$executeSafely$11() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeSafely$12(Runnable runnable, Runnable runnable2) {
        if (this.mIsReleased) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    private /* synthetic */ Object lambda$initGlRenderer$10(q8n q8nVar, Map map, b bVar) throws Exception {
        executeSafely(new l9(this, q8nVar, map, bVar, 9));
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGlRenderer$9(q8n q8nVar, Map map, b bVar) {
        try {
            this.mGlRenderer.e(q8nVar, map);
            bVar.b(null);
        } catch (RuntimeException e) {
            bVar.d(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onInputSurface$0(znw0 znw0Var, xnw0 xnw0Var) {
        GLUtils$InputFormat gLUtils$InputFormat = GLUtils$InputFormat.DEFAULT;
        if (znw0Var.c.a() && ((w84) xnw0Var).d) {
            gLUtils$InputFormat = GLUtils$InputFormat.YUV;
        }
        w570 w570Var = this.mGlRenderer;
        brs.d(true, w570Var.a);
        brs.c(w570Var.c);
        if (w570Var.l != gLUtils$InputFormat) {
            w570Var.l = gLUtils$InputFormat;
            w570Var.l(w570Var.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onInputSurface$1(znw0 znw0Var, SurfaceTexture surfaceTexture, Surface surface, wnw0 wnw0Var) {
        synchronized (znw0Var.a) {
            znw0Var.o = null;
            znw0Var.p = null;
        }
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.mInputSurfaceCount--;
        checkReadyToRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onInputSurface$2(final znw0 znw0Var) {
        this.mInputSurfaceCount++;
        w570 w570Var = this.mGlRenderer;
        brs.d(true, w570Var.a);
        brs.c(w570Var.c);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(w570Var.m);
        surfaceTexture.setDefaultBufferSize(znw0Var.b.getWidth(), znw0Var.b.getHeight());
        final Surface surface = new Surface(surfaceTexture);
        znw0Var.c(this.mGlExecutor, new e90(23, this, znw0Var));
        znw0Var.b(surface, this.mGlExecutor, new e9e() { // from class: olh
            @Override // defpackage.e9e
            public final void accept(Object obj) {
                DefaultSurfaceProcessor.this.lambda$onInputSurface$1(znw0Var, surfaceTexture, surface, (wnw0) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.mGlHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onOutputSurface$3(qnw0 qnw0Var, pnw0 pnw0Var) {
        qnw0Var.close();
        Surface remove = this.mOutputSurfaces.remove(qnw0Var);
        if (remove != null) {
            w570 w570Var = this.mGlRenderer;
            brs.d(true, w570Var.a);
            brs.c(w570Var.c);
            w570Var.j(remove, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$4(qnw0 qnw0Var) {
        Executor executor = this.mGlExecutor;
        ot7 ot7Var = new ot7(1, this, qnw0Var);
        snw0 snw0Var = (snw0) qnw0Var;
        Surface c = snw0Var.c(executor, ot7Var);
        this.mGlRenderer.g(c);
        this.mOutputSurfaces.put(snw0Var, c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$5() {
        this.mIsReleased = true;
        checkReadyToRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$snapshot$6(plh plhVar) {
        this.mPendingSnapshots.add(plhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$snapshot$7(b bVar) {
        bVar.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }

    private Object lambda$snapshot$8(int i, int i2, b bVar) throws Exception {
        executeSafely(new zvg(11, this, new z54(i, i2, bVar)), new nlh(0, bVar));
        return "DefaultSurfaceProcessor#snapshot";
    }

    private void takeSnapshotAndDrawJpeg(Triple<Surface, Size, float[]> triple) {
        if (this.mPendingSnapshots.isEmpty()) {
            return;
        }
        if (triple == null) {
            failAllPendingSnapshots(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<plh> it = this.mPendingSnapshots.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    plh next = it.next();
                    if (i != ((z54) next).b || bitmap == null) {
                        i = ((z54) next).b;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = getBitmap((Size) triple.g(), (float[]) triple.h(), i);
                        i2 = -1;
                    }
                    if (i2 != ((z54) next).a) {
                        byteArrayOutputStream.reset();
                        i2 = ((z54) next).a;
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) triple.f();
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.k(bArr, surface);
                    ((z54) next).c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            failAllPendingSnapshots(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.mIsReleaseRequested.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.mTextureMatrix);
        Triple<Surface, Size, float[]> triple = null;
        for (Map.Entry<qnw0, Surface> entry : this.mOutputSurfaces.entrySet()) {
            Surface value = entry.getValue();
            qnw0 key = entry.getKey();
            Matrix.multiplyMM(this.mSurfaceOutputMatrix, 0, this.mTextureMatrix, 0, ((snw0) key).x, 0);
            snw0 snw0Var = (snw0) key;
            int i = snw0Var.c;
            if (i == 34) {
                try {
                    this.mGlRenderer.k(surfaceTexture.getTimestamp(), this.mSurfaceOutputMatrix, value);
                } catch (RuntimeException e) {
                    sgb1.e(TAG, "Failed to render with OpenGL.", e);
                }
            } else {
                d6z.y("Unsupported format: " + i, i == 256);
                d6z.y("Only one JPEG output is supported.", triple == null);
                triple = new Triple<>(value, snw0Var.w, (float[]) this.mSurfaceOutputMatrix.clone());
            }
        }
        try {
            takeSnapshotAndDrawJpeg(triple);
        } catch (RuntimeException e2) {
            failAllPendingSnapshots(e2);
        }
    }

    @Override // defpackage.tnw0
    public void onInputSurface(znw0 znw0Var) {
        if (this.mIsReleaseRequested.get()) {
            znw0Var.d();
            return;
        }
        zvg zvgVar = new zvg(13, this, znw0Var);
        Objects.requireNonNull(znw0Var);
        executeSafely(zvgVar, new mlh(znw0Var, 0));
    }

    @Override // defpackage.tnw0
    public void onOutputSurface(qnw0 qnw0Var) {
        if (this.mIsReleaseRequested.get()) {
            qnw0Var.close();
            return;
        }
        zvg zvgVar = new zvg(12, this, qnw0Var);
        Objects.requireNonNull(qnw0Var);
        executeSafely(zvgVar, new oxe(25, qnw0Var));
    }

    @Override // defpackage.tnw0
    public void release() {
        if (this.mIsReleaseRequested.getAndSet(true)) {
            return;
        }
        executeSafely(new oxe(24, this));
    }

    @Override // defpackage.tnw0
    public euy snapshot(int i, int i2) {
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            Object lambda$snapshot$8 = lambda$snapshot$8(i, i2, bVar);
            if (lambda$snapshot$8 != null) {
                bVar.a = lambda$snapshot$8;
            }
        } catch (Exception e) {
            gl7Var.a(e);
        }
        return ni91.g(gl7Var);
    }

    private void executeSafely(Runnable runnable) {
        executeSafely(runnable, new vpa(3));
    }

    public DefaultSurfaceProcessor(q8n q8nVar) {
        this(q8nVar, Collections.EMPTY_MAP);
    }
}
