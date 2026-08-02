package ru.ok.media.api;

import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes9.dex */
public interface PublisherRenderer {
    void cleanupGl();

    int getFboRotation();

    void init(boolean z);

    void renderFrame(GL10 gl10);
}
