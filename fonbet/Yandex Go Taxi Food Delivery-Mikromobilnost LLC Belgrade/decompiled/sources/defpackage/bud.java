package defpackage;

import android.os.Trace;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.internal.a;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public final class bud implements bii0, rtd {
    public final iz40 A;
    public final iz40 B;
    public final hz40 C;
    public final bb9 D;
    public final bb9 E;
    public final hz40 F;
    public hz40 G;
    public boolean H;
    public d5s0 I;
    public gs90 J;
    public bud K;
    public int L;
    public final gp50 M;
    public final zti0 N;
    public final bts O;
    public int P;
    public wls Q;
    public final ttd a;
    public final dmw0 b;
    public final AtomicReference c = new AtomicReference(null);
    public final Object w = new Object();
    public final kz40 x;
    public final sus0 y;
    public final hz40 z;

    public bud(ttd ttdVar, dmw0 dmw0Var) {
        this.a = ttdVar;
        this.b = dmw0Var;
        Object obj = null;
        iz40 iz40Var = new iz40(obj);
        kz40 kz40Var = iz40Var.e;
        if (kz40Var == null) {
            kz40Var = new kz40(iz40Var);
            iz40Var.e = kz40Var;
        }
        kz40 kz40Var2 = kz40Var;
        this.x = kz40Var2;
        sus0 sus0Var = new sus0();
        if (ttdVar.e()) {
            sus0Var.D = new wx40(obj);
        }
        if (ttdVar.g()) {
            sus0Var.h();
        }
        this.y = sus0Var;
        this.z = cmm0.b();
        this.A = new iz40(obj);
        this.B = new iz40(obj);
        this.C = cmm0.b();
        bb9 bb9Var = new bb9();
        this.D = bb9Var;
        bb9 bb9Var2 = new bb9();
        this.E = bb9Var2;
        this.F = cmm0.b();
        this.G = cmm0.b();
        gp50 gp50Var = new gp50(9, ttdVar);
        this.M = gp50Var;
        this.N = new zti0();
        bts btsVar = new bts(dmw0Var, ttdVar, uus0.f(sus0Var), kz40Var2, bb9Var, bb9Var2, gp50Var, this);
        ttdVar.s(btsVar);
        this.O = btsVar;
        z5d.a.getClass();
        a aVar = z5d.b;
    }

    public final void A(wls wlsVar) {
        boolean l = l();
        s();
        ttd ttdVar = this.a;
        if (!l) {
            this.Q = wlsVar;
            ttdVar.a(this, wlsVar);
            return;
        }
        bts btsVar = this.O;
        btsVar.g();
        this.Q = wlsVar;
        ttdVar.a(this, wlsVar);
        btsVar.f();
    }

    @Override // defpackage.bii0
    public final InvalidationResult a(aii0 aii0Var, Object obj) {
        bud budVar;
        int i = aii0Var.b;
        if ((i & 2) != 0) {
            aii0Var.b = i | 4;
        }
        yss yssVar = aii0Var.c;
        if (yssVar == null || !yssVar.a()) {
            return InvalidationResult.IGNORED;
        }
        sus0 sus0Var = this.y;
        sus0Var.getClass();
        yss yssVar2 = aii0Var.c;
        if (yssVar2 != null && sus0Var.l(uh6.e(yssVar2))) {
            if (aii0Var.d == null) {
                return InvalidationResult.IGNORED;
            }
            InvalidationResult u = u(aii0Var, yssVar, obj);
            if (u != InvalidationResult.IGNORED) {
                this.M.B();
            }
            return u;
        }
        synchronized (this.w) {
            budVar = this.K;
        }
        if (budVar != null) {
            bts btsVar = budVar.O;
            if (btsVar.F && btsVar.k0(aii0Var, obj)) {
                return InvalidationResult.IMMINENT;
            }
        }
        return InvalidationResult.IGNORED;
    }

    @Override // defpackage.bii0
    public final void b() {
        this.H = true;
        this.M.B();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bii0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj) {
        aii0 B;
        int i;
        boolean z;
        int i2;
        bts btsVar = this.O;
        if (btsVar.A > 0 || (B = btsVar.B()) == null) {
            return;
        }
        int i3 = B.b | 1;
        B.b = i3;
        Object obj2 = null;
        if ((i3 & 32) == 0) {
            qy40 qy40Var = B.f;
            if (qy40Var == null) {
                qy40Var = new qy40(obj2);
                B.f = qy40Var;
            }
            int i4 = B.e;
            int c = qy40Var.c(obj);
            if (c < 0) {
                c = ~c;
                i = -1;
            } else {
                i = qy40Var.c[c];
            }
            qy40Var.b[c] = obj;
            qy40Var.c[c] = i4;
            if (i == B.e) {
                z = true;
                this.M.B();
                if (z) {
                    if (obj instanceof h5u0) {
                        ((h5u0) obj).m484recordReadInh_f27i8$runtime(1);
                    }
                    ooc.a(this.z, obj, B);
                    if (obj instanceof qxi) {
                        qxi qxiVar = (qxi) obj;
                        pxi d = qxiVar.d();
                        hz40 hz40Var = this.C;
                        ooc.A(hz40Var, obj);
                        qy40 qy40Var2 = d.e;
                        Object[] objArr = qy40Var2.b;
                        long[] jArr = qy40Var2.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8;
                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j & 255) < 128) {
                                            g5u0 g5u0Var = (g5u0) objArr[(i5 << 3) + i8];
                                            i2 = i6;
                                            if (g5u0Var instanceof h5u0) {
                                                ((h5u0) g5u0Var).m484recordReadInh_f27i8$runtime(1);
                                            }
                                            ooc.a(hz40Var, g5u0Var, obj);
                                        } else {
                                            i2 = i6;
                                        }
                                        j >>= i2;
                                        i8++;
                                        i6 = i2;
                                    }
                                    if (i7 != i6) {
                                        break;
                                    }
                                }
                                if (i5 == length) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        Object obj3 = d.f;
                        hz40 hz40Var2 = B.g;
                        if (hz40Var2 == null) {
                            hz40Var2 = new hz40((Object) null);
                            B.g = hz40Var2;
                        }
                        hz40Var2.o(qxiVar, obj3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        this.M.B();
        if (z) {
        }
    }

    public final void d() {
        this.c.set(null);
        this.D.a();
        this.E.a();
        kz40 kz40Var = this.x;
        if (kz40Var.a.g()) {
            return;
        }
        zti0 zti0Var = this.N;
        try {
            zti0Var.g(kz40Var, this.O.D());
            zti0Var.b();
        } finally {
            zti0Var.a();
        }
    }

    @Override // defpackage.rtd
    public final void dispose() {
        synchronized (this.w) {
            try {
                if (this.O.F) {
                    khe0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.P != 3) {
                    this.P = 3;
                    z5d.a.getClass();
                    this.Q = z5d.c;
                    bb9 bb9Var = this.O.L;
                    if (bb9Var != null) {
                        h(bb9Var);
                    }
                    int i = 0;
                    boolean z = this.y.b == 0;
                    if (!z || !this.x.a.g()) {
                        zti0 zti0Var = this.N;
                        try {
                            zti0Var.g(this.x, this.O.D());
                            if (!z) {
                                sus0 sus0Var = this.y;
                                zti0 zti0Var2 = this.N;
                                ows0 k = sus0Var.k();
                                try {
                                    k.n(new jid(i, zti0Var2), k.t);
                                    k.J();
                                    k.e(true);
                                    this.b.b();
                                    this.b.d();
                                    zti0Var.c();
                                } catch (Throwable th) {
                                    k.e(false);
                                    throw th;
                                }
                            }
                            zti0Var.b();
                            zti0Var.a();
                        } catch (Throwable th2) {
                            zti0Var.a();
                            throw th2;
                        }
                    }
                    bts btsVar = this.O;
                    btsVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        btsVar.b.x(btsVar);
                        btsVar.E.clear();
                        btsVar.s.clear();
                        btsVar.e.a();
                        btsVar.v = null;
                        btsVar.a.b();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.a.y(this);
    }

    public final void e(Object obj, boolean z) {
        Object d = this.z.d(obj);
        if (d == null) {
            return;
        }
        boolean z2 = d instanceof iz40;
        iz40 iz40Var = this.A;
        iz40 iz40Var2 = this.B;
        hz40 hz40Var = this.F;
        if (!z2) {
            aii0 aii0Var = (aii0) d;
            if (ooc.z(hz40Var, obj, aii0Var) || aii0Var.b(obj) == InvalidationResult.IGNORED) {
                return;
            }
            if (aii0Var.g == null || z) {
                iz40Var.a(aii0Var);
                return;
            } else {
                iz40Var2.a(aii0Var);
                return;
            }
        }
        iz40 iz40Var3 = (iz40) d;
        Object[] objArr = iz40Var3.b;
        long[] jArr = iz40Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        aii0 aii0Var2 = (aii0) objArr[(i << 3) + i3];
                        if (!ooc.z(hz40Var, obj, aii0Var2) && aii0Var2.b(obj) != InvalidationResult.IGNORED) {
                            if (aii0Var2.g == null || z) {
                                iz40Var.a(aii0Var2);
                            } else {
                                iz40Var2.a(aii0Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void f(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean c2;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z2;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c3;
        long j8;
        int i2;
        int i3;
        long[] jArr9;
        boolean z3 = set instanceof androidx.compose.runtime.collection.a;
        hz40 hz40Var = this.C;
        Object obj = null;
        int i4 = 8;
        if (z3) {
            iz40 iz40Var = ((androidx.compose.runtime.collection.a) set).a;
            Object[] objArr = iz40Var.b;
            long[] jArr10 = iz40Var.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i5 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i5];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i5 << 3) + i7];
                                c3 = c4;
                                if (obj2 instanceof aii0) {
                                    ((aii0) obj2).b(obj);
                                } else {
                                    e(obj2, z);
                                    Object d = hz40Var.d(obj2);
                                    if (d != null) {
                                        if (d instanceof iz40) {
                                            iz40 iz40Var2 = (iz40) d;
                                            Object[] objArr2 = iz40Var2.b;
                                            long[] jArr11 = iz40Var2.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = i4;
                                                i2 = length;
                                                int i9 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i9];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                e((qxi) objArr2[(i9 << 3) + i11], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i8;
                                                            i11++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i10 != i8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i2 = length;
                                            e((qxi) d, z);
                                        }
                                        i3 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i2 = length;
                                i3 = 8;
                            } else {
                                jArr8 = jArr10;
                                c3 = c4;
                                j8 = j9;
                                i2 = length;
                                i3 = i4;
                            }
                            j9 = j8 >> i3;
                            i7++;
                            length = i2;
                            i4 = i3;
                            c4 = c3;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c4;
                        int i12 = length;
                        if (i6 != i4) {
                            break;
                        } else {
                            length = i12;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr10 = jArr7;
                    obj = null;
                    i4 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof aii0) {
                    ((aii0) obj3).b(null);
                } else {
                    e(obj3, z);
                    Object d2 = hz40Var.d(obj3);
                    if (d2 != null) {
                        if (d2 instanceof iz40) {
                            iz40 iz40Var3 = (iz40) d2;
                            Object[] objArr3 = iz40Var3.b;
                            long[] jArr13 = iz40Var3.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr13[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                e((qxi) objArr3[(i << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            e((qxi) d2, z);
                        }
                    }
                }
            }
        }
        hz40 hz40Var2 = this.z;
        iz40 iz40Var4 = this.A;
        if (z) {
            iz40 iz40Var5 = this.B;
            if (iz40Var5.h()) {
                long[] jArr14 = hz40Var2.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = hz40Var2.b[i18];
                                    Object obj5 = hz40Var2.c[i18];
                                    if (obj5 instanceof iz40) {
                                        iz40 iz40Var6 = (iz40) obj5;
                                        Object[] objArr4 = iz40Var6.b;
                                        long[] jArr15 = iz40Var6.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            aii0 aii0Var = (aii0) objArr5[i22];
                                                            if (iz40Var5.c(aii0Var) || iz40Var4.c(aii0Var)) {
                                                                iz40Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z2 = iz40Var6.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        aii0 aii0Var2 = (aii0) obj5;
                                        z2 = iz40Var5.c(aii0Var2) || iz40Var4.c(aii0Var2);
                                    }
                                    if (z2) {
                                        hz40Var2.n(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                iz40Var5.b();
                k();
                return;
            }
        }
        if (iz40Var4.h()) {
            long[] jArr17 = hz40Var2.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = hz40Var2.b[i26];
                                Object obj7 = hz40Var2.c[i26];
                                if (obj7 instanceof iz40) {
                                    iz40 iz40Var7 = (iz40) obj7;
                                    Object[] objArr6 = iz40Var7.b;
                                    long[] jArr18 = iz40Var7.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (iz40Var4.c((aii0) objArr7[i30])) {
                                                            iz40Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    c2 = iz40Var7.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    c2 = iz40Var4.c((aii0) obj7);
                                }
                                if (c2) {
                                    hz40Var2.n(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            k();
            iz40Var4.b();
        }
    }

    public final void g() {
        synchronized (this.w) {
            try {
                h(this.D);
                q();
            } catch (Throwable th) {
                try {
                    if (!this.x.a.g()) {
                        zti0 zti0Var = this.N;
                        try {
                            zti0Var.g(this.x, this.O.D());
                            zti0Var.b();
                            zti0Var.a();
                        } catch (Throwable th2) {
                            zti0Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    d();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0013, B:5:0x0035, B:7:0x0039, B:10:0x0047, B:12:0x004b, B:13:0x0051, B:17:0x005c, B:30:0x0089, B:32:0x0096, B:149:0x0045), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(bb9 bb9Var) {
        o13 o13Var;
        zti0 zti0Var;
        ows0 k;
        zti0 zti0Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        zti0 zti0Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        long j3;
        bb9 bb9Var2 = this.E;
        bts btsVar = this.O;
        ytd D = btsVar.D();
        zti0 zti0Var4 = this.N;
        zti0Var4.g(this.x, D);
        try {
            if (bb9Var.a.c()) {
                try {
                    if (bb9Var2.a.c() && this.J == null) {
                        zti0Var4.b();
                    }
                    return;
                } finally {
                }
            }
            gs90 gs90Var = this.J;
            if (gs90Var == null || (o13Var = gs90Var.c()) == null) {
                o13Var = this.b;
            }
            gs90 gs90Var2 = this.J;
            try {
                Trace.beginSection(o13Var.equals(gs90Var2 != null ? gs90Var2.c() : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    gs90 gs90Var3 = this.J;
                    try {
                        try {
                            if (gs90Var3 != null) {
                                zti0Var = gs90Var3.d();
                                if (zti0Var == null) {
                                }
                                sus0 sus0Var = this.y;
                                ytd D2 = btsVar.D();
                                k = uus0.f(sus0Var).k();
                                int i3 = 0;
                                bb9Var.b(o13Var, k, zti0Var, D2);
                                k.e(true);
                                o13Var.d();
                                Trace.endSection();
                                zti0Var4.c();
                                zti0Var4.d();
                                if (this.H) {
                                    zti0Var2 = zti0Var4;
                                } else {
                                    Trace.beginSection("Compose:unobserve");
                                    try {
                                        this.H = false;
                                        hz40 hz40Var = this.z;
                                        long[] jArr3 = hz40Var.a;
                                        int length = jArr3.length - 2;
                                        if (length >= 0) {
                                            int i4 = 0;
                                            while (true) {
                                                long j4 = jArr3[i4];
                                                char c2 = 7;
                                                long j5 = -9187201950435737472L;
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i7 = i3;
                                                    while (i7 < i6) {
                                                        if ((j4 & 255) < 128) {
                                                            c = c2;
                                                            int i8 = (i4 << 3) + i7;
                                                            j2 = j5;
                                                            Object obj = hz40Var.b[i8];
                                                            Object obj2 = hz40Var.c[i8];
                                                            if (obj2 instanceof iz40) {
                                                                iz40 iz40Var = (iz40) obj2;
                                                                Object[] objArr = iz40Var.b;
                                                                long[] jArr4 = iz40Var.a;
                                                                int i9 = i5;
                                                                int length2 = jArr4.length - 2;
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                zti0Var3 = zti0Var4;
                                                                if (length2 >= 0) {
                                                                    int i10 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            long j6 = jArr4[i10];
                                                                            j = j4;
                                                                            long[] jArr5 = jArr4;
                                                                            if ((((~j6) << c) & j6 & j2) != j2) {
                                                                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                                for (int i12 = 0; i12 < i11; i12++) {
                                                                                    if ((j6 & 255) < 128) {
                                                                                        j3 = j6;
                                                                                        int i13 = (i10 << 3) + i12;
                                                                                        if (!((aii0) objArr[i13]).a()) {
                                                                                            iz40Var.m(i13);
                                                                                        }
                                                                                    } else {
                                                                                        j3 = j6;
                                                                                    }
                                                                                    j6 = j3 >> i9;
                                                                                }
                                                                                if (i11 != i9) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (i10 == length2) {
                                                                                break;
                                                                            }
                                                                            i10++;
                                                                            jArr4 = jArr5;
                                                                            j4 = j;
                                                                            i9 = 8;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            Trace.endSection();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    j = j4;
                                                                }
                                                                z = iz40Var.g();
                                                            } else {
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                zti0Var3 = zti0Var4;
                                                                j = j4;
                                                                z = !((aii0) obj2).a();
                                                            }
                                                            if (z) {
                                                                hz40Var.n(i8);
                                                            }
                                                            i2 = 8;
                                                        } else {
                                                            i = i7;
                                                            jArr2 = jArr3;
                                                            zti0Var3 = zti0Var4;
                                                            j = j4;
                                                            c = c2;
                                                            j2 = j5;
                                                            i2 = i5;
                                                        }
                                                        j4 = j >> i2;
                                                        i7 = i + 1;
                                                        i5 = i2;
                                                        c2 = c;
                                                        j5 = j2;
                                                        zti0Var4 = zti0Var3;
                                                        jArr3 = jArr2;
                                                    }
                                                    jArr = jArr3;
                                                    zti0Var2 = zti0Var4;
                                                    if (i6 != i5) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr = jArr3;
                                                    zti0Var2 = zti0Var4;
                                                }
                                                if (i4 == length) {
                                                    break;
                                                }
                                                i4++;
                                                zti0Var4 = zti0Var2;
                                                jArr3 = jArr;
                                                i3 = 0;
                                            }
                                        } else {
                                            zti0Var2 = zti0Var4;
                                        }
                                        k();
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                if (bb9Var2.a.c() && this.J == null) {
                                    zti0Var2.b();
                                }
                                return;
                            }
                            if (bb9Var2.a.c()) {
                                zti0Var2.b();
                            }
                            return;
                        } finally {
                            zti0Var2.a();
                        }
                        bb9Var.b(o13Var, k, zti0Var, D2);
                        k.e(true);
                        o13Var.d();
                        Trace.endSection();
                        zti0Var4.c();
                        zti0Var4.d();
                        if (this.H) {
                        }
                    } catch (Throwable th3) {
                        try {
                            k.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                    zti0Var = zti0Var4;
                    sus0 sus0Var2 = this.y;
                    ytd D22 = btsVar.D();
                    k = uus0.f(sus0Var2).k();
                    int i32 = 0;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (bb9Var2.a.c() && this.J == null) {
                        zti0Var4.b();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void i() {
        synchronized (this.w) {
            try {
                if (!this.E.c()) {
                    h(this.E);
                }
            } catch (Throwable th) {
                try {
                    if (!this.x.a.g()) {
                        zti0 zti0Var = this.N;
                        try {
                            zti0Var.g(this.x, this.O.D());
                            zti0Var.b();
                            zti0Var.a();
                        } catch (Throwable th2) {
                            zti0Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void j() {
        zti0 zti0Var;
        synchronized (this.w) {
            try {
                this.O.v = null;
                if (!this.x.a.g()) {
                    zti0Var = this.N;
                    try {
                        zti0Var.g(this.x, this.O.D());
                        zti0Var.b();
                        zti0Var.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.x.a.g()) {
                        zti0Var = this.N;
                        try {
                            zti0Var.g(this.x, this.O.D());
                            zti0Var.b();
                            zti0Var.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    d();
                    throw th2;
                }
            }
        }
    }

    public final void k() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean z;
        int i4;
        int i5;
        hz40 hz40Var = this.C;
        long[] jArr3 = hz40Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = hz40Var.b[i10];
                            Object obj2 = hz40Var.c[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof iz40;
                            j5 = j8;
                            hz40 hz40Var2 = this.z;
                            if (z2) {
                                iz40 iz40Var = (iz40) obj2;
                                Object[] objArr = iz40Var.b;
                                long[] jArr4 = iz40Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!hz40Var2.b((qxi) objArr[i15])) {
                                                        iz40Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                z = iz40Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                z = !hz40Var2.b((qxi) obj2);
                            }
                            if (z) {
                                hz40Var.n(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        iz40 iz40Var2 = this.B;
        if (!iz40Var2.h()) {
            return;
        }
        Object[] objArr2 = iz40Var2.b;
        long[] jArr5 = iz40Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((aii0) objArr2[i20]).g == null) {
                            iz40Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.w) {
            z = true;
            if (this.P != 1) {
                z = false;
            }
            if (z) {
                this.P = 0;
            }
        }
        return z;
    }

    public final void m(wls wlsVar) {
        try {
            synchronized (this.w) {
                p();
                hz40 hz40Var = this.G;
                this.G = cmm0.b();
                try {
                    bts btsVar = this.O;
                    d5s0 d5s0Var = this.I;
                    if (!btsVar.e.a.c()) {
                        lid.a("Expected applyChanges() to have been called");
                    }
                    btsVar.P = d5s0Var;
                    try {
                        btsVar.r(hz40Var, wlsVar);
                    } finally {
                        btsVar.P = null;
                    }
                } catch (Throwable th) {
                    this.G = hz40Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.x.a.g()) {
                    zti0 zti0Var = this.N;
                    try {
                        zti0Var.g(this.x, this.O.D());
                        zti0Var.b();
                        zti0Var.a();
                    } catch (Throwable th3) {
                        zti0Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                d();
                throw th4;
            }
        }
    }

    public final gs90 n(boolean z, wls wlsVar) {
        if (this.J != null) {
            khe0.b("A pausable composition is in progress");
        }
        gs90 gs90Var = new gs90(this, this.a, this.O, this.x, wlsVar, z, this.b, this.w);
        this.J = gs90Var;
        return gs90Var;
    }

    public final void o() {
        zti0 zti0Var;
        synchronized (this.w) {
            try {
                if (this.J != null) {
                    khe0.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.y.b == 0;
                try {
                    try {
                        if (z) {
                            if (!this.x.a.g()) {
                            }
                            this.z.h();
                            this.C.h();
                            this.G.h();
                            this.D.a();
                            this.E.a();
                            bts btsVar = this.O;
                            btsVar.E.clear();
                            btsVar.s.clear();
                            btsVar.e.a();
                            btsVar.v = null;
                            this.P = 1;
                        }
                        zti0Var.g(this.x, this.O.D());
                        if (!z) {
                            sus0 sus0Var = this.y;
                            zti0 zti0Var2 = this.N;
                            ows0 k = sus0Var.k();
                            try {
                                k.n(new a6n(18, zti0Var2, k), k.t);
                                k.e(true);
                                this.b.d();
                                zti0Var.c();
                            } catch (Throwable th) {
                                k.e(false);
                                throw th;
                            }
                        }
                        zti0Var.b();
                        zti0Var.a();
                        this.z.h();
                        this.C.h();
                        this.G.h();
                        this.D.a();
                        this.E.a();
                        bts btsVar2 = this.O;
                        btsVar2.E.clear();
                        btsVar2.s.clear();
                        btsVar2.e.a();
                        btsVar2.v = null;
                        this.P = 1;
                    } catch (Throwable th2) {
                        zti0Var.a();
                        throw th2;
                    }
                    zti0Var = this.N;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void p() {
        Object obj = s8o.a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                lid.b("pending composition has not been applied");
                ny61.A();
                return;
            }
            if (andSet instanceof Set) {
                f((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                lid.b("corrupt pendingModifications drain: " + atomicReference);
                ny61.A();
                return;
            }
            for (Set set : (Set[]) andSet) {
                f(set, true);
            }
        }
    }

    public final void q() {
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (jl40.l(andSet, s8o.a)) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                f(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.J == null) {
                lid.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            lid.b("corrupt pendingModifications drain: " + atomicReference);
            ny61.A();
        }
    }

    public final void r() {
        EmptySet emptySet = EmptySet.a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(emptySet);
        if (jl40.l(andSet, s8o.a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            lid.b("corrupt pendingModifications drain: " + atomicReference);
            ny61.A();
            return;
        }
        for (Set set : (Set[]) andSet) {
            f(set, false);
        }
    }

    public final void s() {
        int i = this.P;
        if (i != 0) {
            khe0.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.J == null) {
            return;
        }
        khe0.b("A pausable composition is in progress");
    }

    public final void t(ArrayList arrayList) {
        kz40 kz40Var = this.x;
        bts btsVar = this.O;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!jl40.l(((kb30) ((Pair) arrayList.get(i)).c()).b(), this)) {
                lid.a("Check failed");
                break;
            }
        }
        try {
            btsVar.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    btsVar.F(arrayList);
                    btsVar.l();
                } catch (Throwable th) {
                    btsVar.h();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!kz40Var.a.g()) {
                    zti0 zti0Var = this.N;
                    try {
                        zti0Var.g(kz40Var, btsVar.D());
                        zti0Var.b();
                        zti0Var.a();
                    } catch (Throwable th3) {
                        zti0Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                d();
                throw th4;
            }
        }
    }

    public final InvalidationResult u(aii0 aii0Var, yss yssVar, Object obj) {
        bud budVar;
        synchronized (this.w) {
            try {
                bud budVar2 = this.K;
                if (budVar2 != null) {
                    sus0 sus0Var = this.y;
                    int i = this.L;
                    if (sus0Var.z) {
                        lid.a("Writer is active");
                    }
                    if (i < 0 || i >= sus0Var.b) {
                        lid.a("Invalid group index");
                    }
                    yss e = uh6.e(yssVar);
                    if (sus0Var.l(e)) {
                        int a = uus0.a(i, sus0Var.a) + i;
                        int i2 = e.a;
                        budVar = (i <= i2 && i2 < a) ? budVar2 : null;
                    }
                    budVar2 = null;
                }
                if (budVar == null) {
                    bts btsVar = this.O;
                    if (btsVar.F && btsVar.k0(aii0Var, obj)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (obj == null) {
                        this.G.o(aii0Var, kl40.F);
                    } else {
                        boolean z = obj instanceof qxi;
                        hz40 hz40Var = this.G;
                        if (z) {
                            Object d = hz40Var.d(aii0Var);
                            if (d != null) {
                                if (d instanceof iz40) {
                                    iz40 iz40Var = (iz40) d;
                                    Object[] objArr = iz40Var.b;
                                    long[] jArr = iz40Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i3 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i3];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                                for (int i5 = 0; i5 < i4; i5++) {
                                                    if ((255 & j) < 128 && objArr[(i3 << 3) + i5] == kl40.F) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i4 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i3 == length) {
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                } else if (d == kl40.F) {
                                }
                            }
                            ooc.a(this.G, aii0Var, obj);
                        } else {
                            hz40Var.o(aii0Var, kl40.F);
                        }
                    }
                }
                if (budVar != null) {
                    return budVar.u(aii0Var, yssVar, obj);
                }
                this.a.n(this);
                return this.O.F ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object d = this.z.d(obj);
        if (d == null) {
            return;
        }
        boolean z = d instanceof iz40;
        hz40 hz40Var = this.F;
        if (!z) {
            aii0 aii0Var = (aii0) d;
            if (aii0Var.b(obj) == InvalidationResult.IMMINENT) {
                ooc.a(hz40Var, obj, aii0Var);
                return;
            }
            return;
        }
        iz40 iz40Var = (iz40) d;
        Object[] objArr = iz40Var.b;
        long[] jArr = iz40Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        aii0 aii0Var2 = (aii0) objArr[(i << 3) + i3];
                        if (aii0Var2.b(obj) == InvalidationResult.IMMINENT) {
                            ooc.a(hz40Var, obj, aii0Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(Set set) {
        boolean z = set instanceof androidx.compose.runtime.collection.a;
        hz40 hz40Var = this.C;
        hz40 hz40Var2 = this.z;
        if (z) {
            iz40 iz40Var = ((androidx.compose.runtime.collection.a) set).a;
            Object[] objArr = iz40Var.b;
            long[] jArr = iz40Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (hz40Var2.b(obj) || hz40Var.b(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (hz40Var2.b(obj2) || hz40Var.b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        synchronized (this.w) {
            gs90 gs90Var = this.J;
            boolean z = false;
            if (gs90Var != null && !gs90Var.f()) {
                gs90Var.h();
                gs90Var.c().b();
                return false;
            }
            p();
            try {
                hz40 hz40Var = this.G;
                this.G = cmm0.b();
                try {
                    bts btsVar = this.O;
                    d5s0 d5s0Var = this.I;
                    bb9 bb9Var = btsVar.e;
                    if (!bb9Var.a.c()) {
                        lid.a("Expected applyChanges() to have been called");
                    }
                    if (hz40Var.e > 0 || !btsVar.s.isEmpty()) {
                        btsVar.P = d5s0Var;
                        try {
                            btsVar.r(hz40Var, null);
                            btsVar.P = null;
                            z = !bb9Var.c();
                        } catch (Throwable th) {
                            btsVar.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        q();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.G = hz40Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.x.a.g()) {
                        zti0 zti0Var = this.N;
                        try {
                            zti0Var.g(this.x, this.O.D());
                            zti0Var.b();
                            zti0Var.a();
                        } catch (Throwable th4) {
                            zti0Var.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    d();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void y(androidx.compose.runtime.collection.a aVar) {
        androidx.compose.runtime.collection.a aVar2;
        while (true) {
            Object obj = this.c.get();
            if (obj == null || obj.equals(s8o.a)) {
                aVar2 = aVar;
            } else if (obj instanceof Set) {
                aVar2 = new Set[]{obj, aVar};
            } else {
                if (!(obj instanceof Object[])) {
                    dac.f(this.c, "corrupt pendingModifications: ");
                    return;
                }
                aVar2 = f73.s((Set[]) obj, aVar);
            }
            AtomicReference atomicReference = this.c;
            while (!atomicReference.compareAndSet(obj, aVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.w) {
                    q();
                }
                return;
            }
            return;
        }
    }

    public final void z(Object obj) {
        synchronized (this.w) {
            try {
                v(obj);
                Object d = this.C.d(obj);
                if (d != null) {
                    if (d instanceof iz40) {
                        iz40 iz40Var = (iz40) d;
                        Object[] objArr = iz40Var.b;
                        long[] jArr = iz40Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            v((qxi) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        v((qxi) d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
