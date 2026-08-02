package xsna;

import com.vk.superapp.ui.widgets.SuperAppShowcaseVideoBannerWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetShowcaseVideoBannerItem.kt */
/* loaded from: classes6.dex */
public final class hen0 extends f9n0 {
    public final SuperAppShowcaseVideoBannerWidget e;

    public hen0(SuperAppShowcaseVideoBannerWidget superAppShowcaseVideoBannerWidget) {
        super(superAppShowcaseVideoBannerWidget.k, superAppShowcaseVideoBannerWidget.d, superAppShowcaseVideoBannerWidget.n.b, null, 24);
        this.e = superAppShowcaseVideoBannerWidget;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_video_banner_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hen0) && epx.f(this.e, ((hen0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "SuperAppWidgetShowcaseVideoBannerItem(data=" + this.e + ')';
    }
}
