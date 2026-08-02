package xsna;

import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c99;
import xsna.ca9;
import xsna.ddz;
import xsna.mcz;
import xsna.xaz;

/* compiled from: LinkViewHolderBindings.kt */
/* loaded from: classes7.dex */
public final class cdz {
    public final FunctionReferenceImpl a;
    public final gzs<s3q0> b;
    public final izs<String, s3q0> c;
    public final p490 d = r99.a.a();
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public final com.vk.voip.ui.share.link.pager.view.b f;
    public final h1x0 g;

    /* compiled from: LinkViewHolderBindings.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<s99, ddz> {
        @Override // xsna.izs
        public final ddz invoke(s99 s99Var) {
            ddz.b dVar;
            ddz.a aVar;
            s99 s99Var2 = s99Var;
            ((cvq) this.receiver).getClass();
            xaz xazVar = s99Var2.d;
            if (xazVar instanceof xaz.a) {
                xaz.a aVar2 = (xaz.a) xazVar;
                dVar = new ddz.b.a(aVar2.a, aVar2.b);
            } else if (epx.f(xazVar, xaz.b.a)) {
                dVar = ddz.b.C2724b.a;
            } else if (xazVar instanceof xaz.c) {
                dVar = new ddz.b.c(((xaz.c) xazVar).a);
            } else {
                if (!(xazVar instanceof xaz.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                xaz.d dVar2 = (xaz.d) xazVar;
                dVar = new ddz.b.d(dVar2.a, dVar2.b);
            }
            ca9 ca9Var = s99Var2.c;
            if (ca9Var instanceof ca9.a) {
                aVar = new ddz.a.C2723a(((ca9.a) ca9Var).a);
            } else if (epx.f(ca9Var, ca9.b.a)) {
                aVar = ddz.a.b.a;
            } else if (ca9Var instanceof ca9.c) {
                ca9.c cVar = (ca9.c) ca9Var;
                boolean z = cVar.G;
                boolean z2 = cVar.A;
                boolean z3 = cVar.I;
                aVar = new ddz.a.c(z, z2, cVar.H, z3, cVar.K, cVar.L, cVar.O);
            } else {
                if (!epx.f(ca9Var, ca9.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = ddz.a.d.a;
            }
            return new ddz(dVar, aVar);
        }
    }

    /* compiled from: LinkViewHolderBindings.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ddz, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ddz ddzVar) {
            ((zcz) this.receiver).y.b(ddzVar);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cdz(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, izs<? super String, s3q0> izsVar) {
        this.a = (FunctionReferenceImpl) gzsVar;
        this.b = gzsVar2;
        this.c = izsVar;
        com.vk.voip.ui.share.link.pager.view.b bVar = new com.vk.voip.ui.share.link.pager.view.b(OKVoipEngine.b.b(), null, VoipShareLinkPagerState.TypeControl.SHARE_REFRESH, new vg20(), izsVar);
        this.f = bVar;
        h1x0 h1x0Var = new h1x0(new bpn0(new xs6(15)));
        this.g = h1x0Var;
        h1x0Var.c();
        h1x0Var.a(bVar.k);
    }

    public final void a(zcz zczVar) {
        zczVar.m.a(this.f);
        m99 v = this.d.v();
        v.b(c99.n.a);
        v.b(new c99.c0(false, "LinkSettings"));
        io.reactivex.rxjava3.internal.operators.observable.j1 U = v.f.U(new adz(new a(1, cvq.a, cvq.class, "transform", "transform(Lcom/vk/voip/ui/settings/feature/CallSettingsState;)Lcom/vk/voip/ui/settings/link_view/LinkViewModel;", 0), 0));
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = U.a0(asu0Var.d()).subscribe(new vl0(new b(1, zczVar, zcz.class, "accept", "accept(Lcom/vk/voip/ui/settings/link_view/LinkViewModel;)V", 0), 27));
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        bVar.b(subscribe);
        io.reactivex.rxjava3.subjects.f<mcz> fVar = zczVar.e;
        bVar.b(fVar.a0(asu0Var.d()).subscribe(new mp0(new wcj(v, 19), 29)));
        bVar.b(fVar.b0(mcz.b.class).a0(asu0Var.d()).subscribe(new bdz(new wzf(this, 26), 0)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0.b.a.b0(fjw0.class), new op0(new v4v(3), 20)).a0(asu0Var.d()).subscribe(new y00(new dxh(this, 21), 26)));
    }
}
