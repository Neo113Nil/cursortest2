package xsna;

import com.vk.superapp.ui.widgets.SuperAppTextWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vkontakte.android.R;

/* compiled from: SuperAppTextWidgetItem.kt */
/* loaded from: classes6.dex */
public final class dcn0 extends f9n0 {
    public final SuperAppTextWidget e;

    public dcn0(SuperAppTextWidget superAppTextWidget) {
        super(superAppTextWidget.k, superAppTextWidget.d, superAppTextWidget.n.b, null, 24);
        this.e = superAppTextWidget;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_text_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dcn0) && epx.f(this.e, ((dcn0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "SuperAppTextWidgetItem(data=" + this.e + ')';
    }
}
