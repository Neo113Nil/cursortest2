package com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.core.network.auth;

import android.content.Context;
import com.yandex.fintechsdk.data.auth.api.TokenSource;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import defpackage.dn90;
import defpackage.ek;
import defpackage.fnz0;
import defpackage.gtq0;
import defpackage.hk3;
import defpackage.hn90;
import defpackage.m7b;
import defpackage.qk3;
import defpackage.qoi0;
import defpackage.tje;
import defpackage.uo90;
import defpackage.z22;
import defpackage.zn90;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes12.dex */
public final class a {
    public final z22 a;
    public final hk3 b;
    public final Context c;
    public final DefaultEnvironment d;
    public final dn90 e;
    public final zn90 f;
    public final kotlinx.coroutines.sync.a g = gtq0.a();

    public a(z22 z22Var, hk3 hk3Var, Context context, DefaultEnvironment defaultEnvironment, dn90 dn90Var, zn90 zn90Var) {
        this.a = z22Var;
        this.b = hk3Var;
        this.c = context;
        this.d = defaultEnvironment;
        this.e = dn90Var;
        this.f = zn90Var;
    }

    public static final boolean a(a aVar, dn90 dn90Var, long j) {
        long j2;
        Context context;
        zn90 zn90Var;
        z22 z22Var = aVar.a;
        try {
            context = aVar.c;
            zn90Var = aVar.f;
            j2 = j;
        } catch (Exception e) {
            e = e;
            j2 = j;
        }
        try {
            String c = ((hn90) dn90Var).c(context, j2, zn90Var.a, zn90Var.b, aVar.d == DefaultEnvironment.TESTING, true, new m7b(new uo90(z22Var, 0), new uo90(z22Var, 3)));
            j2 = j;
            aVar.b.a(new qk3(new ek(c, j2), TokenSource.PASSPORT));
            return true;
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            String message = exc.getMessage();
            String d = qoi0.a(exc.getClass()).d();
            if (d == null) {
                d = "";
            }
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new fnz0(message, d, Long.valueOf(j2)));
            return false;
        }
    }

    public final boolean b() {
        return ((Boolean) tje.Y(EmptyCoroutineContext.a, new PassportAuthTokenGeneratorImpl$generateNewToken$1(this, null))).booleanValue();
    }
}
