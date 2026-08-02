package androidx.compose.runtime;

import defpackage.aii0;
import defpackage.bts;
import defpackage.bud;
import defpackage.d5s0;
import defpackage.dmm0;
import defpackage.fse;
import defpackage.gp50;
import defpackage.iz40;
import defpackage.jb30;
import defpackage.kb30;
import defpackage.o13;
import defpackage.oz40;
import defpackage.r1b0;
import defpackage.rtd;
import defpackage.sls;
import defpackage.t18;
import defpackage.ttd;
import defpackage.wls;
import defpackage.xw91;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c extends ttd {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final iz40 e = dmm0.a();
    public final oz40 f = new ParcelableSnapshotMutableState(r1b0.w, xw91.D);
    public final /* synthetic */ bts g;

    public c(bts btsVar, long j, boolean z, boolean z2, gp50 gp50Var) {
        this.g = btsVar;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.ttd
    public final void a(bud budVar, wls wlsVar) {
        this.g.b.a(budVar, wlsVar);
    }

    @Override // defpackage.ttd
    public final iz40 b(bud budVar, d5s0 d5s0Var, wls wlsVar) {
        return this.g.b.b(budVar, d5s0Var, wlsVar);
    }

    @Override // defpackage.ttd
    public final void c(kb30 kb30Var) {
        this.g.b.c(kb30Var);
    }

    @Override // defpackage.ttd
    public final void d() {
        bts btsVar = this.g;
        btsVar.A--;
    }

    @Override // defpackage.ttd
    public final boolean e() {
        return this.g.b.e();
    }

    @Override // defpackage.ttd
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.ttd
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.ttd
    public final long h() {
        return this.a;
    }

    @Override // defpackage.ttd
    public final rtd i() {
        return this.g.h;
    }

    @Override // defpackage.ttd
    public final r1b0 j() {
        return (r1b0) this.f.getValue();
    }

    @Override // defpackage.ttd
    public final fse k() {
        return this.g.b.k();
    }

    @Override // defpackage.ttd
    public final boolean l() {
        return this.g.b.l();
    }

    @Override // defpackage.ttd
    public final void m(kb30 kb30Var) {
        this.g.b.m(kb30Var);
    }

    @Override // defpackage.ttd
    public final void n(bud budVar) {
        bts btsVar = this.g;
        btsVar.b.n(btsVar.h);
        btsVar.b.n(budVar);
    }

    @Override // defpackage.ttd
    public final void o(kb30 kb30Var, jb30 jb30Var, o13 o13Var) {
        this.g.b.o(kb30Var, jb30Var, o13Var);
    }

    @Override // defpackage.ttd
    public final jb30 p(kb30 kb30Var) {
        return this.g.b.p(kb30Var);
    }

    @Override // defpackage.ttd
    public final iz40 q(bud budVar, d5s0 d5s0Var, iz40 iz40Var) {
        return this.g.b.q(budVar, d5s0Var, iz40Var);
    }

    @Override // defpackage.ttd
    public final void r(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.ttd
    public final void s(bts btsVar) {
        this.e.a(btsVar);
    }

    @Override // defpackage.ttd
    public final void t(aii0 aii0Var) {
        this.g.b.t(aii0Var);
    }

    @Override // defpackage.ttd
    public final void u(bud budVar) {
        this.g.b.u(budVar);
    }

    @Override // defpackage.ttd
    public final t18 v(sls slsVar) {
        return this.g.b.v(slsVar);
    }

    @Override // defpackage.ttd
    public final void w() {
        this.g.A++;
    }

    @Override // defpackage.ttd
    public final void x(bts btsVar) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(btsVar.A());
            }
        }
        if (btsVar != null) {
            this.e.l(btsVar);
        }
    }

    @Override // defpackage.ttd
    public final void y(bud budVar) {
        this.g.b.y(budVar);
    }

    public final void z() {
        iz40 iz40Var = this.e;
        if (iz40Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
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
                                    bts btsVar = (bts) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(btsVar.A());
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
                        } else {
                            i++;
                        }
                    }
                }
            }
            iz40Var.b();
        }
    }
}
