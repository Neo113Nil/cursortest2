package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.ads.api.newsfeed.WallAdsEasyPromoteUrlBuilder;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.ads.EasyPromote;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vkontakte.android.R;

/* compiled from: EasyPromoteButtonHolder.kt */
/* loaded from: classes4.dex */
public final class vvo extends qi6<NewsEntry> implements View.OnClickListener {
    public final WallAdsEasyPromoteUrlBuilder C;
    public final TextView D;
    public final TextView E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvo(ViewGroup viewGroup, WallAdsEasyPromoteUrlBuilder wallAdsEasyPromoteUrlBuilder) {
        super(R.layout.post_easy_promote_button_v3, viewGroup);
        viewGroup.getContext();
        this.C = wallAdsEasyPromoteUrlBuilder;
        this.D = (TextView) this.itemView.findViewById(R.id.text);
        TextView textView = (TextView) this.itemView.findViewById(R.id.button);
        this.E = textView;
        this.itemView.setBackground(null);
        this.itemView.setOnClickListener(this);
        textView.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        EasyPromote c = na60.c(newsEntry);
        String str = c != null ? c.d : null;
        String str2 = c != null ? c.e : null;
        if (str == null || str.length() == 0) {
            str = v6(R.string.ads_easy_promote_description);
        }
        this.D.setText(str);
        if (str2 == null || str2.length() == 0) {
            str2 = v6(R.string.ads_easy_promote_button);
        }
        this.E.setText(str2);
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
