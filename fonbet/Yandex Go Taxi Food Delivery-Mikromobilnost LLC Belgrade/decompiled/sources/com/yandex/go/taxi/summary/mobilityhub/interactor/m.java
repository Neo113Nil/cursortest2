package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.ck31;
import defpackage.mdh;
import defpackage.pb31;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class m {
    public final String a;
    public final tt2 b;
    public final ck31 c;
    public final pb31 d;
    public final com.yandex.go.taxi.experiments.q e;

    public m(String str, tt2 tt2Var, ck31 ck31Var, pb31 pb31Var, com.yandex.go.taxi.experiments.q qVar) {
        this.a = str;
        this.b = tt2Var;
        this.c = ck31Var;
        this.d = pb31Var;
        this.e = qVar;
    }

    public final tpr a() {
        tpr t = kotlinx.coroutines.flow.e.t(new m0(((com.yandex.go.taxi.tariffs.internal.repository.k) this.c).i(), this.e.a(), new MobilityHubVerticalsUiStateInteractor$uiStateFlow$1(this, null)));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(t, mdh.b);
    }
}
