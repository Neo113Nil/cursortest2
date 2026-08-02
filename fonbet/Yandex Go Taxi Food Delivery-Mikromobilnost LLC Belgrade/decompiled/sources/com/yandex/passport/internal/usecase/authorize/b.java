package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.token.t;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.util.p;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b extends n {
    public final t d;
    public final b1 e;
    public final com.yandex.passport.internal.credentials.d f;
    public final com.yandex.passport.internal.network.mappers.b g;

    public b(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.h hVar, com.yandex.passport.internal.usecase.n nVar, t tVar, b1 b1Var, com.yandex.passport.internal.credentials.d dVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(aVar, hVar, nVar);
        this.d = tVar;
        this.e = b1Var;
        this.f = dVar;
        this.g = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.yandex.passport.internal.usecase.authorize.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a aVar, ContinuationImpl continuationImpl) {
        AuthByCookieUseCase$getMasterToken$1 authByCookieUseCase$getMasterToken$1;
        int i;
        a aVar2;
        Object a;
        Object value;
        Throwable a2;
        b bVar = this;
        if (continuationImpl instanceof AuthByCookieUseCase$getMasterToken$1) {
            authByCookieUseCase$getMasterToken$1 = (AuthByCookieUseCase$getMasterToken$1) continuationImpl;
            int i2 = authByCookieUseCase$getMasterToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authByCookieUseCase$getMasterToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authByCookieUseCase$getMasterToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authByCookieUseCase$getMasterToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bVar.e.n(aVar.d(), "by_cookie", new Long(aVar.b()));
                    com.yandex.passport.internal.j g = p.g(bVar.f.a, aVar.getEnvironment());
                    String cookies = aVar.c().getCookies();
                    if (cookies == null && (cookies = aVar.c().makeCookies()) == null) {
                        ny61.r("missed sessionid for cookies");
                        return null;
                    }
                    String str = cookies;
                    Environment u = p.u(aVar.c().m303getEnvironment());
                    bVar.g.getClass();
                    com.yandex.passport.data.network.token.m mVar = new com.yandex.passport.data.network.token.m(com.yandex.passport.internal.network.mappers.b.a(u), aVar.c().getHost(), str, aVar.d(), aVar.b(), g.getDecryptedId(), g.getDecryptedSecret());
                    authByCookieUseCase$getMasterToken$1.L$0 = bVar;
                    aVar2 = aVar;
                    authByCookieUseCase$getMasterToken$1.L$1 = aVar2;
                    authByCookieUseCase$getMasterToken$1.label = 1;
                    a = bVar.d.a(mVar, authByCookieUseCase$getMasterToken$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a aVar3 = (a) authByCookieUseCase$getMasterToken$1.L$1;
                    b bVar2 = (b) authByCookieUseCase$getMasterToken$1.L$0;
                    kotlin.b.b(obj);
                    aVar2 = aVar3;
                    bVar = bVar2;
                    a = obj;
                }
                value = ((Result) a).getValue();
                if (!(value instanceof Result.Failure)) {
                    bVar.e.m(aVar2.b(), aVar2.d(), "by_cookie");
                }
                a2 = Result.a(value);
                if (a2 != null) {
                    bVar.e.k(aVar2.b(), aVar2.d(), "by_cookie", String.valueOf(a2.getMessage()));
                }
                return value;
            }
        }
        authByCookieUseCase$getMasterToken$1 = new AuthByCookieUseCase$getMasterToken$1(bVar, continuationImpl);
        Object obj2 = authByCookieUseCase$getMasterToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authByCookieUseCase$getMasterToken$1.label;
        if (i != 0) {
        }
        value = ((Result) a).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a2 = Result.a(value);
        if (a2 != null) {
        }
        return value;
    }
}
