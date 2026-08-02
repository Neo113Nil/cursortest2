package defpackage;

/* loaded from: classes15.dex */
public final class l0z0 {
    public final int a;
    public final int b;
    public float c;
    public final float[] d;
    public float e;

    public l0z0(int i, int i2) {
        this.a = i;
        this.b = i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            for (int i5 = i3 > 0 ? 0 : 1; i5 * i2 < (i2 - i3) * i; i5++) {
                i4++;
            }
            i3++;
        }
        this.d = new float[i4];
    }

    public final void a(int i, int i2, float[] fArr) {
        float[] fArr2;
        double d;
        float[] fArr3 = new float[i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            fArr2 = this.d;
            int i5 = this.b;
            float f = 0.5f;
            if (i3 >= i5) {
                break;
            }
            int i6 = 0;
            while (i6 * i5 < (i5 - i3) * this.a) {
                int i7 = 0;
                while (true) {
                    d = 3.141592653589793d;
                    if (i7 >= i) {
                        break;
                    }
                    fArr3[i7] = (float) Math.cos((3.141592653589793d / i) * i6 * (i7 + f));
                    i7++;
                    i5 = i5;
                }
                int i8 = i5;
                int i9 = 0;
                float f2 = 0.0f;
                while (i9 < i2) {
                    float f3 = f;
                    int i10 = i6;
                    float cos = (float) Math.cos((d / i2) * i3 * (i9 + f3));
                    for (int i11 = 0; i11 < i; i11++) {
                        f2 += fArr[(i9 * i) + i11] * fArr3[i11] * cos;
                    }
                    i9++;
                    f = f3;
                    i6 = i10;
                    d = 3.141592653589793d;
                }
                float f4 = f;
                int i12 = i6;
                float f5 = f2 / (i * i2);
                if (i12 > 0 || i3 > 0) {
                    fArr2[i4] = f5;
                    this.e = Math.max(this.e, Math.abs(f5));
                    i4++;
                } else {
                    this.c = f5;
                }
                i6 = i12 + 1;
                f = f4;
                i5 = i8;
            }
            i3++;
        }
        if (this.e > 0.0f) {
            for (int i13 = 0; i13 < fArr2.length; i13++) {
                fArr2[i13] = ((0.5f / this.e) * fArr2[i13]) + 0.5f;
            }
        }
    }

    public final int b(byte[] bArr, int i, int i2) {
        for (float f : this.d) {
            int i3 = (i2 >> 1) + i;
            bArr[i3] = (byte) ((Math.round(f * 15.0f) << ((i2 & 1) << 2)) | bArr[i3]);
            i2++;
        }
        return i2;
    }
}
