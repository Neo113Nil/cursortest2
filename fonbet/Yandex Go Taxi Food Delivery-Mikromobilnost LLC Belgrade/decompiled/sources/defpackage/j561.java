package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ybsdk.feature.savings.internal.views.diffrate.DiffRateCalendarView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class j561 implements zo31 {
    public final FrameLayout a;
    public final ErrorView b;
    public final ShimmerFrameLayout c;
    public final DiffRateCalendarView d;
    public final DiffRateCalendarView e;

    public j561(FrameLayout frameLayout, ErrorView errorView, ShimmerFrameLayout shimmerFrameLayout, DiffRateCalendarView diffRateCalendarView, DiffRateCalendarView diffRateCalendarView2) {
        this.a = frameLayout;
        this.b = errorView;
        this.c = shimmerFrameLayout;
        this.d = diffRateCalendarView;
        this.e = diffRateCalendarView2;
    }

    public static j561 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(doh0.ybsdk_savings_diff_rate_calendar_sheet_content, viewGroup, false);
        int i = tbh0.diff_rate_calendar_error;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = tbh0.diff_rate_calendar_skeleton;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
            if (shimmerFrameLayout != null) {
                i = tbh0.diff_rate_calendar_skeleton_view;
                DiffRateCalendarView diffRateCalendarView = (DiffRateCalendarView) cma1.O(i, inflate);
                if (diffRateCalendarView != null) {
                    i = tbh0.diff_rate_calendar_view;
                    DiffRateCalendarView diffRateCalendarView2 = (DiffRateCalendarView) cma1.O(i, inflate);
                    if (diffRateCalendarView2 != null) {
                        return new j561((FrameLayout) inflate, errorView, shimmerFrameLayout, diffRateCalendarView, diffRateCalendarView2);
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
