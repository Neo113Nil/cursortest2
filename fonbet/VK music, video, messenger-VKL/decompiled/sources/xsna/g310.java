package xsna;

import com.vk.ecomm.reviews.api.model.MarketItemReviewRepliesArgs;
import xsna.an50;

/* compiled from: MarketItemReviewRepliesStore.kt */
/* loaded from: classes18.dex */
public final class g310 implements d310, mm50<c310, w1g0, h2g0> {
    public final /* synthetic */ mm50<c310, w1g0, h2g0> b;

    public g310(final MarketItemReviewRepliesArgs marketItemReviewRepliesArgs, final hoz hozVar, final fy2 fy2Var, final b25 b25Var) {
        this.b = new ql50((aqw) null, 7).a(an50.a.a(new j18() { // from class: xsna.e310
            @Override // xsna.gzs
            public final Object invoke() {
                return new com.vk.ecomm.reviews.impl.marketitem.replies.presentation.b(MarketItemReviewRepliesArgs.this);
            }
        }, h310.b, i310.b, new t5o0() { // from class: xsna.f310
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                return new com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o(hoz.this, fy2Var, b25Var, nn50Var);
            }
        }));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super c310, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super h2g0, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(w1g0 w1g0Var) {
        this.b.b(w1g0Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final c310 getCurrentState() {
        return this.b.getCurrentState();
    }
}
