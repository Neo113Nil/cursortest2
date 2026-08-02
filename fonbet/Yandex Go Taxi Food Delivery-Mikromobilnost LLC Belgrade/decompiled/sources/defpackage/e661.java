package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.OperationProgressOverlayDialog;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class e661 implements zo31 {
    public final ConstraintLayout a;
    public final OperationProgressOverlayDialog b;
    public final ToolbarView c;
    public final FrameLayout d;

    public e661(ConstraintLayout constraintLayout, OperationProgressOverlayDialog operationProgressOverlayDialog, ToolbarView toolbarView, FrameLayout frameLayout) {
        this.a = constraintLayout;
        this.b = operationProgressOverlayDialog;
        this.c = toolbarView;
        this.d = frameLayout;
    }

    public static e661 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(aoh0.ybsdk_screen_card_bind_credit_limit, viewGroup, false);
        int i = qbh0.progressOverload;
        OperationProgressOverlayDialog operationProgressOverlayDialog = (OperationProgressOverlayDialog) cma1.O(i, inflate);
        if (operationProgressOverlayDialog != null) {
            i = qbh0.toolbar;
            ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
            if (toolbarView != null) {
                i = qbh0.web3dsViewContainer;
                FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                if (frameLayout != null) {
                    return new e661((ConstraintLayout) inflate, operationProgressOverlayDialog, toolbarView, frameLayout);
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
