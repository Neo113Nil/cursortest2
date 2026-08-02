package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BalanceWidget;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class j36 {
    public final ho4 a;
    public g36 b;

    public j36(BalanceWidget balanceWidget) {
        View inflate = LayoutInflater.from(balanceWidget.getContext()).inflate(yrh0.balance_expanded_blizzard_layout, (ViewGroup) null, false);
        int i = zfh0.button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = zfh0.text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                this.a = new ho4((ViewGroup) linearLayout, (View) buttonComponent, (Object) robotoTextView, 0);
                balanceWidget.setExpandedContent(linearLayout);
                buttonComponent.setClickable(false);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }
}
