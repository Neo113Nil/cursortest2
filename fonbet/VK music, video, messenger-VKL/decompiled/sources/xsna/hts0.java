package xsna;

import android.graphics.Rect;
import android.opengl.GLES20;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.MediaUtils;
import com.vk.media.gles.EglTexture;
import com.vk.media.rotation.Flip;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.objects.TrivialFragmentShader;
import ru.ok.videomessages.VideoMessageStencilHolder;

/* compiled from: VideoMessageStencilRenderer.kt */
/* loaded from: classes3.dex */
public final class hts0 extends com.vk.media.gles.a {
    public final MediaUtils.d e;
    public FrameBuffer f;
    public final TrivialFragmentShader g;
    public final Rect h;
    public final VideoMessageStencilHolder i;

    public hts0(MediaUtils.d dVar) {
        super(new EglTexture(EglTexture.ProgramType.TEXTURE_EXT));
        this.e = dVar;
        this.g = new TrivialFragmentShader(0, false);
        this.h = new Rect();
        this.i = new VideoMessageStencilHolder(dVar.a, dVar.b);
    }

    @Override // com.vk.media.gles.a
    public final void h() {
        super.h();
        this.i.release();
    }

    public final void j(int i, float[] fArr, float[] fArr2, Flip flip, boolean z) {
        FrameBuffer frameBuffer = this.f;
        MediaUtils.d dVar = this.e;
        int i2 = dVar.a;
        int i3 = dVar.b;
        if (frameBuffer == null || i2 != frameBuffer.getWidth() || i3 != frameBuffer.getHeight()) {
            if (frameBuffer != null) {
                frameBuffer.release();
            }
            frameBuffer = new FrameBuffer(i2, i3);
            GlUtil.checkGlError("VideoMessageStencilRenderer::checkFrameBuffer");
        }
        frameBuffer.bind();
        GLES20.glViewport(0, 0, dVar.a, dVar.b);
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        GLES20.glClear(16640);
        g(i, fArr, fArr2, flip);
        frameBuffer.unbind();
        int textureId = frameBuffer.getTextureId();
        int i4 = dVar.a;
        int i5 = dVar.b;
        this.i.render(textureId, i4, i5, i4, i5, flip != Flip.NO_FLIP, z);
        Rect rect = this.h;
        GLES20.glViewport(rect.left, rect.bottom, rect.right, rect.top);
        int textureId2 = frameBuffer.getTextureId();
        TrivialFragmentShader trivialFragmentShader = this.g;
        trivialFragmentShader.setTextureId(textureId2);
        trivialFragmentShader.render();
        this.f = frameBuffer;
    }
}
