package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class p861 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final RecyclerView c;
    public final wz51 d;
    public final ToolbarView e;

    public p861(ConstraintLayout constraintLayout, ErrorView errorView, RecyclerView recyclerView, wz51 wz51Var, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = recyclerView;
        this.d = wz51Var;
        this.e = toolbarView;
    }

    public static p861 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(foh0.ybsdk_settings, viewGroup, false);
        int i = ubh0.bottomSheetContainer;
        if (((FrameLayout) cma1.O(i, inflate)) != null) {
            i = ubh0.errorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = ubh0.settings;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null && (O = cma1.O((i = ubh0.shimmer), inflate)) != null) {
                    wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 23);
                    i = ubh0.toolbar;
                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                    if (toolbarView != null) {
                        return new p861((ConstraintLayout) inflate, errorView, recyclerView, wz51Var, toolbarView);
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
