package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.viewpager.model.MarketItemReviewsDoneOfferItem;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.viewpager.model.MarketItemReviewsProductOfferItem;

/* compiled from: MarketItemsForReviewViewAdapter.kt */
/* loaded from: classes18.dex */
public final class l610 extends sxm {
    public final k610 i;

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.k610] */
    public l610(final slh slhVar) {
        this.i = new yzs() { // from class: xsna.k610
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Long l = (Long) obj;
                l.getClass();
                Float f = (Float) obj3;
                f.getClass();
                slh.this.invoke(l, (UserId) obj2, f);
                return s3q0.a;
            }
        };
        x0(MarketItemReviewsDoneOfferItem.class, new amp(11));
        x0(MarketItemReviewsProductOfferItem.class, new f1j(this, 26));
    }
}
