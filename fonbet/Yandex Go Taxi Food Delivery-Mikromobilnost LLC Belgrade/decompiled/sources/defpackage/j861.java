package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.widgets.common.CloseButtonView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class j861 implements zo31 {
    public final ConstraintLayout a;
    public final CloseButtonView b;
    public final ErrorView c;
    public final View d;
    public final ToolbarView e;
    public final CircularProgressIndicator f;

    public j861(ConstraintLayout constraintLayout, CloseButtonView closeButtonView, ErrorView errorView, View view, ToolbarView toolbarView, CircularProgressIndicator circularProgressIndicator) {
        this.a = constraintLayout;
        this.b = closeButtonView;
        this.c = errorView;
        this.d = view;
        this.e = toolbarView;
        this.f = circularProgressIndicator;
    }

    public static j861 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(ooh0.ybsdk_screen_webview, viewGroup, false);
        int i = ech0.closeButton;
        CloseButtonView closeButtonView = (CloseButtonView) cma1.O(i, inflate);
        if (closeButtonView != null) {
            i = ech0.errorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null && (O = cma1.O((i = ech0.gripBackground), inflate)) != null) {
                i = ech0.toolbar;
                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                if (toolbarView != null) {
                    i = ech0.webViewProgress;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) cma1.O(i, inflate);
                    if (circularProgressIndicator != null) {
                        return new j861((ConstraintLayout) inflate, closeButtonView, errorView, O, toolbarView, circularProgressIndicator);
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
