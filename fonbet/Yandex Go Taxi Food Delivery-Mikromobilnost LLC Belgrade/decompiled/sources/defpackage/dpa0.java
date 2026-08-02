package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class dpa0 implements zo31 {
    public final ConstraintLayout a;
    public final View b;
    public final FrameLayout c;
    public final LinearLayout d;

    public dpa0(ConstraintLayout constraintLayout, View view, FrameLayout frameLayout, LinearLayout linearLayout) {
        this.a = constraintLayout;
        this.b = view;
        this.c = frameLayout;
        this.d = linearLayout;
    }

    public static dpa0 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(ulh0.paymentsdk_dk_bind_card_fragment, viewGroup, false);
        int i = l9h0.blockView;
        View O = cma1.O(i, inflate);
        if (O != null) {
            i = l9h0.contentView;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
            if (frameLayout != null) {
                i = l9h0.progressbar;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                if (linearLayout != null) {
                    return new dpa0((ConstraintLayout) inflate, O, frameLayout, linearLayout);
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
