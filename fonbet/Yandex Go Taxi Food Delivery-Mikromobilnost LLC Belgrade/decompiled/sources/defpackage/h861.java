package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes2.dex */
public final class h861 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final ErrorView c;
    public final RecyclerView d;
    public final RecyclerView e;
    public final TextView f;

    public h861(ConstraintLayout constraintLayout, YbButtonView ybButtonView, ErrorView errorView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = errorView;
        this.d = recyclerView;
        this.e = recyclerView2;
        this.f = textView;
    }

    public static h861 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(qmh0.ybsdk_screen_upgrade, viewGroup, false);
        int i = jah0.buttonSend;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = jah0.errorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = jah0.recyclerForm;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    i = jah0.recyclerShimmer;
                    RecyclerView recyclerView2 = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView2 != null) {
                        i = jah0.textAgreement;
                        TextView textView = (TextView) cma1.O(i, inflate);
                        if (textView != null) {
                            i = jah0.toolbar;
                            if (((ToolbarView) cma1.O(i, inflate)) != null) {
                                return new h861((ConstraintLayout) inflate, ybButtonView, errorView, recyclerView, recyclerView2, textView);
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
