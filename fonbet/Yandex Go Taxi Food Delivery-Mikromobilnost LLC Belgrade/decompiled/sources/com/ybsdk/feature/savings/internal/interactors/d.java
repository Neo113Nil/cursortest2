package com.ybsdk.feature.savings.internal.interactors;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import defpackage.ny61;
import defpackage.x6m0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class d {
    public final com.ybsdk.feature.savings.internal.data.b a;
    public MoneyEntity b;

    public d(com.ybsdk.feature.savings.internal.data.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        SavingsAccountInteractor$getInfo$1 savingsAccountInteractor$getInfo$1;
        int i;
        Object c;
        if (continuationImpl instanceof SavingsAccountInteractor$getInfo$1) {
            savingsAccountInteractor$getInfo$1 = (SavingsAccountInteractor$getInfo$1) continuationImpl;
            int i2 = savingsAccountInteractor$getInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsAccountInteractor$getInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsAccountInteractor$getInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsAccountInteractor$getInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    savingsAccountInteractor$getInfo$1.label = 1;
                    c = this.a.c(str, savingsAccountInteractor$getInfo$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    this.b = ((x6m0) c).j;
                }
                return c;
            }
        }
        savingsAccountInteractor$getInfo$1 = new SavingsAccountInteractor$getInfo$1(this, continuationImpl);
        Object obj2 = savingsAccountInteractor$getInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsAccountInteractor$getInfo$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
        return c;
    }
}
