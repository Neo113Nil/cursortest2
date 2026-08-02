package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class a261 implements zo31 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final ShimmerFrameLayout c;
    public final TextView d;

    public a261(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ShimmerFrameLayout shimmerFrameLayout, TextView textView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = shimmerFrameLayout;
        this.d = textView;
    }

    public static a261 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(anh0.ybsdk_item_card_promo_bullet, viewGroup, false);
        int i = sah0.image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
        if (appCompatImageView != null) {
            i = sah0.imageShimmer;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
            if (shimmerFrameLayout != null) {
                i = sah0.text;
                TextView textView = (TextView) cma1.O(i, inflate);
                if (textView != null) {
                    return new a261((ConstraintLayout) inflate, appCompatImageView, shimmerFrameLayout, textView);
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
