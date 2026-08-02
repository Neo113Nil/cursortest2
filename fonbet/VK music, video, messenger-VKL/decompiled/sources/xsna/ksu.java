package xsna;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.rt50;
import xsna.tsp0;

/* compiled from: H264Reader.java */
/* loaded from: classes12.dex */
public final class ksu implements zap {
    public final e6i0 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public rgp0 j;
    public a k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final qt50 d = new qt50(7);
    public final qt50 e = new qt50(8);
    public final qt50 f = new qt50(6);
    public long m = C.TIME_UNSET;
    public final xi90 o = new xi90();

    /* compiled from: H264Reader.java */
    public static final class a {
        public final rgp0 a;
        public final boolean b;
        public final boolean c;
        public final yi90 f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public long l;
        public long p;
        public long q;
        public boolean r;
        public boolean s;
        public final SparseArray<rt50.m> d = new SparseArray<>();
        public final SparseArray<rt50.l> e = new SparseArray<>();
        public C3204a m = new C3204a();
        public C3204a n = new C3204a();
        public boolean k = false;
        public boolean o = false;

        /* compiled from: H264Reader.java */
        /* renamed from: xsna.ksu$a$a, reason: collision with other inner class name */
        public static final class C3204a {
            public boolean a;
            public boolean b;

            @Nullable
            public rt50.m c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;
        }

        public a(rgp0 rgp0Var, boolean z, boolean z2) {
            this.a = rgp0Var;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new yi90(bArr, 0, 0);
            C3204a c3204a = this.n;
            c3204a.b = false;
            c3204a.a = false;
        }
    }

    public ksu(e6i0 e6i0Var, boolean z, boolean z2) {
        this.a = e6i0Var;
        this.b = z;
        this.c = z2;
    }

