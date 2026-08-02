package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MarketItemRating;
import com.vk.ecomm.design.view.badge.MarketDiscountBadge;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: GoodPreviewItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class q6u extends vfz<o6u> {
    public final VkText l;
    public final VkText m;
    public final VkText n;
    public final MarketDiscountBadge o;
    public final VkPicture p;
    public final View q;
    public final View r;
    public final VkText s;
    public final VkText t;
    public final VkText u;
    public final VkText v;
    public o6u w;

    public q6u(ViewGroup viewGroup, sop sopVar) {
        super(R.layout.good_preview_info_item, viewGroup);
        this.l = (VkText) this.itemView.findViewById(R.id.product_preview_title);
        this.m = (VkText) this.itemView.findViewById(R.id.product_preview_price);
        VkText vkText = (VkText) this.itemView.findViewById(R.id.product_preview_old_price);
        this.n = vkText;
        this.o = (MarketDiscountBadge) this.itemView.findViewById(R.id.product_preview_discount);
        VkPicture vkPicture = (VkPicture) this.itemView.findViewById(R.id.product_preview_picture);
        this.p = vkPicture;
        View findViewById = this.itemView.findViewById(R.id.product_preview_rating_container);
        this.q = findViewById;
        this.r = this.itemView.findViewById(R.id.product_preview_rating_star_view);
        this.s = (VkText) findViewById.findViewById(R.id.product_preview_rating_mark);
        this.t = (VkText) findViewById.findViewById(R.id.product_preview_rating_reviews_count);
        VkText vkText2 = (VkText) this.itemView.findViewById(R.id.product_preview_description);
        this.u = vkText2;
        this.v = (VkText) this.itemView.findViewById(R.id.product_preview_show_more_button);
        vkPicture.setPlaceholderColor(dhr0.Y(R.attr.vk_ui_background_secondary, this.itemView.getContext()));
        vkText.setPaintFlags(17);
        vkText2.setHyphenationFrequency(0);
        vkText2.getViewTreeObserver().addOnPreDrawListener(new p6u(vkText2, this));
        this.itemView.setOnClickListener(new sch(3, sopVar, this));
    }

    @Override // xsna.vfz
    public final void W5(o6u o6uVar) {
        int i;
        Float f;
        Float f2;
        o6u o6uVar2 = o6uVar;
        Object obj = 0;
        k7u k7uVar = o6uVar2.b;
        if (this.w == null || !obj.equals(obj)) {
            this.w = o6uVar2;
            Good good = k7uVar.a;
            Good good2 = k7uVar.a;
            this.l.setText(good.d);
            Image image = good.n;
            String str = good.e;
            ImageSize imageSize = (ImageSize) ixj0.c(image != null ? image.b : null, cn70.b(135), cn70.b(162));
            String str2 = imageSize != null ? imageSize.d.d : null;
            if (str2 == null) {
                str2 = "";
            }
            this.p.setContent(new c.d(str2, null));
            this.m.setText(good2.h.e);
            ey2.i(this.n, good2.h.f);
            int i2 = good2.h.g;
            MarketDiscountBadge marketDiscountBadge = this.o;
            if (i2 != 0) {
                marketDiscountBadge.setDiscountFromValue(i2);
                marketDiscountBadge.setVisibility(0);
            } else {
                f4m.j(marketDiscountBadge);
            }
            o6u o6uVar3 = this.w;
            if (o6uVar3 == null) {
                o6uVar3 = null;
            }
            MarketItemRating marketItemRating = o6uVar3.b.a.t;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float floatValue = (marketItemRating == null || (f2 = marketItemRating.b) == null) ? 0.0f : f2.floatValue();
            VkText vkText = this.t;
            VkText vkText2 = this.s;
            if (floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                o6u o6uVar4 = this.w;
                if (o6uVar4 == null) {
                    o6uVar4 = null;
                }
                MarketItemRating marketItemRating2 = o6uVar4.b.a.t;
                if (marketItemRating2 != null && (f = marketItemRating2.b) != null) {
                    f3 = f.floatValue();
                }
                vkText2.setText(brm0.y(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1)), ".", StringUtils.COMMA));
                vkText2.setVisibility(0);
                o6u o6uVar5 = this.w;
                if (o6uVar5 == null) {
                    o6uVar5 = null;
                }
                MarketItemRating marketItemRating3 = o6uVar5.b.a.t;
                Integer num = marketItemRating3 != null ? marketItemRating3.c : null;
                vkText.setText(num != null ? enj.f(R.plurals.good_preview_review_count, num.intValue(), this.itemView.getContext()) : null);
                i = R.attr.vk_ui_accent_orange_peach;
            } else {
                vkText2.setVisibility(8);
                vkText.setText(this.itemView.getContext().getString(R.string.good_preview_no_reviews));
                i = R.attr.vk_ui_icon_tertiary;
            }
            this.r.setBackgroundTintList(ColorStateList.valueOf(dhr0.t.c(i)));
            int i3 = str.length() <= 0 ? 8 : 0;
            VkText vkText3 = this.u;
            vkText3.setVisibility(i3);
            vkText3.setText(str);
            o6u o6uVar6 = this.w;
            mt00.d(Long.valueOf((o6uVar6 == null ? null : o6uVar6).b.a.b), Long.valueOf((o6uVar6 != null ? o6uVar6 : null).b.a.c.b), -1, CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS, null, null, null, null, null, null, null, null, null, null, 32752);
        }
    }
}
