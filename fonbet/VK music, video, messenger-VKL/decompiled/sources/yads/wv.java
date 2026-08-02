package yads;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class wv extends ry {
    public final mo k;
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final v73 r;
    public uv s;
    public vv t;
    public long u;
    public long v;

    public wv(mo moVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        ni.a(j >= 0);
        this.k = (mo) ni.a(moVar);
        this.l = j;
        this.m = j2;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = new ArrayList();
        this.r = new v73();
    }

    @Override // yads.mo
    public final void a(v93 v93Var) {
        this.j = v93Var;
        this.i = mc3.a((Handler.Callback) null);
        a((Object) null, this.k);
    }

    @Override // yads.ry
    /* renamed from: b */
    public final void a(Object obj, mo moVar, w73 w73Var) {
        if (this.t != null) {
            return;
        }
        b(w73Var);
    }

    @Override // yads.mo
    public final gn1 c() {
        return this.k.c();
    }

    @Override // yads.ry, yads.mo
    public final void d() {
        vv vvVar = this.t;
        if (vvVar != null) {
            throw vvVar;
        }
        super.d();
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        super.e();
        this.t = null;
        this.s = null;
    }

    public final void b(w73 w73Var) {
        long j;
        long j2;
        long j3;
        w73Var.a(0, this.r, 0L);
        long j4 = this.r.r;
        if (this.s != null && !this.q.isEmpty() && !this.o) {
            long j5 = this.u - j4;
            j3 = this.m != Long.MIN_VALUE ? this.v - j4 : Long.MIN_VALUE;
            j2 = j5;
        } else {
            long j6 = this.l;
            long j7 = this.m;
            if (this.p) {
                long j8 = this.r.n;
                j6 += j8;
                j = j8 + j7;
            } else {
                j = j7;
            }
            this.u = j4 + j6;
            this.v = j7 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = this.q.size();
            for (int i = 0; i < size; i++) {
                tv tvVar = (tv) this.q.get(i);
                long j9 = this.u;
                long j10 = this.v;
                tvVar.f = j9;
                tvVar.g = j10;
            }
            j2 = j6;
            j3 = j;
        }
        try {
            uv uvVar = new uv(w73Var, j2, j3);
            this.s = uvVar;
            a(uvVar);
        } catch (vv e) {
            this.t = e;
            for (int i2 = 0; i2 < this.q.size(); i2++) {
                ((tv) this.q.get(i2)).h = this.t;
            }
        }
    }

    @Override // yads.mo
    public final void a(qn1 qn1Var) {
        if (this.q.remove(qn1Var)) {
            this.k.a(((tv) qn1Var).b);
            if (!this.q.isEmpty() || this.o) {
                return;
            }
            uv uvVar = this.s;
            uvVar.getClass();
            b(uvVar.c);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final qn1 a(zn1 zn1Var, qe qeVar, long j) {
        tv tvVar = new tv(this.k.a(zn1Var, qeVar, j), this.n, this.u, this.v);
        this.q.add(tvVar);
        return tvVar;
    }
}
