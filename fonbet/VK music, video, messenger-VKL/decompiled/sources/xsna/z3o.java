package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.text.VkText;
import com.vk.donut.design.view.badge.SmallOneTimeDonutBadge;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: DonutTextOneTimeBadgeHolder.kt */
/* loaded from: classes4.dex */
public final class z3o extends rp6<a4o, NewsEntry> {
    public final VkText E;
    public final SmallOneTimeDonutBadge F;

    public z3o(ViewGroup viewGroup) {
        super(R.layout.news_item_one_time_donut_badge_with_text, viewGroup);
        this.E = (VkText) this.itemView.findViewById(R.id.news_item_donut_badge_text);
        this.F = (SmallOneTimeDonutBadge) this.itemView.findViewById(R.id.news_item_donut_small_badge);
    }

    @Override // xsna.rp6
    public final void R6(a4o a4oVar) {
        a4o a4oVar2 = a4oVar;
        this.E.setText(a4oVar2.h);
        this.F.setAmount(a4oVar2.i);
    }
}
