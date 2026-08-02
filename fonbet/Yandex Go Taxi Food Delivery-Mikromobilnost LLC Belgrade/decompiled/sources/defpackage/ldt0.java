package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes6.dex */
public final class ldt0 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;

    public ldt0(LinearLayout linearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
    }

    public static ldt0 p(LayoutInflater layoutInflater, SourceOnMapControl sourceOnMapControl) {
        View inflate = layoutInflater.inflate(zrh0.source_on_map_control_buttons_trail, (ViewGroup) sourceOnMapControl, false);
        sourceOnMapControl.addView(inflate);
        int i = agh0.source_on_map_accept_trail_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            int i2 = agh0.source_on_map_decline_trail_button;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i2, inflate);
            if (buttonComponent2 != null) {
                return new ldt0(linearLayout, buttonComponent, buttonComponent2);
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final LinearLayout o() {
        return this.a;
    }
}
