package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;

/* loaded from: classes3.dex */
public final class g161 implements zo31 {
    public final ConstraintLayout a;
    public final BottomBarNavigation b;
    public final YbDivView c;
    public final ErrorView d;
    public final DivSkeletonsView e;
    public final ToolbarView f;

    public g161(ConstraintLayout constraintLayout, BottomBarNavigation bottomBarNavigation, YbDivView ybDivView, ErrorView errorView, DivSkeletonsView divSkeletonsView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = bottomBarNavigation;
        this.c = ybDivView;
        this.d = errorView;
        this.e = divSkeletonsView;
        this.f = toolbarView;
    }

    public static g161 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(gnh0.ybsdk_divkit_common_screen, viewGroup, false);
        int i = yah0.bottomBar;
        BottomBarNavigation bottomBarNavigation = (BottomBarNavigation) cma1.O(i, inflate);
        if (bottomBarNavigation != null) {
            i = yah0.divView;
            YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
            if (ybDivView != null) {
                i = yah0.errorView;
                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                if (errorView != null) {
                    i = yah0.skeletons;
                    DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i, inflate);
                    if (divSkeletonsView != null) {
                        i = yah0.toolbar;
                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                        if (toolbarView != null) {
                            return new g161((ConstraintLayout) inflate, bottomBarNavigation, ybDivView, errorView, divSkeletonsView, toolbarView);
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
