package xsna;

import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.tile.SuperAppMoreTile;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetMoreTileItem.kt */
/* loaded from: classes6.dex */
public final class ycn0 extends e9n0 {
    public final SuperAppMoreTile h;

    public ycn0(SuperAppMoreTile superAppMoreTile) {
        super(superAppMoreTile.k, superAppMoreTile.d, superAppMoreTile.n.b);
        this.h = superAppMoreTile;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_more_tile_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ycn0) && epx.f(this.h, ((ycn0) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "SuperAppWidgetMoreTileItem(data=" + this.h + ')';
    }
}
