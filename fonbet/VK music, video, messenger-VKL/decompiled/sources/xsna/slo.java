package xsna;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.Arrays;

/* compiled from: DrawingPath.java */
/* loaded from: classes17.dex */
public final class slo {
    public final ppo a = new ppo();
    public final ppo b = new ppo();
    public final Path c = new Path();
    public boolean d = false;

    static {
        iah0.a(1);
    }

    public final Path a() {
        boolean z = this.d;
        Path path = this.c;
        if (z) {
            return path;
        }
        path.rewind();
        ppo ppoVar = this.a;
        if (ppoVar.b != 0) {
            float a = ppoVar.a(0);
            float a2 = this.b.a(0);
            path.moveTo(a, a2);
            path.lineTo(a + 1.0f, a2);
        }
        return path;
    }

    public final void b(Matrix matrix) {
        ppo ppoVar;
        ppo ppoVar2 = this.a;
        int i = ppoVar2.b * 2;
        float[] fArr = new float[i];
        int i2 = 0;
        while (true) {
            ppoVar = this.b;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 / 2;
            fArr[i2] = ppoVar2.a(i3);
            fArr[i2 + 1] = ppoVar.a(i3);
            i2 += 2;
        }
        matrix.mapPoints(fArr);
        ppoVar2.b = 0;
        ppoVar.b = 0;
        for (int i4 = 0; i4 < i; i4 += 2) {
            float f = fArr[i4];
            int i5 = ppoVar2.b + 1;
            float[] fArr2 = ppoVar2.a;
            int length = fArr2.length;
            if (i5 > length) {
                int i6 = length * 2;
                if (i6 >= i5) {
                    i5 = i6;
                }
                ppoVar2.a = Arrays.copyOf(fArr2, i5);
            }
            float[] fArr3 = ppoVar2.a;
            int i7 = ppoVar2.b;
            ppoVar2.b = i7 + 1;
            fArr3[i7] = f;
            float f2 = fArr[i4 + 1];
            int i8 = ppoVar.b + 1;
            float[] fArr4 = ppoVar.a;
            int length2 = fArr4.length;
            if (i8 > length2) {
                int i9 = length2 * 2;
                if (i9 >= i8) {
                    i8 = i9;
                }
                ppoVar.a = Arrays.copyOf(fArr4, i8);
            }
            float[] fArr5 = ppoVar.a;
            int i10 = ppoVar.b;
            ppoVar.b = i10 + 1;
            fArr5[i10] = f2;
        }
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || slo.class != obj.getClass()) {
            return false;
        }
        slo sloVar = (slo) obj;
        return this.d == sloVar.d && Arrays.equals(this.a.a, sloVar.a.a) && Arrays.equals(this.b.a, sloVar.b.a);
    }

    public final int hashCode() {
        return (((((Arrays.hashCode(this.b.a) + (Arrays.hashCode(this.a.a) * 31)) * 31) + 1) * 31) + (this.d ? 1 : 0)) * 31;
    }
}
