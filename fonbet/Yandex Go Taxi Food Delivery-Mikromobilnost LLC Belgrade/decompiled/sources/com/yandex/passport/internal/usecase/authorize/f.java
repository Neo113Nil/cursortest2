package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.token.f0;
import com.yandex.passport.data.network.token.y;
import com.yandex.passport.internal.util.p;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f extends n {
    public final f0 d;
    public final com.yandex.passport.internal.network.mappers.b e;
    public final com.yandex.passport.internal.credentials.d f;

    public f(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.h hVar, com.yandex.passport.internal.usecase.n nVar, f0 f0Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.credentials.d dVar) {
        super(aVar, hVar, nVar);
        this.d = f0Var;
        this.e = bVar;
        this.f = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.internal.usecase.authorize.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(e eVar, ContinuationImpl continuationImpl) {
        AuthorizeByDeviceCodeUseCase$getMasterToken$1 authorizeByDeviceCodeUseCase$getMasterToken$1;
        int i;
        if (continuationImpl instanceof AuthorizeByDeviceCodeUseCase$getMasterToken$1) {
            authorizeByDeviceCodeUseCase$getMasterToken$1 = (AuthorizeByDeviceCodeUseCase$getMasterToken$1) continuationImpl;
            int i2 = authorizeByDeviceCodeUseCase$getMasterToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizeByDeviceCodeUseCase$getMasterToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizeByDeviceCodeUseCase$getMasterToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizeByDeviceCodeUseCase$getMasterToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.j g = p.g(this.f.a, eVar.getEnvironment());
                    Environment environment = eVar.getEnvironment();
                    this.e.getClass();
                    y yVar = new y(com.yandex.passport.internal.network.mappers.b.a(environment), eVar.c(), g.getDecryptedId(), g.getDecryptedSecret());
                    authorizeByDeviceCodeUseCase$getMasterToken$1.label = 1;
                    obj = this.d.a(yVar, authorizeByDeviceCodeUseCase$getMasterToken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        authorizeByDeviceCodeUseCase$getMasterToken$1 = new AuthorizeByDeviceCodeUseCase$getMasterToken$1(this, continuationImpl);
        Object obj2 = authorizeByDeviceCodeUseCase$getMasterToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizeByDeviceCodeUseCase$getMasterToken$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
