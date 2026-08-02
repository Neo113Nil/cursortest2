package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ybsdk.widgets.common.DashboardBalanceTextView;
import com.ybsdk.widgets.common.DashboardDrawableTextView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.dashboard.DashboardCollapsingBalanceView;
import com.ybsdk.widgets.common.dashboard.DashboardViewLayout;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class n061 implements zo31 {
    public final FrameLayout a;
    public final DashboardBalanceTextView b;
    public final TextView c;
    public final DashboardDrawableTextView d;
    public final DashboardViewLayout e;
    public final ErrorView f;
    public final ShimmerFrameLayout g;

    public n061(FrameLayout frameLayout, DashboardBalanceTextView dashboardBalanceTextView, TextView textView, DashboardDrawableTextView dashboardDrawableTextView, DashboardViewLayout dashboardViewLayout, ErrorView errorView, ShimmerFrameLayout shimmerFrameLayout) {
        this.a = frameLayout;
        this.b = dashboardBalanceTextView;
        this.c = textView;
        this.d = dashboardDrawableTextView;
        this.e = dashboardViewLayout;
        this.f = errorView;
        this.g = shimmerFrameLayout;
    }

    public static n061 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(bnh0.ybsdk_cashback_dashboard_fragment, viewGroup, false);
        int i = tah0.cashbackBalanceView;
        DashboardBalanceTextView dashboardBalanceTextView = (DashboardBalanceTextView) cma1.O(i, inflate);
        if (dashboardBalanceTextView != null) {
            i = tah0.cashbackDescription;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null) {
                i = tah0.cashbackTitle;
                DashboardDrawableTextView dashboardDrawableTextView = (DashboardDrawableTextView) cma1.O(i, inflate);
                if (dashboardDrawableTextView != null) {
                    i = tah0.dashboardView;
                    DashboardViewLayout dashboardViewLayout = (DashboardViewLayout) cma1.O(i, inflate);
                    if (dashboardViewLayout != null) {
                        i = tah0.errorView;
                        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                        if (errorView != null) {
                            i = tah0.linearLayout;
                            if (((DashboardCollapsingBalanceView) cma1.O(i, inflate)) != null) {
                                i = tah0.shimmer;
                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                                if (shimmerFrameLayout != null) {
                                    return new n061((FrameLayout) inflate, dashboardBalanceTextView, textView, dashboardDrawableTextView, dashboardViewLayout, errorView, shimmerFrameLayout);
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

    public final FrameLayout o() {
        return this.a;
    }
}
