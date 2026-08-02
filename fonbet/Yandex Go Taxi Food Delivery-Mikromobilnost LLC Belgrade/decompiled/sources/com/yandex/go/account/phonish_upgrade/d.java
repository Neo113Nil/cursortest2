package com.yandex.go.account.phonish_upgrade;

import defpackage.jbh;
import defpackage.rqo;
import defpackage.tpr;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes.dex */
public final class d implements q {
    public final /* synthetic */ q a;
    public final ru.yandex.taxi.am.i b;

    public d(rqo rqoVar, ru.yandex.taxi.am.i iVar) {
        this.a = ((jbh) rqoVar).d(new ForcePhonishUpgradeExperiment(0));
        this.b = iVar;
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (ForcePhonishUpgradeExperiment) this.a.c();
    }

    public final m0 d() {
        return new m0(ru.yandex.taxi.experiments.d.b(this), this.b.a(), new ForcePhonishUpgradeExperimentProvider$activeFullExperimentFlow$1(this, null));
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
