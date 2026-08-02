package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.bvf0;
import defpackage.iv20;
import defpackage.m020;
import defpackage.w3r0;
import defpackage.w811;
import defpackage.wmm;
import defpackage.z721;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j {
    public final w3r0 a;
    public final l b;
    public final z721 c;
    public final w811 d;
    public final com.yandex.go.taxi.summary.mobilityhub.deeplink.b e;
    public final wmm f;

    public j(w3r0 w3r0Var, l lVar, z721 z721Var, w811 w811Var, com.yandex.go.taxi.summary.mobilityhub.deeplink.b bVar, wmm wmmVar) {
        this.a = w3r0Var;
        this.b = lVar;
        this.c = z721Var;
        this.d = w811Var;
        this.e = bVar;
        this.f = wmmVar;
    }

    public final Object a(m020 m020Var, iv20 iv20Var, Continuation continuation) {
        Object n = bvf0.n(new MobilityHubInitInteractor$init$2(this, m020Var, iv20Var, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
