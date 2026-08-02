package xsna;

import android.opengl.GLES20;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AnaglyphFilter.kt */
/* loaded from: classes12.dex */
public class iw1 extends kax {
    public final float s;
    public final float t;
    public final float u;
    public float v;
    public float w;

    public iw1() {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 31);
    }

    @Override // xsna.e0u, xsna.umv
    public final void a(int i, int i2) {
        this.v = (i2 / 54.0f) / i;
        this.w = 0.018518519f;
    }

    @Override // xsna.kax, xsna.e0u
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        iw1 iw1Var = (iw1) obj;
        return this.s == iw1Var.s && this.t == iw1Var.t && this.u == iw1Var.u && this.v == iw1Var.v && this.w == iw1Var.w;
    }

    @Override // xsna.kax, xsna.e0u
    public final int hashCode() {
        return Float.hashCode(this.w) + io.reactivex.rxjava3.subjects.b.a(this.v, io.reactivex.rxjava3.subjects.b.a(this.u, io.reactivex.rxjava3.subjects.b.a(this.t, io.reactivex.rxjava3.subjects.b.a(this.s, super.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // xsna.kax, xsna.e0u, xsna.umv
    public final void onDraw() {
        float f = this.r;
        GLES20.glUniform1f(f("imageWidthFactor"), this.v * f);
        GLES20.glUniform1f(f("imageHeightFactor"), this.w * f);
        int f2 = f("redFactor");
        float f3 = 1.0f - ((1.0f - this.s) * f);
        float[] fArr = nap.a;
        GLES20.glUniform1f(f2, f3);
        GLES20.glUniform1f(f("greenFactor"), 1.0f - ((1.0f - this.t) * f));
        GLES20.glUniform1f(f("blueFactor"), 1.0f - ((1.0f - this.u) * f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw1(float f, float f2, int i) {
        super("\n            attribute vec4 aPosition;\n            attribute vec4 aTextureCoord;\n            varying highp vec2 gbCoordinate;\n            varying highp vec2 rCoordinate;\n\n            uniform mat4 mvpMatrix;\n            uniform mat4 texMatrix;\n            uniform float paramIntensity;\n            uniform float imageWidthFactor;\n            uniform float imageHeightFactor;\n\n            void main() {\n                gl_Position = mvpMatrix * aPosition;\n                mediump vec2 offset = vec2( -imageWidthFactor, imageHeightFactor);\n                gbCoordinate = (texMatrix * aTextureCoord).xy;\n                rCoordinate = (texMatrix * aTextureCoord).xy + offset;\n            }\n        ", "\n            %s\n            precision highp float;\n            uniform %s sTexture;\n            uniform mediump float redFactor;\n            uniform mediump float greenFactor;\n            uniform mediump float blueFactor;\n            varying highp vec2 gbCoordinate;\n            varying highp vec2 rCoordinate;\n    \n            void main() {\n                gl_FragColor = vec4(texture2D(sTexture, rCoordinate).r * redFactor, texture2D(sTexture, gbCoordinate).g * greenFactor, texture2D(sTexture, gbCoordinate).b * blueFactor, 1.0);\n            }\n        ");
        float f3 = (i & 1) != 0 ? 1.0f : 0.7f;
        f = (i & 2) != 0 ? 1.0f : f;
        f2 = (i & 4) != 0 ? 1.0f : f2;
        this.s = f3;
        this.t = f;
        this.u = f2;
        this.v = 0.018518519f;
        this.w = 0.018518519f;
    }
}
