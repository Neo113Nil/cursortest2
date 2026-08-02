package xsna;

import android.view.ViewGroup;
import com.vk.donut.design.view.badge.LargeOneTimeDonutBadge;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: DonutOneTimeBadgeHolder.kt */
/* loaded from: classes4.dex */
public final class a1o extends rp6<b1o, NewsEntry> {
    public final LargeOneTimeDonutBadge E;

    public a1o(ViewGroup viewGroup) {
        super(R.layout.news_item_one_time_donut_badge, viewGroup);
        this.E = (LargeOneTimeDonutBadge) this.itemView.findViewById(R.id.news_item_donut_large_badge);
    }

    @Override // xsna.rp6
    public final void R6(b1o b1oVar) {
        this.E.setAmount(b1oVar.h);
    }
}
