package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.products.ProductCarouselItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MarketPortletItemDelegate.kt */
/* loaded from: classes4.dex */
public final class pa10 implements lbf0 {
    public final h440 a;
    public final sz00 b;
    public final CommonMarketStat$TypeRefSource c = CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS;

    public pa10(h440 h440Var, sz00 sz00Var) {
        this.a = h440Var;
        this.b = sz00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.lbf0
    public final void a(kbf0 kbf0Var, vif0<?> vif0Var, int i) {
        T t = vif0Var.m;
        ProductCarouselItem productCarouselItem = t instanceof ProductCarouselItem ? (ProductCarouselItem) t : null;
        if (productCarouselItem == null) {
            return;
        }
        int i2 = productCarouselItem.c;
        UserId userId = productCarouselItem.l;
        if (kbf0Var.equals(jcr.c)) {
            b(vif0Var.itemView.getContext(), productCarouselItem, true);
            return;
        }
        if (kbf0Var.equals(xus.c)) {
            b(vif0Var.itemView.getContext(), productCarouselItem, false);
            return;
        }
        if (kbf0Var.equals(kci.d)) {
            View view = vif0Var.itemView;
            tfx tfxVar = new tfx("market.hideItem", new io.reactivex.rxjava3.processors.b(21), new io.reactivex.rxjava3.subjects.b(24));
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            tfx.l(tfxVar, "item_id", i2, 0, 0, 8);
            hg1.b(view, rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe(new c40(new oa10(this, i, productCarouselItem), 28)));
            return;
        }
        if (!kbf0Var.equals(sni.f)) {
            throw new NoWhenBranchMatchedException();
        }
        mt00.d(Long.valueOf(i2), Long.valueOf(userId.b), productCarouselItem.s, this.c, null, null, null, productCarouselItem.o, null, null, null, null, null, null, 32496);
    }

    public final void b(Context context, ProductCarouselItem productCarouselItem, boolean z) {
        hd60.a().P0(productCarouselItem, z);
        this.b.g(context, new qz00(productCarouselItem.c, productCarouselItem.l, this.c, productCarouselItem.s, null, null, null, productCarouselItem.o, null, null, null, null, null, 1047536));
    }
}
