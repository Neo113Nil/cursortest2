package xsna;

import android.opengl.Matrix;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* compiled from: VideoEncoder.java */
/* loaded from: classes12.dex */
public final class yis0 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final float[] e;
    public final float[] f;

    public yis0(int i, boolean z, int i2, int i3, float[] fArr, float[] fArr2) {
        float[] fArr3;
        float[] fArr4;
        this.a = i;
        this.d = z;
        this.b = i2;
        this.c = i3;
        if (fArr == null || fArr.length != 16) {
            fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
        } else {
            fArr3 = Arrays.copyOf(fArr, fArr.length);
        }
        this.e = fArr3;
        if (fArr2 == null || fArr2.length != 16) {
            float[] fArr5 = new float[16];
            Matrix.setIdentityM(fArr5, 0);
            fArr4 = fArr5;
        } else {
            fArr4 = Arrays.copyOf(fArr2, fArr2.length);
        }
        this.f = fArr4;
    }

    public final boolean a() {
        return this.a >= 0 && this.b > 0 && this.c > 0;
    }

    public final Object clone() throws CloneNotSupportedException {
        return new yis0(this.a, this.d, this.b, this.c, this.e, this.f);
    }

    @NonNull
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
