package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProductId;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.wid0;

/* compiled from: MarketMultiPickerItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class j810 extends vfz<g810> {
    public final izs<b910, s3q0> l;
    public final q530 m;
    public final MarketProductTileView n;
    public g810 o;

    /* JADX WARN: Multi-variable type inference failed */
    public j810(ViewGroup viewGroup, izs<? super b910, s3q0> izsVar, q530 q530Var) {
        super(R.layout.products_multipicker_item_product_tile, viewGroup);
        this.l = izsVar;
        this.m = q530Var;
        this.n = (MarketProductTileView) this.itemView.findViewById(R.id.market_product_tile);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(g810 g810Var) {
        String str;
        List list;
        Float f;
        g810 g810Var2 = g810Var;
        this.o = g810Var2;
        MultipickerProduct multipickerProduct = g810Var2.e;
        MultipickerProduct.Moderation moderation = multipickerProduct.e;
        boolean z = moderation.b;
        boolean z2 = moderation.c;
        boolean z3 = moderation.d;
        Integer num = moderation.e;
        MultipickerProductId multipickerProductId = multipickerProduct.b;
        UserId userId = multipickerProductId.c;
        Long valueOf = Long.valueOf(multipickerProductId.b);
        MultipickerProduct.Moderation.Reject reject = moderation.g;
        c530 c530Var = new c530(z, z2, z3, num, new d530(userId, valueOf, reject != null ? new h530(reject.b, reject.c, reject.d) : null, moderation.f));
        ModerationRestriction a = this.m.a(c530Var);
        Context context = this.itemView.getContext();
        boolean h = a.h();
        boolean z4 = g810Var2.c;
        boolean z5 = g810Var2.d;
        MultipickerProduct.Owner owner = multipickerProduct.k;
        MultipickerProduct.Rating rating = multipickerProduct.l;
        MultipickerProduct.Price price = multipickerProduct.d;
        String str2 = multipickerProduct.c;
        Image image = multipickerProduct.f;
        boolean z6 = multipickerProduct.h;
        boolean z7 = moderation.c;
        MultipickerProduct.Moderation.Reject reject2 = moderation.g;
        boolean z8 = moderation.d;
        if (!z7 && z8) {
            image = null;
        }
        int i = R.drawable.vk_icon_gallery_outline_56;
        if (!z7 && z8) {
            i = R.drawable.vk_icon_block_outline_56;
        }
        MarketProductTileConfig.ProductStatus productStatus = (reject2 == null || !reject2.e) ? z8 ? MarketProductTileConfig.ProductStatus.HardBlock : reject2 != null ? MarketProductTileConfig.ProductStatus.SoftBlock : !z6 ? MarketProductTileConfig.ProductStatus.OutOfStock : MarketProductTileConfig.ProductStatus.Normal : MarketProductTileConfig.ProductStatus.Moderation;
        if (!z7) {
            if (z8) {
                str2 = context.getString(R.string.product_tile_unavailable);
            } else if (h) {
                str2 = context.getString(R.string.product_tile_specify_age);
            }
        }
        int i2 = price.e;
        if (i2 != 0) {
            str = str2;
            list = Collections.singletonList(new wid0.a(new wid0.a.InterfaceC3933a.b(i2)));
        } else {
            str = str2;
            list = EmptyList.b;
        }
        List list2 = list;
        Integer valueOf2 = (reject2 == null || !reject2.e) ? z8 ? Integer.valueOf(R.string.product_tile_status_badge_blocked) : (h || z6) ? null : Integer.valueOf(R.string.product_tile_status_badge_inactive) : Integer.valueOf(R.string.product_tile_status_badge_moderation);
        String string = valueOf2 != null ? context.getString(valueOf2.intValue()) : null;
        boolean z9 = ((rating == null || (f = rating.b) == null) ? 0.0f : f.floatValue()) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        String str3 = str;
        MarketProductTileConfig marketProductTileConfig = new MarketProductTileConfig(new MarketProductTileConfig.d(image, str3, Integer.valueOf(i), !z6, h, true), (MarketProductTileConfig.g) null, new MarketProductTileConfig.h(price.b, price.c, price.d, productStatus, moderation.c, 64), new MarketProductTileConfig.e(str3, z7, productStatus, 16), new MarketProductTileConfig.f(owner != null ? owner.c : null, owner != null ? owner.d : false, ((owner != null ? owner.c : null) == null || z9) ? false : true, 8), (MarketProductTileConfig.b) null, new MarketProductTileConfig.c(z4, z5), new MarketProductTileConfig.j(rating != null ? rating.b : null, rating != null ? rating.d : null, z9, 8), new MarketProductTileConfig.k(string, string != null), list2, (MarketProductTileConfig.a) null, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 63778);
        MarketProductTileView marketProductTileView = this.n;
        marketProductTileView.P4(marketProductTileConfig);
        marketProductTileView.Z4(new j6k(this, c530Var, a, 2));
    }
}
