package com.yandex.passport.data.network.core;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.network.u;

/* loaded from: classes8.dex */
public final class p {
    public final com.yandex.passport.internal.network.d a;

    public p(com.yandex.passport.internal.network.d dVar) {
        this.a = dVar;
    }

    public final u a(com.yandex.passport.data.models.g gVar, Long l) {
        com.yandex.passport.internal.network.d dVar = this.a;
        com.yandex.passport.internal.network.e eVar = dVar.a;
        dVar.b.getClass();
        com.yandex.passport.common.core.a aVar = Environment.Companion;
        int i = gVar.a;
        aVar.getClass();
        return new u(((com.yandex.passport.internal.network.l) eVar).c(com.yandex.passport.common.core.a.a(i), l));
    }
}
