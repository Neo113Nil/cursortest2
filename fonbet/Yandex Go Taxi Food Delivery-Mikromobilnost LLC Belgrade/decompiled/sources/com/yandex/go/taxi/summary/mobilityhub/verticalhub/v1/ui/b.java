package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.sls;

/* loaded from: classes14.dex */
public final class b extends RecyclerView.g {
    public final sls a;
    public boolean b;
    public int c;

    public b(sls slsVar) {
        this.a = slsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            this.b = true;
            this.c = 0;
        } else if (i == 0 && this.b && this.c != 0) {
            ((VerticalHubV1ModalView$userScrolledListener$1) this.a).invoke();
            this.b = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.c = i2;
    }
}
