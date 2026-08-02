package xsna;

import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.debug.VkFeedDebugInfoView;
import com.vkontakte.android.R;

/* compiled from: DebugInfoHolder.kt */
/* loaded from: classes4.dex */
public final class y5l extends rp6<z5l, NewsEntry> {
    public final VkFeedDebugInfoView E;

    public y5l(ViewGroup viewGroup) {
        super(R.layout.news_item_debug_info, viewGroup);
        VkFeedDebugInfoView vkFeedDebugInfoView = (VkFeedDebugInfoView) this.itemView;
        this.E = vkFeedDebugInfoView;
        vkFeedDebugInfoView.setOnLabelClickListener(new w16(this, 3));
        vkFeedDebugInfoView.setOnDescriptionClickListener(new yn3(this, 7));
    }

    @Override // xsna.rp6
    public final void R6(z5l z5lVar) {
        CharSequence charSequence = z5lVar.h;
        VkFeedDebugInfoView vkFeedDebugInfoView = this.E;
        vkFeedDebugInfoView.setLabelText(charSequence);
        vkFeedDebugInfoView.setDescriptionText(null);
        vkFeedDebugInfoView.setDescriptionVisible(false);
    }
}
