package xsna;

import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.half_tile.SuperAppWidgetHalfTile;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetShowcaseProgressHalfTileItem.kt */
/* loaded from: classes6.dex */
public final class ndn0 extends y8n0 {
    public final SuperAppWidgetHalfTile h;

    public ndn0(SuperAppWidgetHalfTile superAppWidgetHalfTile) {
        super(superAppWidgetHalfTile.k, superAppWidgetHalfTile.d, superAppWidgetHalfTile.n.b);
        this.h = superAppWidgetHalfTile;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_progress_half_tile_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndn0) && epx.f(this.h, ((ndn0) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "SuperAppWidgetShowcaseProgressHalfTileItem(data=" + this.h + ')';
    }
}
