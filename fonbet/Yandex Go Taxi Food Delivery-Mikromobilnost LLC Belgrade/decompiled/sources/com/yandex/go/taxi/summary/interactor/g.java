package com.yandex.go.taxi.summary.interactor;

import defpackage.a7t0;
import defpackage.arv0;
import defpackage.ay00;
import defpackage.ck31;
import defpackage.fwu0;
import defpackage.g92;
import defpackage.jgv;
import defpackage.k7x0;
import defpackage.msb1;
import defpackage.rgv0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u8u;
import defpackage.uyj;
import defpackage.vev0;
import defpackage.w511;
import defpackage.x8u;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.experiment.q;

/* loaded from: classes14.dex */
public final class g {
    public final q a;
    public final arv0 b;
    public final jgv c;
    public final k7x0 d;
    public final ck31 e;
    public final tt2 f;
    public final vev0 g;
    public final rgv0 h;
    public final fwu0 i;

    public g(q qVar, arv0 arv0Var, jgv jgvVar, k7x0 k7x0Var, ck31 ck31Var, tt2 tt2Var, vev0 vev0Var, rgv0 rgv0Var, fwu0 fwu0Var) {
        this.a = qVar;
        this.b = arv0Var;
        this.c = jgvVar;
        this.d = k7x0Var;
        this.e = ck31Var;
        this.f = tt2Var;
        this.g = vev0Var;
        this.h = rgv0Var;
        this.i = fwu0Var;
    }

    public final tpr a(tpr tprVar) {
        tpr fVar;
        x8u x8uVar = this.g.c;
        if (x8uVar.equals(msb1.I)) {
            d dVar = new d(kotlinx.coroutines.flow.e.t(tprVar), this);
            r0 r0Var = ((a7t0) this.b).a;
            this.i.getClass();
            fVar = kotlinx.coroutines.flow.e.n(dVar, r0Var, new b(new g92(2, ay00.a), this.h), new SummaryHeaderUIStateInteractor$trapHeader$2(this, null));
        } else {
            if (!(x8uVar instanceof u8u)) {
                w511.b();
                return null;
            }
            fVar = new f(kotlinx.coroutines.flow.e.t(tprVar), this, (u8u) x8uVar);
        }
        tpr t = kotlinx.coroutines.flow.e.t(fVar);
        this.f.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
