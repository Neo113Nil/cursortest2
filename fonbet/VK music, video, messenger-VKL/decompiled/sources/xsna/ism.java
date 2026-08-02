package xsna;

import com.vk.dto.common.Peer;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.esm;

/* compiled from: DialogsListConfigImpl.kt */
/* loaded from: classes18.dex */
public final class ism implements esm {
    public final a1w a;
    public final mxv b;
    public final b25 c;
    public final jtm d;
    public final ko8 e;
    public final m7p f;
    public final bpn0 g = new bpn0(new xqf(this, 14));
    public final io.reactivex.rxjava3.core.q<io8> h;
    public final mo8 i;
    public final k9q0 j;
    public final fo50 k;
    public final tq l;
    public final io.reactivex.rxjava3.core.q<ng20> m;
    public final g6o0 n;
    public final dfz o;
    public final esm.a p;
    public final o5e0 q;

    public ism(a1w a1wVar, mxv mxvVar, b25 b25Var, jtm jtmVar, ko8 ko8Var, m7p m7pVar) {
        io.reactivex.rxjava3.core.q<io8> o0;
        this.a = a1wVar;
        this.b = mxvVar;
        this.c = b25Var;
        this.d = jtmVar;
        this.e = ko8Var;
        this.f = m7pVar;
        csm csmVar = new csm(a1wVar, ko8Var);
        if (csmVar.d) {
            o0 = csmVar.b.a();
        } else {
            io.reactivex.rxjava3.internal.operators.observable.m1 a = csmVar.a.l.a();
            io.reactivex.rxjava3.core.w wVar = csmVar.c;
            o0 = new io.reactivex.rxjava3.internal.operators.mixed.o(new io.reactivex.rxjava3.internal.operators.observable.i0(a.a0(wVar).r0(wVar), new fq1(new bz(18), 11)), new lh3(new m1k(csmVar, 3), 12)).o0(csmVar.a());
        }
        this.h = o0;
        this.i = new mo8(mxvVar);
        d02 b = m7pVar.b();
        this.j = m7pVar.a();
        this.k = new fo50();
        this.l = new tq(10);
        this.m = new pg20(a1wVar).a();
        this.n = new g6o0(mxvVar);
        this.o = new dfz(a1wVar, b);
        Peer q = a1wVar.q();
        cau0 cau0Var = a1wVar.r().h;
        q.getClass();
        boolean z = false;
        if (!q.Ab(Peer.Type.GROUP) && (!o25.b(b25Var) || b25Var.i().S)) {
            z = true;
        }
        a1wVar.q().getClass();
        this.p = esm.a.a(ApiInvocationException.ErrorCodes.IDS_BLOCKED, z, !r5.Ab(r7));
        this.q = new o5e0(a1wVar);
    }

    @Override // xsna.esm
    public final jtm a() {
        return this.d;
    }

    @Override // xsna.esm
    public final m5e0 b() {
        return this.q;
    }

    @Override // xsna.esm
    public final esm.a c() {
        return this.p;
    }

    @Override // xsna.esm
    public final fo50 d() {
        return this.k;
    }

    @Override // xsna.esm
    public final g6o0 e() {
        return this.n;
    }

    @Override // xsna.esm
    public final mo8 f() {
        return this.i;
    }

    @Override // xsna.esm
    public final bfz g() {
        return this.o;
    }

    @Override // xsna.esm
    public final nsm h() {
        return this.l;
    }

    @Override // xsna.esm
    public final io.reactivex.rxjava3.core.q<io8> i() {
        return this.h;
    }

    @Override // xsna.esm
    public final io.reactivex.rxjava3.core.q<ng20> j() {
        return this.m;
    }

    @Override // xsna.esm
    public final boolean k() {
        return false;
    }

    @Override // xsna.esm
    public final int l() {
        this.a.a.getClass();
        return 10;
    }

    @Override // xsna.esm
    public final drz<xrm> m() {
        return (drz) this.g.getValue();
    }

    @Override // xsna.esm
    public final k9q0 n() {
        return this.j;
    }

    @Override // xsna.esm
    public final int o() {
        this.a.a.getClass();
        return 30;
    }
}
