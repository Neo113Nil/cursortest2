package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.savings.internal.network.SavingsApi;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final SavingsApi a;

    public a(SavingsApi savingsApi) {
        this.a = savingsApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DiffRateCalendarRepository$getDiffRateCalendar$1 diffRateCalendarRepository$getDiffRateCalendar$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof DiffRateCalendarRepository$getDiffRateCalendar$1) {
            diffRateCalendarRepository$getDiffRateCalendar$1 = (DiffRateCalendarRepository$getDiffRateCalendar$1) continuationImpl;
            int i2 = diffRateCalendarRepository$getDiffRateCalendar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diffRateCalendarRepository$getDiffRateCalendar$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diffRateCalendarRepository$getDiffRateCalendar$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diffRateCalendarRepository$getDiffRateCalendar$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DiffRateCalendarRepository$getDiffRateCalendar$2 diffRateCalendarRepository$getDiffRateCalendar$2 = new DiffRateCalendarRepository$getDiffRateCalendar$2(this, null);
                    diffRateCalendarRepository$getDiffRateCalendar$1.label = 1;
                    c = c.c(diffRateCalendarRepository$getDiffRateCalendar$2, diffRateCalendarRepository$getDiffRateCalendar$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                DiffRateCalendarRepository$getDiffRateCalendar$3$1 diffRateCalendarRepository$getDiffRateCalendar$3$1 = new DiffRateCalendarRepository$getDiffRateCalendar$3$1(2, null);
                diffRateCalendarRepository$getDiffRateCalendar$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, diffRateCalendarRepository$getDiffRateCalendar$3$1, diffRateCalendarRepository$getDiffRateCalendar$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        diffRateCalendarRepository$getDiffRateCalendar$1 = new DiffRateCalendarRepository$getDiffRateCalendar$1(this, continuationImpl);
        Object obj2 = diffRateCalendarRepository$getDiffRateCalendar$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diffRateCalendarRepository$getDiffRateCalendar$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
