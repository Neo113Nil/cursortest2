package defpackage;

import com.yandex.go.charity.models.OpenCharitySource;
import com.yandex.go.external_service.view.ExternalServiceModalView;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class o2p implements s2p {
    public final x6w0 a;
    public boolean b;
    public final /* synthetic */ p2p c;

    public o2p(p2p p2pVar, x6w0 x6w0Var) {
        this.c = p2pVar;
        this.a = x6w0Var;
    }

    @Override // defpackage.s2p
    public final void a(sls slsVar, sls slsVar2) {
        p2p p2pVar = this.c;
        m950 m950Var = (m950) p2pVar.S.get();
        x6w0 x6w0Var = this.a;
        p2pVar.E(m950Var, new x8w0(x6w0Var.a, new jl3(x6w0Var.u)), new m2p(slsVar, slsVar2, p2pVar), hxx.a);
    }

    @Override // defpackage.s2p
    public final void b(h1p h1pVar, w6a0 w6a0Var, vdn vdnVar) {
        p2p p2pVar = this.c;
        p2pVar.E((m950) p2pVar.Q.get(), new q3p(w6a0Var, h1pVar), new n2p(vdnVar, p2pVar), hxx.a);
    }

    @Override // defpackage.s2p
    public final void c(String str) {
        ((aj7) this.c.K).b(str, false);
    }

    @Override // defpackage.s2p
    public final void close() {
        ExternalServiceModalView externalServiceModalView;
        i1p i1pVar = this.c.f0;
        if (i1pVar == null || (externalServiceModalView = (ExternalServiceModalView) ((uzf) i1pVar).f0.get()) == null) {
            return;
        }
        externalServiceModalView.collapse();
    }

    @Override // defpackage.s2p
    public final void d(String str) {
        p2p p2pVar = this.c;
        p2pVar.E((m950) p2pVar.O.get(), new k7w0(str, false, true, null, null, null, 7, true, null, 1048120), sy60.Q2, hxx.a);
    }

    @Override // defpackage.s2p
    public final void e(h1p h1pVar, o8w0 o8w0Var, gcn gcnVar) {
        p2p p2pVar = this.c;
        p2pVar.E((m950) p2pVar.J.get(), new p8w0(h1pVar.getValue(), o8w0Var.a), new j2p(gcnVar, 2), hxx.a);
    }

    @Override // defpackage.s2p
    public final void f(h1p h1pVar) {
    }

    @Override // defpackage.s2p
    public final void g(emu0 emu0Var, wew0 wew0Var) {
        this.b = true;
        p2p p2pVar = this.c;
        p2pVar.E((m950) p2pVar.G.get(), emu0Var, new k2p(this, wew0Var), hxx.a);
    }

    @Override // defpackage.s2p
    public final void h(ew51 ew51Var, gcn gcnVar) {
        ((dv51) ((cv51) this.c.P.get())).b(new fv51(ew51Var, true), new h2p(gcnVar, 0));
    }

    @Override // defpackage.s2p
    public final void i(h1p h1pVar, qxx0 qxx0Var) {
        p2p p2pVar = this.c;
        p2pVar.A((m950) p2pVar.M.get(), new prd0(qxx0Var), sy60.Q2);
    }

    @Override // defpackage.s2p
    public final void j(hkv hkvVar, String str, gcn gcnVar) {
        p2p p2pVar = this.c;
        p2pVar.A((m950) p2pVar.L.get(), hkvVar, new i2p(gcnVar, str, p2pVar));
    }

    @Override // defpackage.s2p
    public final void k(Map map, gcn gcnVar) {
        if (map == null) {
            map = b.f();
        }
        oza ozaVar = new oza(map, OpenCharitySource.EATSKIT);
        p2p p2pVar = this.c;
        p2pVar.E((m950) p2pVar.N.get(), ozaVar, new j2p(gcnVar, 0), hxx.a);
    }

    @Override // defpackage.s2p
    public final void l(h1p h1pVar, String str, gcn gcnVar) {
        p2p p2pVar = this.c;
        p2pVar.E((m950) p2pVar.H.get(), new wpc(zoy0.r(h1pVar.getValue(), str), 2), new l2p(this, h1pVar, str, gcnVar), hxx.a);
    }

    @Override // defpackage.s2p
    public final boolean m() {
        return this.b;
    }

    @Override // defpackage.s2p
    public final void n(rfn rfnVar) {
        p2p p2pVar = this.c;
        p2pVar.E((m950) p2pVar.F.get(), rfnVar, sy60.Q2, hxx.a);
    }

    @Override // defpackage.s2p
    public final void o(h1p h1pVar, a90 a90Var) {
        p2p p2pVar = this.c;
        p2pVar.A((m950) p2pVar.R.get(), new b1p(a90Var), sy60.Q2);
    }

    @Override // defpackage.s2p
    public final void p() {
        this.c.r(new qu(9));
    }
}
