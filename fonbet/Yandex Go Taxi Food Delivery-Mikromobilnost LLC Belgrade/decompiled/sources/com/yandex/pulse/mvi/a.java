package com.yandex.pulse.mvi;

import defpackage.ev20;
import defpackage.fv20;
import defpackage.ms5;
import defpackage.pc20;
import defpackage.qc20;
import defpackage.thw0;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final /* synthetic */ class a implements thw0 {
    public final /* synthetic */ ev20 a;
    public final /* synthetic */ fv20 b;
    public final /* synthetic */ long c;

    public /* synthetic */ a(ev20 ev20Var, fv20 fv20Var, long j) {
        this.a = ev20Var;
        this.b = fv20Var;
        this.c = j;
    }

    @Override // defpackage.thw0
    public final Object get() {
        ev20 ev20Var = this.a;
        ms5 ms5Var = ev20Var.q;
        qc20 qc20Var = ev20Var.s;
        fv20 fv20Var = this.b;
        Map map = (Map) fv20Var.k.get();
        thw0 thw0Var = fv20Var.m;
        Set set = (Set) thw0Var.get();
        long j = this.c;
        return new qc20(new pc20[]{new TotalScoreCalculator(ms5Var, qc20Var, map, set, j), ev20Var.i ? new TotalScoreCalculator(ev20Var.q, ev20Var.t, (Map) fv20Var.l.get(), (Set) thw0Var.get(), j) : null});
    }
}
