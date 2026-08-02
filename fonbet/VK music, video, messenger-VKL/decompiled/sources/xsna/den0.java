package xsna;

import com.vk.superapp.ui.widgets.SuperAppShowcaseSectionScrollWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetShowcaseSectionScrollItem.kt */
/* loaded from: classes6.dex */
public final class den0 extends f9n0 {
    public final SuperAppShowcaseSectionScrollWidget e;

    public den0(SuperAppShowcaseSectionScrollWidget superAppShowcaseSectionScrollWidget) {
        super(superAppShowcaseSectionScrollWidget.k, superAppShowcaseSectionScrollWidget.d, superAppShowcaseSectionScrollWidget.n.b, null, 24);
        this.e = superAppShowcaseSectionScrollWidget;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_section_scroll_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof den0) && epx.f(this.e, ((den0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "SuperAppWidgetShowcaseSectionScrollItem(data=" + this.e + ')';
    }
}
