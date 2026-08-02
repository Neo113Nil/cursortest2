package xsna;

import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.SuperAppWidgetOnboardingPanel;
import com.vkontakte.android.R;

/* compiled from: SuperAppOnboardingPanelItem.kt */
/* loaded from: classes6.dex */
public final class lan0 extends f9n0 {
    public final SuperAppWidgetOnboardingPanel e;

    public lan0(SuperAppWidgetOnboardingPanel superAppWidgetOnboardingPanel) {
        super(superAppWidgetOnboardingPanel.k, superAppWidgetOnboardingPanel.n, superAppWidgetOnboardingPanel.m.b, superAppWidgetOnboardingPanel.e, 16);
        this.e = superAppWidgetOnboardingPanel;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_onboarding_panel;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lan0) && epx.f(this.e, ((lan0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "SuperAppOnboardingPanelItem(data=" + this.e + ')';
    }
}
