package com.yandex.go.payments_widgets.mini.widgets.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.nwy0;
import defpackage.sls;
import defpackage.tje;
import defpackage.vtg0;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/payments_widgets/mini/widgets/presentation/PaymentMiniWidgetsContainer;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/view/View;", "view", "Lkotlin/Function0;", "Lzy11;", "onExpandClick", "<init>", "(Landroid/view/View;Lsls;)V", "", "applyThemeForChildrenByDefault", "()Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMiniWidgetsContainer extends FrameLayout implements nwy0 {
    public PaymentMiniWidgetsContainer(View view, sls slsVar) {
        super(view.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(tje.r(vtg0.payment_mini_widgets_margin_horizontal, getContext()), tje.r(vtg0.payment_mini_widgets_margin_vertical, getContext()), tje.r(vtg0.payment_mini_widgets_margin_horizontal, getContext()), tje.r(vtg0.payment_mini_widgets_margin_vertical, getContext()));
        setLayoutParams(marginLayoutParams);
        addView(view);
        if (slsVar != null) {
            c.z(slsVar, this);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }
}
