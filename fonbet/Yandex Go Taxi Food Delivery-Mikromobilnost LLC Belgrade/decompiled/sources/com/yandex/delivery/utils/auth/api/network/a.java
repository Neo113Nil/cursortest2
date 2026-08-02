package com.yandex.delivery.utils.auth.api.network;

import defpackage.cvj0;
import defpackage.d5j0;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.h991;
import defpackage.kvj0;
import defpackage.lf60;
import defpackage.m8w;
import defpackage.meu;
import defpackage.ni3;
import defpackage.p8w;
import defpackage.qvj0;
import defpackage.rk3;
import defpackage.rvj0;
import defpackage.t4j0;
import defpackage.tje;
import defpackage.uk3;
import defpackage.w511;
import defpackage.wk3;
import defpackage.zci0;
import defpackage.zk3;
import kotlin.coroutines.EmptyCoroutineContext;
import okhttp3.Protocol;

/* loaded from: classes.dex */
public final class a implements p8w {
    public final h3y a;

    public a(h3y h3yVar) {
        this.a = h3yVar;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        String str;
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        Object c = d5j0Var.c(lf60.class);
        meu meuVar = d5j0Var.c;
        if (((lf60) c) != null) {
            return zci0Var.b(d5j0Var);
        }
        zk3 zk3Var = (zk3) tje.Y(EmptyCoroutineContext.a, new AuthInterceptor$intercept$authState$1(this, null));
        if ((zk3Var instanceof wk3) || (zk3Var instanceof uk3)) {
            zci0Var.a.cancel();
            cvj0 cvj0Var = new cvj0();
            cvj0Var.c = 401;
            cvj0Var.a = d5j0Var;
            rvj0.Companion.getClass();
            cvj0Var.g = qvj0.b("", null);
            cvj0Var.b = Protocol.HTTP_2;
            cvj0Var.d = "No authorization token provided";
            return cvj0Var.a();
        }
        if (!(zk3Var instanceof rk3)) {
            w511.b();
            return null;
        }
        t4j0 b = d5j0Var.b();
        ni3 ni3Var = ((rk3) zk3Var).a;
        String a = meuVar.a("Authorization");
        if (a == null || evu0.J(a)) {
            b.a("Authorization", h991.c(ni3Var.a));
        }
        String a2 = meuVar.a("X-YaTaxi-UserId");
        if ((a2 == null || evu0.J(a2)) && (str = ni3Var.b) != null) {
            b.a("X-YaTaxi-UserId", str);
        }
        return zci0Var.b(new d5j0(b));
    }
}
