package xsna;

import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;
import xsna.k4f0;

/* compiled from: ReactionsFeedMviReducer.kt */
/* loaded from: classes4.dex */
public final class n4f0 implements bm50<ReactionsFeedMviState, k4f0> {
    @Override // xsna.bm50
    public final ReactionsFeedMviState a(ReactionsFeedMviState reactionsFeedMviState, k4f0 k4f0Var) {
        ReactionsFeedMviState reactionsFeedMviState2 = reactionsFeedMviState;
        k4f0 k4f0Var2 = k4f0Var;
        if (!(k4f0Var2 instanceof k4f0.a)) {
            return reactionsFeedMviState2;
        }
        String str = ((k4f0.a) k4f0Var2).a;
        ur60 ur60Var = reactionsFeedMviState2.c;
        reactionsFeedMviState2.getClass();
        return new ReactionsFeedMviState(str, ur60Var);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(k4f0 k4f0Var) {
        return true;
    }
}
