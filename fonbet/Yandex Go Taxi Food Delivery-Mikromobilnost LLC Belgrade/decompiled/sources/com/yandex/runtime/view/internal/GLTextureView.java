package com.yandex.runtime.view.internal;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;

/* loaded from: classes8.dex */
public class GLTextureView implements RenderDelegate {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private EGLConfigChooserImpl eglConfigChooser;
    private GLContextFactory glContextFactory;
    private GLRenderThread renderThread;

    public GLTextureView(boolean z) {
        EGLConfigChooserImpl eGLConfigChooserImpl = new EGLConfigChooserImpl();
        this.eglConfigChooser = eGLConfigChooserImpl;
        this.glContextFactory = new GLContextFactory(z, eGLConfigChooserImpl);
    }

    private boolean isInitialized() {
        return this.renderThread != null;
    }

    public void onPause() {
        if (isInitialized()) {
            this.renderThread.onPause();
        }
    }

    public void onResume() {
        if (isInitialized()) {
            this.renderThread.onResume();
        }
    }

    public void onSizeChanged(int i, int i2) {
        if (isInitialized()) {
            this.renderThread.onSizeChanged(i, i2);
        }
    }

    public void onTextureDestroyed() {
        if (isInitialized()) {
            this.renderThread.finish();
            try {
                this.renderThread.join();
            } catch (InterruptedException unused) {
            }
            this.renderThread = null;
        }
    }

    @Override // com.yandex.runtime.view.internal.RenderDelegate
    public void requestRender() {
        if (isInitialized()) {
            this.renderThread.requestRender();
        }
    }

    @Override // com.yandex.runtime.view.internal.RenderDelegate
    public void setForceRender(boolean z) {
        if (isInitialized()) {
            this.renderThread.setForceRender(z);
        }
    }

    public void setRenderer(SurfaceTexture surfaceTexture, int i, int i2, GLSurfaceView.Renderer renderer) {
        surfaceTexture.setDefaultBufferSize(i, i2);
        GLRenderThread gLRenderThread = new GLRenderThread(surfaceTexture, this.eglConfigChooser, this.glContextFactory, renderer);
        this.renderThread = gLRenderThread;
        gLRenderThread.onSizeChanged(i, i2);
        this.renderThread.start();
    }
}
