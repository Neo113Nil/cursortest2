package androidx.compose.foundation.text;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.j;
import defpackage.aii0;
import defpackage.bmt0;
import defpackage.bts;
import defpackage.but0;
import defpackage.c2r0;
import defpackage.c530;
import defpackage.csy0;
import defpackage.dg21;
import defpackage.did;
import defpackage.dry0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.gk2;
import defpackage.hk2;
import defpackage.hry0;
import defpackage.i5y0;
import defpackage.ik2;
import defpackage.ily;
import defpackage.kk2;
import defpackage.kky;
import defpackage.ly3;
import defpackage.ogo0;
import defpackage.oz40;
import defpackage.pe5;
import defpackage.pi6;
import defpackage.q791;
import defpackage.r3k0;
import defpackage.rmy0;
import defpackage.sls;
import defpackage.ti91;
import defpackage.tls;
import defpackage.uiy0;
import defpackage.wls;
import defpackage.wvd0;
import defpackage.y5e;
import defpackage.ycc;
import defpackage.yx40;
import defpackage.yx91;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class g {
    public final oz40 a = androidx.compose.runtime.f.j(null);
    public kk2 b;
    public final SnapshotStateList c;

    public g(kk2 kk2Var) {
        uiy0 uiy0Var = new uiy0(15);
        kk2Var.getClass();
        hk2 hk2Var = new hk2(kk2Var);
        ArrayList arrayList = hk2Var.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) uiy0Var.invoke(((gk2) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ik2 ik2Var = (ik2) list.get(i2);
                arrayList3.add(new gk2(ik2Var.b, ik2Var.c, ik2Var.a, ik2Var.d));
            }
            ycc.r(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = hk2Var.i();
        this.c = new SnapshotStateList();
    }

    public static ik2 c(ik2 ik2Var, dry0 dry0Var) {
        int c = dry0Var.b.c(r3.f - 1, false);
        if (ik2Var.b < c) {
            return ik2.a(ik2Var, null, Math.min(ik2Var.c, c), 11);
        }
        return null;
    }

    public final void a(fid fidVar, int i) {
        char c;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1154651354);
        char c2 = 2;
        int i2 = (btsVar.e(this) ? 4 : 2) | i;
        boolean z2 = false;
        int i3 = 16;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            dg21 dg21Var = (dg21) btsVar.m(j.s);
            kk2 kk2Var = this.b;
            List a = kk2Var.a(kk2Var.b.length());
            int size = a.size();
            int i4 = 0;
            while (i4 < size) {
                ik2 ik2Var = (ik2) a.get(i4);
                int i5 = ik2Var.b;
                Object obj = ik2Var.a;
                if (i5 != ik2Var.c) {
                    btsVar.e0(725478935);
                    Object Q = btsVar.Q();
                    Object obj2 = did.a;
                    if (Q == obj2) {
                        Q = ly3.i(btsVar);
                    }
                    zx40 zx40Var = (zx40) Q;
                    c = c2;
                    f530 a2 = androidx.compose.ui.graphics.d.a(c530.a, new rmy0(3, this, ik2Var));
                    Object Q2 = btsVar.Q();
                    if (Q2 == obj2) {
                        Q2 = new uiy0(i3);
                        btsVar.o0(Q2);
                    }
                    f530 c3 = ti91.c(fnq0.b(a2, z2, (tls) Q2).k(new csy0(new r3k0(19, this, ik2Var))), zx40Var);
                    wvd0.a.getClass();
                    f530 b = yx91.b(c3, y5e.c0);
                    boolean e = btsVar.e(this) | btsVar.k(ik2Var) | btsVar.e(dg21Var);
                    Object Q3 = btsVar.Q();
                    if (e || Q3 == obj2) {
                        Q3 = new i5y0(this, ik2Var, dg21Var);
                        btsVar.o0(Q3);
                    }
                    pi6.a(q791.f(b, zx40Var, null, null, null, null, (sls) Q3, 508), btsVar, 0);
                    kky kkyVar = (kky) obj;
                    hry0 b2 = kkyVar.b();
                    if (b2 == null || (b2.a == null && b2.b == null && b2.c == null && b2.d == null)) {
                        z = false;
                        btsVar.e0(728331710);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(726303039);
                        Object Q4 = btsVar.Q();
                        if (Q4 == obj2) {
                            Q4 = new ily(zx40Var);
                            btsVar.o0(Q4);
                        }
                        ily ilyVar = (ily) Q4;
                        Object Q5 = btsVar.Q();
                        if (Q5 == obj2) {
                            Q5 = new TextLinkScope$LinksComposables$1$3$1(ilyVar, null);
                            btsVar.o0(Q5);
                        }
                        zpn.e(btsVar, (wls) Q5, zy11.a);
                        yx40 yx40Var = ilyVar.b;
                        yx40 yx40Var2 = ilyVar.b;
                        Boolean valueOf = Boolean.valueOf((yx40Var.getIntValue() & 2) != 0);
                        Boolean valueOf2 = Boolean.valueOf((yx40Var2.getIntValue() & 1) != 0);
                        Boolean valueOf3 = Boolean.valueOf((yx40Var2.getIntValue() & 4) != 0);
                        hry0 b3 = kkyVar.b();
                        bmt0 bmt0Var = b3 != null ? b3.a : null;
                        hry0 b4 = kkyVar.b();
                        bmt0 bmt0Var2 = b4 != null ? b4.b : null;
                        hry0 b5 = kkyVar.b();
                        bmt0 bmt0Var3 = b5 != null ? b5.c : null;
                        hry0 b6 = kkyVar.b();
                        Object[] objArr = {valueOf, valueOf2, valueOf3, bmt0Var, bmt0Var2, bmt0Var3, b6 != null ? b6.d : null};
                        boolean e2 = btsVar.e(this) | btsVar.k(ik2Var);
                        Object Q6 = btsVar.Q();
                        if (e2 || Q6 == obj2) {
                            Q6 = new rmy0(this, ik2Var, ilyVar);
                            btsVar.o0(Q6);
                        }
                        b(objArr, (tls) Q6, btsVar, (i2 << 6) & 896);
                        z = false;
                        btsVar.t(false);
                    }
                    btsVar.t(z);
                } else {
                    c = c2;
                    z = z2;
                    btsVar.e0(728345598);
                    btsVar.t(z);
                }
                i4++;
                z2 = z;
                c2 = c;
                i3 = 16;
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new but0(this, i, 16);
        }
    }

    public final void b(Object[] objArr, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2083052099);
        int i2 = (i & 48) == 0 ? (btsVar.e(tlsVar) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= btsVar.e(this) ? 256 : 128;
        }
        btsVar.c0(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (btsVar.c(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= btsVar.e(obj) ? 4 : 0;
        }
        btsVar.t(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c2r0 c2r0Var = new c2r0(2, 1);
            c2r0Var.a(tlsVar);
            c2r0Var.b(objArr);
            ArrayList arrayList = c2r0Var.b;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean e = btsVar.e(this) | ((i3 & 112) == 32);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new pe5(this, tlsVar, i4);
                btsVar.o0(Q);
            }
            zpn.d(array, (tls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(this, objArr, tlsVar, i, 26);
        }
    }
}
