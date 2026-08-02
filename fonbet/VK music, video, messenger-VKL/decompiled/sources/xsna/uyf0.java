package xsna;

import android.opengl.Matrix;
import java.util.Arrays;

/* compiled from: RenderUtils.java */
/* loaded from: classes3.dex */
public final class uyf0 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final float[] e;
    public final float[] f;

    public uyf0(int i, boolean z, int i2, int i3, float[] fArr, float[] fArr2) {
        this.a = i;
        this.d = z;
        this.b = i2;
        this.c = i3;
        this.e = a(fArr);
        this.f = a(fArr2);
    }

    public static float[] a(float[] fArr) {
        if (fArr != null && fArr.length != 16) {
            throw new IllegalArgumentException("matrix length should be 16, not " + fArr.length);
        }
        if (fArr != null) {
            return Arrays.copyOf(fArr, fArr.length);
        }
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        return fArr2;
    }

    public final Object clone() throws CloneNotSupportedException {
        return new uyf0(this.a, this.d, this.b, this.c, this.e, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ texName=");
        sb.append(this.a);
        sb.append(this.d ? " (ext)" : "");
        sb.append(" ");
        sb.append(this.b);
        sb.append("x");
        sb.append(this.c);
        sb.append(" mvp=");
        sb.append(Arrays.toString(this.e));
        sb.append(" st=");
        sb.append(Arrays.toString(this.f));
        sb.append(" }");
        return sb.toString();
    }
}
