package ru.ok.tensorflow.tflite;

import android.content.Context;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import ru.ok.tensorflow.util.async.ConditionLock;
import xsna.ue9;

/* loaded from: classes9.dex */
public class GLHandler {
    private GLSurfaceView glSurfaceView;

    public GLHandler(Context context) {
        GLSurfaceView gLSurfaceView = new GLSurfaceView(context);
        this.glSurfaceView = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(3);
        this.glSurfaceView.setRenderer(new DummyGLRenderer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runTaskSync$0(Runnable runnable, ConditionLock conditionLock) {
        runnable.run();
        conditionLock.set(true);
    }

    public void release() {
        this.glSurfaceView.onPause();
    }

    public void runTask(Runnable runnable, boolean z) {
        if (z) {
            runTaskSync(runnable);
        } else {
            runTaskAsync(runnable);
        }
    }

    public void runTaskAsync(Runnable runnable) {
        this.glSurfaceView.queueEvent(runnable);
    }

    public void runTaskSync(Runnable runnable) {
        ConditionLock conditionLock = new ConditionLock(false);
        this.glSurfaceView.queueEvent(new ue9(2, runnable, conditionLock));
        conditionLock.await(true);
    }

    public class DummyGLRenderer implements GLSurfaceView.Renderer {
        private DummyGLRenderer() {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("GLHandler thread " + currentThread.getId());
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        }
    }
}
