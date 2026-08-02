package xsna;

import android.content.Context;
import com.vk.comments.api.model.MarketItemCommentsArgs;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;

/* compiled from: CommentsFeatureRouterImpl.kt */
/* loaded from: classes17.dex */
public final class oeg implements neg {
    @Override // xsna.neg
    public final void a(MarketItemCommentsArgs marketItemCommentsArgs, Context context) {
        MarketItemCommentsFragment.a aVar = new MarketItemCommentsFragment.a(MarketItemCommentsFragment.class, null, null);
        aVar.j.putParcelable("MARKET_ITEM_COMMENTS_ARGS_KEY", marketItemCommentsArgs);
        aVar.k(context);
    }
}
