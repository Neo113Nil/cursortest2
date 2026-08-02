package com.yandex.go.chargers.attention.presentation;

import android.view.View;
import com.yandex.go.chargers.attention.data.d;
import com.yandex.go.chargers.attention.data.e;
import defpackage.cn9;
import defpackage.jn9;
import defpackage.jqr;
import defpackage.mn9;
import defpackage.nn9;
import defpackage.rn9;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uyj;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class b implements mn9 {
    public final rn9 a;
    public ChargersAttentionView b;

    public b(rn9 rn9Var) {
        this.a = rn9Var;
    }

    public final ChargersAttentionView a(View view) {
        ChargersAttentionView chargersAttentionView = new ChargersAttentionView(view.getContext(), null, 0, 6, null);
        new ChargersAttentionViewDelegateImpl$obtainOverlay$chargersAttentionView$1$1(this, b.class, "chargersAttentionView", "getChargersAttentionView()Lcom/yandex/go/chargers/attention/presentation/ChargersAttentionView;", 0).i(chargersAttentionView);
        chargersAttentionView.setContent(view);
        nn9 nn9Var = new nn9(this);
        rn9 rn9Var = this.a;
        rn9Var.Bg(nn9Var);
        jn9 jn9Var = rn9Var.y;
        tpr a = jn9Var.b.a();
        e eVar = (e) jn9Var.c;
        d dVar = new d(new com.yandex.go.chargers.attention.data.b(eVar.d, eVar), eVar);
        eVar.b.getClass();
        sjh sjhVar = uyj.a;
        tpr t = kotlinx.coroutines.flow.e.t(new m0(a, kotlinx.coroutines.flow.e.F(dVar, sjhVar), new ChargersAttentionUiStateInteractor$uiStateFlow$1(jn9Var, null)));
        jn9Var.a.getClass();
        tje.N(rn9Var.Jg(), null, null, new ChargersAttentionViewPresenter$listenToState$$inlined$collectIn$1(new jqr(kotlinx.coroutines.flow.e.F(t, sjhVar), new ChargersAttentionViewPresenter$listenToState$1(rn9Var, null), 3), null, (cn9) rn9Var.Dg()), 3);
        return chargersAttentionView;
    }
}
