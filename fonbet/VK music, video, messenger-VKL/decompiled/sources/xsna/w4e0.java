package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.discover.carousel.products.ProductCarouselPromoItem;
import com.vkontakte.android.R;

/* compiled from: PromoCarouselItemHolder.kt */
/* loaded from: classes4.dex */
public final class w4e0 extends vif0<ProductCarouselPromoItem> implements View.OnClickListener {
    public final VkImage n;
    public final TextView o;
    public final TextView p;
    public final TextView q;

    public w4e0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.promo_recomendation_item, 0);
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.image);
        this.n = vkImage;
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        this.p = (TextView) this.itemView.findViewById(R.id.subtitle);
        TextView textView = (TextView) this.itemView.findViewById(R.id.action_button);
        this.q = textView;
        dek0.b(vkImage, null, null, 6);
        this.itemView.setOnClickListener(this);
        textView.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(ProductCarouselPromoItem productCarouselPromoItem) {
        ImageSize Cb;
        String str;
        ProductCarouselPromoItem productCarouselPromoItem2 = productCarouselPromoItem;
        ey2.i(this.o, productCarouselPromoItem2.d);
        ey2.i(this.p, productCarouselPromoItem2.e);
        Image image = productCarouselPromoItem2.c;
        VkImage vkImage = this.n;
        if (image == null || (Cb = image.Cb(cn70.b(40), true, false)) == null || (str = Cb.d.d) == null) {
            f4m.j(vkImage);
        } else {
            vkImage.setVisibility(0);
            vkImage.s0(str);
        }
        ey2.i(this.q, productCarouselPromoItem2.f);
        hd60.a().O0(productCarouselPromoItem2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        if (jjc.b() || (str = ((ProductCarouselPromoItem) this.m).g) == null) {
            return;
        }
        maz.c(xwk.d().e(), this.itemView.getContext(), str, LaunchContext.A, null, null, 24);
    }
}
