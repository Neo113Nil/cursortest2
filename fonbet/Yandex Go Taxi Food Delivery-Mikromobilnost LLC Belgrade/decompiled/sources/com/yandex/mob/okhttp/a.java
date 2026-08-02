package com.yandex.mob.okhttp;

import defpackage.go20;
import defpackage.gr20;
import defpackage.jse;
import defpackage.oq20;
import defpackage.pr20;
import defpackage.tje;
import defpackage.wp20;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class a {
    public final wp20 a;
    public final jse b;

    public a(wp20 wp20Var, jse jseVar) {
        this.a = wp20Var;
        this.b = jseVar;
    }

    public final Object a(gr20 gr20Var, oq20 oq20Var, go20 go20Var, pr20 pr20Var, Continuation continuation) {
        return tje.k0(this.b, new OkHttpMobAvailabilityGateway$ping$2(pr20Var, oq20Var, go20Var, this, gr20Var, null), continuation);
    }
}
