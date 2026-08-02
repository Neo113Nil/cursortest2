package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressView;

/* loaded from: classes3.dex */
public final class b061 implements zo31 {
    public final ConstraintLayout a;
    public final YbDivView b;
    public final ErrorView c;
    public final OperationProgressView d;
    public final ConstraintLayout e;
    public final YbDivView f;
    public final YbDivView g;

    public b061(ConstraintLayout constraintLayout, YbDivView ybDivView, ErrorView errorView, OperationProgressView operationProgressView, ConstraintLayout constraintLayout2, YbDivView ybDivView2, YbDivView ybDivView3) {
        this.a = constraintLayout;
        this.b = ybDivView;
        this.c = errorView;
        this.d = operationProgressView;
        this.e = constraintLayout2;
        this.f = ybDivView2;
        this.g = ybDivView3;
    }

    public static b061 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(xmh0.ybsdk_auto_topup_setup_v2, viewGroup, false);
        int i = pah0.autoTopupV2DivContentMain;
        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
        if (ybDivView != null) {
            i = pah0.autoTopupV2ErrorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = pah0.autoTopupV2ProgressBar;
                OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                if (operationProgressView != null) {
                    i = pah0.autoTopupV2Toolbar;
                    ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                    if (constraintLayout != null) {
                        i = pah0.toolbarDivBlockCenter;
                        YbDivView ybDivView2 = (YbDivView) cma1.O(i, inflate);
                        if (ybDivView2 != null) {
                            i = pah0.toolbarDivBlockRight;
                            YbDivView ybDivView3 = (YbDivView) cma1.O(i, inflate);
                            if (ybDivView3 != null) {
                                return new b061((ConstraintLayout) inflate, ybDivView, errorView, operationProgressView, constraintLayout, ybDivView2, ybDivView3);
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

    public final ConstraintLayout o() {
        return this.a;
    }
}
