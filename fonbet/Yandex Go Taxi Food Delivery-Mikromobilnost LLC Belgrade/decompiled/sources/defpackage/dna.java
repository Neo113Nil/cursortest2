package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class dna implements zo31 {
    public final /* synthetic */ int a;
    public final View b;
    public final View c;
    public final ViewGroup d;
    public final View e;
    public final View f;

    public dna(GoImageView goImageView, GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = 4;
        this.d = goLinearLayout;
        this.c = buttonComponent;
        this.b = goImageView;
        this.e = robotoTextView;
        this.f = robotoTextView2;
    }

    public static dna o(View view) {
        int i = rdh0.service_close;
        GoImageView goImageView = (GoImageView) cma1.O(i, view);
        if (goImageView != null) {
            i = rdh0.service_logo;
            GoImageView goImageView2 = (GoImageView) cma1.O(i, view);
            if (goImageView2 != null) {
                GoLinearLayout goLinearLayout = (GoLinearLayout) view;
                i = rdh0.service_name;
                AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, view);
                if (appCompatTextView != null) {
                    return new dna(goLinearLayout, goImageView, goImageView2, goLinearLayout, appCompatTextView, 1);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.d;
        switch (i) {
            case 0:
                return (CardView) viewGroup;
            case 1:
                return (GoLinearLayout) viewGroup;
            case 2:
                return (CoordinatorLayout) viewGroup;
            case 3:
                return (FrameLayout) viewGroup;
            case 4:
                return (GoLinearLayout) viewGroup;
            case 5:
                return (LinearLayout) viewGroup;
            case 6:
                return (GoConstraintLayout) viewGroup;
            case 7:
                return (GoLinearLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    public ConstraintLayout p() {
        return (ConstraintLayout) this.d;
    }

    public /* synthetic */ dna(ViewGroup viewGroup, View view, View view2, View view3, View view4, int i) {
        this.a = i;
        this.d = viewGroup;
        this.b = view;
        this.c = view2;
        this.e = view3;
        this.f = view4;
    }
}
