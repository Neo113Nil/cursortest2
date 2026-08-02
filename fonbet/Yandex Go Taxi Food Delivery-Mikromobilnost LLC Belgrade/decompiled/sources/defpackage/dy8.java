package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.summary.requirements.list.carousel.view.CarouselButton;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class dy8 implements zo31 {
    public final GoLinearLayout a;
    public final CarouselButton b;
    public final GoImageView c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public dy8(GoLinearLayout goLinearLayout, CarouselButton carouselButton, GoImageView goImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = carouselButton;
        this.c = goImageView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    public static dy8 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(mrh0.carousel_item_view, viewGroup, false);
        int i = lfh0.button;
        CarouselButton carouselButton = (CarouselButton) cma1.O(i, inflate);
        if (carouselButton != null) {
            i = lfh0.compensation_space;
            if (((Space) cma1.O(i, inflate)) != null) {
                i = lfh0.icon;
                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                if (goImageView != null) {
                    i = lfh0.not_available;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = lfh0.title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView2 != null) {
                            return new dy8((GoLinearLayout) inflate, carouselButton, goImageView, robotoTextView, robotoTextView2);
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
