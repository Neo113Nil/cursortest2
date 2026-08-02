package com.yandex.mob.okhttp;

import defpackage.go20;
import defpackage.jse;
import defpackage.oq20;
import defpackage.pr20;
import defpackage.tje;
import defpackage.wp20;
import defpackage.wq20;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class d {
    public final wp20 a;
    public final jse b;

    public d(wp20 wp20Var, jse jseVar) {
        this.a = wp20Var;
        this.b = jseVar;
    }

    public final Object a(pr20 pr20Var, oq20 oq20Var, go20 go20Var, wq20 wq20Var, Continuation continuation) {
        return tje.k0(this.b, new OkHttpMobRemoteNotificationsGateway$pushAcknowledgment$2(pr20Var, oq20Var, go20Var, wq20Var, this, null), continuation);
    }
}
