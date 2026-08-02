package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.x0;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class cip extends x0 {
    public final ho4 N;

    public cip(View view) {
        super(view);
        int i = vch0.iv_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, view);
        if (appCompatImageView != null) {
            i = vch0.tv_text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, view);
            if (robotoTextView != null) {
                this.N = new ho4((ViewGroup) view, (View) appCompatImageView, (Object) robotoTextView, 3);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }
}
