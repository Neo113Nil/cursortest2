package xsna;

import com.vk.dto.common.Peer;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.esm;
import xsna.io8;

/* compiled from: CommonFolderDialogsListConfigImpl.kt */
/* loaded from: classes18.dex */
public final class wjg implements esm {
    public final a1w a;
    public final jtm b;
    public final bpn0 c = new bpn0(new no(this, 28));
    public final io.reactivex.rxjava3.core.q<io8> d;
    public final mo8 e;
    public final k9q0 f;
    public final vjg g;
    public final xjg h;
    public final io.reactivex.rxjava3.core.q<ng20> i;
    public final g6o0 j;
    public final dfz k;
    public final esm.a l;
    public final o5e0 m;

    public wjg(a1w a1wVar, a2s a2sVar, mxv mxvVar, b25 b25Var, ko8 ko8Var, jtm jtmVar, m7p m7pVar) {
        this.a = a1wVar;
        this.b = jtmVar;
        mxvVar.getClass();
        this.d = io.reactivex.rxjava3.core.q.T(io8.a.a);
        this.e = new mo8(mxvVar);
        d02 b = m7pVar.b();
        this.f = m7pVar.a();
        this.g = new vjg();
        this.h = new xjg(a2sVar);
        this.i = new pg20(a1wVar).a();
        this.j = new g6o0(mxvVar);
        this.k = new dfz(a1wVar, b);
        Peer q = a1wVar.q();
        cau0 cau0Var = a1wVar.r().h;
        q.getClass();
        boolean z = false;
        if (!q.Ab(Peer.Type.GROUP) && (!o25.b(b25Var) || b25Var.i().S)) {
            z = true;
        }
        a1wVar.q().getClass();
        this.l = esm.a.a(ApiInvocationException.ErrorCodes.IDS_BLOCKED, z, !r2.Ab(r3));
        this.m = new o5e0(a1wVar);
    }

    @Override // xsna.esm
    public final jtm a() {
        return this.b;
    }

    @Override // xsna.esm
    public final m5e0 b() {
        return this.m;
    }

    @Override // xsna.esm
    public final esm.a c() {
        return this.l;
    }

    @Override // xsna.esm
    public final fo50 d() {
        return this.g;
    }

    @Override // xsna.esm
    public final g6o0 e() {
        return this.j;
    }

    @Override // xsna.esm
    public final mo8 f() {
        return this.e;
    }

    @Override // xsna.esm
    public final bfz g() {
        return this.k;
    }

    @Override // xsna.esm
    public final nsm h() {
        return this.h;
    }

    @Override // xsna.esm
    public final io.reactivex.rxjava3.core.q<io8> i() {
        return this.d;
    }

    @Override // xsna.esm
    public final io.reactivex.rxjava3.core.q<ng20> j() {
        return this.i;
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
        return (drz) this.c.getValue();
    }

    @Override // xsna.esm
    public final k9q0 n() {
        return this.f;
    }

    @Override // xsna.esm
    public final int o() {
        this.a.a.getClass();
        return 30;
    }
}
