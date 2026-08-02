package com.yandex.go.shortcuts.impl.view.adapter.market.recommendation;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import defpackage.bgh;
import defpackage.e6g;
import defpackage.ekh0;
import defpackage.ex00;
import defpackage.fbz;
import defpackage.jx00;
import defpackage.k3s0;
import defpackage.kx00;
import defpackage.lx00;
import defpackage.lys;
import defpackage.mrg0;
import defpackage.qoi0;
import defpackage.rp31;
import defpackage.rs5;
import defpackage.s5o;
import defpackage.t4s0;
import defpackage.tje;
import defpackage.u7h0;
import defpackage.umw0;
import defpackage.x3s0;
import defpackage.zxs;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.recycler.PreCachingLayoutManager;

/* loaded from: classes13.dex */
public final class b extends lys implements umw0 {
    public static final List U = Collections.singletonList(new s5o(MarketRecommendationsSectionViewHolder$Companion$PAYLOAD_TYPES$1.b));
    public final jx00 S;
    public final RecyclerView T;

    public b(View view, c cVar, t4s0 t4s0Var, k3s0 k3s0Var, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, x3s0 x3s0Var, lx00 lx00Var, e6g e6gVar) {
        super(view, k3s0Var);
        List list = a.e0;
        jx00 jx00Var = new jx00(x3s0Var, Collections.singletonList(new zxs(qoi0.a(ex00.class), ekh0.market_recommendation_item, a.e0, new rs5(t4s0Var, lx00Var, e6gVar, cVar, aVar, ProductMode$Taxi.SectionType.HORIZONTAL_STACK_SECTION, x3s0Var, 4))));
        this.S = jx00Var;
        PreCachingLayoutManager preCachingLayoutManager = new PreCachingLayoutManager(view.getContext());
        preCachingLayoutManager.Z = 3;
        int i = u7h0.scrollable_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(view, i));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(jx00Var);
        recyclerView.setLayoutManager(preCachingLayoutManager);
        recyclerView.addItemDecoration(new bgh(tje.u(4, view.getContext()), tje.r(mrg0.go_design_s_space, view.getContext()), tje.u(4, view.getContext())));
        this.T = recyclerView;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        this.S.submitList(((kx00) obj).b, new fbz(17, this));
    }
}
