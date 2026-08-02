package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class p361 implements zo31 {
    public final ConstraintLayout a;
    public final LoadableInput b;
    public final RecyclerView c;
    public final ToolbarView d;

    public p361(ConstraintLayout constraintLayout, LoadableInput loadableInput, RecyclerView recyclerView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = loadableInput;
        this.c = recyclerView;
        this.d = toolbarView;
    }

    public static p361 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_mobile_payment, viewGroup, false);
        int i = cch0.mobilePaymentInput;
        LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
        if (loadableInput != null) {
            i = cch0.mobilePaymentRecycler;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = cch0.mobilePaymentToolbar;
                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                if (toolbarView != null) {
                    return new p361((ConstraintLayout) inflate, loadableInput, recyclerView, toolbarView);
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
