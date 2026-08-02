package xsna;

import android.view.ViewTreeObserver;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.recyclerview.ReactionsFeedLinearLayoutManager;

/* compiled from: ReactionsFeedLinearLayoutManager.kt */
/* loaded from: classes4.dex */
public final class y3f0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ ReactionsFeedLinearLayoutManager c;

    public y3f0(ViewTreeObserver viewTreeObserver, ReactionsFeedLinearLayoutManager reactionsFeedLinearLayoutManager) {
        this.b = viewTreeObserver;
        this.c = reactionsFeedLinearLayoutManager;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.removeOnGlobalLayoutListener(this);
        ReactionsFeedLinearLayoutManager reactionsFeedLinearLayoutManager = this.c;
        int i = reactionsFeedLinearLayoutManager.w;
        if (i != -1) {
            reactionsFeedLinearLayoutManager.K(i, reactionsFeedLinearLayoutManager.x);
            reactionsFeedLinearLayoutManager.w = -1;
            reactionsFeedLinearLayoutManager.x = Integer.MIN_VALUE;
        }
    }
}
