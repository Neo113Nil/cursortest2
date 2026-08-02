package xsna;

import com.vk.superapp.ui.widgets.SuperAppShowcaseSectionPosterWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetShowcaseSectionPosterItem.kt */
/* loaded from: classes6.dex */
public final class xdn0 extends f9n0 {
    public final SuperAppShowcaseSectionPosterWidget e;

    public xdn0(SuperAppShowcaseSectionPosterWidget superAppShowcaseSectionPosterWidget) {
        super(superAppShowcaseSectionPosterWidget.k, superAppShowcaseSectionPosterWidget.d, superAppShowcaseSectionPosterWidget.n.b, null, 24);
        this.e = superAppShowcaseSectionPosterWidget;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_section_poster_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdn0) && epx.f(this.e, ((xdn0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "SuperAppWidgetShowcaseSectionPosterItem(data=" + this.e + ')';
    }
}
