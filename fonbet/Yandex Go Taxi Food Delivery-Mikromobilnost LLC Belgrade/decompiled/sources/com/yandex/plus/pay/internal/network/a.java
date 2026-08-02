package com.yandex.plus.pay.internal.network;

import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.m8w;
import defpackage.p8w;
import defpackage.t4j0;
import defpackage.tje;
import defpackage.zci0;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes8.dex */
public final class a implements p8w {
    public final com.yandex.plus.domain.auth.impl.a a;

    public a(com.yandex.plus.domain.auth.impl.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        d5j0 d5j0Var;
        String str = (String) tje.Y(EmptyCoroutineContext.a, new AuthenticationInterceptor$intercept$request$1(this, null));
        if (str != null) {
            t4j0 b = ((zci0) m8wVar).e.b();
            b.c.g("X-OAuth-Token", str);
            b.c.g("Authorization", "OAuth ".concat(str));
            d5j0Var = new d5j0(b);
        } else {
            d5j0Var = ((zci0) m8wVar).e;
        }
        return ((zci0) m8wVar).b(d5j0Var);
    }
}
