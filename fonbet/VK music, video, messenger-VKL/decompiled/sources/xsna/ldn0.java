package xsna;

import com.vk.superapp.ui.widgets.SuperAppShowcaseConfirmNumberWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetShowcaseConfirmNumberItem.kt */
/* loaded from: classes6.dex */
public final class ldn0 extends f9n0 {
    public final SuperAppShowcaseConfirmNumberWidget e;

    public ldn0(SuperAppShowcaseConfirmNumberWidget superAppShowcaseConfirmNumberWidget) {
        super(superAppShowcaseConfirmNumberWidget.k, superAppShowcaseConfirmNumberWidget.d, superAppShowcaseConfirmNumberWidget.n.b, null, 24);
        this.e = superAppShowcaseConfirmNumberWidget;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_confirm_number_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.e;
    }
}
