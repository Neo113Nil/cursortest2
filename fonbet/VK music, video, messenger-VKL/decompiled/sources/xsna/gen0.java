package xsna;

import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.half_tile.SuperAppWidgetHalfTile;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetShowcaseUserStackHalfTileItem.kt */
/* loaded from: classes6.dex */
public final class gen0 extends y8n0 {
    public final SuperAppWidgetHalfTile h;

    public gen0(SuperAppWidgetHalfTile superAppWidgetHalfTile) {
        super(superAppWidgetHalfTile.k, superAppWidgetHalfTile.d, superAppWidgetHalfTile.n.b);
        this.h = superAppWidgetHalfTile;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_user_stack_half_tile_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gen0) && epx.f(this.h, ((gen0) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "SuperAppWidgetShowcaseUserStackHalfTileItem(data=" + this.h + ')';
    }
}
