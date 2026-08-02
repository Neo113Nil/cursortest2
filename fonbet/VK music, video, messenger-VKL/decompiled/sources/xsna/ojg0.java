package xsna;

import android.opengl.GLES20;

/* compiled from: RgbFilter.kt */
/* loaded from: classes12.dex */
public final class ojg0 extends kax {
    public final float s;
    public final float t;
    public final float u;
    public int v;
    public int w;
    public int x;

    public ojg0() {
        this(1.0f, 1.0f, 1.0f);
    }

    @Override // xsna.kax, xsna.e0u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ojg0.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        ojg0 ojg0Var = (ojg0) obj;
        return this.s == ojg0Var.s && this.t == ojg0Var.t && this.u == ojg0Var.u;
    }

    @Override // xsna.kax, xsna.e0u
    public final int hashCode() {
        return Float.hashCode(this.u) + io.reactivex.rxjava3.subjects.b.a(this.t, io.reactivex.rxjava3.subjects.b.a(this.s, super.hashCode() * 31, 31), 31);
    }

    @Override // xsna.kax, xsna.e0u, xsna.umv
    public final void init() {
        super.init();
        this.v = f("red");
        this.w = f("green");
        this.x = f("blue");
    }

    @Override // xsna.kax, xsna.e0u, xsna.umv
    public final void onDraw() {
        super.onDraw();
        int i = this.v;
        float[] fArr = nap.a;
        GLES20.glUniform1f(i, this.s);
        GLES20.glUniform1f(this.w, this.t);
        GLES20.glUniform1f(this.x, this.u);
    }

    public ojg0(float f, float f2, float f3) {
        super("uniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = mvpMatrix * aPosition;   vTextureCoord = (texMatrix * aTextureCoord).xy;}\n", "\n%s\nprecision mediump float;\n\nvarying vec2 vTextureCoord;\n\nuniform %s sTexture;\nuniform highp float red;\nuniform highp float green;\nuniform highp float blue;\nuniform float paramIntensity;\n\nvoid main() {\n    vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    vec4 outputColor = vec4(textureColor.r * red, textureColor.g * green, textureColor.b * blue, 1.0);\n    gl_FragColor = mix(textureColor, outputColor, paramIntensity);\n}\n");
        this.s = f;
        this.t = f2;
        this.u = f3;
        this.v = -1;
        this.w = -1;
        this.x = -1;
    }
}
