package ru.ok.gl.effects.media.controller.video;

import android.graphics.SurfaceTexture;
import ru.ok.gl.effects.media.controller.video.OutputSurface;
import ru.ok.gl.objects.GlUtil;

/* loaded from: classes9.dex */
public final class SurfaceTextureWrapper implements TextureRenderer {
    private SurfaceTexture surfaceTexture;
    private int textureID = -1;

    @Override // ru.ok.gl.effects.media.controller.video.TextureRenderer
    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    @Override // ru.ok.gl.effects.media.controller.video.TextureRenderer
    public int getTextureId() {
        return this.textureID;
    }

    @Override // ru.ok.gl.effects.media.controller.video.TextureRenderer
    public void init() throws OutputSurface.TooManyObjectException {
        GlUtil.checkGlError("initGl start");
        this.textureID = GlUtil.createExternalTextures(1)[0];
        this.surfaceTexture = new SurfaceTexture(this.textureID);
        GlUtil.checkGlError("initGl end");
    }

    @Override // ru.ok.gl.effects.media.controller.video.TextureRenderer
    public void release() {
        this.surfaceTexture.release();
        this.surfaceTexture = null;
        int i = this.textureID;
        if (i != -1) {
            GlUtil.deleteTexture(i);
        }
    }

    @Override // ru.ok.gl.effects.media.controller.video.TextureRenderer
    public void updateFrame() {
        this.surfaceTexture.updateTexImage();
    }
}
