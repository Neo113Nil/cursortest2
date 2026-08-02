package com.yandex.passport.internal.database.auth_cookie;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.usecase.j;
import com.yandex.passport.internal.usecase.k;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes8.dex */
public final class a {
    public final d a;
    public final com.yandex.passport.common.coroutine.a b;
    public final j c;
    public final k d;
    public final com.yandex.passport.internal.flags.j e;

    public a(d dVar, com.yandex.passport.common.coroutine.a aVar, j jVar, k kVar, com.yandex.passport.internal.flags.j jVar2) {
        this.a = dVar;
        this.b = aVar;
        this.c = jVar;
        this.d = kVar;
        this.e = jVar2;
    }

    public final Object a(Uid uid, Continuation continuation) {
        return tje.k0(((com.yandex.passport.common.coroutine.b) this.b).f, new AuthCookieDaoWrapper$deleteCookieByUid$2(this, uid, null), continuation);
    }

    public final Object b(Uid uid, SuspendLambda suspendLambda) {
        return tje.k0(((com.yandex.passport.common.coroutine.b) this.b).f, new AuthCookieDaoWrapper$getCookieByUid$2(this, uid, null), suspendLambda);
    }

    public final Object c(f fVar, Continuation continuation) {
        Object k0 = tje.k0(((com.yandex.passport.common.coroutine.b) this.b).f, new AuthCookieDaoWrapper$insertCookie$2(this, fVar, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
