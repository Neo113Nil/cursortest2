package com.yandex.go.taxi.summary.shared.sourcedestination;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.b0x0;
import defpackage.pwy0;
import defpackage.tct0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import ru.yandex.taxi.address.experiment.q;

/* loaded from: classes14.dex */
public final class c {
    public final uze0 a;
    public final tct0 b;
    public final tt2 c;
    public final q d;
    public final b0x0 e;
    public final pwy0 f;

    public c(uze0 uze0Var, tct0 tct0Var, tt2 tt2Var, q qVar, b0x0 b0x0Var, pwy0 pwy0Var) {
        this.a = uze0Var;
        this.b = tct0Var;
        this.c = tt2Var;
        this.d = qVar;
        this.e = b0x0Var;
        this.f = pwy0Var;
    }

    public final tpr a(tpr tprVar, tpr tprVar2) {
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.l(tprVar, ((k) this.a).j.a(), new b(tprVar2, this), kotlinx.coroutines.flow.e.d(this.e.a), this.f.a(), new SourceDestinationStateInteractor$stateFlow$2(this, null)));
        this.c.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
