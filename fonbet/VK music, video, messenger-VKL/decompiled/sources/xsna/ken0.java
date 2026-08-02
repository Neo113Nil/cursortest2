package xsna;

import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetTile;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetTileBigIconItem.kt */
/* loaded from: classes6.dex */
public final class ken0 extends men0 {
    public final SuperAppWidgetTile i;

    public ken0(SuperAppWidgetTile superAppWidgetTile) {
        super(superAppWidgetTile);
        this.i = superAppWidgetTile;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_tile_widget_big_icon;
    }

    @Override // xsna.men0, xsna.f9n0
    public final SuperAppWidget c() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ken0) && epx.f(this.i, ((ken0) obj).i);
    }

    @Override // xsna.men0
    /* renamed from: h */
    public final SuperAppWidgetTile c() {
        return this.i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return "SuperAppWidgetTileBigIconItem(data=" + this.i + ')';
    }
}
