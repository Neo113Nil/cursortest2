package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.main.internal.widgets.SbpYbsCustomErrorView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class d861 implements zo31 {
    public final ConstraintLayout a;
    public final SbpYbsCustomErrorView b;
    public final ErrorView c;
    public final LoadableInput d;
    public final RecyclerView e;
    public final ToolbarView f;

    public d861(ConstraintLayout constraintLayout, SbpYbsCustomErrorView sbpYbsCustomErrorView, ErrorView errorView, LoadableInput loadableInput, RecyclerView recyclerView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = sbpYbsCustomErrorView;
        this.c = errorView;
        this.d = loadableInput;
        this.e = recyclerView;
        this.f = toolbarView;
    }

    public static d861 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(mnh0.ybsdk_screen_sbp_partners, viewGroup, false);
        int i = ebh0.sbpAccountsBanksCustomErrorView;
        SbpYbsCustomErrorView sbpYbsCustomErrorView = (SbpYbsCustomErrorView) cma1.O(i, inflate);
        if (sbpYbsCustomErrorView != null) {
            i = ebh0.sbpAccountsBanksErrorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = ebh0.sbpAccountsBanksFilterInput;
                LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
                if (loadableInput != null) {
                    i = ebh0.sbpAccountsBanksRecycler;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView != null) {
                        i = ebh0.sbpAccountsBanksToolbar;
                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                        if (toolbarView != null) {
                            return new d861((ConstraintLayout) inflate, sbpYbsCustomErrorView, errorView, loadableInput, recyclerView, toolbarView);
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
