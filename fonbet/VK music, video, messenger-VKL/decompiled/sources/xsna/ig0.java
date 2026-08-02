package xsna;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: AdMarkHolder.kt */
/* loaded from: classes4.dex */
public final class ig0 extends qi6<NewsEntry> {
    public final TextView C;

    public ig0(ViewGroup viewGroup) {
        super(R.layout.marked_as_ads, viewGroup);
        this.C = (TextView) this.itemView.findViewById(R.id.text);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        String str;
        int dimensionPixelSize;
        baf0 baf0Var;
        if (newsEntry instanceof Post) {
            if (((Post) newsEntry).F) {
                baf0Var = dhr0.t.b(R.drawable.vk_icon_money_circle_16, R.attr.vk_ui_icon_tertiary);
                str = v6(R.string.sponsored_post_in_group);
                dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.newsfeed_ad_mark_post_height);
            }
            dimensionPixelSize = 0;
            baf0Var = null;
            str = null;
        } else {
            if (newsEntry instanceof PromoPost) {
                str = ((PromoPost) newsEntry).q;
                if (str.length() > 0) {
                    dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.newsfeed_ad_mark_promo_post_height);
                    baf0Var = null;
                }
            }
            dimensionPixelSize = 0;
            baf0Var = null;
            str = null;
        }
        TextView textView = this.C;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(baf0Var, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setMinHeight(dimensionPixelSize);
        textView.setText(str);
    }
}
