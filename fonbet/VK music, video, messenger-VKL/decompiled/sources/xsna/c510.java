package xsna;

import android.content.Context;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: MarketItemTileConfigurator.kt */
/* loaded from: classes18.dex */
public final class c510 {
    public static MarketProductTileConfig a(Context context, a210 a210Var, boolean z) {
        String str = a210Var.d;
        Photo photo = a210Var.h;
        boolean z2 = a210Var.i;
        if (!z2 && z) {
            str = context.getString(R.string.product_tile_specify_age);
        }
        String str2 = str;
        Integer valueOf = (z2 || !z) ? null : Integer.valueOf(R.string.product_tile_status_badge_for_adults);
        String string = valueOf != null ? context.getString(valueOf.intValue()) : null;
        return new MarketProductTileConfig(new MarketProductTileConfig.d(photo != null ? photo.y : null, str2, Integer.valueOf(R.drawable.vk_icon_gallery_outline_56), false, z, true), (MarketProductTileConfig.g) null, new MarketProductTileConfig.h(a210Var.g, a210Var.f, a210Var.e, null, false, 88), new MarketProductTileConfig.e(str2, false, null, 22), new MarketProductTileConfig.f((String) null, false, false, 8), new MarketProductTileConfig.b(a210Var.k, true), (MarketProductTileConfig.c) null, new MarketProductTileConfig.j((Float) null, (String) null, false, 8), new MarketProductTileConfig.k(string, string != null), (List) null, (MarketProductTileConfig.a) null, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 64834);
    }
}
