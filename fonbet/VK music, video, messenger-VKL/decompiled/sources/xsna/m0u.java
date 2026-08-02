package xsna;

import android.opengl.GLES20;
import com.vk.media.pipeline.gl.GlException;
import java.util.Arrays;

/* compiled from: GlRoundProgram.kt */
/* loaded from: classes3.dex */
public final class m0u extends l0u {
    public float p;
    public float q;
    public final int r;
    public final int s;

    public m0u(f100 f100Var, boolean z) {
        super(f100Var, z ? String.format("%s\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vFrameTextureCoord;\nuniform %s sTexture;\nuniform float radiusX;\nuniform float radiusY;\nconst float edgeSmoothingDelta = 0.01;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n   if (radiusX != 0.0 && radiusY != 0.0) {\n       float x = max(radiusX - vFrameTextureCoord.x, radiusX - 1.0 + vFrameTextureCoord.x) / radiusX;\n       float y = max(radiusY - vFrameTextureCoord.y, radiusY - 1.0 + vFrameTextureCoord.y) / radiusY;\n       x = max(x, 0.0); y = max(y, 0.0);\n       float r = x * x + y * y;\n       \n       // linearly fade alpha from 1 to 0 near texture edge to hide jugged border\n       float fadeStartR = 1.0 - edgeSmoothingDelta; \n       if (r > fadeStartR) {\n           gl_FragColor.a = 1.0 - clamp((r - fadeStartR) / 2.0 / edgeSmoothingDelta, 0.0, 1.0);\n       }\n   }\n}\n", Arrays.copyOf(new Object[]{"#extension GL_OES_EGL_image_external : require", "samplerExternalOES"}, 2)) : String.format("%s\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vFrameTextureCoord;\nuniform %s sTexture;\nuniform float radiusX;\nuniform float radiusY;\nconst float edgeSmoothingDelta = 0.01;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n   if (radiusX != 0.0 && radiusY != 0.0) {\n       float x = max(radiusX - vFrameTextureCoord.x, radiusX - 1.0 + vFrameTextureCoord.x) / radiusX;\n       float y = max(radiusY - vFrameTextureCoord.y, radiusY - 1.0 + vFrameTextureCoord.y) / radiusY;\n       x = max(x, 0.0); y = max(y, 0.0);\n       float r = x * x + y * y;\n       \n       // linearly fade alpha from 1 to 0 near texture edge to hide jugged border\n       float fadeStartR = 1.0 - edgeSmoothingDelta; \n       if (r > fadeStartR) {\n           gl_FragColor.a = 1.0 - clamp((r - fadeStartR) / 2.0 / edgeSmoothingDelta, 0.0, 1.0);\n       }\n   }\n}\n", Arrays.copyOf(new Object[]{"", "sampler2D"}, 2)), "\nprecision mediump float;\nuniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute vec4 aVertexCoord;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 vFrameTextureCoord;\nvoid main() {\n    gl_Position = mvpMatrix * aVertexCoord;\n    vTextureCoord = (texMatrix * aTextureCoord).xy;\n    vFrameTextureCoord = aTextureCoord.xy;\n}\n", "GlRoundProgram", z);
        try {
            this.r = b("radiusX");
            this.s = b("radiusY");
        } catch (GlException e) {
            c();
            throw e;
        }
    }

    @Override // xsna.l0u
    public final void e() {
        super.e();
        wwf0 wwf0Var = wwf0.c;
        GLES20.glUniform1f(this.r, this.p);
        wwf0.o(wwf0Var, null, 3);
        GLES20.glUniform1f(this.s, this.q);
        wwf0.o(wwf0Var, null, 3);
    }
}
