package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class l extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.usecase.n b;
    public final com.yandex.passport.data.network.token.r0 c;
    public final com.yandex.passport.internal.credentials.d d;
    public final com.yandex.passport.internal.network.mappers.b e;

    public l(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.n nVar, com.yandex.passport.data.network.token.r0 r0Var, com.yandex.passport.internal.credentials.d dVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = nVar;
        this.c = r0Var;
        this.d = dVar;
        this.e = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(k kVar, ContinuationImpl continuationImpl) {
        AuthorizeByMailOAuthTaskIdUseCase$run$1 authorizeByMailOAuthTaskIdUseCase$run$1;
        int i;
        Throwable a;
        Object failure;
        AnalyticsFromValue analyticsFromValue;
        if (continuationImpl instanceof AuthorizeByMailOAuthTaskIdUseCase$run$1) {
            authorizeByMailOAuthTaskIdUseCase$run$1 = (AuthorizeByMailOAuthTaskIdUseCase$run$1) continuationImpl;
            int i2 = authorizeByMailOAuthTaskIdUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizeByMailOAuthTaskIdUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizeByMailOAuthTaskIdUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizeByMailOAuthTaskIdUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.j g = com.yandex.passport.internal.util.p.g(this.d.a, kVar.a);
                    Environment environment = kVar.a;
                    this.e.getClass();
                    com.yandex.passport.data.network.token.k0 k0Var = new com.yandex.passport.data.network.token.k0(com.yandex.passport.internal.network.mappers.b.a(environment), kVar.b, g.getDecryptedId(), g.getDecryptedSecret());
                    authorizeByMailOAuthTaskIdUseCase$run$1.L$0 = this;
                    authorizeByMailOAuthTaskIdUseCase$run$1.L$1 = kVar;
                    authorizeByMailOAuthTaskIdUseCase$run$1.label = 1;
                    obj = this.c.a(k0Var, authorizeByMailOAuthTaskIdUseCase$run$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        failure = ((Result) obj).getValue();
                        return new Result(failure);
                    }
                    kVar = (k) authorizeByMailOAuthTaskIdUseCase$run$1.L$1;
                    this = (l) authorizeByMailOAuthTaskIdUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                Object value = ((Result) obj).getValue();
                a = Result.a(value);
                if (a == null) {
                    failure = new Result.Failure(a);
                    return new Result(failure);
                }
                com.yandex.passport.internal.usecase.n nVar = this.b;
                Environment environment2 = kVar.a;
                PassportSocialProviderCode passportSocialProviderCode = kVar.c;
                AnalyticsFromValue.Companion.getClass();
                analyticsFromValue = AnalyticsFromValue.MAILISH_WEBVIEW;
                com.yandex.passport.internal.usecase.o oVar = new com.yandex.passport.internal.usecase.o(environment2, 0L, (MasterToken) value, passportSocialProviderCode, analyticsFromValue);
                authorizeByMailOAuthTaskIdUseCase$run$1.L$0 = null;
                authorizeByMailOAuthTaskIdUseCase$run$1.L$1 = null;
                authorizeByMailOAuthTaskIdUseCase$run$1.label = 2;
                obj = nVar.a(oVar, authorizeByMailOAuthTaskIdUseCase$run$1);
            }
        }
        authorizeByMailOAuthTaskIdUseCase$run$1 = new AuthorizeByMailOAuthTaskIdUseCase$run$1(this, continuationImpl);
        Object obj2 = authorizeByMailOAuthTaskIdUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizeByMailOAuthTaskIdUseCase$run$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        a = Result.a(value2);
        if (a == null) {
        }
    }
}
