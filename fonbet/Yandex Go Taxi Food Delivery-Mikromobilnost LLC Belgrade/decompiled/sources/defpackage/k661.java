package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressOverlayDialog;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class k661 implements zo31 {
    public final ConstraintLayout a;
    public final YbDivView b;
    public final ErrorView c;
    public final OperationProgressOverlayDialog d;
    public final ToolbarView e;

    public k661(ConstraintLayout constraintLayout, YbDivView ybDivView, ErrorView errorView, OperationProgressOverlayDialog operationProgressOverlayDialog, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybDivView;
        this.c = errorView;
        this.d = operationProgressOverlayDialog;
        this.e = toolbarView;
    }

    public static k661 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(anh0.ybsdk_screen_card_set_status_processing, viewGroup, false);
        int i = sah0.divView;
        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
        if (ybDivView != null) {
            i = sah0.errorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = sah0.status;
                OperationProgressOverlayDialog operationProgressOverlayDialog = (OperationProgressOverlayDialog) cma1.O(i, inflate);
                if (operationProgressOverlayDialog != null) {
                    i = sah0.toolbarView;
                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                    if (toolbarView != null) {
                        return new k661((ConstraintLayout) inflate, ybDivView, errorView, operationProgressOverlayDialog, toolbarView);
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
