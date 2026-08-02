package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import defpackage.alb0;
import defpackage.asy0;
import defpackage.bkq0;
import defpackage.bwc0;
import defpackage.ckq0;
import defpackage.dfq0;
import defpackage.dis0;
import defpackage.dkq0;
import defpackage.dry0;
import defpackage.eja1;
import defpackage.eqb1;
import defpackage.ey40;
import defpackage.f530;
import defpackage.fkq0;
import defpackage.hk2;
import defpackage.hkq0;
import defpackage.ho40;
import defpackage.jl40;
import defpackage.kk2;
import defpackage.lvc0;
import defpackage.lxv;
import defpackage.nzs;
import defpackage.oly0;
import defpackage.oz40;
import defpackage.p4a1;
import defpackage.pzo;
import defpackage.pzt0;
import defpackage.qxi;
import defpackage.rkq0;
import defpackage.rm40;
import defpackage.rx91;
import defpackage.rzx;
import defpackage.tkq0;
import defpackage.tls;
import defpackage.tse;
import defpackage.v3a1;
import defpackage.w6u;
import defpackage.wkq0;
import defpackage.wlz;
import defpackage.wu60;
import defpackage.x4c;
import defpackage.yur;
import defpackage.z8b1;
import defpackage.zii0;
import defpackage.zkq0;
import defpackage.zlz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class i {
    public final zkq0 a;
    public w6u e;
    public tls f;
    public final qxi j;
    public wu60 k;
    public rzx l;
    public rkq0 t;
    public boolean u;
    public tse v;
    public bwc0 w;
    public boolean x;
    public final oz40 b = androidx.compose.runtime.f.j(null);
    public final oz40 c = androidx.compose.runtime.f.j(Boolean.TRUE);
    public tls d = new hkq0(this, 7);
    public final androidx.compose.foundation.text.contextmenu.modifier.c g = new androidx.compose.foundation.text.contextmenu.modifier.c();
    public final yur h = new yur();
    public final oz40 i = androidx.compose.runtime.f.j(Boolean.FALSE);
    public final oz40 m = androidx.compose.runtime.f.i(zy11.a, x4c.Q);
    public final oz40 n = androidx.compose.runtime.f.j(new wu60(0));
    public final oz40 o = androidx.compose.runtime.f.j(new wu60(0));
    public final oz40 p = androidx.compose.runtime.f.j(null);
    public final oz40 q = androidx.compose.runtime.f.j(null);
    public final oz40 r = androidx.compose.runtime.f.j(null);
    public final oz40 s = androidx.compose.runtime.f.j(null);

    public i(zkq0 zkq0Var) {
        this.a = zkq0Var;
        int i = 3;
        this.j = androidx.compose.runtime.f.d(new fkq0(this, i));
        zkq0Var.e = new hkq0(this, 8);
        zkq0Var.f = new alb0(24, this);
        zkq0Var.g = new wkq0(this);
        zkq0Var.h = new g(this);
        zkq0Var.i = new hkq0(this, 2);
        zkq0Var.j = new hkq0(this, i);
    }

    public final long a(rzx rzxVar, long j) {
        rzx rzxVar2 = this.l;
        if (rzxVar2 == null || !rzxVar2.d()) {
            return 9205357640488583168L;
        }
        return k().T(rzxVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        kk2 kk2Var;
        tls tlsVar;
        int i;
        if (g() != null) {
            zkq0 zkq0Var = this.a;
            if (zkq0Var.a().e != 0) {
                hk2 hk2Var = new hk2(0);
                ArrayList c = zkq0Var.c(k());
                ListIterator listIterator = c.listIterator(c.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    }
                    ckq0 ckq0Var = (ckq0) zkq0Var.a().e(((ho40) listIterator.previous()).a);
                    if (ckq0Var != null && ckq0Var.a.b != ckq0Var.b.b) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                if (i != -1) {
                    int size = c.size();
                    int i2 = 0;
                    while (i2 < size) {
                        ho40 ho40Var = (ho40) c.get(i2);
                        ckq0 ckq0Var2 = (ckq0) zkq0Var.a().e(ho40Var.a);
                        if (ckq0Var2 != null) {
                            kk2 d = ho40Var.d();
                            long c2 = eja1.c(ckq0Var2.a.b, ckq0Var2.b.b);
                            boolean z = i2 >= i;
                            hk2Var.c(d, asy0.f(c2), asy0.e(c2));
                            if (!z) {
                                hk2Var.a.append('\n');
                            }
                        }
                        i2++;
                    }
                }
                kk2Var = hk2Var.i();
                if (kk2Var == null) {
                    kk2 kk2Var2 = kk2Var.b.length() > 0 ? kk2Var : null;
                    if (kk2Var2 == null || (tlsVar = this.f) == null) {
                        return;
                    }
                    tlsVar.invoke(kk2Var2);
                    return;
                }
                return;
            }
        }
        kk2Var = null;
        if (kk2Var == null) {
        }
    }

    public final ho40 c(bkq0 bkq0Var) {
        return (ho40) this.a.c.e(bkq0Var.c);
    }

    public final f530 d() {
        return p4a1.d(v3a1.d(new SelectionManager$contextMenuAreaModifier$1(this, null)), this.g, new SelectionManager$contextMenuAreaModifier$2(this, null), null, new hkq0(this, 1));
    }

    public final Pair e() {
        int i;
        int i2;
        int i3;
        if (g() == null) {
            return null;
        }
        zkq0 zkq0Var = this.a;
        if (zkq0Var.b.isEmpty()) {
            return null;
        }
        hk2 hk2Var = new hk2(0);
        ArrayList c = zkq0Var.c(k());
        ListIterator listIterator = c.listIterator(c.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            ckq0 ckq0Var = (ckq0) zkq0Var.a().e(((ho40) listIterator.previous()).a);
            if (ckq0Var != null && ckq0Var.a.b != ckq0Var.b.b) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            int size = c.size();
            int i4 = 0;
            i2 = -1;
            i3 = -1;
            while (i4 < size) {
                ho40 ho40Var = (ho40) c.get(i4);
                ckq0 ckq0Var2 = (ckq0) zkq0Var.a().e(ho40Var.a);
                if (ckq0Var2 != null) {
                    kk2 d = ho40Var.d();
                    long c2 = eja1.c(ckq0Var2.a.b, ckq0Var2.b.b);
                    boolean z = i4 >= i;
                    if (i2 == -1) {
                        i2 = asy0.f(c2);
                        hk2Var.c(d, 0, asy0.f(c2));
                    }
                    hk2Var.c(d, asy0.f(c2), asy0.e(c2));
                    StringBuilder sb = hk2Var.a;
                    if (z) {
                        i3 = sb.length();
                        hk2Var.c(d, asy0.e(c2), d.b.length());
                    } else {
                        sb.append('\n');
                    }
                }
                i4++;
            }
        } else {
            i2 = -1;
            i3 = -1;
        }
        kk2 i5 = hk2Var.i();
        if (i2 == -1 || i3 == -1) {
            return null;
        }
        return new Pair(i5, new asy0(eja1.c(i2, i3)));
    }

    public final Handle f() {
        return (Handle) this.r.getValue();
    }

    public final ckq0 g() {
        return (ckq0) this.b.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean i() {
        ckq0 g = g();
        if (g != null) {
            bkq0 bkq0Var = g.b;
            bkq0 bkq0Var2 = g.a;
            if (!jl40.l(bkq0Var2, bkq0Var)) {
                if (bkq0Var2.c == bkq0Var.c) {
                    return true;
                }
                rzx k = k();
                zkq0 zkq0Var = this.a;
                ArrayList c = zkq0Var.c(k);
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    ckq0 ckq0Var = (ckq0) zkq0Var.a().e(((ho40) c.get(i)).a);
                    if (ckq0Var != null && ckq0Var.a.b != ckq0Var.b.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void j() {
        w6u w6uVar;
        this.a.k.setValue(zlz.a);
        this.x = false;
        o();
        if (g() != null) {
            this.d.invoke(null);
            if (!h() || (w6uVar = this.e) == null) {
                return;
            }
            ((lvc0) w6uVar).a(9);
        }
    }

    public final rzx k() {
        rzx rzxVar = this.l;
        if (rzxVar == null) {
            throw nzs.g("null coordinates");
        }
        if (!rzxVar.d()) {
            lxv.a("unattached coordinates");
        }
        return rzxVar;
    }

    public final void l(boolean z) {
        oz40 oz40Var = this.c;
        if (((Boolean) oz40Var.getValue()).booleanValue() != z) {
            oz40Var.setValue(Boolean.valueOf(z));
            o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (defpackage.rx91.d(r10, r11) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        long j;
        wu60 wu60Var;
        bkq0 bkq0Var;
        bkq0 bkq0Var2;
        ckq0 g = g();
        rzx rzxVar = this.l;
        wu60 wu60Var2 = null;
        ho40 c = (g == null || (bkq0Var2 = g.a) == null) ? null : c(bkq0Var2);
        ho40 c2 = (g == null || (bkq0Var = g.b) == null) ? null : c(bkq0Var);
        rzx c3 = c != null ? c.c() : null;
        rzx c4 = c2 != null ? c2.c() : null;
        oz40 oz40Var = this.q;
        oz40 oz40Var2 = this.p;
        if (g == null || rzxVar == null || !rzxVar.d() || (c3 == null && c4 == null)) {
            oz40Var2.setValue(null);
            oz40Var.setValue(null);
            return;
        }
        zii0 g2 = rx91.g(rzxVar);
        if (c3 != null) {
            j = 9205357640488583168L;
            long a = c.a(g, true);
            if ((a & 9223372034707292159L) != 9205357640488583168L) {
                long T = rzxVar.T(c3, a);
                wu60Var = new wu60(T);
                if (f() != Handle.SelectionStart) {
                }
                oz40Var2.setValue(wu60Var);
                if (c4 != null) {
                    long a2 = c2.a(g, false);
                    if ((a2 & 9223372034707292159L) != j) {
                        long T2 = rzxVar.T(c4, a2);
                        wu60 wu60Var3 = new wu60(T2);
                        if (f() == Handle.SelectionEnd || rx91.d(g2, T2)) {
                            wu60Var2 = wu60Var3;
                        }
                    }
                }
                oz40Var.setValue(wu60Var2);
            }
        } else {
            j = 9205357640488583168L;
        }
        wu60Var = null;
        oz40Var2.setValue(wu60Var);
        if (c4 != null) {
        }
        oz40Var.setValue(wu60Var2);
    }

    public final boolean n(long j, long j2, boolean z, dkq0 dkq0Var) {
        ArrayList arrayList;
        rkq0 rkq0Var;
        dry0 dry0Var;
        long j3;
        int i;
        ArrayList arrayList2;
        int i2;
        tkq0 tkq0Var;
        long j4;
        Direction e;
        Direction direction;
        Direction direction2;
        Direction direction3;
        boolean z2;
        Direction direction4;
        int i3;
        Direction direction5;
        Direction direction6;
        tkq0 tkq0Var2;
        int i4;
        int i5;
        int i6;
        bkq0 bkq0Var;
        int i7;
        bkq0 bkq0Var2;
        this.r.setValue(z ? Handle.SelectionStart : Handle.SelectionEnd);
        this.s.setValue(new wu60(j));
        rzx k = k();
        zkq0 zkq0Var = this.a;
        ArrayList c = zkq0Var.c(k);
        int i8 = wlz.a;
        ey40 ey40Var = new ey40((Object) null);
        int size = c.size();
        for (int i9 = 0; i9 < size; i9++) {
            ey40Var.e(i9, ((ho40) c.get(i9)).a);
        }
        int i10 = 2;
        long j5 = 9223372034707292159L;
        tkq0 tkq0Var3 = new tkq0(j, j2, k, z, (j2 & 9223372034707292159L) == 9205357640488583168L ? null : g(), new pzo(i10, ey40Var));
        int size2 = c.size();
        int i11 = 0;
        while (true) {
            arrayList = tkq0Var3.h;
            if (i11 >= size2) {
                break;
            }
            ho40 ho40Var = (ho40) c.get(i11);
            rzx c2 = ho40Var.c();
            if (c2 == null || (dry0Var = (dry0) ho40Var.c.invoke()) == null) {
                tkq0Var2 = tkq0Var3;
                i2 = size2;
                i3 = i11;
                i = i10;
                j3 = j5;
                arrayList2 = c;
            } else {
                j3 = j5;
                i = i10;
                long T = tkq0Var3.c.T(c2, 0L);
                long e2 = wu60.e(tkq0Var3.a, T);
                arrayList2 = c;
                long j6 = tkq0Var3.b;
                long e3 = (j6 & j3) == 9205357640488583168L ? 9205357640488583168L : wu60.e(j6, T);
                long j7 = ho40Var.a;
                long j8 = dry0Var.c;
                float f = (int) (j8 >> 32);
                float f2 = (int) (j8 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                i2 = size2;
                int i12 = i11;
                int i13 = (int) (e2 >> 32);
                Direction direction7 = Float.intBitsToFloat(i13) < 0.0f ? Direction.BEFORE : Float.intBitsToFloat(i13) > f ? Direction.AFTER : Direction.ON;
                int i14 = (int) (e2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                Direction direction8 = Float.intBitsToFloat(i14) < 0.0f ? Direction.BEFORE : Float.intBitsToFloat(i14) > f2 ? Direction.AFTER : Direction.ON;
                boolean z3 = tkq0Var3.d;
                ckq0 ckq0Var = tkq0Var3.e;
                if (z3) {
                    tkq0Var = tkq0Var3;
                    j4 = j7;
                    e = eqb1.e(direction7, direction8, tkq0Var, j4, ckq0Var != null ? ckq0Var.b : null);
                    direction4 = e;
                    i3 = i12;
                    direction = direction7;
                    direction3 = direction;
                    direction2 = direction8;
                    direction5 = direction4;
                    z2 = z3;
                    direction6 = direction2;
                } else {
                    tkq0Var = tkq0Var3;
                    j4 = j7;
                    e = eqb1.e(direction7, direction8, tkq0Var, j4, ckq0Var != null ? ckq0Var.a : null);
                    direction = direction7;
                    direction2 = direction8;
                    direction3 = e;
                    z2 = z3;
                    direction4 = direction;
                    i3 = i12;
                    direction5 = direction2;
                    direction6 = direction3;
                }
                tkq0Var2 = tkq0Var;
                Direction e4 = z8b1.e(direction, direction2);
                if (e4 == Direction.ON || e4 != e) {
                    int length = dry0Var.a.a.b.length();
                    pzo pzoVar = tkq0Var2.f;
                    if (z2) {
                        int g = eqb1.g(e2, dry0Var);
                        if (ckq0Var == null || (bkq0Var2 = ckq0Var.b) == null) {
                            i7 = g;
                            length = i7;
                        } else {
                            i7 = g;
                            int compare = pzoVar.compare(Long.valueOf(bkq0Var2.c), Long.valueOf(j4));
                            if (compare < 0) {
                                length = 0;
                            } else if (compare <= 0) {
                                length = bkq0Var2.b;
                            }
                        }
                        i6 = length;
                        i5 = i7;
                    } else {
                        int g2 = eqb1.g(e2, dry0Var);
                        if (ckq0Var == null || (bkq0Var = ckq0Var.a) == null) {
                            i4 = g2;
                            i5 = i4;
                        } else {
                            i4 = g2;
                            int compare2 = pzoVar.compare(Long.valueOf(bkq0Var.c), Long.valueOf(j4));
                            if (compare2 < 0) {
                                length = 0;
                            } else if (compare2 <= 0) {
                                length = bkq0Var.b;
                            }
                            i5 = length;
                        }
                        i6 = i4;
                    }
                    int g3 = (e3 & j3) == 9205357640488583168L ? -1 : eqb1.g(e3, dry0Var);
                    int i15 = tkq0Var2.k + 2;
                    tkq0Var2.k = i15;
                    long j9 = j4;
                    dfq0 dfq0Var = new dfq0(j9, i15, i5, i6, g3, dry0Var);
                    tkq0Var2.i = tkq0Var2.a(tkq0Var2.i, direction3, direction6);
                    tkq0Var2.j = tkq0Var2.a(tkq0Var2.j, direction4, direction5);
                    tkq0Var2.g.e(arrayList.size(), j9);
                    arrayList.add(dfq0Var);
                }
            }
            i11 = i3 + 1;
            i10 = i;
            size2 = i2;
            tkq0Var3 = tkq0Var2;
            c = arrayList2;
            j5 = j3;
        }
        tkq0 tkq0Var4 = tkq0Var3;
        int i16 = tkq0Var4.k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            rkq0Var = null;
        } else if (size3 != 1) {
            int i17 = tkq0Var4.i;
            int i18 = i17 == -1 ? i16 : i17;
            int i19 = tkq0Var4.j;
            rkq0Var = new rm40(tkq0Var4.g, arrayList, i18, i19 == -1 ? i16 : i19, tkq0Var4.d, tkq0Var4.e);
        } else {
            dfq0 dfq0Var2 = (dfq0) kotlin.collections.a.s0(arrayList);
            int i20 = tkq0Var4.i;
            int i21 = i20 == -1 ? i16 : i20;
            int i22 = tkq0Var4.j;
            rkq0Var = new dis0(tkq0Var4.d, i21, i22 == -1 ? i16 : i22, tkq0Var4.e, dfq0Var2);
        }
        if (rkq0Var == null || !rkq0Var.h(this.t)) {
            return false;
        }
        ckq0 a = dkq0Var.a(rkq0Var);
        if (!jl40.l(a, g())) {
            if (h()) {
                ArrayList arrayList3 = zkq0Var.b;
                int size4 = arrayList3.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size4) {
                        break;
                    }
                    if (((ho40) arrayList3.get(i23)).d().b.length() > 0) {
                        w6u w6uVar = this.e;
                        if (w6uVar != null) {
                            ((lvc0) w6uVar).a(9);
                        }
                    } else {
                        i23++;
                    }
                }
            }
            zkq0Var.k.setValue(rkq0Var.l(a));
            this.d.invoke(a);
            this.u = false;
        }
        this.t = rkq0Var;
        return true;
    }

    public final void o() {
        pzt0 pzt0Var;
        if (((Boolean) this.i.getValue()).booleanValue()) {
            boolean z = this.x;
            androidx.compose.foundation.text.contextmenu.modifier.c cVar = this.g;
            if (z && h()) {
                if (((zii0) this.j.getValue()) == null) {
                    return;
                }
                cVar.a();
            } else {
                oly0 oly0Var = cVar.a;
                if (oly0Var == null || (pzt0Var = oly0Var.z) == null) {
                    return;
                }
                pzt0Var.a(null);
                oly0Var.z = null;
            }
        }
    }
}
