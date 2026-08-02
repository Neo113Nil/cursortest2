package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class gru implements zo31 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final RobotoTextView c;

    public gru(ConstraintLayout constraintLayout, ImageView imageView, RobotoTextView robotoTextView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = robotoTextView;
    }

    public static gru o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(yrh0.horizontal_shortcuts_item, viewGroup, false);
        int i = zfh0.icon;
        ImageView imageView = (ImageView) cma1.O(i, inflate);
        if (imageView != null) {
            i = zfh0.title;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                return new gru((ConstraintLayout) inflate, imageView, robotoTextView);
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
