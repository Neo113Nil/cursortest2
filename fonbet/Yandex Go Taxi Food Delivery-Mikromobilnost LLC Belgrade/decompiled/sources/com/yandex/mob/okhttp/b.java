package com.yandex.mob.okhttp;

import defpackage.go20;
import defpackage.jse;
import defpackage.oq20;
import defpackage.pr20;
import defpackage.tje;
import defpackage.up20;
import defpackage.wp20;
import defpackage.xm20;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class b {
    public final wp20 a;
    public final jse b;

    public b(wp20 wp20Var, jse jseVar) {
        this.a = wp20Var;
        this.b = jseVar;
    }

    public final Object a(pr20 pr20Var, oq20 oq20Var, go20 go20Var, xm20 xm20Var, Continuation continuation) {
        return tje.k0(this.b, new OkHttpMobDataGateway$config$2(pr20Var, oq20Var, go20Var, xm20Var, this, null), continuation);
    }

    public final Object b(pr20 pr20Var, oq20 oq20Var, go20 go20Var, up20 up20Var, Continuation continuation) {
        return tje.k0(this.b, new OkHttpMobDataGateway$notifications$2(pr20Var, oq20Var, go20Var, up20Var, this, null), continuation);
    }
}
