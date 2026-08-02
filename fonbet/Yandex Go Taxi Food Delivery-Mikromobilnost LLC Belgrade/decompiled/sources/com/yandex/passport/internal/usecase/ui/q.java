package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.a1;
import com.yandex.passport.data.network.e1;
import com.yandex.passport.data.network.f1;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class q extends com.yandex.passport.common.domain.a {
    public final f1 b;
    public final com.yandex.passport.internal.network.mappers.b c;

    public q(com.yandex.passport.common.coroutine.a aVar, f1 f1Var, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = f1Var;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable c(q qVar, p pVar, ContinuationImpl continuationImpl) {
        CountrySuggestionUseCase$run$1 countrySuggestionUseCase$run$1;
        int i;
        Object value;
        if (continuationImpl instanceof CountrySuggestionUseCase$run$1) {
            countrySuggestionUseCase$run$1 = (CountrySuggestionUseCase$run$1) continuationImpl;
            int i2 = countrySuggestionUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                countrySuggestionUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = countrySuggestionUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = countrySuggestionUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f1 f1Var = qVar.b;
                    com.yandex.passport.internal.network.mappers.b bVar = qVar.c;
                    Environment environment = pVar.a;
                    bVar.getClass();
                    a1 a1Var = new a1(com.yandex.passport.internal.network.mappers.b.a(environment), pVar.b);
                    countrySuggestionUseCase$run$1.label = 1;
                    obj = f1Var.a(a1Var, countrySuggestionUseCase$run$1);
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
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    try {
                        value = (String) kotlin.collections.a.P(((e1) value).b);
                    } catch (Throwable th) {
                        value = new Result.Failure(th);
                    }
                }
                return new Result(value);
            }
        }
        countrySuggestionUseCase$run$1 = new CountrySuggestionUseCase$run$1(qVar, continuationImpl);
        Object obj2 = countrySuggestionUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = countrySuggestionUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return c(this, (p) obj, (ContinuationImpl) continuation);
    }
}
