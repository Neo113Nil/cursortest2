package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class c961 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonViewGroup b;
    public final TextView c;
    public final ErrorView d;
    public final ImageView e;
    public final OperationProgressView f;
    public final wz51 g;
    public final TextView h;
    public final ToolbarView i;

    public c961(ConstraintLayout constraintLayout, YbButtonViewGroup ybButtonViewGroup, TextView textView, ErrorView errorView, ImageView imageView, OperationProgressView operationProgressView, wz51 wz51Var, TextView textView2, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybButtonViewGroup;
        this.c = textView;
        this.d = errorView;
        this.e = imageView;
        this.f = operationProgressView;
        this.g = wz51Var;
        this.h = textView2;
        this.i = toolbarView;
    }

    public static c961 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(koh0.ybsdk_test_payment, viewGroup, false);
        int i = zbh0.testPaymentStatusButtonGroup;
        YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
        if (ybButtonViewGroup != null) {
            i = zbh0.testPaymentStatusDescription;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null) {
                i = zbh0.testPaymentStatusErrorView;
                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                if (errorView != null) {
                    i = zbh0.testPaymentStatusMemberIcon;
                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                    if (imageView != null) {
                        i = zbh0.testPaymentStatusOperationIcon;
                        OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                        if (operationProgressView != null && (O = cma1.O((i = zbh0.testPaymentStatusSkeletons), inflate)) != null) {
                            int i2 = zbh0.avatar;
                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                i2 = zbh0.skeletons_title;
                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                    i2 = zbh0.ybsdk_skeletonview;
                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                        wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 29);
                                        i = zbh0.testPaymentStatusTitle;
                                        TextView textView2 = (TextView) cma1.O(i, inflate);
                                        if (textView2 != null) {
                                            i = zbh0.testPaymentStatusToolbar;
                                            ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                            if (toolbarView != null) {
                                                return new c961((ConstraintLayout) inflate, ybButtonViewGroup, textView, errorView, imageView, operationProgressView, wz51Var, textView2, toolbarView);
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
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
