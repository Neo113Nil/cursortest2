package xsna;

import com.vk.ecomm.market.good.linkedcontent.mvi2.MarketLinkedContentState;
import xsna.an50;

/* compiled from: MarketLinkedContentStore.kt */
/* loaded from: classes18.dex */
public final class r710 implements m710, mm50<MarketLinkedContentState, q610, t610> {
    public final /* synthetic */ mm50<MarketLinkedContentState, q610, t610> b;

    public r710(final k6k k6kVar, final gzs gzsVar, final g7s0 g7s0Var, final hc10 hc10Var) {
        this.b = new ql50((aqw) null, 7).a(an50.a.a(new j18() { // from class: xsna.n710
            @Override // xsna.gzs
            public final Object invoke() {
                return new s610(k6k.this, gzsVar);
            }
        }, new wb0() { // from class: xsna.o710
            @Override // xsna.izs
            /* renamed from: j */
            public final qj50 invoke(sj50 sj50Var) {
                return new r610(g7s0.this, hc10Var, sj50Var);
            }
        }, q710.b, new p710()));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super MarketLinkedContentState, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super t610, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(q610 q610Var) {
        this.b.b(q610Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final MarketLinkedContentState e() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final MarketLinkedContentState getCurrentState() {
        return this.b.getCurrentState();
    }
}
