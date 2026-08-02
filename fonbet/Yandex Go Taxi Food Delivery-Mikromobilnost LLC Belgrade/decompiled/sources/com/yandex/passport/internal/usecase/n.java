package com.yandex.passport.internal.usecase;

import com.yandex.passport.internal.ModernAccount;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class n extends com.yandex.passport.common.domain.a {
    public final p b;
    public final com.yandex.passport.internal.core.accounts.e c;

    public n(com.yandex.passport.common.coroutine.a aVar, p pVar, com.yandex.passport.internal.core.accounts.e eVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = pVar;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(o oVar, Continuation continuation) {
        FetchAndSaveModernAccountUseCase$run$1 fetchAndSaveModernAccountUseCase$run$1;
        int i;
        Object value;
        if (continuation instanceof FetchAndSaveModernAccountUseCase$run$1) {
            fetchAndSaveModernAccountUseCase$run$1 = (FetchAndSaveModernAccountUseCase$run$1) continuation;
            int i2 = fetchAndSaveModernAccountUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchAndSaveModernAccountUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchAndSaveModernAccountUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchAndSaveModernAccountUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fetchAndSaveModernAccountUseCase$run$1.L$0 = this;
                    fetchAndSaveModernAccountUseCase$run$1.L$1 = oVar;
                    fetchAndSaveModernAccountUseCase$run$1.label = 1;
                    obj = this.b.a(oVar, fetchAndSaveModernAccountUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = (o) fetchAndSaveModernAccountUseCase$run$1.L$1;
                    this = (n) fetchAndSaveModernAccountUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    try {
                        value = this.c.a((ModernAccount) value, oVar.a().getEvent(), true);
                    } catch (Throwable th) {
                        value = new Result.Failure(th);
                    }
                }
                return new Result(value);
            }
        }
        fetchAndSaveModernAccountUseCase$run$1 = new FetchAndSaveModernAccountUseCase$run$1(this, (ContinuationImpl) continuation);
        Object obj2 = fetchAndSaveModernAccountUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchAndSaveModernAccountUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }
}
