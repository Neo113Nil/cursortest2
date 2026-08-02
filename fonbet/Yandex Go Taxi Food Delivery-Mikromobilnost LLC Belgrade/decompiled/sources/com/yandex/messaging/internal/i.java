package com.yandex.messaging.internal;

import defpackage.kse;
import defpackage.o5e;
import defpackage.rol0;
import defpackage.tpr;

/* loaded from: classes15.dex */
public final class i {
    public final com.yandex.messaging.internal.authorized.j a;
    public final o5e b;
    public final kse c;

    public i(com.yandex.messaging.internal.authorized.j jVar, o5e o5eVar, kse kseVar) {
        this.a = jVar;
        this.b = o5eVar;
        this.c = kseVar;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new rol0(new GetConnectionStatusUseCase$execute$1(this, null)));
    }
}
