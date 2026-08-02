package com.yandex.go.shortcuts.impl.view.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bgh;
import defpackage.k3s0;
import defpackage.lys;
import defpackage.mmp0;
import defpackage.n3q0;
import defpackage.o3q0;
import defpackage.rp31;
import defpackage.s5o;
import defpackage.tje;
import defpackage.u7h0;
import defpackage.wor0;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.recycler.SpannedGridLayoutManager;

/* loaded from: classes13.dex */
public final class r extends lys {
    public static final List Z = Collections.singletonList(new s5o(SectionScrollableViewHolder$Companion$PAYLOAD_TYPES$1.b));
    public final t S;
    public final wor0 T;
    public final o3q0 U;
    public final SpannedGridLayoutManager V;
    public final RecyclerView W;

    public r(t tVar, wor0 wor0Var, k3s0 k3s0Var, View view) {
        super(view, k3s0Var);
        this.S = tVar;
        this.T = wor0Var;
        o3q0 o3q0Var = new o3q0(this);
        this.U = o3q0Var;
        SpannedGridLayoutManager spannedGridLayoutManager = new SpannedGridLayoutManager(view.getContext(), SpannedGridLayoutManager.Orientation.HORIZONTAL);
        this.V = spannedGridLayoutManager;
        int i = u7h0.scrollable_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(view, i));
        spannedGridLayoutManager.U = tVar;
        spannedGridLayoutManager.i1();
        recyclerView.setLayoutManager(spannedGridLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(tVar);
        recyclerView.addItemDecoration(new bgh(tje.u(4, view.getContext()), tje.u(4, view.getContext()), tje.u(4, view.getContext())));
        recyclerView.addOnScrollListener(o3q0Var);
        this.W = recyclerView;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        n3q0 n3q0Var = (n3q0) obj;
        this.S.submitList(n3q0Var.c, new mmp0(5, this));
        this.U.getClass();
        this.V.Q1(n3q0Var.b);
    }
}
