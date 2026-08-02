package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class mqw0 implements zo31 {
    public final LinearLayout a;
    public final ImageView b;
    public final RobotoTextView c;

    public mqw0(LinearLayout linearLayout, ImageView imageView, RobotoTextView robotoTextView) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = robotoTextView;
    }

    public static mqw0 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(yrh0.surge_info_content_error_item, viewGroup, false);
        int i = zfh0.icon;
        ImageView imageView = (ImageView) cma1.O(i, inflate);
        if (imageView != null) {
            i = zfh0.text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                return new mqw0((LinearLayout) inflate, imageView, robotoTextView);
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
