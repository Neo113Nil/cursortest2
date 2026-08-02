package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes11.dex */
public abstract class lr20 {
    public static final f43 a = new f43(6);
    public static final f43 b = new f43(5);
    public static final g43 c = new g43(1);
    public static final g43 d = new g43(0);
    public static final m501 e;
    public static final r501 f;
    public static final q501 g;
    public static final o501 h;

    static {
        int i = 7;
        e = new m501(i);
        f = new r501(i);
        g = new q501(i);
        h = new o501(i);
    }

    public static final lum a() {
        return new lum(new jiz0(25), va21.a, new mtw(26), wa21.a);
    }

    public static void b(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f2 = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i7;
        }
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = iArr.length == 0 ? 0.0f : (i - i3) / iArr.length;
        float f2 = length / 2.0f;
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i7 = iArr[length3];
            iArr2[length3] = Math.round(f2);
            f2 += i7 + length;
        }
    }

    public static void d(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float max = (i - i3) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? max : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i5 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f2);
            f2 += i7 + max;
            i2++;
            i6++;
        }
    }

    public static void e(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f3);
            f3 += i7 + length;
            i2++;
            i6++;
        }
    }

    public static final void f(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        if (j < 0) {
            ny61.g("Failed requirement.");
            return;
        }
        if (j < Math.pow(256.0d, i)) {
            while (i > 0) {
                int i2 = (i - 1) * 8;
                byteArrayOutputStream.write((byte) (((255 << i2) & j) >> i2));
                i--;
            }
            return;
        }
        throw new IllegalArgumentException(("Value " + j + " cannot be stored in " + i + " bytes").toString());
    }

    public static final void g(int i, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        if (bArr.length > i) {
            ny61.g("Failed requirement.");
            return;
        }
        f(byteArrayOutputStream, bArr.length, (int) (Math.ceil(Math.log(i) / z6e.a) / 8.0d));
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }
}
