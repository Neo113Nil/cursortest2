package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class aqa0 implements zo31 {
    public final View a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final ConstraintLayout e;

    public aqa0(View view, ImageView imageView, TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.a = view;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = constraintLayout;
    }

    public static aqa0 o(ConstraintLayout constraintLayout) {
        int i = j9h0.paymentsdkSnackbarImage;
        ImageView imageView = (ImageView) cma1.O(i, constraintLayout);
        if (imageView != null) {
            i = j9h0.paymentsdkSnackbarSubtitle;
            TextView textView = (TextView) cma1.O(i, constraintLayout);
            if (textView != null) {
                i = j9h0.paymentsdkSnackbarTitle;
                TextView textView2 = (TextView) cma1.O(i, constraintLayout);
                if (textView2 != null) {
                    i = j9h0.snackBarLayout;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) cma1.O(i, constraintLayout);
                    if (constraintLayout2 != null) {
                        return new aqa0(constraintLayout, imageView, textView, textView2, constraintLayout2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(constraintLayout.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
