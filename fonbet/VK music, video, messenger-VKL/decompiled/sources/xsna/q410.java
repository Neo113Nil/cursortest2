package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.view.components.rating.VkDynamicRatingBar;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.viewpager.model.MarketItemReviewsProductOfferItem;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: MarketItemReviewsProductOfferItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class q410 extends vfz<MarketItemReviewsProductOfferItem> {
    public final yzs<Long, UserId, Float, s3q0> l;
    public Long m;
    public UserId n;
    public final View o;
    public final VKImageView p;
    public final TextView q;
    public final TextView r;
    public final VkDynamicRatingBar s;
    public final TextView t;

    public q410(ViewGroup viewGroup, k610 k610Var) {
        super(R.layout.market_item_reviews_product_offer_item_view_holder, viewGroup);
        this.l = k610Var;
        this.o = this.itemView.findViewById(R.id.item_view_holder_view);
        this.p = (VKImageView) this.itemView.findViewById(R.id.item_iv);
        this.q = (TextView) this.itemView.findViewById(R.id.item_title_tv);
        this.r = (TextView) this.itemView.findViewById(R.id.item_description_tv);
        VkDynamicRatingBar vkDynamicRatingBar = (VkDynamicRatingBar) this.itemView.findViewById(R.id.rating_view);
        this.s = vkDynamicRatingBar;
        this.t = (TextView) this.itemView.findViewById(R.id.item_reviewed_message_tv);
        vkDynamicRatingBar.setOnRatingChanged(new n1d(this, 27));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(MarketItemReviewsProductOfferItem marketItemReviewsProductOfferItem) {
        MarketItemReviewsProductOfferItem marketItemReviewsProductOfferItem2 = marketItemReviewsProductOfferItem;
        this.m = Long.valueOf(marketItemReviewsProductOfferItem2.b);
        this.n = marketItemReviewsProductOfferItem2.c;
        List<BaseImageDto> list = marketItemReviewsProductOfferItem2.d;
        VKImageView vKImageView = this.p;
        bwt0.S(vKImageView, new cpo0(list, vKImageView));
        this.q.setText(marketItemReviewsProductOfferItem2.e);
        this.r.setText(marketItemReviewsProductOfferItem2.f);
        int i = (int) marketItemReviewsProductOfferItem2.g;
        VkDynamicRatingBar vkDynamicRatingBar = this.s;
        vkDynamicRatingBar.setRating(i);
        boolean z = marketItemReviewsProductOfferItem2.h;
        vkDynamicRatingBar.setInteractionEnabled(!z);
        this.t.setVisibility(z ? 0 : 4);
        View view = this.o;
        if (z) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new en9(this, 8));
        }
    }
}
