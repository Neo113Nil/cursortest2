package com.yandex.passport.internal.interaction;

import com.yandex.passport.data.network.mc;
import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.ui.g;
import defpackage.tls;
import defpackage.wls;

/* loaded from: classes2.dex */
public final class b extends c {
    public final g d;
    public final Object e;
    public final Object f;
    public final tls g;

    public b(com.yandex.passport.internal.helper.f fVar, g gVar, wls wlsVar, a0 a0Var) {
        this.e = fVar;
        this.d = gVar;
        this.f = wlsVar;
        this.g = a0Var;
    }

    public b(com.yandex.passport.internal.network.mappers.b bVar, mc mcVar, g gVar, tls tlsVar) {
        this.e = bVar;
        this.f = mcVar;
        this.d = gVar;
        this.g = tlsVar;
    }
}
