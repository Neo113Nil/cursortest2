package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class n961 implements zo31 {
    public final /* synthetic */ int a;
    public final ShimmerFrameLayout b;

    public /* synthetic */ n961(ShimmerFrameLayout shimmerFrameLayout, int i) {
        this.a = i;
        this.b = shimmerFrameLayout;
    }

    public static n961 p(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(mnh0.ybsdk_user_cards_shimmer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        if (inflate != null) {
            return new n961((ShimmerFrameLayout) inflate, 5);
        }
        ny61.t("rootView");
        return null;
    }

    public static n961 q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(mnh0.ybsdk_user_cards_shimmer_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        if (inflate != null) {
            return new n961((ShimmerFrameLayout) inflate, 6);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public ShimmerFrameLayout o() {
        int i = this.a;
        return this.b;
    }
}
