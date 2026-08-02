package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.tabview.TabView;

/* loaded from: classes3.dex */
public final class ba61 implements zo31 {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final TabView c;
    public final ToolbarView d;

    public ba61(ConstraintLayout constraintLayout, RecyclerView recyclerView, TabView tabView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = tabView;
        this.d = toolbarView;
    }

    public static ba61 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_transfer_requisite, viewGroup, false);
        int i = cch0.requisiteForm;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
        if (recyclerView != null) {
            i = cch0.requisiteTabView;
            TabView tabView = (TabView) cma1.O(i, inflate);
            if (tabView != null) {
                i = cch0.requisiteToolbar;
                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                if (toolbarView != null) {
                    return new ba61((ConstraintLayout) inflate, recyclerView, tabView, toolbarView);
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
