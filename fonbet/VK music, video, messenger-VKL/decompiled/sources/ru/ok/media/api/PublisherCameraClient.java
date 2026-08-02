package ru.ok.media.api;

import ru.ok.media.utils.VideoSize;

/* compiled from: PublisherCameraClient.kt */
/* loaded from: classes9.dex */
public interface PublisherCameraClient {
    VideoSize getCameraResolution();

    VideoSize getPreferredPreviewSize();

    PublisherRenderer getRenderer();

    int getVideoRotation();

    boolean isCameraClientActive();

    void onFrameCaptured();

    void setCameraIsExternal(boolean z);

    void setCameraIsFront(boolean z);

    void setCameraPreviewSize(VideoSize videoSize);

    void setCameraRotation(int i);

    void setRendererListener(PublisherRendererCallback publisherRendererCallback);

    void setVideoRotation(int i);

    void updateRendererVideoSize();
}
