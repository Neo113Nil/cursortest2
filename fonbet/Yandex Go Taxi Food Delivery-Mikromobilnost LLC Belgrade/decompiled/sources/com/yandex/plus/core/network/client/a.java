package com.yandex.plus.core.network.client;

import defpackage.jt50;
import defpackage.sq50;
import defpackage.wls;
import defpackage.zl50;
import defpackage.zls;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes2.dex */
public final class a {
    public final /* synthetic */ jt50 a;
    public final /* synthetic */ zls b;

    public a(jt50 jt50Var, zls zlsVar) {
        this.a = jt50Var;
        this.b = zlsVar;
    }

    public final Object a(sq50 sq50Var, Object obj, wls wlsVar, SuspendLambda suspendLambda) {
        return com.yandex.plus.core.network.call.a.c(new zl50(2, wlsVar, this.a), new NetworkClient$Companion$wrapError$1$2(this.b, sq50Var, obj, null), suspendLambda);
    }
}
