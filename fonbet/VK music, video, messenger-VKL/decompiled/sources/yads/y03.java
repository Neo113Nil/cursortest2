package yads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class y03 extends mo {
    public final u30 h;
    public final o30 i;
    public final nx0 j;
    public final long k = C.TIME_UNSET;
    public final ae0 l;
    public final boolean m;
    public final t03 n;
    public final gn1 o;
    public v93 p;

    public y03(en1 en1Var, o30 o30Var, ae0 ae0Var, boolean z) {
        this.i = o30Var;
        this.l = ae0Var;
        this.m = z;
        new sm1().a(Uri.EMPTY);
        en1Var.getClass();
        throw null;
    }

    @Override // yads.mo
    public final void a(v93 v93Var) {
        this.p = v93Var;
        a(this.n);
    }

    @Override // yads.mo
    public final gn1 c() {
        return this.o;
    }

    @Override // yads.mo
    public final void a(qn1 qn1Var) {
        ((x03) qn1Var).j.a((dh1) null);
    }

    @Override // yads.mo
    public final qn1 a(zn1 zn1Var, qe qeVar, long j) {
        return new x03(this.h, this.i, this.p, this.j, this.k, this.l, b(zn1Var), this.m);
    }

    @Override // yads.mo
    public final void d() {
    }

    @Override // yads.mo
    public final void e() {
    }
}
