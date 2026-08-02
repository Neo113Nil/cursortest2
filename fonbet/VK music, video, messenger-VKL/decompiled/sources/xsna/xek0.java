package xsna;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Sonic.java */
/* loaded from: classes12.dex */
public final class xek0 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final b<?> i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    /* compiled from: Sonic.java */
    public final class a implements b<float[]> {
        public final float[] a;
        public float[] b;
        public float[] c;
        public float[] d;
        public double e;
        public double f;
        public double g;

        public a() {
            int i = xek0.this.h;
            this.a = new float[i];
            int i2 = i * xek0.this.b;
            this.b = new float[i2];
            this.c = new float[i2];
            this.d = new float[i2];
        }

        @Override // xsna.xek0.b
        public final void a(int i, ByteBuffer byteBuffer) {
            FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
            float[] fArr = this.c;
            xek0 xek0Var = xek0.this;
            asFloatBuffer.put(fArr, 0, xek0Var.b * i);
            byteBuffer.position((i * 4 * xek0Var.b) + byteBuffer.position());
        }

        @Override // xsna.xek0.b
        public final void b(int i) {
            this.c = r(this.c, xek0.this.k, i);
        }

        @Override // xsna.xek0.b
        public final boolean c() {
            double d = this.e;
            return d != ConnectivityTracker.DEFAULT_UPLINK_BITRATE && xek0.this.p != 0 && this.f <= d * 3.0d && d * 2.0d > this.g * 3.0d;
        }

        @Override // xsna.xek0.b
        public final void d(int i) {
            this.b = r(this.b, xek0.this.j, i);
        }

        @Override // xsna.xek0.b
        public final float[] e() {
            return this.b;
        }

        @Override // xsna.xek0.b
        public final int f() {
            return 4;
        }

        @Override // xsna.xek0.b
        public final void flush() {
            this.g = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.e = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.f = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }

        @Override // xsna.xek0.b
        public final void g(int i, int i2) {
            xek0 xek0Var = xek0.this;
            int i3 = xek0Var.h / i2;
            int i4 = xek0Var.b;
            int i5 = i2 * i4;
            int i6 = i * i4;
            for (int i7 = 0; i7 < i3; i7++) {
                double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                for (int i8 = 0; i8 < i5; i8++) {
                    d += this.b[rqi.a(i7, i5, i6, i8)];
                }
                this.a[i7] = (float) (d / i5);
            }
        }

        @Override // xsna.xek0.b
        public final int h(int i, int i2, int i3) {
            return s(i, i2, i3, this.b);
        }

        @Override // xsna.xek0.b
        public final void i(int i, long j, long j2) {
            int i2 = 0;
            while (true) {
                xek0 xek0Var = xek0.this;
                int i3 = xek0Var.b;
                if (i2 >= i3) {
                    return;
                }
                float[] fArr = this.c;
                int i4 = (xek0Var.k * i3) + i2;
                float[] fArr2 = this.d;
                int i5 = (i * i3) + i2;
                float f = fArr2[i5];
                float f2 = fArr2[i5 + i3];
                long j3 = xek0Var.n * j;
                long j4 = (r1 + 1) * j2;
                long j5 = j4 - j3;
                fArr[i4] = (((r10 - j5) * f2) + (j5 * f)) / (j4 - (xek0Var.m * j2));
                i2++;
            }
        }

        @Override // xsna.xek0.b
        public final float[] j() {
            return this.d;
        }

        @Override // xsna.xek0.b
        public final void k(int i) {
            this.d = r(this.d, xek0.this.l, i);
        }

        @Override // xsna.xek0.b
        public final void l(int i, ByteBuffer byteBuffer) {
            FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
            float[] fArr = this.b;
            xek0 xek0Var = xek0.this;
            asFloatBuffer.get(fArr, xek0Var.j * xek0Var.b, i / 4);
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // xsna.xek0.b
        public final void m(int i, int i2) {
            for (int i3 = 0; i3 < xek0.this.b * i2; i3++) {
                this.b[i + i3] = 0.0f;
            }
        }

        @Override // xsna.xek0.b
        public final int n(int i, int i2) {
            return s(0, i, i2, this.a);
        }

        @Override // xsna.xek0.b
        public final void o(int i, int i2, int i3, int i4, int i5) {
            float[] fArr = this.c;
            float[] fArr2 = this.b;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = (i3 * i2) + i6;
                int i8 = (i5 * i2) + i6;
                int i9 = (i4 * i2) + i6;
                for (int i10 = 0; i10 < i; i10++) {
                    fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                    i7 += i2;
                    i9 += i2;
                    i8 += i2;
                }
            }
        }

        @Override // xsna.xek0.b
        public final void p() {
            this.g = this.e;
        }

        @Override // xsna.xek0.b
        public final float[] q() {
            return this.c;
        }

        public final float[] r(float[] fArr, int i, int i2) {
            int length = fArr.length;
            int i3 = xek0.this.b;
            int i4 = length / i3;
            return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
        }

        public final int s(int i, int i2, int i3, float[] fArr) {
            int i4 = xek0.this.b * i;
            double d = 1.0d;
            int i5 = 0;
            double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            int i6 = 255;
            int i7 = i2;
            while (i7 <= i3) {
                double d3 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                for (int i8 = 0; i8 < i7; i8++) {
                    d3 += Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
                }
                int i9 = i4;
                double d4 = i7;
                if (i5 * d3 < d * d4) {
                    i5 = i7;
                    d = d3;
                }
                if (i6 * d3 > d4 * d2) {
                    i6 = i7;
                    d2 = d3;
                }
                i7++;
                i4 = i9;
            }
            this.e = d / i5;
            this.f = d2 / i6;
            return i5;
        }
    }

    /* compiled from: Sonic.java */
    public interface b<T> {
        void a(int i, ByteBuffer byteBuffer);

        void b(int i);

        boolean c();

        void d(int i);

        T e();

        int f();

        void flush();

        void g(int i, int i2);

        int h(int i, int i2, int i3);

        void i(int i, long j, long j2);

        T j();

        void k(int i);

        void l(int i, ByteBuffer byteBuffer);

        void m(int i, int i2);

        int n(int i, int i2);

        void o(int i, int i2, int i3, int i4, int i5);

        void p();

        T q();
    }

    /* compiled from: Sonic.java */
    public final class c implements b<short[]> {
        public final short[] a;
        public short[] b;
        public short[] c;
        public short[] d;
        public int e;
        public int f;
        public int g;

        public c() {
            int i = xek0.this.h;
            this.a = new short[i];
            int i2 = i * xek0.this.b;
            this.b = new short[i2];
            this.c = new short[i2];
            this.d = new short[i2];
        }

        @Override // xsna.xek0.b
        public final void a(int i, ByteBuffer byteBuffer) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            short[] sArr = this.c;
            xek0 xek0Var = xek0.this;
            asShortBuffer.put(sArr, 0, xek0Var.b * i);
            byteBuffer.position((i * 2 * xek0Var.b) + byteBuffer.position());
        }

        @Override // xsna.xek0.b
        public final void b(int i) {
            this.c = r(this.c, xek0.this.k, i);
        }

        @Override // xsna.xek0.b
        public final boolean c() {
            int i = this.e;
            return i != 0 && xek0.this.p != 0 && this.f <= i * 3 && i * 2 > this.g * 3;
        }

        @Override // xsna.xek0.b
        public final void d(int i) {
            this.b = r(this.b, xek0.this.j, i);
        }

        @Override // xsna.xek0.b
        public final short[] e() {
            return this.b;
        }

        @Override // xsna.xek0.b
        public final int f() {
            return 2;
        }

        @Override // xsna.xek0.b
        public final void flush() {
            this.g = 0;
            this.e = 0;
            this.f = 0;
        }

        @Override // xsna.xek0.b
        public final void g(int i, int i2) {
            short[] sArr = this.b;
            xek0 xek0Var = xek0.this;
            int i3 = xek0Var.h / i2;
            int i4 = xek0Var.b;
            int i5 = i2 * i4;
            int i6 = i * i4;
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    i8 += sArr[rqi.a(i7, i5, i6, i9)];
                }
                this.a[i7] = (short) (i8 / i5);
            }
        }

        @Override // xsna.xek0.b
        public final int h(int i, int i2, int i3) {
            return s(this.b, i, i2, i3);
        }

        @Override // xsna.xek0.b
        public final void i(int i, long j, long j2) {
            int i2 = 0;
            while (true) {
                xek0 xek0Var = xek0.this;
                int i3 = xek0Var.b;
                if (i2 >= i3) {
                    return;
                }
                short[] sArr = this.c;
                int i4 = (xek0Var.k * i3) + i2;
                short[] sArr2 = this.d;
                int i5 = (i * i3) + i2;
                short s = sArr2[i5];
                short s2 = sArr2[i5 + i3];
                long j3 = xek0Var.n * j;
                long j4 = (r1 + 1) * j2;
                long j5 = j4 - j3;
                long j6 = j4 - (xek0Var.m * j2);
                sArr[i4] = (short) ((((j6 - j5) * s2) + (s * j5)) / j6);
                i2++;
            }
        }

        @Override // xsna.xek0.b
        public final short[] j() {
            return this.d;
        }

        @Override // xsna.xek0.b
        public final void k(int i) {
            this.d = r(this.d, xek0.this.l, i);
        }

        @Override // xsna.xek0.b
        public final void l(int i, ByteBuffer byteBuffer) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            short[] sArr = this.b;
            xek0 xek0Var = xek0.this;
            asShortBuffer.get(sArr, xek0Var.j * xek0Var.b, i / 2);
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // xsna.xek0.b
        public final void m(int i, int i2) {
            for (int i3 = 0; i3 < xek0.this.b * i2; i3++) {
                this.b[i + i3] = 0;
            }
        }

        @Override // xsna.xek0.b
        public final int n(int i, int i2) {
            return s(this.a, 0, i, i2);
        }

        @Override // xsna.xek0.b
        public final void o(int i, int i2, int i3, int i4, int i5) {
            short[] sArr = this.c;
            short[] sArr2 = this.b;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = (i3 * i2) + i6;
                int i8 = (i5 * i2) + i6;
                int i9 = (i4 * i2) + i6;
                for (int i10 = 0; i10 < i; i10++) {
                    sArr[i7] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                    i7 += i2;
                    i9 += i2;
                    i8 += i2;
                }
            }
        }

        @Override // xsna.xek0.b
        public final void p() {
            this.g = this.e;
        }

        @Override // xsna.xek0.b
        public final short[] q() {
            return this.c;
        }

        public final short[] r(short[] sArr, int i, int i2) {
            int length = sArr.length;
            int i3 = xek0.this.b;
            int i4 = length / i3;
            return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
        }

        public final int s(short[] sArr, int i, int i2, int i3) {
            int i4 = i * xek0.this.b;
            int i5 = 255;
            int i6 = 1;
            int i7 = 0;
            int i8 = 0;
            while (i2 <= i3) {
                int i9 = 0;
                for (int i10 = 0; i10 < i2; i10++) {
                    i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
                }
                if (i9 * i7 < i6 * i2) {
                    i7 = i2;
                    i6 = i9;
                }
                if (i9 * i5 > i8 * i2) {
                    i5 = i2;
                    i8 = i9;
                }
                i2++;
            }
            this.e = i6 / i7;
            this.f = i8 / i5;
            return i7;
        }
    }

    public xek0(int i, int i2, float f, float f2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        this.h = i4 * 2;
        this.i = z ? new a() : new c();
    }

    public final void a(int i, int i2) {
        b<?> bVar = this.i;
        bVar.b(i2);
        Object e = bVar.e();
        int i3 = this.b;
        System.arraycopy(e, i * i3, bVar.q(), this.k * i3, i3 * i2);
        this.k += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        float f;
        int i;
        double d;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        long j2;
        int i9 = this.k;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i10 = this.a;
        int i11 = 1;
        b<?> bVar = this.i;
        int i12 = this.b;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i13 = this.j;
            int i14 = this.h;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.o;
                    if (i16 > 0) {
                        int min = Math.min(i14, i16);
                        a(i15, min);
                        this.o -= min;
                        i15 += min;
                        f = f4;
                        d = d2;
                        i4 = i11;
                        i2 = i14;
                    } else {
                        int i17 = i10 > 4000 ? i10 / 4000 : i11;
                        int i18 = this.g;
                        int i19 = this.f;
                        if (i12 == i11 && i17 == i11) {
                            i = bVar.h(i15, i19, i18);
                            f = f4;
                        } else {
                            bVar.g(i15, i17);
                            f = f4;
                            int n = bVar.n(i19 / i17, i18 / i17);
                            if (i17 != i11) {
                                int i20 = n * i17;
                                int i21 = i17 * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 >= i19) {
                                    i19 = i22;
                                }
                                if (i23 <= i18) {
                                    i18 = i23;
                                }
                                if (i12 == i11) {
                                    i = bVar.h(i15, i19, i18);
                                } else {
                                    bVar.g(i15, i11);
                                    i = bVar.n(i19, i18);
                                }
                            } else {
                                i = n;
                            }
                        }
                        int i24 = bVar.c() ? this.p : i;
                        bVar.p();
                        this.p = i;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                i5 = i11;
                                double d3 = (i24 / (d2 - 1.0d)) + this.q;
                                i6 = (int) Math.round(d3);
                                d = d2;
                                this.q = d3 - i6;
                                bVar = bVar;
                            } else {
                                d = d2;
                                i5 = i11;
                                double d4 = (((2.0d - d) * i24) / (d - 1.0d)) + this.q;
                                int round = (int) Math.round(d4);
                                this.o = round;
                                this.q = d4 - round;
                                i6 = i24;
                            }
                            bVar.b(i6);
                            int i25 = i14;
                            int i26 = i6;
                            bVar.o(i26, this.b, this.k, i15, i15 + i24);
                            this.k += i26;
                            i15 = i24 + i26 + i15;
                            i2 = i25;
                            i4 = i5;
                        } else {
                            d = d2;
                            int i27 = i11;
                            int i28 = i14;
                            if (d < 0.5d) {
                                i2 = i28;
                                double d5 = ((i24 * d) / (1.0d - d)) + this.q;
                                int round2 = (int) Math.round(d5);
                                this.q = d5 - round2;
                                i3 = round2;
                            } else {
                                i2 = i28;
                                double d6 = ((((d * 2.0d) - 1.0d) * i24) / (1.0d - d)) + this.q;
                                int round3 = (int) Math.round(d6);
                                this.o = round3;
                                this.q = d6 - round3;
                                i3 = i24;
                            }
                            int i29 = i24 + i3;
                            bVar.b(i29);
                            i4 = i27;
                            System.arraycopy(bVar.e(), i15 * i12, bVar.q(), this.k * i12, i24 * i12);
                            int i30 = i15;
                            bVar.o(i3, this.b, this.k + i24, i24 + i15, i30);
                            this.k += i29;
                            i15 = i30 + i3;
                        }
                    }
                    if (i15 + i2 > i13) {
                        break;
                    }
                    i14 = i2;
                    f4 = f;
                    i11 = i4;
                    d2 = d;
                }
                int i31 = this.j - i15;
                System.arraycopy(bVar.e(), i15 * i12, bVar.e(), 0, i31 * i12);
                this.j = i31;
                if (f != 1.0f || this.k == i9) {
                }
                long j3 = (long) (i10 / f);
                long j4 = i10;
                while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                    j3 /= 2;
                    j4 /= 2;
                }
                int i32 = this.k - i9;
                bVar.k(i32);
                System.arraycopy(bVar.q(), i9 * i12, bVar.j(), this.l * i12, i32 * i12);
                this.k = i9;
                this.l += i32;
                int i33 = 0;
                while (true) {
                    i7 = this.l - 1;
                    if (i33 >= i7) {
                        break;
                    }
                    while (true) {
                        i8 = this.m + 1;
                        j = i8;
                        long j5 = j * j3;
                        j2 = this.n;
                        if (j5 <= j2 * j4) {
                            break;
                        }
                        int i34 = i4;
                        bVar.b(i34);
                        bVar.i(i33, j4, j3);
                        this.n += i34;
                        this.k += i34;
                    }
                    int i35 = i4;
                    this.m = i8;
                    if (j == j4) {
                        this.m = 0;
                        fxc0.z(j2 == j3 ? i35 : 0);
                        this.n = 0;
                    }
                    i33++;
                    i4 = i35;
                }
                if (i7 == 0) {
                    return;
                }
                System.arraycopy(bVar.j(), i7 * i12, bVar.j(), 0, (this.l - i7) * i12);
                this.l -= i7;
                return;
            }
        } else {
            a(0, this.j);
            this.j = 0;
        }
        f = f4;
        i4 = 1;
        if (f != 1.0f) {
        }
    }
}
