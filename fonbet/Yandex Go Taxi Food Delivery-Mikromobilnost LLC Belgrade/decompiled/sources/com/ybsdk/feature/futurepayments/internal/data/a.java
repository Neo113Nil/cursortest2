package com.ybsdk.feature.futurepayments.internal.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.divkit.api.dto.DivScreenDto;
import com.ybsdk.feature.futurepayments.internal.network.FuturePaymentsApi;
import defpackage.g8e;
import defpackage.kqs;
import defpackage.ny61;
import defpackage.rr51;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final FuturePaymentsApi a;

    public a(FuturePaymentsApi futurePaymentsApi) {
        this.a = futurePaymentsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, DivScreenDto divScreenDto, ContinuationImpl continuationImpl) {
        FuturePaymentsRepository$toFuturePaymentsEntity$1 futurePaymentsRepository$toFuturePaymentsEntity$1;
        int i;
        Object b;
        aVar.getClass();
        if (continuationImpl instanceof FuturePaymentsRepository$toFuturePaymentsEntity$1) {
            futurePaymentsRepository$toFuturePaymentsEntity$1 = (FuturePaymentsRepository$toFuturePaymentsEntity$1) continuationImpl;
            int i2 = futurePaymentsRepository$toFuturePaymentsEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                futurePaymentsRepository$toFuturePaymentsEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = futurePaymentsRepository$toFuturePaymentsEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = futurePaymentsRepository$toFuturePaymentsEntity$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar2 = new com.ybsdk.feature.divkit.api.domain.a(null);
                    DivDataDto divData = divScreenDto.getDivData();
                    futurePaymentsRepository$toFuturePaymentsEntity$1.L$0 = divScreenDto;
                    futurePaymentsRepository$toFuturePaymentsEntity$1.label = 1;
                    b = aVar2.b(divData, futurePaymentsRepository$toFuturePaymentsEntity$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    divScreenDto = (DivScreenDto) futurePaymentsRepository$toFuturePaymentsEntity$1.L$0;
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    return b;
                }
                rr51 rr51Var = (rr51) b;
                com.ybsdk.core.utils.text.b bVar = Text.Companion;
                String title = divScreenDto.getTitle();
                if (title == null) {
                    title = "";
                }
                return new kqs(g8e.i(bVar, title), rr51Var, divScreenDto.getAnalyticParameters());
            }
        }
        futurePaymentsRepository$toFuturePaymentsEntity$1 = new FuturePaymentsRepository$toFuturePaymentsEntity$1(aVar, continuationImpl);
        Object obj2 = futurePaymentsRepository$toFuturePaymentsEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = futurePaymentsRepository$toFuturePaymentsEntity$1.label;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        FuturePaymentsRepository$getFuturePaymentsScreen$1 futurePaymentsRepository$getFuturePaymentsScreen$1;
        int i;
        if (continuationImpl instanceof FuturePaymentsRepository$getFuturePaymentsScreen$1) {
            futurePaymentsRepository$getFuturePaymentsScreen$1 = (FuturePaymentsRepository$getFuturePaymentsScreen$1) continuationImpl;
            int i2 = futurePaymentsRepository$getFuturePaymentsScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                futurePaymentsRepository$getFuturePaymentsScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = futurePaymentsRepository$getFuturePaymentsScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = futurePaymentsRepository$getFuturePaymentsScreen$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                FuturePaymentsRepository$getFuturePaymentsScreen$2 futurePaymentsRepository$getFuturePaymentsScreen$2 = new FuturePaymentsRepository$getFuturePaymentsScreen$2(this, null);
                futurePaymentsRepository$getFuturePaymentsScreen$1.label = 1;
                Object c = c.c(futurePaymentsRepository$getFuturePaymentsScreen$2, futurePaymentsRepository$getFuturePaymentsScreen$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        futurePaymentsRepository$getFuturePaymentsScreen$1 = new FuturePaymentsRepository$getFuturePaymentsScreen$1(this, continuationImpl);
        Object obj2 = futurePaymentsRepository$getFuturePaymentsScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = futurePaymentsRepository$getFuturePaymentsScreen$1.label;
        if (i == 0) {
        }
    }
}
