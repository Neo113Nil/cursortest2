package com.yandex.passport.data.network.core;

import com.yandex.passport.common.core.Environment;
import defpackage.evu0;

/* loaded from: classes8.dex */
public final class l {
    public final com.yandex.passport.internal.network.d a;

    public l(com.yandex.passport.internal.network.d dVar) {
        this.a = dVar;
    }

    public final String a(com.yandex.passport.data.models.g gVar) {
        try {
            com.yandex.passport.internal.network.d dVar = this.a;
            com.yandex.passport.internal.network.e eVar = dVar.a;
            dVar.b.getClass();
            com.yandex.passport.common.core.a aVar = Environment.Companion;
            int i = gVar.a;
            aVar.getClass();
            String g = com.yandex.passport.common.url.b.g(((com.yandex.passport.internal.network.l) eVar).f(com.yandex.passport.common.core.a.a(i), null, null));
            return evu0.J(g) ? "passport.yandex.ru" : g;
        } catch (Exception unused) {
            return "passport.yandex.ru";
        }
    }
}
