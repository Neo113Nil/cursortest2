package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.widgets.common.OperationProgressOverlayDialog;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class j661 implements zo31 {
    public final FrameLayout a;
    public final CommunicationFullScreenView b;
    public final OperationProgressOverlayDialog c;
    public final ShimmerFrameLayout d;
    public final ToolbarView e;

    public j661(FrameLayout frameLayout, CommunicationFullScreenView communicationFullScreenView, OperationProgressOverlayDialog operationProgressOverlayDialog, ShimmerFrameLayout shimmerFrameLayout, ToolbarView toolbarView) {
        this.a = frameLayout;
        this.b = communicationFullScreenView;
        this.c = operationProgressOverlayDialog;
        this.d = shimmerFrameLayout;
        this.e = toolbarView;
    }

    public static j661 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(anh0.ybsdk_screen_card_reissue, viewGroup, false);
        int i = sah0.guideline;
        if (((Guideline) cma1.O(i, inflate)) != null) {
            i = sah0.landing;
            CommunicationFullScreenView communicationFullScreenView = (CommunicationFullScreenView) cma1.O(i, inflate);
            if (communicationFullScreenView != null) {
                i = sah0.progress;
                OperationProgressOverlayDialog operationProgressOverlayDialog = (OperationProgressOverlayDialog) cma1.O(i, inflate);
                if (operationProgressOverlayDialog != null) {
                    i = sah0.shimmer;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                    if (shimmerFrameLayout != null) {
                        i = sah0.skeleton1;
                        if (((SkeletonView) cma1.O(i, inflate)) != null) {
                            i = sah0.skeleton2;
                            if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                i = sah0.skeleton3;
                                if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                    i = sah0.skeleton4;
                                    if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                        i = sah0.toolbarView;
                                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                        if (toolbarView != null) {
                                            return new j661((FrameLayout) inflate, communicationFullScreenView, operationProgressOverlayDialog, shimmerFrameLayout, toolbarView);
                                        }
                                    }
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
}
