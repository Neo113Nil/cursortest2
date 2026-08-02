package xsna;

import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.miniwidgets.SuperAppMiniWidget;
import com.vkontakte.android.R;

/* compiled from: SuperAppMiniWidgetsScrollItem.kt */
/* loaded from: classes6.dex */
public final class fan0 extends f9n0 {
    public final SuperAppMiniWidget e;

    public fan0(SuperAppMiniWidget superAppMiniWidget) {
        super(superAppMiniWidget.k, superAppMiniWidget.d, superAppMiniWidget.m.b, superAppMiniWidget.e, 16);
        this.e = superAppMiniWidget;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_mini_widgets_scroll;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.e;
    }
}
