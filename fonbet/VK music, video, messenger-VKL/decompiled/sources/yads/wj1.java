package yads;

import android.os.Handler;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class wj1 extends ry {
    public final mo k;
    public final boolean l;
    public final v73 m;
    public final t73 n;
    public uj1 o;
    public tj1 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public wj1(mo moVar, boolean z) {
        boolean z2;
        this.k = moVar;
        if (z) {
            moVar.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new v73();
        this.n = new t73();
        moVar.getClass();
        this.o = uj1.a(moVar.c());
    }

    @Override // yads.mo
    public final qn1 a(zn1 zn1Var, qe qeVar, long j) {
        tj1 tj1Var = new tj1(zn1Var, qeVar, j);
        tj1Var.a(this.k);
        if (this.r) {
            tj1Var.a(zn1Var.a(a(zn1Var.a)));
            return tj1Var;
        }
        this.p = tj1Var;
        if (!this.q) {
            this.q = true;
            a((Object) null, this.k);
        }
        return tj1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d3  */
    @Override // yads.ry
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, mo moVar, w73 w73Var) {
        uj1 uj1Var;
        zn1 a;
        uj1 uj1Var2;
        if (this.r) {
            uj1 uj1Var3 = this.o;
            this.o = new uj1(w73Var, uj1Var3.d, uj1Var3.e);
            tj1 tj1Var = this.p;
            if (tj1Var != null) {
                a(tj1Var.h);
            }
        } else if (w73Var.c()) {
            if (this.s) {
                uj1 uj1Var4 = this.o;
                uj1Var2 = new uj1(w73Var, uj1Var4.d, uj1Var4.e);
            } else {
                uj1Var2 = new uj1(w73Var, v73.s, uj1.f);
            }
            this.o = uj1Var2;
        } else {
            w73Var.a(0, this.m, 0L);
            v73 v73Var = this.m;
            long j = v73Var.n;
            Object obj2 = v73Var.b;
            tj1 tj1Var2 = this.p;
            if (tj1Var2 != null) {
                long j2 = tj1Var2.c;
                uj1 uj1Var5 = this.o;
                Object obj3 = tj1Var2.b.a;
                uj1Var5.a(uj1Var5.a(obj3), this.n, true);
                long j3 = this.n.f + j2;
                if (j3 != this.o.a(0, this.m, 0L).n) {
                    j = j3;
                }
            }
            Pair a2 = w73Var.a(this.m, this.n, 0, j);
            Object obj4 = a2.first;
            long longValue = ((Long) a2.second).longValue();
            if (this.s) {
                uj1 uj1Var6 = this.o;
                uj1Var = new uj1(w73Var, uj1Var6.d, uj1Var6.e);
            } else {
                uj1Var = new uj1(w73Var, obj2, obj4);
            }
            this.o = uj1Var;
            tj1 tj1Var3 = this.p;
            if (tj1Var3 != null) {
                a(longValue);
                zn1 zn1Var = tj1Var3.b;
                Object obj5 = zn1Var.a;
                if (this.o.e != null && obj5.equals(uj1.f)) {
                    obj5 = this.o.e;
                }
                a = zn1Var.a(obj5);
                this.s = true;
                this.r = true;
                a((w73) this.o);
                if (a == null) {
                    tj1 tj1Var4 = this.p;
                    tj1Var4.getClass();
                    tj1Var4.a(a);
                    return;
                }
                return;
            }
        }
        a = null;
        this.s = true;
        this.r = true;
        a((w73) this.o);
        if (a == null) {
        }
    }

    @Override // yads.mo
    public final gn1 c() {
        return this.k.c();
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        this.r = false;
        this.q = false;
        super.e();
    }

    public final Object a(Object obj) {
        return (this.o.e == null || !obj.equals(uj1.f)) ? obj : this.o.e;
    }

    @Override // yads.ry
    public final zn1 a(Object obj, zn1 zn1Var) {
        Object obj2 = zn1Var.a;
        Object obj3 = this.o.e;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = uj1.f;
        }
        return zn1Var.a(obj2);
    }

    @Override // yads.mo
    public final void a(v93 v93Var) {
        this.j = v93Var;
        this.i = mc3.a((Handler.Callback) null);
        if (this.l) {
            return;
        }
        this.q = true;
        a((Object) null, this.k);
    }

    @Override // yads.mo
    public final void a(qn1 qn1Var) {
        ((tj1) qn1Var).a();
        if (qn1Var == this.p) {
            this.p = null;
        }
    }

    public final void a(long j) {
        tj1 tj1Var = this.p;
        int a = this.o.a(tj1Var.b.a);
        if (a == -1) {
            return;
        }
        long j2 = this.o.a(a, this.n, false).e;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        tj1Var.h = j;
    }

    @Override // yads.ry, yads.mo
    public final void d() {
    }
}
