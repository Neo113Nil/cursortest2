package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class do5 implements zo31 {
    public final /* synthetic */ int a;
    public final GoFrameLayout b;
    public final GoImageView c;
    public final RobotoTextView d;

    public /* synthetic */ do5(GoFrameLayout goFrameLayout, GoImageView goImageView, RobotoTextView robotoTextView, int i) {
        this.a = i;
        this.b = goFrameLayout;
        this.c = goImageView;
        this.d = robotoTextView;
    }

    public static do5 o(View view) {
        int i = ghh0.back_button;
        GoImageView goImageView = (GoImageView) cma1.O(i, view);
        if (goImageView != null) {
            i = ghh0.screen_title;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, view);
            if (robotoTextView != null) {
                return new do5((GoFrameLayout) view, goImageView, robotoTextView, 0);
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static do5 p(View view) {
        int i = i7h0.icon;
        GoImageView goImageView = (GoImageView) cma1.O(i, view);
        if (goImageView != null) {
            i = i7h0.title;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, view);
            if (robotoTextView != null) {
                return new do5((GoFrameLayout) view, goImageView, robotoTextView, 1);
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
