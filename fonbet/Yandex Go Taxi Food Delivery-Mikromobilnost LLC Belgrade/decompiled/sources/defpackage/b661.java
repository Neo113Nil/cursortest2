package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class b661 implements zo31 {
    public final FrameLayout a;
    public final LinearLayoutCompat b;
    public final YbDivView c;
    public final ErrorView d;
    public final FullscreenStatusView e;
    public final ToolbarView f;

    public b661(FrameLayout frameLayout, LinearLayoutCompat linearLayoutCompat, YbDivView ybDivView, ErrorView errorView, FullscreenStatusView fullscreenStatusView, ToolbarView toolbarView) {
        this.a = frameLayout;
        this.b = linearLayoutCompat;
        this.c = ybDivView;
        this.d = errorView;
        this.e = fullscreenStatusView;
        this.f = toolbarView;
    }

    public static b661 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(fnh0.ybsdk_screen_base_div, viewGroup, false);
        int i = xah0.contentContainer;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) cma1.O(i, inflate);
        if (linearLayoutCompat != null) {
            i = xah0.divView;
            YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
            if (ybDivView != null) {
                i = xah0.error;
                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                if (errorView != null) {
                    i = xah0.statusView;
                    FullscreenStatusView fullscreenStatusView = (FullscreenStatusView) cma1.O(i, inflate);
                    if (fullscreenStatusView != null) {
                        i = xah0.toolbar;
                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                        if (toolbarView != null) {
                            return new b661((FrameLayout) inflate, linearLayoutCompat, ybDivView, errorView, fullscreenStatusView, toolbarView);
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

    public final FrameLayout o() {
        return this.a;
    }
}
