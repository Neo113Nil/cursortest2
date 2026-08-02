package xsna;

import android.content.Context;
import com.vk.dto.common.Image;
import com.vk.dto.discover.carousel.products.ProductCarouselItem;
import com.vk.dto.photo.Photo;
import com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto;
import com.vkontakte.android.R;
import java.util.Collections;

/* compiled from: ProductCarouselItemHolderV2.kt */
/* loaded from: classes4.dex */
public final class ond0 extends vif0<ProductCarouselItem> {
    public final pnd0 n;
    public final gtl0 o;
    public final ag20 p;
    public final yu60 q;

    public ond0(pnd0 pnd0Var, gtl0 gtl0Var) {
        super(gtl0Var.itemView, gtl0Var.l);
        this.n = pnd0Var;
        this.o = gtl0Var;
        this.p = new ag20(this, 24);
        this.q = new yu60(this, 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto$a] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto$a] */
    @Override // xsna.vif0
    public final void i6(ProductCarouselItem productCarouselItem) {
        ProductCarouselItem productCarouselItem2 = productCarouselItem;
        ag20 ag20Var = this.p;
        gtl0 gtl0Var = this.o;
        gtl0Var.q6(ag20Var);
        gtl0Var.s6(this.q);
        Context context = this.itemView.getContext();
        this.n.getClass();
        RecommendationsCarouselItemUiDto.c cVar = new RecommendationsCarouselItemUiDto.c(productCarouselItem2.f.e, null, null, 30);
        String str = productCarouselItem2.d;
        Photo photo = productCarouselItem2.g;
        RecommendationsCarouselItemUiDto.b bVar = photo != null ? new RecommendationsCarouselItemUiDto.b(photo.y, null) : null;
        String str2 = productCarouselItem2.q;
        if (str2 != null) {
            Image image = productCarouselItem2.r;
            r8 = new RecommendationsCarouselItemUiDto.a(str2, image != null ? new RecommendationsCarouselItemUiDto.a.InterfaceC1369a.b(Collections.singletonList(image)) : null, true);
        }
        gtl0Var.V5(new RecommendationsCarouselItemUiDto(cVar, str, bVar, r8, new RecommendationsCarouselItemUiDto.ActionButtonData(context.getString(R.string.product_carousel_item_action_button_title), null, null, RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.NONE, 6)));
    }
}
