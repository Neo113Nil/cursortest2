package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView;
import com.ybsdk.widgets.common.OperationStatusView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.MaskedShimmeringBar;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class m2y implements zo31 {
    public final /* synthetic */ int a;
    public final View b;
    public final View c;
    public final View d;
    public final Object e;

    public m2y(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, MaskedShimmeringBar maskedShimmeringBar) {
        this.a = 8;
        this.c = frameLayout;
        this.e = imageView;
        this.d = imageView2;
        this.b = maskedShimmeringBar;
    }

    public static m2y o(View view) {
        int i = p8h0.background;
        ImageView imageView = (ImageView) cma1.O(i, view);
        if (imageView != null) {
            i = p8h0.icon;
            ImageView imageView2 = (ImageView) cma1.O(i, view);
            if (imageView2 != null) {
                i = p8h0.shimmering;
                MaskedShimmeringBar maskedShimmeringBar = (MaskedShimmeringBar) cma1.O(i, view);
                if (maskedShimmeringBar != null) {
                    return new m2y((FrameLayout) view, imageView, imageView2, maskedShimmeringBar);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static m2y p(LinearLayout linearLayout) {
        int i = o6h0.shimmering_images_slider_frame;
        PlaceholderView placeholderView = (PlaceholderView) cma1.O(i, linearLayout);
        if (placeholderView != null) {
            i = o6h0.shimmering_subtitle;
            PlaceholderView placeholderView2 = (PlaceholderView) cma1.O(i, linearLayout);
            if (placeholderView2 != null) {
                i = o6h0.shimmering_title;
                PlaceholderView placeholderView3 = (PlaceholderView) cma1.O(i, linearLayout);
                if (placeholderView3 != null) {
                    return new m2y(linearLayout, placeholderView, placeholderView2, placeholderView3, 4);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(linearLayout.getResources().getResourceName(i)));
        return null;
    }

    public static m2y q(View view) {
        int i = fch0.progress;
        OperationStatusView operationStatusView = (OperationStatusView) cma1.O(i, view);
        if (operationStatusView != null) {
            i = fch0.progressLabel;
            TextView textView = (TextView) cma1.O(i, view);
            if (textView != null) {
                i = fch0.progressSublabel;
                TextView textView2 = (TextView) cma1.O(i, view);
                if (textView2 != null) {
                    return new m2y((LinearLayout) view, operationStatusView, textView, textView2, 12);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static m2y s(LayoutInflater layoutInflater, SuperAppMainOnboardingView superAppMainOnboardingView) {
        View inflate = layoutInflater.inflate(zth0.shortcut_onboarding, (ViewGroup) superAppMainOnboardingView, false);
        int i = bjh0.shortcut_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = bjh0.subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = bjh0.title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    return new m2y(inflate, (View) frameLayout, (View) robotoTextView, (Object) robotoTextView2, 9);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        View view = this.c;
        switch (i) {
            case 0:
                return (GoConstraintLayout) view;
            case 1:
                return (GoLinearLayout) view;
            case 2:
                return (ConstraintLayout) view;
            case 3:
                return (FrameLayout) view;
            case 4:
                return view;
            case 5:
                return (ConstraintLayout) view;
            case 6:
                return (GoLinearLayout) view;
            case 7:
                return (GoConstraintLayout) view;
            case 8:
                return (FrameLayout) view;
            case 9:
                return (LinearLayout) view;
            case 10:
                return (CardView) view;
            case 11:
                return (GoConstraintLayout) view;
            default:
                return (LinearLayout) view;
        }
    }

    public LinearLayout r() {
        return (LinearLayout) this.c;
    }

    public /* synthetic */ m2y(ViewGroup viewGroup, View view, View view2, RobotoTextView robotoTextView, int i) {
        this.a = i;
        this.c = viewGroup;
        this.d = view;
        this.e = view2;
        this.b = robotoTextView;
    }

    public /* synthetic */ m2y(View view, View view2, View view3, Object obj, int i) {
        this.a = i;
        this.c = view;
        this.d = view2;
        this.b = view3;
        this.e = obj;
    }

    public m2y(GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, ButtonComponent buttonComponent, ho4 ho4Var) {
        this.a = 11;
        this.c = goConstraintLayout;
        this.b = robotoTextView;
        this.d = buttonComponent;
        this.e = ho4Var;
    }
}
