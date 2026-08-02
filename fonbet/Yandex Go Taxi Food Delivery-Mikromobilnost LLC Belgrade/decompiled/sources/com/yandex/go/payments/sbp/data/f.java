package com.yandex.go.payments.sbp.data;

import com.yandex.go.payments.sbp.data.model.SbpTokenHomeResponse;
import defpackage.cmt;
import defpackage.ny61;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f {
    public final SbpTokenApi a;
    public volatile SbpTokenHomeResponse b = new SbpTokenHomeResponse(0);

    public f(SbpTokenApi sbpTokenApi) {
        this.a = sbpTokenApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SbpHomeBanksRepository$updateSbpTokenHomeInfo$1 sbpHomeBanksRepository$updateSbpTokenHomeInfo$1;
        int i;
        try {
            if (continuationImpl instanceof SbpHomeBanksRepository$updateSbpTokenHomeInfo$1) {
                sbpHomeBanksRepository$updateSbpTokenHomeInfo$1 = (SbpHomeBanksRepository$updateSbpTokenHomeInfo$1) continuationImpl;
                int i2 = sbpHomeBanksRepository$updateSbpTokenHomeInfo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sbpHomeBanksRepository$updateSbpTokenHomeInfo$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sbpHomeBanksRepository$updateSbpTokenHomeInfo$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sbpHomeBanksRepository$updateSbpTokenHomeInfo$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<SbpTokenHomeResponse> a = this.a.a();
                        sbpHomeBanksRepository$updateSbpTokenHomeInfo$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(a, sbpHomeBanksRepository$updateSbpTokenHomeInfo$1);
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
                    SbpTokenHomeResponse sbpTokenHomeResponse = (SbpTokenHomeResponse) obj;
                    this.b = sbpTokenHomeResponse;
                    return sbpTokenHomeResponse;
                }
            }
            if (i != 0) {
            }
            SbpTokenHomeResponse sbpTokenHomeResponse2 = (SbpTokenHomeResponse) obj;
            this.b = sbpTokenHomeResponse2;
            return sbpTokenHomeResponse2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        sbpHomeBanksRepository$updateSbpTokenHomeInfo$1 = new SbpHomeBanksRepository$updateSbpTokenHomeInfo$1(this, continuationImpl);
        Object obj2 = sbpHomeBanksRepository$updateSbpTokenHomeInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpHomeBanksRepository$updateSbpTokenHomeInfo$1.label;
    }
}
