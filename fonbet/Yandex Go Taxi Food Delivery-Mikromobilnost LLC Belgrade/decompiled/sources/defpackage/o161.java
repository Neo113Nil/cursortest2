package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.widgets.common.CloseButtonView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class o161 implements zo31 {
    public final ConstraintLayout a;
    public final CloseButtonView b;
    public final ErrorView c;
    public final ho4 d;
    public final ViewPager2 e;

    public o161(ConstraintLayout constraintLayout, CloseButtonView closeButtonView, ErrorView errorView, ho4 ho4Var, ViewPager2 viewPager2) {
        this.a = constraintLayout;
        this.b = closeButtonView;
        this.c = errorView;
        this.d = ho4Var;
        this.e = viewPager2;
    }

    public static o161 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View O2;
        View inflate = layoutInflater.inflate(joh0.ybsdk_fragment_vertical_stories, viewGroup, false);
        int i = ybh0.closeButton;
        CloseButtonView closeButtonView = (CloseButtonView) cma1.O(i, inflate);
        if (closeButtonView != null) {
            i = ybh0.errorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null && (O = cma1.O((i = ybh0.shimmerLayout), inflate)) != null) {
                int i2 = ybh0.backButton;
                ImageView imageView = (ImageView) cma1.O(i2, O);
                if (imageView != null) {
                    i2 = ybh0.firstPageShimmer;
                    if (((ShimmerFrameLayout) cma1.O(i2, O)) != null && (O2 = cma1.O((i2 = ybh0.secondPageShimmer), O)) != null) {
                        i2 = ybh0.shimmerItem1;
                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                            i2 = ybh0.shimmerItem2;
                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                i2 = ybh0.shimmerItem3;
                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                    i2 = ybh0.skeletonItemButton;
                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                        ho4 ho4Var = new ho4((LinearLayout) O, imageView, O2, 27);
                                        i = ybh0.storiesPager;
                                        ViewPager2 viewPager2 = (ViewPager2) cma1.O(i, inflate);
                                        if (viewPager2 != null) {
                                            return new o161((ConstraintLayout) inflate, closeButtonView, errorView, ho4Var, viewPager2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                return null;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final ConstraintLayout o() {
        return this.a;
    }
}
