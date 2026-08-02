package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.b;
import com.yandex.plus.plaquesdk.design.SwitchComponent;
import com.yandex.plus.plaquesdk.widget.RobotoTextView;

/* loaded from: classes2.dex */
public final class k451 extends n451 {
    public final tls b;
    public final LinearLayoutCompat c;
    public final RobotoTextView d;
    public final SwitchComponent e;

    public k451(Context context, tls tlsVar) {
        this.b = tlsVar;
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context);
        this.c = linearLayoutCompat;
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setTransitionName("plaque_switch_widget_text_transition_name");
        robotoTextView.setImportantForAccessibility(2);
        robotoTextView.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -2));
        robotoTextView.setMinWidth((int) TypedValue.applyDimension(1, 76.0f, robotoTextView.getContext().getResources().getDisplayMetrics()));
        robotoTextView.setTextColor(robotoTextView.getContext().getColor(xpg0.plaque_sdk_component_white));
        linearLayoutCompat.addView(robotoTextView);
        this.d = robotoTextView;
        SwitchComponent switchComponent = new SwitchComponent(context);
        switchComponent.setTransitionName("plaque_switch_widget_toggle_transition_name");
        switchComponent.setImportantForAccessibility(2);
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
        layoutParams.setMarginStart(switchComponent.dimen(rvg0.plaque_sdk_component_safe_switch_start_margin));
        switchComponent.setLayoutParams(layoutParams);
        switchComponent.setTrackColor(xpg0.plaque_sdk_plaque_switch_micro_widget_checked);
        switchComponent.setUncheckedTrackColor(xpg0.plaque_sdk_plaque_switch_micro_widget_unchecked);
        linearLayoutCompat.addView(switchComponent);
        this.e = switchComponent;
        linearLayoutCompat.setTransitionName("plaque_switch_widget_group_transition_name");
        linearLayoutCompat.setOrientation(0);
        linearLayoutCompat.setClipChildren(false);
        linearLayoutCompat.setClipToPadding(false);
    }

    @Override // defpackage.drd0
    public final View a() {
        return this.c;
    }

    @Override // defpackage.n451
    public final void c(eg20 eg20Var) {
        yf20 yf20Var = (yf20) eg20Var;
        p151 p151Var = yf20Var.d;
        this.c.setGravity(p151Var.c);
        int i = p151Var.c;
        RobotoTextView robotoTextView = this.d;
        robotoTextView.setGravity(i);
        robotoTextView.setText(yf20Var.e.a);
        this.e.setChecked(yf20Var.f);
    }

    @Override // defpackage.n451
    public final tls d() {
        return this.b;
    }

    @Override // defpackage.n451
    public final void e(eg20 eg20Var) {
        b.p(this.c, new ifq0(17, (yf20) eg20Var));
    }

    public final String toString() {
        return "Switch";
    }
}
