package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.ads.api.newsfeed.WallAdsEasyPromoteUrlBuilder;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.ads.EasyPromote;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vkontakte.android.R;

/* compiled from: EasyPromoteStateHolder.kt */
/* loaded from: classes4.dex */
public final class swo extends qi6<NewsEntry> implements View.OnClickListener {
    public final WallAdsEasyPromoteUrlBuilder C;
    public final ImageView D;
    public final TextView E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swo(ViewGroup viewGroup, WallAdsEasyPromoteUrlBuilder wallAdsEasyPromoteUrlBuilder) {
        super(R.layout.post_easy_promote_state, viewGroup);
        viewGroup.getContext();
        this.C = wallAdsEasyPromoteUrlBuilder;
        this.D = (ImageView) this.itemView.findViewById(R.id.icon);
        this.E = (TextView) this.itemView.findViewById(R.id.text);
        this.itemView.setBackground(null);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        int i;
        int i2;
        int i3;
        EasyPromote c = na60.c(newsEntry);
        Integer valueOf = c != null ? Integer.valueOf(c.b) : null;
        if (valueOf != null && valueOf.intValue() == 4) {
            i = R.drawable.vk_icon_statistics_outline_24;
            i2 = R.string.ads_easy_promote_started;
            i3 = R.color.vk_blue_200;
        } else if (valueOf != null && valueOf.intValue() == 3) {
            i = R.drawable.vk_icon_error_circle_outline_24;
            i2 = R.string.ads_easy_promote_stopped;
            i3 = R.color.vk_orange;
        } else if (valueOf != null && valueOf.intValue() == 5) {
            i = R.drawable.vk_icon_recent_outline_24;
            i2 = R.string.ads_easy_promote_verifying;
            i3 = R.color.vk_gray_300;
        } else if (valueOf != null && valueOf.intValue() == 6) {
            i = R.drawable.vk_icon_block_outline_24;
            i2 = R.string.ads_easy_promote_rejected;
            i3 = R.color.vk_red;
        } else if (valueOf != null && valueOf.intValue() == 7) {
            i = R.drawable.vk_icon_done_24;
            i2 = R.string.ads_easy_promote_finished;
            i3 = R.color.vk_green;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
        if (imageView != null) {
            imageView.setImageTintList(anj.b(i3, this.itemView.getContext()));
        }
        this.E.setText(i2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String Bb;
        String b;
        NewsEntry q6 = q6();
        if (q6 == null || (Bb = q6.Bb()) == null) {
            return;
        }
        boolean d = fkq0.d(k9q0.o(q6));
        boolean z = q6 instanceof Post;
        WallAdsEasyPromoteUrlBuilder wallAdsEasyPromoteUrlBuilder = this.C;
        if (z) {
            b = wallAdsEasyPromoteUrlBuilder.a(Bb, d ? WallAdsEasyPromoteUrlBuilder.From.PROFILE_POST_POPOVER : WallAdsEasyPromoteUrlBuilder.From.COM_POST_POPOVER);
        } else if (!(q6 instanceof Videos)) {
            return;
        } else {
            b = wallAdsEasyPromoteUrlBuilder.b(Bb, d ? WallAdsEasyPromoteUrlBuilder.From.PROFILE_CLIP_POPOVER : WallAdsEasyPromoteUrlBuilder.From.COM_CLIP_POPOVER);
        }
        hd60.a().G(this.itemView.getContext(), InternalVkMiniApps.ADS_EASY_PROMOTE.h().a, b);
    }
}
