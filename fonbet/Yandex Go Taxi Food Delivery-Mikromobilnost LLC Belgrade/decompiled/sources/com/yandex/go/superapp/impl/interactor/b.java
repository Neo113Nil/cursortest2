package com.yandex.go.superapp.impl.interactor;

import com.yandex.go.superapp.api.loading_tracker.GlobalLoadingEvent;
import defpackage.rit;
import defpackage.tje;
import defpackage.tse;
import defpackage.v3p;
import defpackage.v770;
import defpackage.wsv0;
import defpackage.y9w0;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes14.dex */
public final class b {
    public final rit a;
    public final com.yandex.go.superapp.impl.delegate.a b;
    public final tse c;
    public final v3p d;

    public b(a aVar, y9w0 y9w0Var, rit ritVar, com.yandex.go.superapp.impl.delegate.a aVar2, tse tseVar, v3p v3pVar) {
        this.a = ritVar;
        this.b = aVar2;
        this.c = tseVar;
        this.d = v3pVar;
    }

    public final void a(wsv0 wsv0Var, v770 v770Var) {
        this.a.a(GlobalLoadingEvent.ROUTING_PREPARE);
        tje.N(this.c, null, CoroutineStart.UNDISPATCHED, new ExternalServiceCardOpenInteractorImpl$openServiceCard$1(this, wsv0Var, v770Var, null), 1);
    }
}
