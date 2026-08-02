package com.yandex.go.zone.interceptor;

import com.yandex.go.zone.repository.d;
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
    public final d a;

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        d5j0 d5j0Var;
        String str = (String) tje.Y(EmptyCoroutineContext.a, new LastZoneNamesInterceptor$intercept$savedZoneNames$1(this, null));
        if (str == null) {
            d5j0Var = ((zci0) m8wVar).e;
        } else {
            t4j0 b = ((zci0) m8wVar).e.b();
            b.c.a("X-YaTaxi-Last-Zone-Names", str);
            d5j0Var = new d5j0(b);
        }
        return ((zci0) m8wVar).b(d5j0Var);
    }
}
