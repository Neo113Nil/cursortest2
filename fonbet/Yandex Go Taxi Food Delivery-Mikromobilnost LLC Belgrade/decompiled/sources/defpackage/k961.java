package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class k961 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final LoadableInput c;
    public final FullscreenStatusView d;
    public final RecyclerView e;
    public final ToolbarView f;

    public k961(ConstraintLayout constraintLayout, ErrorView errorView, LoadableInput loadableInput, FullscreenStatusView fullscreenStatusView, RecyclerView recyclerView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = loadableInput;
        this.d = fullscreenStatusView;
        this.e = recyclerView;
        this.f = toolbarView;
    }

    public static k961 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_transfer2_phone_input, viewGroup, false);
        int i = cch0.transferPhoneInputErrorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = cch0.transferPhoneInputFilter;
            LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
            if (loadableInput != null) {
                i = cch0.transferPhoneInputFullscreenView;
                FullscreenStatusView fullscreenStatusView = (FullscreenStatusView) cma1.O(i, inflate);
                if (fullscreenStatusView != null) {
                    i = cch0.transferPhoneInputRecycler;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView != null) {
                        i = cch0.transferPhoneInputToolbar;
                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                        if (toolbarView != null) {
                            return new k961((ConstraintLayout) inflate, errorView, loadableInput, fullscreenStatusView, recyclerView, toolbarView);
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
