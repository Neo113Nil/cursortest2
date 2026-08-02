package com.yandex.passport.internal.upgrader;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.data.network.t0;
import com.yandex.passport.data.network.x0;
import com.yandex.passport.data.network.y0;
import com.yandex.passport.internal.ModernAccount;
import defpackage.ny61;
import defpackage.uyj;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class k extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final y0 c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.e e;

    public k(com.yandex.passport.internal.core.accounts.d dVar, y0 y0Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.e eVar) {
        super(uyj.a);
        this.b = dVar;
        this.c = y0Var;
        this.d = bVar;
        this.e = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uid uid, Continuation continuation) {
        GetUpgradeUrlUseCase$run$1 getUpgradeUrlUseCase$run$1;
        int i;
        MasterToken masterToken;
        Object value;
        k kVar = this;
        if (continuation instanceof GetUpgradeUrlUseCase$run$1) {
            getUpgradeUrlUseCase$run$1 = (GetUpgradeUrlUseCase$run$1) continuation;
            int i2 = getUpgradeUrlUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUpgradeUrlUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getUpgradeUrlUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUpgradeUrlUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.core.accounts.d dVar = kVar.b;
                    ModernAccount e = dVar.a().e(uid);
                    Environment environment = uid.getEnvironment();
                    kVar.d.getClass();
                    com.yandex.passport.data.models.g a = com.yandex.passport.internal.network.mappers.b.a(environment);
                    long locationId = e != null ? e.getLocationId() : 0L;
                    ModernAccount e2 = dVar.a().e(uid);
                    if (e2 == null || (masterToken = e2.getMasterToken()) == null) {
                        masterToken = new MasterToken(null);
                    }
                    t0 t0Var = new t0(masterToken, a, locationId, kVar.e.a(), e != null ? e.m298getUpgradePostponedAtR7zlAxo() : 0L);
                    getUpgradeUrlUseCase$run$1.L$0 = kVar;
                    getUpgradeUrlUseCase$run$1.label = 1;
                    obj = kVar.c.a(t0Var, getUpgradeUrlUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kVar = (k) getUpgradeUrlUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    try {
                        kVar.getClass();
                        String str = ((x0) value).f;
                        if (str == null) {
                            throw new FailedResponseException("No url got from backend");
                        }
                        value = new com.yandex.passport.common.url.b(com.yandex.passport.common.url.b.k(str));
                    } catch (Throwable th) {
                        value = new Result.Failure(th);
                    }
                }
                return new Result(value);
            }
        }
        getUpgradeUrlUseCase$run$1 = new GetUpgradeUrlUseCase$run$1(kVar, (ContinuationImpl) continuation);
        Object obj2 = getUpgradeUrlUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUpgradeUrlUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }
}
