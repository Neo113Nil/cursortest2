package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.api.dto.market.MarketTileInfo;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetMarketProductTile;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.wid0;
import xsna.zdn0;

/* compiled from: SuperAppWidgetMarketProductTileHolder.kt */
/* loaded from: classes6.dex */
public final class vcn0 extends ucn0<wcn0> implements f530 {
    public final u7n0 p;
    public final q530 q;
    public final MarketProductTileView r;
    public final p530 s;

    public vcn0(View view, zdn0.b bVar, q530 q530Var) {
        super(view, null);
        this.p = bVar;
        this.q = q530Var;
        MarketProductTileView marketProductTileView = (MarketProductTileView) this.itemView.findViewById(R.id.product_tile);
        this.r = marketProductTileView;
        VkPicture vkPicture = (VkPicture) marketProductTileView.findViewById(R.id.iv_main_image);
        TextView textView = (TextView) marketProductTileView.findViewById(R.id.tv_price);
        TextView textView2 = (TextView) marketProductTileView.findViewById(R.id.tv_name);
        RecyclerView recyclerView = (RecyclerView) marketProductTileView.findViewById(R.id.rv_badges);
        this.s = new p530(this.itemView, (VKImageView) null, (TextView) null, (TextView) null, (TextView) null, 60);
        bwt0.f0(vkPicture, 0, 0, 0, 0, 8);
        vkPicture.setCornerRadius(cn70.c(12));
        bwt0.f0(textView, 0, 0, 0, 0, 14);
        bwt0.f0(textView2, 0, 0, 0, 0, 14);
        recyclerView.setTranslationX(cn70.c(-6));
    }

    public static MarketProductTileConfig g6(Context context, SuperAppWidgetMarketProductTile.Payload payload, boolean z) {
        Object cVar;
        SoccomFeatures soccomFeatures = SoccomFeatures.SUPERAPP_MARKET_LAMODA;
        soccomFeatures.getClass();
        if (com.vk.toggle.b.A.a(soccomFeatures)) {
            String str = payload.h;
            String str2 = payload.f;
            cVar = epx.f(str, "lamoda") ? new wid0.b(str2) : (str2 == null || str2.length() == 0) ? new wid0.c(null) : new wid0.c(str2);
        } else {
            String str3 = payload.f;
            cVar = (str3 == null || str3.length() == 0) ? new wid0.c(null) : new wid0.c(str3);
        }
        MarketTileInfo marketTileInfo = payload.d;
        String string = z ? context.getString(R.string.product_tile_specify_age) : marketTileInfo.b;
        MarketProductTileConfig.k kVar = new MarketProductTileConfig.k(context.getString(R.string.product_tile_status_badge_for_adults), z);
        WebImage webImage = payload.c;
        return new MarketProductTileConfig(new MarketProductTileConfig.d(webImage != null ? chx0.a(webImage) : null, z, 10), (MarketProductTileConfig.g) null, new MarketProductTileConfig.h(marketTileInfo.c, marketTileInfo.d, null, null, false, 92), new MarketProductTileConfig.e(string, false, null, 22), new MarketProductTileConfig.f((String) null, false, false, 15), (MarketProductTileConfig.b) null, (MarketProductTileConfig.c) null, (MarketProductTileConfig.j) null, kVar, Collections.singletonList(cVar), (MarketProductTileConfig.a) null, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 63970);
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        wcn0 wcn0Var = (wcn0) zif0Var;
        SuperAppWidgetMarketProductTile.Payload payload = wcn0Var.h.o;
        c530 c530Var = new c530(payload.e, false, false, null, new d530(null, null, null, null));
        q530 q530Var = this.q;
        if (q530Var != null) {
            q530Var.c(c530Var, this, new na7(27, this, wcn0Var));
        }
        this.r.Z4(new dyc(this, c530Var, wcn0Var, 5));
    }

    @Override // xsna.f530
    public final p530 k1(Integer num) {
        return this.s;
    }

    @Override // xsna.f530
    public final void o1(Integer num) {
        Context context = this.itemView.getContext();
        Object obj = this.l;
        if (obj == null) {
            obj = null;
        }
        this.r.P4(g6(context, ((wcn0) obj).h.o, false));
    }
}
