package xsna;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.discover.community.CommunityMediaDiscoverGridItem;
import com.vk.dto.polls.PollGradient;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import xsna.am;

/* compiled from: CommunityMediaDiscoverGridItemHolder.kt */
/* loaded from: classes4.dex */
public final class aah extends uc6<CommunityMediaDiscoverGridItem> {
    public final ViewGroup I;
    public final View J;
    public final ImageView K;
    public final VkImage L;
    public final TextView M;
    public final TextView N;

    public aah(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.news_community_discover_grid_item, viewGroup, false), viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.news_community_grid_item_container);
        this.I = viewGroup2;
        this.J = this.itemView.findViewById(R.id.news_community_discover_grid_item_fade);
        this.K = (ImageView) this.itemView.findViewById(R.id.news_community_discover_grid_item_icon);
        this.L = (VkImage) this.itemView.findViewById(R.id.news_community_discover_grid_item_preview);
        this.M = (TextView) this.itemView.findViewById(R.id.news_community_discover_grid_item_title);
        this.N = (TextView) this.itemView.findViewById(R.id.news_community_discover_grid_item_subtitle);
        viewGroup2.setOnClickListener(this);
        viewGroup2.setOnLongClickListener(this);
        iut0.o(viewGroup2, am.a.e, this.itemView.getContext().getString(R.string.accessibility_discover_media_go), null);
        iut0.o(viewGroup2, am.a.f, this.itemView.getContext().getString(R.string.accessibility_discover_media_open_menu), null);
    }

    @Override // xsna.uc6
    public final void U6(CommunityMediaDiscoverGridItem communityMediaDiscoverGridItem) {
        CommunityMediaDiscoverGridItem communityMediaDiscoverGridItem2 = communityMediaDiscoverGridItem;
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_background);
        ViewGroup viewGroup = this.I;
        viewGroup.setBackgroundColor(c);
        TextView textView = this.M;
        textView.setVisibility(0);
        TextView textView2 = this.N;
        textView2.setVisibility(0);
        this.J.setVisibility(4);
        NewsEntry newsEntry = communityMediaDiscoverGridItem2.c;
        int i = communityMediaDiscoverGridItem2.k;
        Post R = di60.R(newsEntry);
        ImageView imageView = this.K;
        if (R == null || !R.mc()) {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        } else {
            imageView.setImageResource(R.drawable.vk_icon_pin_outline_shadow_28);
            imageView.setVisibility(0);
        }
        DiscoverGridItem.a aVar = communityMediaDiscoverGridItem2.g;
        String str = aVar.a;
        String str2 = aVar.b;
        textView.setText(str);
        textView2.setText(str2);
        boolean z = (str == null || drm0.N(str) || str2 == null || drm0.N(str2)) ? false : true;
        String str3 = communityMediaDiscoverGridItem2.m;
        boolean z2 = communityMediaDiscoverGridItem2.j;
        boolean z3 = communityMediaDiscoverGridItem2.l;
        textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
        textView2.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
        if (z3) {
            imageView.setColorFilter(abg0Var.c(R.attr.vk_ui_text_primary), PorterDuff.Mode.MULTIPLY);
        } else {
            imageView.clearColorFilter();
        }
        VkImage vkImage = this.L;
        vkImage.o0(str3, null);
        vkImage.setOnLoadCallback(new z9h(this, z, z2, z3));
        PollGradient pollGradient = communityMediaDiscoverGridItem2.n;
        if (pollGradient != null) {
            viewGroup.setBackground(new dqb0(pollGradient, 0));
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast));
            textView2.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast));
            imageView.setColorFilter(abg0Var.c(R.attr.vk_ui_text_contrast), PorterDuff.Mode.MULTIPLY);
        }
        CommunityMediaDiscoverGridItem communityMediaDiscoverGridItem3 = (CommunityMediaDiscoverGridItem) this.D;
        viewGroup.setContentDescription(communityMediaDiscoverGridItem3 != null ? R6(communityMediaDiscoverGridItem3, Integer.valueOf(communityMediaDiscoverGridItem2.o)) : null);
    }
}
