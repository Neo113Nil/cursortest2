package com.yandex.messaging.internal.view.stickers;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r0;

/* loaded from: classes15.dex */
public class AutoSpanGridLayoutManager extends GridLayoutManager {
    public final int n0;

    public AutoSpanGridLayoutManager(Context context, int i) {
        super(context, 1, 1, false);
        this.n0 = i;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void U0(r0 r0Var, RecyclerView.k kVar) {
        int i = this.H / this.n0;
        if (i != this.c0 && i >= 1) {
            s2(i);
        }
        super.U0(r0Var, kVar);
    }
}
