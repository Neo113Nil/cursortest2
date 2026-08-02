package yads;

import android.net.Uri;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.cfz;

/* loaded from: classes10.dex */
public final class il2 extends mo implements bl2 {
    public final gn1 h;
    public final an1 i;
    public final o30 j;
    public final zk2 k;
    public final tk0 l;
    public final ae0 m;
    public final int n;
    public boolean o = true;
    public long p = C.TIME_UNSET;
    public boolean q;
    public boolean r;
    public v93 s;

    public il2(gn1 gn1Var, o30 o30Var, zk2 zk2Var, tk0 tk0Var, ae0 ae0Var, int i) {
        this.i = (an1) ni.a(gn1Var.c);
        this.h = gn1Var;
        this.j = o30Var;
        this.k = zk2Var;
        this.l = tk0Var;
        this.m = ae0Var;
        this.n = i;
    }

    @Override // yads.mo
    public final qn1 a(zn1 zn1Var, qe qeVar, long j) {
        p30 createDataSource = this.j.createDataSource();
        v93 v93Var = this.s;
        if (v93Var != null) {
            createDataSource.a(v93Var);
        }
        Uri uri = this.i.a;
        zk2 zk2Var = this.k;
        zf2 zf2Var = this.g;
        if (zf2Var != null) {
            return new fl2(uri, createDataSource, hl2.a((sq0) ((cfz) zk2Var).c, zf2Var), this.l, a(zn1Var), this.m, b(zn1Var), this, qeVar, this.i.e, this.n);
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final gn1 c() {
        return this.h;
    }

    @Override // yads.mo
    public final void e() {
        this.l.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [yads.il2, yads.mo] */
    /* JADX WARN: Type inference failed for: r11v5, types: [yads.gl2] */
    @Override // yads.mo
    public final void a(v93 v93Var) {
        this.s = v93Var;
        this.l.prepare();
        tk0 tk0Var = this.l;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        zf2 zf2Var = this.g;
        if (zf2Var != null) {
            tk0Var.a(myLooper, zf2Var);
            long j = this.p;
            t03 t03Var = new t03(j, j, this.q, this.r, this.h);
            if (this.o) {
                t03Var = new gl2(t03Var);
            }
            a(t03Var);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final void a(qn1 qn1Var) {
        fl2 fl2Var = (fl2) qn1Var;
        if (fl2Var.w) {
            for (nt2 nt2Var : fl2Var.t) {
                nt2Var.a();
                nt2Var.d();
            }
        }
        fl2Var.l.a(fl2Var);
        fl2Var.q.removeCallbacksAndMessages(null);
        fl2Var.r = null;
        fl2Var.M = true;
    }

    @Override // yads.mo
    public final void d() {
    }
}
