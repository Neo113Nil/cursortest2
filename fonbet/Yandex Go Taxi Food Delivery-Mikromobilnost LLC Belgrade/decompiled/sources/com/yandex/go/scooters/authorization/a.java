package com.yandex.go.scooters.authorization;

import defpackage.qu;
import defpackage.tje;
import defpackage.ujn0;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes13.dex */
public final class a implements ujn0 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.ujn0
    public final void c() {
        b bVar = this.a;
        tje.N(bVar.o(), null, CoroutineStart.UNDISPATCHED, new ScootersAuthorizationRouter$launchLogin$1(bVar, null), 1);
    }
}
