package ru.ok.gl.effects.media.controller.video;

import android.graphics.SurfaceTexture;

/* loaded from: classes9.dex */
public interface TextureRenderer {
    SurfaceTexture getSurfaceTexture();

    int getTextureId();

    void init();

    void release();

    void updateFrame();
}
