package xsna;

import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import xsna.rt50;
import xsna.tsp0;

/* compiled from: H265Reader.java */
/* loaded from: classes12.dex */
public final class msu implements zap {
    public final e6i0 a;
    public String b;
    public rgp0 c;
    public a d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final qt50 g = new qt50(32);
    public final qt50 h = new qt50(33);
    public final qt50 i = new qt50(34);
    public final qt50 j = new qt50(39);
    public final qt50 k = new qt50(40);
    public long m = C.TIME_UNSET;
    public final xi90 n = new xi90();

    /* compiled from: H265Reader.java */
    public static final class a {
        public final rgp0 a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public a(rgp0 rgp0Var) {
            this.a = rgp0Var;
        }

        public final void a(int i) {
            long j = this.l;
            if (j != C.TIME_UNSET) {
                long j2 = this.b;
                long j3 = this.k;
                if (j2 == j3) {
                    return;
                }
                int i2 = (int) (j2 - j3);
                this.a.a(j, this.m ? 1 : 0, i2, i, null);
            }
        }
    }

    public msu(e6i0 e6i0Var) {
        this.a = e6i0Var;
    }

    @Override // xsna.zap
    public final void a(xi90 xi90Var) {
        int i;
        this.c.getClass();
        String str = y2r0.a;
        while (xi90Var.a() > 0) {
            int i2 = xi90Var.b;
            int i3 = xi90Var.c;
            byte[] bArr = xi90Var.a;
            this.l += xi90Var.a();
            this.c.d(xi90Var.a(), xi90Var);
            while (i2 < i3) {
                int b = rt50.b(bArr, i2, i3, this.f);
                if (b == i3) {
                    f(i2, i3, bArr);
                    return;
                }
                int i4 = (bArr[b + 3] & 126) >> 1;
                if (b <= 0 || bArr[b - 1] != 0) {
                    i = 3;
                } else {
                    b--;
                    i = 4;
                }
                int i5 = b;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    f(i2, i5, bArr);
                }
                int i8 = i3 - i5;
                long j = this.l - i8;
                e(i8, i7 < 0 ? -i7 : 0, j, this.m);
                g(j, i8, i4, this.m);
                i2 = i5 + i6;
            }
        }
    }

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        cVar.a();
        cVar.b();
        this.b = cVar.e;
        cVar.b();
        rgp0 track = rgqVar.track(cVar.d, 2);
        this.c = track;
        this.d = new a(track);
        this.a.a(rgqVar, cVar);
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        this.m = j;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
        this.c.getClass();
        String str = y2r0.a;
        if (z) {
            this.a.c.b(0);
            e(0, 0, this.l, this.m);
            g(this.l, 0, 48, this.m);
        }
    }

    public final void e(int i, int i2, long j, long j2) {
        f0g0 f0g0Var = this.a.c;
        a aVar = this.d;
        boolean z = this.e;
        if (aVar.j && aVar.g) {
            aVar.m = aVar.c;
            aVar.j = false;
        } else if (aVar.h || aVar.g) {
            if (z && aVar.i) {
                aVar.a(i + ((int) (j - aVar.b)));
            }
            aVar.k = aVar.b;
            aVar.l = aVar.e;
            aVar.m = aVar.c;
            aVar.i = true;
        }
        if (!this.e) {
            qt50 qt50Var = this.g;
            qt50Var.b(i2);
            qt50 qt50Var2 = this.h;
            qt50Var2.b(i2);
            qt50 qt50Var3 = this.i;
            qt50Var3.b(i2);
            if (qt50Var.c && qt50Var2.c && qt50Var3.c) {
                String str = this.b;
                int i3 = qt50Var.e;
                byte[] bArr = new byte[qt50Var2.e + i3 + qt50Var3.e];
                System.arraycopy(qt50Var.d, 0, bArr, 0, i3);
                System.arraycopy(qt50Var2.d, 0, bArr, qt50Var.e, qt50Var2.e);
                System.arraycopy(qt50Var3.d, 0, bArr, qt50Var.e + qt50Var2.e, qt50Var3.e);
                rt50.h i4 = rt50.i(qt50Var2.d, 3, qt50Var2.e, null);
                rt50.c cVar = i4.b;
                String a2 = cVar != null ? tzf.a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f) : null;
                a.C0043a c0043a = new a.C0043a();
                c0043a.a = str;
                c0043a.l = io20.q("video/mp2t");
                c0043a.m = io20.q("video/hevc");
                c0043a.j = a2;
                c0043a.t = i4.f;
                c0043a.u = i4.g;
                c0043a.v = i4.h;
                c0043a.w = i4.i;
                c0043a.C = new m6g(i4.l, i4.m, i4.n, i4.d + 8, i4.e + 8, null);
                c0043a.z = i4.j;
                c0043a.o = i4.k;
                c0043a.D = i4.a + 1;
                c0043a.p = Collections.singletonList(bArr);
                androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0043a);
                this.c.c(aVar2);
                int i5 = aVar2.p;
                fxc0.z(i5 != -1);
                f0g0Var.c(i5);
                this.e = true;
            }
        }
        qt50 qt50Var4 = this.j;
        boolean b = qt50Var4.b(i2);
        xi90 xi90Var = this.n;
        if (b) {
            xi90Var.N(qt50Var4.d, rt50.m(qt50Var4.d, qt50Var4.e));
            xi90Var.Q(5);
            f0g0Var.a(j2, xi90Var);
        }
        qt50 qt50Var5 = this.k;
        if (qt50Var5.b(i2)) {
            xi90Var.N(qt50Var5.d, rt50.m(qt50Var5.d, qt50Var5.e));
            xi90Var.Q(5);
            f0g0Var.a(j2, xi90Var);
        }
    }

    public final void f(int i, int i2, byte[] bArr) {
        a aVar = this.d;
        if (aVar.f) {
            int i3 = aVar.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                aVar.g = (bArr[i4] & 128) != 0;
                aVar.f = false;
            } else {
                aVar.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void g(long j, int i, int i2, long j2) {
        a aVar = this.d;
        boolean z = this.e;
        aVar.g = false;
        aVar.h = false;
        aVar.e = j2;
        aVar.d = 0;
        aVar.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (aVar.i && !aVar.j) {
                if (z) {
                    aVar.a(i);
                }
                aVar.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                aVar.h = !aVar.j;
                aVar.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        aVar.c = z2;
        aVar.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }

    @Override // xsna.zap
    public final void seek() {
        this.l = 0L;
        this.m = C.TIME_UNSET;
        rt50.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.a.c.b(0);
        a aVar = this.d;
        if (aVar != null) {
            aVar.f = false;
            aVar.g = false;
            aVar.h = false;
            aVar.i = false;
            aVar.j = false;
        }
    }
}
