package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.token.f1;
import com.yandex.passport.data.network.token.z0;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.util.p;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class l extends n {
    public final f1 d;
    public final b1 e;
    public final com.yandex.passport.internal.network.mappers.b f;
    public final com.yandex.passport.internal.credentials.d g;

    public l(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.h hVar, com.yandex.passport.internal.usecase.n nVar, f1 f1Var, b1 b1Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.credentials.d dVar) {
        super(aVar, hVar, nVar);
        this.d = f1Var;
        this.e = b1Var;
        this.f = bVar;
        this.g = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.yandex.passport.internal.usecase.authorize.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(k kVar, ContinuationImpl continuationImpl) {
        AuthorizeByTrackIdUseCase$getMasterToken$1 authorizeByTrackIdUseCase$getMasterToken$1;
        int i;
        Object value;
        Throwable a;
        if (continuationImpl instanceof AuthorizeByTrackIdUseCase$getMasterToken$1) {
            authorizeByTrackIdUseCase$getMasterToken$1 = (AuthorizeByTrackIdUseCase$getMasterToken$1) continuationImpl;
            int i2 = authorizeByTrackIdUseCase$getMasterToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizeByTrackIdUseCase$getMasterToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizeByTrackIdUseCase$getMasterToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizeByTrackIdUseCase$getMasterToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.e.n(kVar.c(), "by_qr_link", null);
                    com.yandex.passport.internal.j g = p.g(this.g.a, kVar.getEnvironment());
                    Environment environment = kVar.getEnvironment();
                    this.f.getClass();
                    z0 z0Var = new z0(com.yandex.passport.internal.network.mappers.b.a(environment), kVar.c(), g.getDecryptedId(), g.getDecryptedSecret());
                    authorizeByTrackIdUseCase$getMasterToken$1.L$0 = this;
                    authorizeByTrackIdUseCase$getMasterToken$1.L$1 = kVar;
                    authorizeByTrackIdUseCase$getMasterToken$1.label = 1;
                    obj = this.d.a(z0Var, authorizeByTrackIdUseCase$getMasterToken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kVar = (k) authorizeByTrackIdUseCase$getMasterToken$1.L$1;
                    this = (l) authorizeByTrackIdUseCase$getMasterToken$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                a = Result.a(value);
                if (a != null) {
                    this.e.k(0L, kVar.c(), "by_qr_link", String.valueOf(a.getMessage()));
                }
                if (!(value instanceof Result.Failure)) {
                    this.e.m(0L, kVar.c(), "by_qr_link");
                }
                return value;
            }
        }
        authorizeByTrackIdUseCase$getMasterToken$1 = new AuthorizeByTrackIdUseCase$getMasterToken$1(this, continuationImpl);
        Object obj2 = authorizeByTrackIdUseCase$getMasterToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizeByTrackIdUseCase$getMasterToken$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        a = Result.a(value);
        if (a != null) {
        }
        if (!(value instanceof Result.Failure)) {
        }
        return value;
    }
}
