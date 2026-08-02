package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class lba implements zo31 {
    public final ConstraintLayout a;
    public final LottieAnimationView b;
    public final GoImageView c;
    public final GoView d;
    public final RobotoTextView e;
    public final RobotoTextView f;

    public lba(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, GoImageView goImageView, GoView goView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = constraintLayout;
        this.b = lottieAnimationView;
        this.c = goImageView;
        this.d = goView;
        this.e = robotoTextView;
        this.f = robotoTextView2;
    }

    public static lba o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(tsh0.chargers_order_banner_view, viewGroup, false);
        int i = thh0.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) cma1.O(i, inflate);
        if (lottieAnimationView != null) {
            i = thh0.decoration_start_barrier;
            if (((Barrier) cma1.O(i, inflate)) != null) {
                i = thh0.image_view;
                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                if (goImageView != null) {
                    i = thh0.rounded_background_view;
                    GoView goView = (GoView) cma1.O(i, inflate);
                    if (goView != null) {
                        i = thh0.subtitle_text_view;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = thh0.text_container;
                            if (((LinearLayout) cma1.O(i, inflate)) != null) {
                                i = thh0.title_text_view;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                if (robotoTextView2 != null) {
                                    return new lba((ConstraintLayout) inflate, lottieAnimationView, goImageView, goView, robotoTextView, robotoTextView2);
                                }
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
