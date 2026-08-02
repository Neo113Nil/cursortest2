package com.yandex.messaging.internal.backendconfig;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bvf0;
import defpackage.h3y;
import defpackage.tje;
import defpackage.xdf0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a {
    public final h3y a;
    public final r0 b;

    public a(h3y h3yVar, xdf0 xdf0Var) {
        this.a = h3yVar;
        BackendConfig.INSTANCE.getClass();
        this.b = bvf0.c(BackendConfig.Companion.a());
        tje.N(xdf0Var, null, null, new BackendConfigBridge$1(this, null), 3);
    }

    public final BackendConfig a() {
        return (BackendConfig) this.b.getValue();
    }
}
