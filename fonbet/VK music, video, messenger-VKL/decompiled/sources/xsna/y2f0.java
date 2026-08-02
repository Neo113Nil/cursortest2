package xsna;

import android.content.Context;
import com.vk.dto.hints.HintId;
import com.vk.dto.reactions.ReactionMeta;

/* compiled from: NewsfeedListReactionsPlugin.kt */
/* loaded from: classes4.dex */
public final class y2f0 extends z2f0 {
    public final d3f0 f;

    public y2f0(d3f0 d3f0Var) {
        this.f = d3f0Var;
    }

    @Override // xsna.z2f0, xsna.x2f0
    public final void a() {
        hl60 hl60Var = hl60.a;
        hl60.b();
    }

    @Override // xsna.z2f0, xsna.x2f0
    public final void c() {
        hl60 hl60Var = hl60.a;
        hl60.b();
    }

    @Override // xsna.z2f0, xsna.x2f0
    public final void f(m3r m3rVar) {
        hl60 hl60Var = hl60.a;
        hl60.b();
        l7v b = pla.e().b();
        HintId hintId = HintId.BADGES_POST_FEED_NO_BADGES_UNSEEN;
        if (b.a(hintId.getId())) {
            m3rVar.post(new cc3(6, hintId.getId(), (Object) m3rVar));
        }
    }

    @Override // xsna.z2f0, xsna.x2f0
    public final void i(Context context, u5f0 u5f0Var, ReactionMeta reactionMeta, a2f0 a2f0Var, p2f0 p2f0Var) {
        super.i(context, u5f0Var, reactionMeta, a2f0Var, p2f0Var);
        d3f0 d3f0Var = this.f;
        if (d3f0Var != null) {
            d3f0Var.a(new gii0(u5f0Var, reactionMeta, a2f0Var, p2f0Var));
        }
    }

    @Override // xsna.z2f0, xsna.x2f0
    public final void b() {
    }
}
