package ru.ok.media.api;

/* loaded from: classes9.dex */
public interface PublisherCameraCallback {
    void onClosed();

    void rendererStateHasChange(boolean z);

    boolean requestRender();

    void runOnGLThread(Runnable runnable);

    void updateCameraResolution();
}
