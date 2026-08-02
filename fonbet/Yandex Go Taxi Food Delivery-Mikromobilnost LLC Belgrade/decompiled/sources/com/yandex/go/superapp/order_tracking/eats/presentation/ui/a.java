package com.yandex.go.superapp.order_tracking.eats.presentation.ui;

import com.yandex.go.superapp.order_tracking.eats.domain.c;
import defpackage.a3v;
import defpackage.afn;
import defpackage.ffx;
import defpackage.o950;
import defpackage.qc5;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u1n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class a extends qc5 {
    public final String A;
    public final u1n B;
    public final c C;
    public final a3v D;
    public final tt2 E;
    public final n0 F;

    public a(String str, u1n u1nVar, o950 o950Var, c cVar, a3v a3vVar, tt2 tt2Var) {
        super(afn.class, o950Var);
        this.A = str;
        this.B = u1nVar;
        this.C = cVar;
        this.D = a3vVar;
        this.E = tt2Var;
        this.F = ffx.c(1, 0, BufferOverflow.DROP_OLDEST, 2);
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        tje.N(Kg(), null, null, new EatsOrderDetailsPresenter$onResume$1(this, null), 3);
    }
}
