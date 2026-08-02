package xsna;

import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;

/* compiled from: ReactionsFeedMviStore.kt */
/* loaded from: classes4.dex */
public final class r4f0 implements o4f0, bn50<ReactionsFeedMviState, ReactionsFeedMviState, a4f0, d4f0> {
    public final /* synthetic */ cn50 b;

    public r4f0(h5f0 h5f0Var) {
        this.b = new cn50(new ql50((aqw) null, 7).a(uil0.a(h5f0Var.e, new o5c0(h5f0Var, 1), new jsi(new com.vk.movika.tools.controls.seekbar.j(h5f0Var, 12)), new jui(new hs00(h5f0Var, 24)), new sui(new com.vk.movika.tools.controls.seekbar.i(h5f0Var, 14)))));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super ReactionsFeedMviState, s3q0> izsVar) {
        return this.b.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super d4f0, s3q0> izsVar) {
        return this.b.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(lj50 lj50Var) {
        this.b.b((a4f0) lj50Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final Object e() {
        return (ReactionsFeedMviState) this.b.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final lm50 getCurrentState() {
        return (ReactionsFeedMviState) this.b.b.getCurrentState();
    }
}
