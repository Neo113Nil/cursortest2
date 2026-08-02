package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.transfer.internal.screens.common.widgets.TransferErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class ea61 implements zo31 {
    public final ConstraintLayout a;
    public final TransferErrorView b;
    public final LoadableInput c;
    public final RecyclerView d;
    public final ToolbarView e;

    public ea61(ConstraintLayout constraintLayout, TransferErrorView transferErrorView, LoadableInput loadableInput, RecyclerView recyclerView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = transferErrorView;
        this.c = loadableInput;
        this.d = recyclerView;
        this.e = toolbarView;
    }

    public static ea61 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(moh0.ybsdk_transfer_targets, viewGroup, false);
        int i = bch0.errorView;
        TransferErrorView transferErrorView = (TransferErrorView) cma1.O(i, inflate);
        if (transferErrorView != null) {
            i = bch0.filterInput;
            LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
            if (loadableInput != null) {
                i = bch0.recycler;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    i = bch0.toolbar;
                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                    if (toolbarView != null) {
                        return new ea61((ConstraintLayout) inflate, transferErrorView, loadableInput, recyclerView, toolbarView);
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
