package xsna;

import com.vk.superapp.ui.widgets.SuperAppShowcaseScrollWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetShowcaseScrollInGridItem.kt */
/* loaded from: classes6.dex */
public final class vdn0 extends f9n0 {
    public final SuperAppShowcaseScrollWidget e;

    public vdn0(SuperAppShowcaseScrollWidget superAppShowcaseScrollWidget) {
        super(superAppShowcaseScrollWidget.k, superAppShowcaseScrollWidget.d, superAppShowcaseScrollWidget.n.b, null, 24);
        this.e = superAppShowcaseScrollWidget;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_scroll_in_grid_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdn0) && epx.f(this.e, ((vdn0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "SuperAppWidgetShowcaseScrollInGridItem(data=" + this.e + ')';
    }
}
