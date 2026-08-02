package xsna;

import android.opengl.GLES20;

/* compiled from: IntensityFilter.kt */
/* loaded from: classes12.dex */
public abstract class kax extends e0u {
    public int q;
    public float r;

    public kax(String str, String str2) {
        super(str, str2);
        this.q = -1;
        this.r = 1.0f;
    }

    @Override // xsna.e0u
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kax) && super.equals(obj) && this.r == ((kax) obj).r;
    }

    @Override // xsna.e0u, xsna.umv
    public final void h(float f) {
        this.r = f;
    }

    @Override // xsna.e0u
    public int hashCode() {
        return Float.hashCode(this.r) + (super.hashCode() * 31);
    }

    @Override // xsna.e0u, xsna.umv
    public void init() {
        super.init();
        this.q = f("paramIntensity");
    }

    @Override // xsna.e0u, xsna.umv
    public void onDraw() {
        int i = this.q;
        if (i != -1) {
            GLES20.glUniform1f(i, g(this.r));
        }
    }

    @Override // xsna.e0u, xsna.umv
    public void release() {
        this.q = -1;
        super.release();
    }

    public float g(float f) {
        return f;
    }
}
