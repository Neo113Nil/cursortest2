package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes2.dex */
public final class f761 implements zo31 {
    public final ConstraintLayout a;
    public final YbDivView b;
    public final ErrorView c;
    public final FrameLayout d;
    public final DivSkeletonsView e;
    public final ToolbarView f;

    public f761(ConstraintLayout constraintLayout, YbDivView ybDivView, ErrorView errorView, FrameLayout frameLayout, DivSkeletonsView divSkeletonsView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybDivView;
        this.c = errorView;
        this.d = frameLayout;
        this.e = divSkeletonsView;
        this.f = toolbarView;
    }

    public static f761 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(qmh0.ybsdk_screen_menu, viewGroup, false);
        int i = jah0.divView;
        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
        if (ybDivView != null) {
            i = jah0.errorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = jah0.passportProgress;
                FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                if (frameLayout != null) {
                    i = jah0.shimmerDivKit;
                    DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i, inflate);
                    if (divSkeletonsView != null) {
                        i = jah0.toolbar;
                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                        if (toolbarView != null) {
                            return new f761((ConstraintLayout) inflate, ybDivView, errorView, frameLayout, divSkeletonsView, toolbarView);
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
