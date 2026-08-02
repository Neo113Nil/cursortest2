package com.yandex.go.navigator.gas_stations.overview;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import defpackage.tls;

/* loaded from: classes12.dex */
public final class l extends RecyclerView.g {
    public final RecyclerView a;
    public final f0 b;
    public final tls c;
    public int d = -1;

    public l(RecyclerView recyclerView, f0 f0Var, tls tlsVar) {
        this.a = recyclerView;
        this.b = f0Var;
        this.c = tlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int viewLayoutPosition;
        if (i == 0) {
            RecyclerView.e layoutManager = this.a.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            View e = this.b.e(linearLayoutManager);
            if (e == null || linearLayoutManager == null || (viewLayoutPosition = ((RecyclerView.LayoutParams) e.getLayoutParams()).getViewLayoutPosition()) == this.d) {
                return;
            }
            this.d = viewLayoutPosition;
            ((GasStationsOverviewView$snapListener$1) this.c).invoke(Integer.valueOf(viewLayoutPosition));
        }
    }
}
