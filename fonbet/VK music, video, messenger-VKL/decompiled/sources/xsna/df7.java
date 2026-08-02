package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.divider.VkDivider;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: BlockHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class df7 extends rp6<ff7, NewsEntry> {
    public final VkGroupHeader E;
    public final VkDivider F;

    public df7(ViewGroup viewGroup) {
        super(R.layout.news_block_header_v3, viewGroup);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView.findViewById(R.id.recommendation_header);
        this.E = vkGroupHeader;
        this.F = (VkDivider) this.itemView.findViewById(R.id.recommendation_divider);
        getContext();
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        zq70.G(vkGroupHeader);
        vkGroupHeader.setRight(new VkGroupHeader.Right(null, new VkGroupHeader.Right.b(new gko(R.drawable.vk_icon_cancel_outline_24), new x7g(R.attr.vk_ui_icon_secondary), tq.h(tlo0.Companion, R.string.hide_not_interesting), new rj1(this, 8)), null, 5));
    }

    @Override // xsna.rp6
    public final void R6(ff7 ff7Var) {
        String Db;
        ff7 ff7Var2 = ff7Var;
        Integer num = ff7Var2.i;
        VkGroupHeader.d dVar = new VkGroupHeader.d(num != null ? v6(num.intValue()) : ff7Var2.h, null, null, null, 0, null, 510);
        VkGroupHeader vkGroupHeader = this.E;
        vkGroupHeader.setTitle(dVar);
        vkGroupHeader.setSubtitle(ff7Var2.l);
        bwt0.p0(this.F, ff7Var2.k);
        NewsEntry newsEntry = ff7Var2.j;
        if (newsEntry == null || (Db = newsEntry.Db()) == null) {
            return;
        }
        bwt0.Q(vkGroupHeader, R.id.feed_ui_test_news_entry_type_tag, Db);
    }
}