    @Override // xsna.zap
    public final void a(xi90 xi90Var) {
        int i;
        this.j.getClass();
        String str = y2r0.a;
        int i2 = xi90Var.b;
        int i3 = xi90Var.c;
        byte[] bArr = xi90Var.a;
        this.g += xi90Var.a();
        this.j.d(xi90Var.a(), xi90Var);
        while (true) {
            int b = rt50.b(bArr, i2, i3, this.h);
            if (b == i3) {
                f(bArr, i2, i3);
                return;
            }
            int i4 = bArr[b + 3] & 31;
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
                f(bArr, i2, i5);
            }
            int i8 = i3 - i5;
            long j = this.g - i8;
            e(j, i8, i7 < 0 ? -i7 : 0, this.m);
            g(j, i4, this.m);
            i2 = i5 + i6;
        }
    }

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        cVar.a();
        cVar.b();
        this.i = cVar.e;
        cVar.b();
        rgp0 track = rgqVar.track(cVar.d, 2);
        this.j = track;
        this.k = new a(track, this.b, this.c);
        this.a.a(rgqVar, cVar);
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
        this.j.getClass();
        String str = y2r0.a;
        if (z) {
            this.a.c.b(0);
            e(this.g, 0, 0, this.m);
            g(this.g, 9, this.m);
            e(this.g, 0, 0, this.m);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a6, code lost:
    
        if (r3.j == r4.j) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b0, code lost:
    
        if (r9 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c2, code lost:
    
        if (r3.n == r4.n) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d3, code lost:
    
        if (r3.p == r4.p) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e1, code lost:
    
        if (r3.l == r4.l) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023c, code lost:
    
        if (r3 == 1) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j, int i, int i2, long j2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        f0g0 f0g0Var = this.a.c;
        if (!this.l || this.k.c) {
            qt50 qt50Var = this.d;
            qt50Var.b(i2);
            qt50 qt50Var2 = this.e;
            qt50Var2.b(i2);
            if (this.l) {
                if (qt50Var.c) {
                    rt50.m k = rt50.k(3, qt50Var.e, qt50Var.d);
                    f0g0Var.c(k.s);
                    this.k.d.append(k.d, k);
                    qt50Var.c();
                } else if (qt50Var2.c) {
                    yi90 yi90Var = new yi90(qt50Var2.d, 4, qt50Var2.e);
                    int f = yi90Var.f();
                    int f2 = yi90Var.f();
                    yi90Var.i();
                    this.k.e.append(f, new rt50.l(f, f2, yi90Var.d()));
                    qt50Var2.c();
                }
            } else if (qt50Var.c && qt50Var2.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(qt50Var.d, qt50Var.e));
                arrayList.add(Arrays.copyOf(qt50Var2.d, qt50Var2.e));
                rt50.m k2 = rt50.k(3, qt50Var.e, qt50Var.d);
                int i5 = k2.s;
                yi90 yi90Var2 = new yi90(qt50Var2.d, 4, qt50Var2.e);
                int f3 = yi90Var2.f();
                int f4 = yi90Var2.f();
                yi90Var2.i();
                rt50.l lVar = new rt50.l(f3, f4, yi90Var2.d());
                int i6 = k2.a;
                int i7 = k2.b;
                int i8 = k2.c;
                byte[] bArr = tzf.a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
                rgp0 rgp0Var = this.j;
                a.C0043a c0043a = new a.C0043a();
                c0043a.a = this.i;
                c0043a.l = io20.q("video/mp2t");
                c0043a.m = io20.q("video/avc");
                c0043a.j = format;
                c0043a.t = k2.e;
                c0043a.u = k2.f;
                c0043a.C = new m6g(k2.p, k2.q, k2.r, k2.h + 8, k2.i + 8, null);
                c0043a.z = k2.g;
                c0043a.p = arrayList;
                c0043a.o = i5;
                zjh0.d(c0043a, rgp0Var);
                this.l = true;
                f0g0Var.c(i5);
                this.k.d.append(k2.d, k2);
                this.k.e.append(f3, lVar);
                qt50Var.c();
                qt50Var2.c();
            }
        }
        qt50 qt50Var3 = this.f;
        if (qt50Var3.b(i2)) {
            int m = rt50.m(qt50Var3.d, qt50Var3.e);
            byte[] bArr2 = qt50Var3.d;
            xi90 xi90Var = this.o;
            xi90Var.N(bArr2, m);
            xi90Var.P(4);
            f0g0Var.a(j2, xi90Var);
        }
        a aVar = this.k;
        boolean z4 = this.l;
        if (aVar.i != 9) {
            if (aVar.c) {
                a.C3204a c3204a = aVar.n;
                a.C3204a c3204a2 = aVar.m;
                if (c3204a.a) {
                    if (c3204a2.a) {
                        rt50.m mVar = c3204a.c;
                        mVar.getClass();
                        rt50.m mVar2 = c3204a2.c;
                        mVar2.getClass();
                        int i9 = mVar2.m;
                        if (c3204a.f == c3204a2.f) {
                            if (c3204a.g == c3204a2.g) {
                                if (c3204a.h == c3204a2.h) {
                                    if (c3204a.i) {
                                        if (c3204a2.i) {
                                        }
                                    }
                                    int i10 = c3204a.d;
                                    int i11 = c3204a2.d;
                                    if (i10 != i11) {
                                        if (i10 != 0) {
                                        }
                                    }
                                    int i12 = mVar.m;
                                    if (i12 == 0) {
                                        if (i9 == 0) {
                                            if (c3204a.m == c3204a2.m) {
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                        if (i9 == 1) {
                                            if (c3204a.o == c3204a2.o) {
                                            }
                                        }
                                    }
                                    boolean z5 = c3204a.k;
                                    if (z5 == c3204a2.k) {
                                        if (z5) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (aVar.b) {
                z = aVar.s;
            } else {
                a.C3204a c3204a3 = aVar.n;
                z = c3204a3.b && ((i4 = c3204a3.e) == 7 || i4 == 2);
            }
            boolean z6 = aVar.r;
            i3 = aVar.i;
            if (i3 == 5) {
                if (z) {
                    z2 = true;
                }
                z2 = false;
            } else {
                z2 = true;
            }
            z3 = z6 | z2;
            aVar.r = z3;
            aVar.i = 24;
            if (z3) {
                return;
            }
            this.n = false;
            return;
        }
        if (z4 && aVar.o) {
            long j3 = aVar.j;
            int i13 = i + ((int) (j - j3));
            long j4 = aVar.q;
            if (j4 != C.TIME_UNSET) {
                long j5 = aVar.p;
                if (j3 != j5) {
                    aVar.a.a(j4, aVar.r ? 1 : 0, (int) (j3 - j5), i13, null);
                }
            }
        }
        aVar.p = aVar.j;
        aVar.q = aVar.l;
        aVar.r = false;
        aVar.o = true;
        if (aVar.b) {
        }
        boolean z62 = aVar.r;
        i3 = aVar.i;
        if (i3 == 5) {
        }
        z3 = z62 | z2;
        aVar.r = z3;
        aVar.i = 24;
        if (z3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.l || this.k.c) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        a aVar = this.k;
        SparseArray<rt50.l> sparseArray = aVar.e;
        yi90 yi90Var = aVar.f;
        if (aVar.k) {
            int i9 = i2 - i;
            byte[] bArr2 = aVar.g;
            int length = bArr2.length;
            int i10 = aVar.h + i9;
            if (length < i10) {
                aVar.g = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i, aVar.g, aVar.h, i9);
            int i11 = aVar.h + i9;
            aVar.h = i11;
            yi90Var.a = aVar.g;
            yi90Var.c = 0;
            yi90Var.b = i11;
            yi90Var.d = 0;
            yi90Var.a();
            if (yi90Var.b(8)) {
                yi90Var.i();
                int e = yi90Var.e(2);
                yi90Var.j(5);
                if (yi90Var.c()) {
                    yi90Var.f();
                    if (yi90Var.c()) {
                        int f = yi90Var.f();
                        if (!aVar.c) {
                            aVar.k = false;
                            a.C3204a c3204a = aVar.n;
                            c3204a.e = f;
                            c3204a.b = true;
                            return;
                        }
                        if (yi90Var.c()) {
                            int f2 = yi90Var.f();
                            if (sparseArray.indexOfKey(f2) < 0) {
                                aVar.k = false;
                                return;
                            }
                            rt50.l lVar = sparseArray.get(f2);
                            SparseArray<rt50.m> sparseArray2 = aVar.d;
                            int i12 = lVar.a;
                            boolean z5 = lVar.b;
                            rt50.m mVar = sparseArray2.get(i12);
                            boolean z6 = mVar.j;
                            int i13 = mVar.n;
                            int i14 = mVar.l;
                            if (z6) {
                                if (!yi90Var.b(2)) {
                                    return;
                                } else {
                                    yi90Var.j(2);
                                }
                            }
                            if (yi90Var.b(i14)) {
                                int e2 = yi90Var.e(i14);
                                if (mVar.k) {
                                    z = false;
                                    z2 = false;
                                } else {
                                    if (!yi90Var.b(1)) {
                                        return;
                                    }
                                    z = yi90Var.d();
                                    if (z) {
                                        if (yi90Var.b(1)) {
                                            z2 = yi90Var.d();
                                            z3 = true;
                                            z4 = aVar.i != 5;
                                            if (z4) {
                                                i3 = 0;
                                            } else if (!yi90Var.c()) {
                                                return;
                                            } else {
                                                i3 = yi90Var.f();
                                            }
                                            i4 = mVar.m;
                                            if (i4 != 0) {
                                                if (!yi90Var.b(i13)) {
                                                    return;
                                                }
                                                i7 = yi90Var.e(i13);
                                                if (!z5 || z) {
                                                    i5 = 0;
                                                } else if (!yi90Var.c()) {
                                                    return;
                                                } else {
                                                    i5 = yi90Var.g();
                                                }
                                                i6 = 0;
                                            } else {
                                                if (i4 == 1 && !mVar.o) {
                                                    if (yi90Var.c()) {
                                                        int g = yi90Var.g();
                                                        if (!z5 || z) {
                                                            i8 = g;
                                                            i5 = 0;
                                                            i6 = 0;
                                                        } else {
                                                            if (!yi90Var.c()) {
                                                                return;
                                                            }
                                                            i6 = yi90Var.g();
                                                            i8 = g;
                                                            i5 = 0;
                                                        }
                                                        i7 = 0;
                                                        a.C3204a c3204a2 = aVar.n;
                                                        c3204a2.c = mVar;
                                                        c3204a2.d = e;
                                                        c3204a2.e = f;
                                                        c3204a2.f = e2;
                                                        c3204a2.g = f2;
                                                        c3204a2.h = z;
                                                        c3204a2.i = z3;
                                                        c3204a2.j = z2;
                                                        c3204a2.k = z4;
                                                        c3204a2.l = i3;
                                                        c3204a2.m = i7;
                                                        c3204a2.n = i5;
                                                        c3204a2.o = i8;
                                                        c3204a2.p = i6;
                                                        c3204a2.a = true;
                                                        c3204a2.b = true;
                                                        aVar.k = false;
                                                    }
                                                    return;
                                                }
                                                i5 = 0;
                                                i6 = 0;
                                                i7 = 0;
                                            }
                                            i8 = 0;
                                            a.C3204a c3204a22 = aVar.n;
                                            c3204a22.c = mVar;
                                            c3204a22.d = e;
                                            c3204a22.e = f;
                                            c3204a22.f = e2;
                                            c3204a22.g = f2;
                                            c3204a22.h = z;
                                            c3204a22.i = z3;
                                            c3204a22.j = z2;
                                            c3204a22.k = z4;
                                            c3204a22.l = i3;
                                            c3204a22.m = i7;
                                            c3204a22.n = i5;
                                            c3204a22.o = i8;
                                            c3204a22.p = i6;
                                            c3204a22.a = true;
                                            c3204a22.b = true;
                                            aVar.k = false;
                                        }
                                        return;
                                    }
                                    z2 = false;
                                }
                                z3 = z2;
                                if (aVar.i != 5) {
                                }
                                if (z4) {
                                }
                                i4 = mVar.m;
                                if (i4 != 0) {
                                }
                                i8 = 0;
                                a.C3204a c3204a222 = aVar.n;
                                c3204a222.c = mVar;
                                c3204a222.d = e;
                                c3204a222.e = f;
                                c3204a222.f = e2;
                                c3204a222.g = f2;
                                c3204a222.h = z;
                                c3204a222.i = z3;
                                c3204a222.j = z2;
                                c3204a222.k = z4;
                                c3204a222.l = i3;
                                c3204a222.m = i7;
                                c3204a222.n = i5;
                                c3204a222.o = i8;
                                c3204a222.p = i6;
                                c3204a222.a = true;
                                c3204a222.b = true;
                                aVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void g(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        a aVar = this.k;
        boolean z = this.n;
        aVar.i = i;
        aVar.l = j2;
        aVar.j = j;
        aVar.s = z;
        if (!aVar.b || i != 1) {
            if (!aVar.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        a.C3204a c3204a = aVar.m;
        aVar.m = aVar.n;
        aVar.n = c3204a;
        c3204a.b = false;
        c3204a.a = false;
        aVar.h = 0;
        aVar.k = true;
    }

    @Override // xsna.zap
    public final void seek() {
        this.g = 0L;
        this.n = false;
        this.m = C.TIME_UNSET;
        rt50.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.c.b(0);
        a aVar = this.k;
        if (aVar != null) {
            aVar.k = false;
            aVar.o = false;
            a.C3204a c3204a = aVar.n;
            c3204a.b = false;
            c3204a.a = false;
        }
    }
}
