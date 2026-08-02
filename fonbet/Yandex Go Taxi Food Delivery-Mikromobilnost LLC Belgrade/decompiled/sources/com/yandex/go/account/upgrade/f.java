package com.yandex.go.account.upgrade;

import defpackage.ep90;
import defpackage.j921;
import defpackage.jm;
import defpackage.tpr;
import defpackage.u02;
import defpackage.y0s;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.am.m;

/* loaded from: classes.dex */
public final class f implements jm {
    public final ru.yandex.taxi.am.k a;
    public final u02 b;
    public final ep90 c;
    public final y0s d;
    public final m e;
    public final j921 f;

    public f(ru.yandex.taxi.am.k kVar, u02 u02Var, ep90 ep90Var, y0s y0sVar, m mVar, j921 j921Var) {
        this.a = kVar;
        this.b = u02Var;
        this.c = ep90Var;
        this.d = y0sVar;
        this.e = mVar;
        this.f = j921Var;
    }

    public final kotlinx.coroutines.flow.internal.g a() {
        tpr t = kotlinx.coroutines.flow.e.t(new c(com.yandex.go.coroutines.b.d(this.e.f, new AccountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$start$1(null, this)), this));
        y0s y0sVar = this.d;
        return kotlinx.coroutines.flow.e.X(new m0(t, kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(y0sVar.a.a(), new ForceAccountUpgradeExperimentProvider$experimentFlow$$inlined$start$1(null, y0sVar))), new AccountUpgradeInteractorImpl$shouldUpgradeAccount$3(3, null)), new AccountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$flatMapLatest$1(null, this));
    }
}
