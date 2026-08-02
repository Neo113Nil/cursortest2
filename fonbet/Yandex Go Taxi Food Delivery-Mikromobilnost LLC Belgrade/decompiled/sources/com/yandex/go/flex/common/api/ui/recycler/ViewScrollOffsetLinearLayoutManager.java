package com.yandex.go.flex.common.api.ui.recycler;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/flex/common/api/ui/recycler/ViewScrollOffsetLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public class ViewScrollOffsetLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int S(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        int K1 = K1();
        View X = X(0);
        if (X == null) {
            return C1(kVar);
        }
        int i = -n0(X);
        for (int i2 = 0; i2 < K1; i2++) {
            View X2 = X(i2);
            i += X2 != null ? X2.getHeight() : 0;
        }
        return Math.max(getPaddingTop() + i, 0);
    }
}
