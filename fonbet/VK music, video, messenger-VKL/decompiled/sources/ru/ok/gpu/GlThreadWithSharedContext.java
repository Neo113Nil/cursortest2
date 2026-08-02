package ru.ok.gpu;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLSurface;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.tensorflow.util.async.ConditionLock;
import xsna.lhg;
import xsna.wv4;
import xsna.z27;

/* loaded from: classes9.dex */
public class GlThreadWithSharedContext extends Thread {
    private static final String TAG = "GlThreadWithSharedContext";
    private static final String THREAD_NAME = "GlThreadWithSharedContext";
    private boolean doneStarting;
    protected EGLSurface eglSurface;
    protected int framebuffer;
    protected Handler handler;
    protected boolean isReadyRun;
    protected Looper looper;
    protected volatile SharedEglContext sharedEglContext;
    private final Object startLock;
    private boolean startedSuccessfully;

    public GlThreadWithSharedContext(Object obj) {
        this(obj, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setReadyRunAsync$2(boolean z) {
        this.isReadyRun = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$syncCall$0(Runnable runnable, ConditionLock conditionLock) {
        runnable.run();
        conditionLock.set(true);
    }

    public void asyncCall(Runnable runnable) {
        getHandler().post(new z27(runnable, 4));
    }

    public void bindFramebuffer(int i, int i2, int i3) {
        GLES20.glBindFramebuffer(36160, this.framebuffer);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            throw new RuntimeException(lhg.a(glCheckFramebufferStatus, "Framebuffer not complete, status="));
        }
        GLES20.glViewport(0, 0, i2, i3);
        GlUtil.checkGlError("glViewport");
    }

    public EGLSurface createEglSurface() {
        return this.sharedEglContext.createOffscreenSurface(1, 1);
    }

    public Handler createHandler() {
        return new Handler();
    }

    public void forceReleaseCall(Runnable runnable) {
        getHandler().removeCallbacksAndMessages(null);
        syncCall(runnable);
    }

    public EGLContext getEGLContext() {
        return this.sharedEglContext.getContext();
    }

    public SharedEglContext getEglManager() {
        return this.sharedEglContext;
    }

    public int getFramebuffer() {
        return this.framebuffer;
    }

    public Handler getHandler() {
        return this.handler;
    }

    public Looper getLooper() {
        return this.looper;
    }

    public boolean isReadyRun() {
        return this.isReadyRun;
    }

    public void prepareGl() {
        this.eglSurface = createEglSurface();
        SharedEglContext sharedEglContext = this.sharedEglContext;
        EGLSurface eGLSurface = this.eglSurface;
        sharedEglContext.makeCurrent(eGLSurface, eGLSurface);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        GLES20.glGetString(7938);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.framebuffer = iArr[0];
    }

    public boolean quitSafely() {
        Looper looper = this.looper;
        if (looper == null) {
            return false;
        }
        looper.quitSafely();
        return true;
    }

    public void releaseGl() {
        int i = this.framebuffer;
        if (i != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.framebuffer = 0;
        }
        this.sharedEglContext.makeNothingCurrent();
        if (this.eglSurface != null) {
            this.sharedEglContext.releaseSurface(this.eglSurface);
            this.eglSurface = null;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        String name;
        StringBuilder sb;
        boolean z = true;
        try {
            try {
                Looper.prepare();
                this.handler = createHandler();
                this.looper = Looper.myLooper();
                new StringBuilder("Starting GL thread ").append(getName());
                prepareGl();
                this.startedSuccessfully = true;
                synchronized (this.startLock) {
                    this.doneStarting = true;
                    this.startLock.notify();
                }
            } catch (Throwable th) {
                synchronized (this.startLock) {
                    this.doneStarting = z;
                    this.startLock.notify();
                    throw th;
                }
            }
        } catch (Exception e) {
            Log.e("GlThreadWithSharedContext", "Exception inside start GL thread", e);
            synchronized (this.startLock) {
                this.doneStarting = true;
                this.startLock.notify();
            }
        }
        z = false;
        try {
            try {
                Looper.loop();
                this.looper = null;
                this.isReadyRun = false;
                releaseGl();
                this.sharedEglContext.release();
                name = getName();
                sb = new StringBuilder("Stopping GL thread ");
            } catch (Exception e2) {
                Log.e("GlThreadWithSharedContext", "Exception inside GL thread", e2);
                this.looper = null;
                this.isReadyRun = false;
                releaseGl();
                this.sharedEglContext.release();
                name = getName();
                sb = new StringBuilder("Stopping GL thread ");
            }
            sb.append(name);
        } catch (Throwable th2) {
            this.looper = null;
            this.isReadyRun = false;
            releaseGl();
            this.sharedEglContext.release();
            new StringBuilder("Stopping GL thread ").append(getName());
            throw th2;
        }
    }

    public void setReadyRunAsync(final boolean z) {
        getHandler().post(new Runnable() { // from class: xsna.t0u
            @Override // java.lang.Runnable
            public final void run() {
                GlThreadWithSharedContext.this.lambda$setReadyRunAsync$2(z);
            }
        });
    }

    public void syncCall(Runnable runnable) {
        ConditionLock conditionLock = new ConditionLock(false);
        getHandler().post(new wv4(8, runnable, conditionLock));
        conditionLock.await(true);
    }

    public boolean waitUntilReady() throws InterruptedException {
        synchronized (this.startLock) {
            while (!this.doneStarting) {
                try {
                    this.startLock.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.startedSuccessfully;
    }

    public GlThreadWithSharedContext(Object obj, @Nullable int[] iArr) {
        this.startLock = new Object();
        this.eglSurface = null;
        this.handler = null;
        this.looper = null;
        this.framebuffer = 0;
        this.isReadyRun = false;
        this.sharedEglContext = new SharedEglContext(obj, iArr);
        setName("GlThreadWithSharedContext");
    }
}
