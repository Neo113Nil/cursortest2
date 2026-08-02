package defpackage;

import android.view.ViewGroup;
import com.yandex.go.mainscreen.superapp.popup.presentation.SuperAppMainScreenPopupView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes.dex */
public final class k3w0 implements z2w0 {
    public final /* synthetic */ SuperAppMainScreenPopupView a;

    public k3w0(SuperAppMainScreenPopupView superAppMainScreenPopupView) {
        this.a = superAppMainScreenPopupView;
    }

    public final void h(ButtonComponent buttonComponent, e3w0 e3w0Var) {
        ButtonComponent buttonComponent2;
        ListItemComponent listItemComponent;
        float f;
        buttonComponent.setVisibility(e3w0Var.b() ? 0 : 8);
        buttonComponent.setText(e3w0Var.a());
        SuperAppMainScreenPopupView superAppMainScreenPopupView = this.a;
        buttonComponent2 = superAppMainScreenPopupView.reloadButton;
        if (buttonComponent2.getVisibility() == 0) {
            f = 4.0f;
        } else {
            listItemComponent = superAppMainScreenPopupView.hint;
            f = listItemComponent.getVisibility() == 0 ? 0.0f : 8.0f;
        }
        int v = tje.v(buttonComponent.getContext(), f);
        ViewGroup.LayoutParams layoutParams = buttonComponent.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != v) {
            xw31.E(buttonComponent, null, Integer.valueOf(v), null, null);
        }
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        ListItemComponent listItemComponent;
        ListItemComponent listItemComponent2;
        ListItemComponent listItemComponent3;
        ButtonComponent buttonComponent;
        ButtonComponent buttonComponent2;
        ButtonComponent buttonComponent3;
        ButtonComponent buttonComponent4;
        ButtonComponent buttonComponent5;
        ListItemComponent listItemComponent4;
        ButtonComponent buttonComponent6;
        ButtonComponent buttonComponent7;
        ButtonComponent buttonComponent8;
        g3w0 g3w0Var = (g3w0) obj;
        boolean z = g3w0Var instanceof f3w0;
        SuperAppMainScreenPopupView superAppMainScreenPopupView = this.a;
        if (z) {
            listItemComponent = superAppMainScreenPopupView.hint;
            f3w0 f3w0Var = (f3w0) g3w0Var;
            boolean z2 = f3w0Var.d;
            e3w0 e3w0Var = f3w0Var.c;
            String str = f3w0Var.b;
            String str2 = f3w0Var.a;
            listItemComponent.setTitle(str2);
            listItemComponent2 = superAppMainScreenPopupView.hint;
            listItemComponent2.setSubtitle(str);
            listItemComponent3 = superAppMainScreenPopupView.hint;
            listItemComponent3.setVisibility(((str2 == null || evu0.J(str2)) && (str == null || evu0.J(str))) ? 8 : 0);
            buttonComponent = superAppMainScreenPopupView.reloadButton;
            buttonComponent.setVisibility(e3w0Var.b() ? 0 : 8);
            buttonComponent2 = superAppMainScreenPopupView.reloadButton;
            buttonComponent2.setText(e3w0Var.a());
            buttonComponent3 = superAppMainScreenPopupView.reloadButton;
            buttonComponent3.setEnabled(!z2);
            if (z2) {
                buttonComponent8 = superAppMainScreenPopupView.reloadButton;
                buttonComponent8.startProgress();
            } else {
                buttonComponent4 = superAppMainScreenPopupView.reloadButton;
                buttonComponent4.finishProgress();
            }
            buttonComponent5 = superAppMainScreenPopupView.reloadButton;
            listItemComponent4 = superAppMainScreenPopupView.hint;
            xw31.L(tje.v(superAppMainScreenPopupView.getContext(), listItemComponent4.getVisibility() == 0 ? 0.0f : 8.0f), buttonComponent5);
            buttonComponent6 = superAppMainScreenPopupView.orderTaxiButton;
            h(buttonComponent6, f3w0Var.e);
            buttonComponent7 = superAppMainScreenPopupView.orderTaxiByPhoneCallButton;
            h(buttonComponent7, f3w0Var.f);
        }
        superAppMainScreenPopupView.animateVisibility(z);
    }
}
