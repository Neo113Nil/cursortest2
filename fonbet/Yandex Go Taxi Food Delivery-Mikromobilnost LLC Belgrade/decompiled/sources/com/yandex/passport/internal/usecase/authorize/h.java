package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.token.i1;
import com.yandex.passport.data.network.token.o1;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.util.p;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class h extends n {
    public final o1 d;
    public final b1 e;
    public final com.yandex.passport.internal.credentials.d f;
    public final com.yandex.passport.internal.network.mappers.b g;

    public h(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.h hVar, com.yandex.passport.internal.usecase.n nVar, o1 o1Var, b1 b1Var, com.yandex.passport.internal.credentials.d dVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(aVar, hVar, nVar);
        this.d = o1Var;
        this.e = b1Var;
        this.f = dVar;
        this.g = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.yandex.passport.internal.usecase.authorize.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(g gVar, ContinuationImpl continuationImpl) {
        AuthorizeByForwardTrackUseCase$getMasterToken$1 authorizeByForwardTrackUseCase$getMasterToken$1;
        int i;
        Object value;
        Throwable a;
        if (continuationImpl instanceof AuthorizeByForwardTrackUseCase$getMasterToken$1) {
            authorizeByForwardTrackUseCase$getMasterToken$1 = (AuthorizeByForwardTrackUseCase$getMasterToken$1) continuationImpl;
            int i2 = authorizeByForwardTrackUseCase$getMasterToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizeByForwardTrackUseCase$getMasterToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizeByForwardTrackUseCase$getMasterToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizeByForwardTrackUseCase$getMasterToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.e.n(gVar.c().getValue(), "by_track_id", null);
                    com.yandex.passport.internal.j g = p.g(this.f.a, gVar.getEnvironment());
                    Environment u = p.u(gVar.c().m304getEnvironment());
                    this.g.getClass();
                    i1 i1Var = new i1(com.yandex.passport.internal.network.mappers.b.a(u), gVar.c().getValue(), g.getDecryptedId(), g.getDecryptedSecret());
                    authorizeByForwardTrackUseCase$getMasterToken$1.L$0 = this;
                    authorizeByForwardTrackUseCase$getMasterToken$1.L$1 = gVar;
                    authorizeByForwardTrackUseCase$getMasterToken$1.label = 1;
                    obj = this.d.a(i1Var, authorizeByForwardTrackUseCase$getMasterToken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gVar = (g) authorizeByForwardTrackUseCase$getMasterToken$1.L$1;
                    this = (h) authorizeByForwardTrackUseCase$getMasterToken$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                a = Result.a(value);
                if (a != null) {
                    this.e.k(0L, gVar.c().getValue(), "by_track_id", String.valueOf(a.getMessage()));
                }
                if (!(value instanceof Result.Failure)) {
                    this.e.m(0L, gVar.c().getValue(), "by_track_id");
                }
                return value;
            }
        }
        authorizeByForwardTrackUseCase$getMasterToken$1 = new AuthorizeByForwardTrackUseCase$getMasterToken$1(this, continuationImpl);
        Object obj2 = authorizeByForwardTrackUseCase$getMasterToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizeByForwardTrackUseCase$getMasterToken$1.label;
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
