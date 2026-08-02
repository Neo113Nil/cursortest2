package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.t3;
import com.yandex.passport.data.network.x3;
import com.yandex.passport.data.network.y3;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.CredentialProvider;
import com.yandex.passport.internal.entities.Code;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f0 extends com.yandex.passport.common.domain.a {
    public final y3 b;
    public final com.yandex.passport.internal.properties.p c;
    public final com.yandex.passport.internal.core.accounts.d d;
    public final com.yandex.passport.internal.network.mappers.b e;

    public f0(com.yandex.passport.common.coroutine.a aVar, y3 y3Var, com.yandex.passport.internal.properties.p pVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = y3Var;
        this.c = pVar;
        this.d = dVar;
        this.e = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(e0 e0Var, ContinuationImpl continuationImpl) {
        GetChildCodeByUidParentUseCase$run$1 getChildCodeByUidParentUseCase$run$1;
        int i;
        ClientCredentials clientCredentials;
        Environment environment;
        Object value;
        if (continuationImpl instanceof GetChildCodeByUidParentUseCase$run$1) {
            getChildCodeByUidParentUseCase$run$1 = (GetChildCodeByUidParentUseCase$run$1) continuationImpl;
            int i2 = getChildCodeByUidParentUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChildCodeByUidParentUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getChildCodeByUidParentUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChildCodeByUidParentUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Environment environment2 = e0Var.c().getEnvironment();
                    CredentialProvider b = e0Var.b();
                    if (jl40.l(b, CredentialProvider.FromProperties.INSTANCE)) {
                        clientCredentials = this.c.r(environment2);
                    } else if (jl40.l(b, CredentialProvider.NoCredentials.INSTANCE)) {
                        clientCredentials = null;
                    } else {
                        if (!(b instanceof CredentialProvider.Provided)) {
                            w511.b();
                            return null;
                        }
                        clientCredentials = ((CredentialProvider.Provided) e0Var.b()).getClientCredentials();
                    }
                    ModernAccount e = this.d.a().e(e0Var.c());
                    if (e == null) {
                        throw new PassportAccountNotFoundException(e0Var.c());
                    }
                    MasterToken masterToken = e.getMasterToken();
                    this.e.getClass();
                    t3 t3Var = new t3(e.getLocationId(), masterToken, com.yandex.passport.internal.network.mappers.b.a(environment2), clientCredentials != null ? clientCredentials.getDecryptedId() : null, clientCredentials != null ? clientCredentials.getDecryptedSecret() : null, String.valueOf(e0Var.a().getValue()));
                    getChildCodeByUidParentUseCase$run$1.L$0 = environment2;
                    getChildCodeByUidParentUseCase$run$1.label = 1;
                    Object a = this.b.a(t3Var, getChildCodeByUidParentUseCase$run$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    environment = environment2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    environment = (Environment) getChildCodeByUidParentUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    try {
                        x3 x3Var = (x3) value;
                        value = new Code(com.yandex.passport.internal.util.p.y(environment), x3Var.b, x3Var.c);
                    } catch (Throwable th) {
                        value = new Result.Failure(th);
                    }
                }
                return new Result(value);
            }
        }
        getChildCodeByUidParentUseCase$run$1 = new GetChildCodeByUidParentUseCase$run$1(this, continuationImpl);
        Object obj2 = getChildCodeByUidParentUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChildCodeByUidParentUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }
}
