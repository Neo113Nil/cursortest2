package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import com.ybsdk.widgets.common.OperationProgressOverlayDialog;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;

/* loaded from: classes3.dex */
public final class f661 implements zo31 {
    public final FrameLayout a;
    public final CommunicationFullScreenView b;
    public final OperationProgressOverlayDialog c;
    public final ViewSwitcher d;
    public final ToolbarView e;

    public f661(FrameLayout frameLayout, CommunicationFullScreenView communicationFullScreenView, OperationProgressOverlayDialog operationProgressOverlayDialog, ViewSwitcher viewSwitcher, ToolbarView toolbarView) {
        this.a = frameLayout;
        this.b = communicationFullScreenView;
        this.c = operationProgressOverlayDialog;
        this.d = viewSwitcher;
        this.e = toolbarView;
    }

    public static f661 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(anh0.ybsdk_screen_card_deletion, viewGroup, false);
        int i = sah0.communicationView;
        CommunicationFullScreenView communicationFullScreenView = (CommunicationFullScreenView) cma1.O(i, inflate);
        if (communicationFullScreenView != null) {
            i = sah0.progress;
            OperationProgressOverlayDialog operationProgressOverlayDialog = (OperationProgressOverlayDialog) cma1.O(i, inflate);
            if (operationProgressOverlayDialog != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                i = sah0.switcher;
                ViewSwitcher viewSwitcher = (ViewSwitcher) cma1.O(i, inflate);
                if (viewSwitcher != null) {
                    i = sah0.toolbarView;
                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                    if (toolbarView != null) {
                        return new f661(frameLayout, communicationFullScreenView, operationProgressOverlayDialog, viewSwitcher, toolbarView);
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
