package com.yandex.messaging.internal.authorized;

import defpackage.h3y;
import defpackage.tje;
import defpackage.wls;
import defpackage.xdf0;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes15.dex */
public final class j {
    public final h3y a;
    public final h3y b;
    public final xdf0 c;

    public j(h3y h3yVar, h3y h3yVar2, xdf0 xdf0Var) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = xdf0Var;
    }

    public final void a(wls wlsVar) {
        tje.N(this.c, null, null, new UserScopeBridge$launch$1(this, wlsVar, null), 3);
    }

    public final Object b(wls wlsVar, SuspendLambda suspendLambda) {
        return tje.k0(this.c.b, new UserScopeBridge$performSync$2(this, wlsVar, null), suspendLambda);
    }
}
