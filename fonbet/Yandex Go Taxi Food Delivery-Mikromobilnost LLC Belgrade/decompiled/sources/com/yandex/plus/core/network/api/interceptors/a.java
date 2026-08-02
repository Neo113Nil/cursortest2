package com.yandex.plus.core.network.api.interceptors;

import defpackage.d5j0;
import defpackage.evu0;
import defpackage.kvj0;
import defpackage.m8w;
import defpackage.p8w;
import defpackage.t4j0;
import defpackage.tje;
import defpackage.tls;
import defpackage.zci0;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes8.dex */
public final class a implements p8w {
    public final tls a;

    public a(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        t4j0 b = zci0Var.e.b();
        String str = (String) tje.Y(EmptyCoroutineContext.a, new AuthInterceptor$intercept$newRequest$1$token$1(this, null));
        if (str == null || evu0.J(str)) {
            b.f("Authorization");
        } else {
            b.d("Authorization", "OAuth ".concat(str));
        }
        return zci0Var.b(new d5j0(b));
    }
}
