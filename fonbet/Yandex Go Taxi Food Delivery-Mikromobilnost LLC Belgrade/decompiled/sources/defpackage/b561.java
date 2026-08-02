package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class b561 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final FullscreenStatusView c;
    public final ToolbarView d;

    public b561(ConstraintLayout constraintLayout, ErrorView errorView, FullscreenStatusView fullscreenStatusView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = fullscreenStatusView;
        this.d = toolbarView;
    }

    public static b561 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(pnh0.ybsdk_save_partner, viewGroup, false);
        int i = hbh0.partnerSaveErrorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = hbh0.partnerSaveFullscreenView;
            FullscreenStatusView fullscreenStatusView = (FullscreenStatusView) cma1.O(i, inflate);
            if (fullscreenStatusView != null) {
                i = hbh0.partnerSaveToolbar;
                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                if (toolbarView != null) {
                    return new b561((ConstraintLayout) inflate, errorView, fullscreenStatusView, toolbarView);
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
