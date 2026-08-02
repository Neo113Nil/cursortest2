package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.viewpager.model.MarketItemReviewsDoneOfferItem;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: MarketItemReviewsDoneOfferItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class s310 extends vfz<MarketItemReviewsDoneOfferItem> {
    public final TextView l;
    public final VKImageView m;

    public s310(ViewGroup viewGroup) {
        super(R.layout.market_item_reviews_done_item_view_holder, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.subtitle_tv);
        this.m = (VKImageView) this.itemView.findViewById(R.id.main_image_iv);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(MarketItemReviewsDoneOfferItem marketItemReviewsDoneOfferItem) {
        this.l.setText(this.itemView.getContext().getString(R.string.market_items_for_review_bottomsheet_congratulation_text));
        boolean M = dhr0.M();
        VKImageView vKImageView = this.m;
        if (M) {
            vKImageView.setImageResource(R.drawable.vk_icon_illustration_rating_and_review_dark_120h);
        } else {
            vKImageView.setImageResource(R.drawable.vk_icon_illustration_rating_and_review_light_120h);
        }
    }
}
