package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.vault.flexsdk.descriptors.widget.animation.LockOverlayView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.SkeletonView;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes3.dex */
public final class l7n implements zo31 {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;

    public l7n(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.a = 2;
        this.b = constraintLayout;
    }

    public static l7n o(View view) {
        int i = y7h0.icon_placeholder;
        if (((PlaceholderView) cma1.O(i, view)) != null) {
            i = y7h0.title_placeholder;
            if (((PlaceholderView) cma1.O(i, view)) != null) {
                return new l7n((ConstraintLayout) view, 3);
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static l7n p(View view) {
        int i = cch0.promoOffer1Part1;
        if (((SkeletonView) cma1.O(i, view)) != null) {
            i = cch0.promoOffer1Part2;
            if (((SkeletonView) cma1.O(i, view)) != null) {
                i = cch0.promoOffer2Part1;
                if (((SkeletonView) cma1.O(i, view)) != null) {
                    i = cch0.promoOffer2Part2;
                    if (((SkeletonView) cma1.O(i, view)) != null) {
                        i = cch0.promoOffer3Part1;
                        if (((SkeletonView) cma1.O(i, view)) != null) {
                            i = cch0.promoOffer3Part2;
                            if (((SkeletonView) cma1.O(i, view)) != null) {
                                i = cch0.promoOffer4Part1;
                                if (((SkeletonView) cma1.O(i, view)) != null) {
                                    i = cch0.promoOffer4Part2;
                                    if (((SkeletonView) cma1.O(i, view)) != null) {
                                        return new l7n((ConstraintLayout) view, 9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static l7n r(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ioh0.ybsdk_common_status_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = wbh0.progressBar;
        if (((OperationProgressView) cma1.O(i, inflate)) != null) {
            return new l7n((ConstraintLayout) inflate, 5);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public ConstraintLayout q() {
        int i = this.a;
        return this.b;
    }

    public /* synthetic */ l7n(ConstraintLayout constraintLayout, int i) {
        this.a = i;
        this.b = constraintLayout;
    }

    public l7n(ConstraintLayout constraintLayout, ClickableImageView clickableImageView, LockOverlayView lockOverlayView, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, GoImageView goImageView, ShimmeringBar shimmeringBar) {
        this.a = 1;
        this.b = constraintLayout;
    }
}
