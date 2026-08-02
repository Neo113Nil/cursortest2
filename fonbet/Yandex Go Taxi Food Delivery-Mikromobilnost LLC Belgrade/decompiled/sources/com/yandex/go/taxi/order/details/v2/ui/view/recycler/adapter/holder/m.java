package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.akk0;
import defpackage.ghk0;
import defpackage.ibk0;
import defpackage.qpk0;
import defpackage.ygk0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class m extends qpk0 {
    public static final /* synthetic */ int T = 0;
    public final ghk0 R;
    public final com.yandex.go.taxi.order.details.v2.analytics.g S;

    public m(ghk0 ghk0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(ghk0Var.asView());
        this.R = ghk0Var;
        this.S = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        ygk0 ygk0Var = (ygk0) obj;
        akk0 akk0Var = ygk0Var.l;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 10));
        b0(new RideCardDriverViewHolder$processAnalytics$2(this, akk0Var, null));
        ghk0 ghk0Var = this.R;
        ghk0Var.c(ygk0Var);
        ibk0 ibk0Var = ygk0Var.j;
        akk0 akk0Var2 = ygk0Var.l;
        ghk0Var.b(ibk0Var, akk0Var2);
        ghk0Var.a(ygk0Var.i, akk0Var2);
    }
}
