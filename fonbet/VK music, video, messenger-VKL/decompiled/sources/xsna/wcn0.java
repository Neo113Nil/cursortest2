package xsna;

import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetMarketProductTile;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetMarketProductTileItem.kt */
/* loaded from: classes6.dex */
public final class wcn0 extends e9n0 {
    public final SuperAppWidgetMarketProductTile h;

    public wcn0(SuperAppWidgetMarketProductTile superAppWidgetMarketProductTile) {
        super(superAppWidgetMarketProductTile.k, superAppWidgetMarketProductTile.d, superAppWidgetMarketProductTile.n.b);
        this.h = superAppWidgetMarketProductTile;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_market_product_tile_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wcn0) && epx.f(this.h, ((wcn0) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "SuperAppWidgetMarketProductTileItem(data=" + this.h + ')';
    }
}
