package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class j9e0 implements zo31 {
    public final ConstraintLayout a;
    public final DividerAwareComponent b;
    public final AppCompatImageView c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public j9e0(ConstraintLayout constraintLayout, DividerAwareComponent dividerAwareComponent, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = constraintLayout;
        this.b = dividerAwareComponent;
        this.c = appCompatImageView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    public static j9e0 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(zrh0.popup_modal_prominent_header_item, viewGroup, false);
        int i = agh0.popup_prominent_header_divider;
        DividerAwareComponent dividerAwareComponent = (DividerAwareComponent) cma1.O(i, inflate);
        if (dividerAwareComponent != null) {
            i = agh0.popup_prominent_header_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                i = agh0.popup_prominent_header_subtitle;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = agh0.popup_prominent_header_title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new j9e0((ConstraintLayout) inflate, dividerAwareComponent, appCompatImageView, robotoTextView, robotoTextView2);
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
