package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class a761 implements zo31 {
    public final ConstraintLayout a;
    public final YbDivView b;
    public final ErrorView c;
    public final ShimmerFrameLayout d;
    public final ToolbarView e;

    public a761(ConstraintLayout constraintLayout, YbDivView ybDivView, ErrorView errorView, ShimmerFrameLayout shimmerFrameLayout, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybDivView;
        this.c = errorView;
        this.d = shimmerFrameLayout;
        this.e = toolbarView;
    }

    public static a761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(inh0.ybsdk_screen_futurepayments, viewGroup, false);
        int i = abh0.divView;
        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
        if (ybDivView != null) {
            i = abh0.errorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = abh0.shimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                if (shimmerFrameLayout != null) {
                    i = abh0.toolbarView;
                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                    if (toolbarView != null) {
                        return new a761((ConstraintLayout) inflate, ybDivView, errorView, shimmerFrameLayout, toolbarView);
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
