package com.yandex.go.account.phonish_upgrade;

import defpackage.f600;
import defpackage.lz60;
import defpackage.mhf;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes.dex */
public final class j implements lz60 {
    public final tse a;
    public final f600 b;
    public final mhf c;
    public final d d;
    public final p e;

    public j(tse tseVar, f600 f600Var, mhf mhfVar, d dVar, p pVar) {
        this.a = tseVar;
        this.b = f600Var;
        this.c = mhfVar;
        this.d = dVar;
        this.e = pVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.a, null, null, new ForcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.T(new h(new f(this.d.d())), 1), null, this), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ForcePhonishUpgradeLifecycleListener";
    }
}
