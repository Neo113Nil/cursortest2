package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes12.dex */
public final class dda implements zo31 {
    public final LinearLayout a;
    public final GoImageView b;
    public final CircularProgressBar c;
    public final RobotoTextView d;

    public dda(LinearLayout linearLayout, GoImageView goImageView, CircularProgressBar circularProgressBar, RobotoTextView robotoTextView) {
        this.a = linearLayout;
        this.b = goImageView;
        this.c = circularProgressBar;
        this.d = robotoTextView;
    }

    public static dda o(View view) {
        int i = thh0.completion_image_view;
        GoImageView goImageView = (GoImageView) cma1.O(i, view);
        if (goImageView != null) {
            i = thh0.progress_bar;
            CircularProgressBar circularProgressBar = (CircularProgressBar) cma1.O(i, view);
            if (circularProgressBar != null) {
                i = thh0.status_text_view;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, view);
                if (robotoTextView != null) {
                    return new dda((LinearLayout) view, goImageView, circularProgressBar, robotoTextView);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
