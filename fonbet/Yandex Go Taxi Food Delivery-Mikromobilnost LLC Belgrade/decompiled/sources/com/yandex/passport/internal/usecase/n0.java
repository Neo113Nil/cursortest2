package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.b4;
import com.yandex.passport.data.network.g4;
import com.yandex.passport.data.network.i4;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.entities.ClientToken;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class n0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.properties.p b;
    public final i4 c;
    public final com.yandex.passport.internal.network.mappers.b d;

    public n0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.properties.p pVar, i4 i4Var, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = pVar;
        this.c = i4Var;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable c(n0 n0Var, m0 m0Var, ContinuationImpl continuationImpl) {
        GetMasterTokenByMasterTokenUseCase$run$1 getMasterTokenByMasterTokenUseCase$run$1;
        int i;
        n0 n0Var2;
        Credentials credentials;
        Object value;
        if (continuationImpl instanceof GetMasterTokenByMasterTokenUseCase$run$1) {
            getMasterTokenByMasterTokenUseCase$run$1 = (GetMasterTokenByMasterTokenUseCase$run$1) continuationImpl;
            int i2 = getMasterTokenByMasterTokenUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMasterTokenByMasterTokenUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getMasterTokenByMasterTokenUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMasterTokenByMasterTokenUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Credentials credentials2 = (Credentials) m0Var.c();
                    i4 i4Var = n0Var.c;
                    com.yandex.passport.internal.network.mappers.b bVar = n0Var.d;
                    Environment a = m0Var.a();
                    bVar.getClass();
                    com.yandex.passport.data.models.g a2 = com.yandex.passport.internal.network.mappers.b.a(a);
                    long b = m0Var.b();
                    MasterToken d = m0Var.d();
                    String decryptedId = credentials2.getDecryptedId();
                    String decryptedSecret = credentials2.getDecryptedSecret();
                    com.yandex.passport.internal.properties.p pVar = n0Var.b;
                    b4 b4Var = new b4(a2, b, d, decryptedId, decryptedSecret, pVar.c, pVar.d);
                    getMasterTokenByMasterTokenUseCase$run$1.L$0 = n0Var;
                    getMasterTokenByMasterTokenUseCase$run$1.L$1 = credentials2;
                    getMasterTokenByMasterTokenUseCase$run$1.label = 1;
                    Object a3 = i4Var.a(b4Var, getMasterTokenByMasterTokenUseCase$run$1);
                    if (a3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    n0Var2 = n0Var;
                    credentials = credentials2;
                    obj = a3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    credentials = (Credentials) getMasterTokenByMasterTokenUseCase$run$1.L$1;
                    n0Var2 = (n0) getMasterTokenByMasterTokenUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    try {
                        value = new ClientToken(((g4) value).a(), credentials.getDecryptedId());
                    } catch (Throwable th) {
                        value = new Result.Failure(th);
                    }
                }
                if (!(value instanceof Result.Failure)) {
                    n0Var2.getClass();
                    com.yandex.passport.common.account.b bVar2 = MasterToken.Companion;
                    String value2 = ((ClientToken) value).getValue();
                    bVar2.getClass();
                    value = com.yandex.passport.common.account.b.a(value2);
                }
                return new Result(value);
            }
        }
        getMasterTokenByMasterTokenUseCase$run$1 = new GetMasterTokenByMasterTokenUseCase$run$1(n0Var, continuationImpl);
        Object obj2 = getMasterTokenByMasterTokenUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMasterTokenByMasterTokenUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return c(this, (m0) obj, (ContinuationImpl) continuation);
    }
}
