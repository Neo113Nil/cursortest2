package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.snackbar.SnackbarView;

/* loaded from: classes3.dex */
public final class m061 implements zo31 {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final ErrorView c;
    public final View d;
    public final Group e;
    public final YbButtonView f;
    public final SnackbarView g;

    public m061(ConstraintLayout constraintLayout, RecyclerView recyclerView, ErrorView errorView, View view, Group group, YbButtonView ybButtonView, SnackbarView snackbarView) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = errorView;
        this.d = view;
        this.e = group;
        this.f = ybButtonView;
        this.g = snackbarView;
    }

    public static m061 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(bnh0.ybsdk_cashback_category_fragment, viewGroup, false);
        int i = tah0.cashbackRecycler;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
        if (recyclerView != null) {
            i = tah0.cashbackToolbar;
            if (((ToolbarView) cma1.O(i, inflate)) != null) {
                i = tah0.error;
                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                if (errorView != null && (O = cma1.O((i = tah0.progressBackground), inflate)) != null) {
                    i = tah0.progressGroup;
                    Group group = (Group) cma1.O(i, inflate);
                    if (group != null) {
                        i = tah0.progressIndicator;
                        if (((CircularProgressIndicator) cma1.O(i, inflate)) != null) {
                            i = tah0.selectButton;
                            YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
                            if (ybButtonView != null) {
                                i = tah0.snackbar;
                                SnackbarView snackbarView = (SnackbarView) cma1.O(i, inflate);
                                if (snackbarView != null) {
                                    return new m061((ConstraintLayout) inflate, recyclerView, errorView, O, group, ybButtonView, snackbarView);
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
