package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class i161 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final TextView c;
    public final TextView d;
    public final ErrorView e;
    public final AppCompatImageView f;
    public final TextView g;
    public final TransferToolbarView h;
    public final wz51 i;

    public i161(ConstraintLayout constraintLayout, YbButtonView ybButtonView, TextView textView, TextView textView2, ErrorView errorView, AppCompatImageView appCompatImageView, TextView textView3, TransferToolbarView transferToolbarView, wz51 wz51Var) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = textView;
        this.d = textView2;
        this.e = errorView;
        this.f = appCompatImageView;
        this.g = textView3;
        this.h = transferToolbarView;
        this.i = wz51Var;
    }

    public static i161 p(LayoutInflater layoutInflater) {
        View O;
        View inflate = layoutInflater.inflate(noh0.ybsdk_fps_pay_enroll, (ViewGroup) null, false);
        int i = cch0.fpsPayEnrollButton;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = cch0.fpsPayEnrollButtonDescription;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null) {
                i = cch0.fpsPayEnrollDescription;
                TextView textView2 = (TextView) cma1.O(i, inflate);
                if (textView2 != null) {
                    i = cch0.fpsPayEnrollErrorView;
                    ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                    if (errorView != null) {
                        i = cch0.fpsPayEnrollImage;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                        if (appCompatImageView != null) {
                            i = cch0.fpsPayEnrollTitle;
                            TextView textView3 = (TextView) cma1.O(i, inflate);
                            if (textView3 != null) {
                                i = cch0.fpsPayEnrollToolbar;
                                TransferToolbarView transferToolbarView = (TransferToolbarView) cma1.O(i, inflate);
                                if (transferToolbarView != null && (O = cma1.O((i = cch0.loadingState), inflate)) != null) {
                                    int i2 = cch0.partFive;
                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                        i2 = cch0.partFour;
                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                            i2 = cch0.partOne;
                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                i2 = cch0.partSix;
                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                    i2 = cch0.partThree;
                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                        i2 = cch0.partTwo;
                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                            i2 = cch0.toolbarContainer;
                                                            if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                                                                i2 = cch0.toolbarPartOne;
                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                    i2 = cch0.toolbarPartTwo;
                                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                        return new i161((ConstraintLayout) inflate, ybButtonView, textView, textView2, errorView, appCompatImageView, textView3, transferToolbarView, new wz51((ShimmerFrameLayout) O, 6));
                                                                    }
                                                                }
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
                        }
                    }
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

    public final ConstraintLayout o() {
        return this.a;
    }
}
