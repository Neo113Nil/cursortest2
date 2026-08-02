package xsna;

import com.vk.superapp.ui.widgets.SuperAppShowcasePromoWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetShowcasePromoItem.kt */
/* loaded from: classes6.dex */
public final class qdn0 extends f9n0 {
    public final SuperAppShowcasePromoWidget e;

    public qdn0(SuperAppShowcasePromoWidget superAppShowcasePromoWidget) {
        super(superAppShowcasePromoWidget.k, superAppShowcasePromoWidget.d, superAppShowcasePromoWidget.n.b, null, 24);
        this.e = superAppShowcasePromoWidget;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_promo_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdn0) && epx.f(this.e, ((qdn0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "SuperAppWidgetShowcasePromoItem(data=" + this.e + ')';
    }
}
