package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.CredentialProvider;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.properties.p;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d extends n {
    public final com.yandex.passport.data.network.token.h d;
    public final com.yandex.passport.internal.credentials.d e;
    public final com.yandex.passport.internal.network.mappers.b f;

    public d(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.h hVar, com.yandex.passport.internal.usecase.n nVar, com.yandex.passport.data.network.token.h hVar2, com.yandex.passport.internal.credentials.d dVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(aVar, hVar, nVar);
        this.d = hVar2;
        this.e = dVar;
        this.f = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.internal.usecase.authorize.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(c cVar, ContinuationImpl continuationImpl) {
        AuthorizeByCodeUseCase$getMasterToken$1 authorizeByCodeUseCase$getMasterToken$1;
        int i;
        com.yandex.passport.internal.j g;
        if (continuationImpl instanceof AuthorizeByCodeUseCase$getMasterToken$1) {
            authorizeByCodeUseCase$getMasterToken$1 = (AuthorizeByCodeUseCase$getMasterToken$1) continuationImpl;
            int i2 = authorizeByCodeUseCase$getMasterToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizeByCodeUseCase$getMasterToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizeByCodeUseCase$getMasterToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizeByCodeUseCase$getMasterToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (cVar.e() instanceof CredentialProvider.Provided) {
                        ClientCredentials clientCredentials = ((CredentialProvider.Provided) cVar.e()).getClientCredentials();
                        g = new Credentials(clientCredentials.getEncryptedId(), clientCredentials.getEncryptedSecret());
                    } else {
                        PassportEnvironmentImpl m302getEnvironment = cVar.c().m302getEnvironment();
                        p pVar = this.e.a;
                        com.yandex.passport.common.core.a aVar = Environment.Companion;
                        int integer = m302getEnvironment.getInteger();
                        aVar.getClass();
                        g = com.yandex.passport.internal.util.p.g(pVar, com.yandex.passport.common.core.a.a(integer));
                    }
                    Environment u = com.yandex.passport.internal.util.p.u(cVar.c().m302getEnvironment());
                    this.f.getClass();
                    com.yandex.passport.data.network.token.a aVar2 = new com.yandex.passport.data.network.token.a(com.yandex.passport.internal.network.mappers.b.a(u), g.getDecryptedId(), g.getDecryptedSecret(), cVar.c().getValue(), cVar.d());
                    authorizeByCodeUseCase$getMasterToken$1.label = 1;
                    obj = this.d.a(aVar2, authorizeByCodeUseCase$getMasterToken$1);
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
        authorizeByCodeUseCase$getMasterToken$1 = new AuthorizeByCodeUseCase$getMasterToken$1(this, continuationImpl);
        Object obj2 = authorizeByCodeUseCase$getMasterToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizeByCodeUseCase$getMasterToken$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
