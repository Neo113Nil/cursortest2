package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class n161 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final CircularProgressIndicator c;
    public final t661 d;
    public final nzm e;
    public final StoriesComponentView f;

    public n161(ConstraintLayout constraintLayout, ErrorView errorView, CircularProgressIndicator circularProgressIndicator, t661 t661Var, nzm nzmVar, StoriesComponentView storiesComponentView) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = circularProgressIndicator;
        this.d = t661Var;
        this.e = nzmVar;
        this.f = storiesComponentView;
    }

    public static n161 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(joh0.ybsdk_fragment_stories, viewGroup, false);
        int i = ybh0.errorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = ybh0.progress;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) cma1.O(i, inflate);
            if (circularProgressIndicator != null && (O = cma1.O((i = ybh0.shimmer100), inflate)) != null) {
                int i2 = ybh0.shimmer100Button;
                SkeletonView skeletonView = (SkeletonView) cma1.O(i2, O);
                if (skeletonView != null) {
                    i2 = ybh0.shimmer100Text1;
                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                        i2 = ybh0.shimmer100Title;
                        SkeletonView skeletonView2 = (SkeletonView) cma1.O(i2, O);
                        if (skeletonView2 != null) {
                            t661 t661Var = new t661((ShimmerFrameLayout) O, skeletonView, skeletonView2, 2);
                            i = ybh0.shimmer45;
                            View O2 = cma1.O(i, inflate);
                            if (O2 != null) {
                                int i3 = ybh0.imageGuideline;
                                if (((Guideline) cma1.O(i3, O2)) != null) {
                                    i3 = ybh0.shimmer45Button;
                                    SkeletonView skeletonView3 = (SkeletonView) cma1.O(i3, O2);
                                    if (skeletonView3 != null) {
                                        i3 = ybh0.shimmer45Text1;
                                        if (((SkeletonView) cma1.O(i3, O2)) != null) {
                                            i3 = ybh0.shimmer45Title;
                                            if (((SkeletonView) cma1.O(i3, O2)) != null) {
                                                nzm nzmVar = new nzm(skeletonView3, 18, (ShimmerFrameLayout) O2);
                                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                i = ybh0.storiesView;
                                                StoriesComponentView storiesComponentView = (StoriesComponentView) cma1.O(i, inflate);
                                                if (storiesComponentView != null) {
                                                    return new n161(constraintLayout, errorView, circularProgressIndicator, t661Var, nzmVar, storiesComponentView);
                                                }
                                            }
                                        }
                                    }
                                }
                                ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i3)));
                                return null;
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
