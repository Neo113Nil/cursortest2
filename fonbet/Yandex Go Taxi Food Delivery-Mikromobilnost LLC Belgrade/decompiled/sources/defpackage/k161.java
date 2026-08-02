package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressView;

/* loaded from: classes3.dex */
public final class k161 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final OperationProgressView c;
    public final EditText d;
    public final RecyclerView e;

    public k161(ConstraintLayout constraintLayout, ErrorView errorView, OperationProgressView operationProgressView, EditText editText, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = operationProgressView;
        this.d = editText;
        this.e = recyclerView;
    }

    public static k161 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(nnh0.ybsdk_fragment_merchant_offers_test_search, viewGroup, false);
        int i = fbh0.errorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = fbh0.loadingIndicator;
            OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
            if (operationProgressView != null) {
                i = fbh0.searchQueryInput;
                EditText editText = (EditText) cma1.O(i, inflate);
                if (editText != null) {
                    i = fbh0.searchResultRecycler;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView != null) {
                        return new k161((ConstraintLayout) inflate, errorView, operationProgressView, editText, recyclerView);
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
