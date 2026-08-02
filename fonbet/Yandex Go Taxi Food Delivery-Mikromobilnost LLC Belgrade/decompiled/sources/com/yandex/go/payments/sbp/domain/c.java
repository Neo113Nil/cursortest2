package com.yandex.go.payments.sbp.domain;

import com.yandex.go.payments.sbp.data.f;
import defpackage.ny61;
import defpackage.tt2;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class c {
    public final f a;
    public final tt2 b;

    public c(f fVar, tt2 tt2Var) {
        this.a = fVar;
        this.b = tt2Var;
    }

    public final n a(ArrayList arrayList, n0 n0Var) {
        return new n(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.p(n0Var, 500L), new SbpHomeSearchBankInteractor$getFilteredBanksFlow$1(this, arrayList, null)), new SbpHomeSearchBankInteractor$getFilteredBanksFlow$2(arrayList, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1 sbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1;
        int i;
        if (continuationImpl instanceof SbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1) {
            sbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1 = (SbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1) continuationImpl;
            int i2 = sbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1.label = 1;
                    Object a = this.a.a(sbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        sbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1 = new SbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1(this, continuationImpl);
        Object obj2 = sbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpHomeSearchBankInteractor$updateSbpTokenHomeInfo$1.label;
        if (i != 0) {
        }
    }
}
