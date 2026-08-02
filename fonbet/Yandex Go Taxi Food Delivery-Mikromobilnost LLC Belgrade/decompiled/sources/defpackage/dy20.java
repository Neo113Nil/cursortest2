package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class dy20 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final RobotoTextView c;
    public final ImageView d;
    public final ButtonComponent e;
    public final RobotoTextView f;

    public dy20(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, ImageView imageView, ButtonComponent buttonComponent2, RobotoTextView robotoTextView2) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = robotoTextView;
        this.d = imageView;
        this.e = buttonComponent2;
        this.f = robotoTextView2;
    }

    public static dy20 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(wqh0.modal_content_modal_view, viewGroup, false);
        int i = teh0.additional_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = teh0.bottom_buttons;
            if (((BottomEdgeButtonLayout) cma1.O(i, inflate)) != null) {
                i = teh0.description;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = teh0.icon;
                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                    if (imageView != null) {
                        i = teh0.main_button;
                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent2 != null) {
                            i = teh0.title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView2 != null) {
                                return new dy20((ConstraintLayout) inflate, buttonComponent, robotoTextView, imageView, buttonComponent2, robotoTextView2);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
