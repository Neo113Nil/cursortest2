package com.yandex.go.chargers.subscription.domain;

import com.yandex.go.chargers.subscription.data.ChargersSubscriptionApi;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionListFiltersDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionListParamsDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionListResponseDto;
import com.yandex.go.chargers.subscription.domain.model.ChargersPollingRetriesExceededException;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.gua;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.wwg;
import defpackage.zl9;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final h3y a;
    public final gua b;
    public final zl9 c;

    public a(h3y h3yVar, gua guaVar, zl9 zl9Var) {
        this.a = h3yVar;
        this.b = guaVar;
        this.c = zl9Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(2:19|20))(4:54|55|30|(2:47|(2:49|50)(2:51|52))(6:34|(1:35)|38|(1:40)(1:45)|41|(2:43|29)(1:44))))(9:56|57|25|26|(2:28|29)|30|(1:32)|47|(0)(0)))(1:58)|21|(9:23|(2:53|29)|25|26|(0)|30|(0)|47|(0)(0))|14|15))|64|6|7|(0)(0)|21|(0)|14|15|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014c, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014d, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0058, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0133, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0146, code lost:
    
        if (r3.a.emit(new defpackage.wl9(r12), r0) != r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[Catch: all -> 0x0058, CancellationException -> 0x014c, TryCatch #2 {CancellationException -> 0x014c, all -> 0x0058, blocks: (B:20:0x0054, B:21:0x007b, B:23:0x0085, B:26:0x00b7, B:30:0x00ce, B:32:0x00db, B:34:0x00e2, B:35:0x00e4, B:38:0x00fa, B:40:0x0102, B:41:0x0109, B:47:0x011b, B:49:0x0127, B:50:0x012c, B:51:0x012d, B:52:0x0132, B:55:0x0067, B:57:0x0073), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[Catch: all -> 0x0058, CancellationException -> 0x014c, TryCatch #2 {CancellationException -> 0x014c, all -> 0x0058, blocks: (B:20:0x0054, B:21:0x007b, B:23:0x0085, B:26:0x00b7, B:30:0x00ce, B:32:0x00db, B:34:0x00e2, B:35:0x00e4, B:38:0x00fa, B:40:0x0102, B:41:0x0109, B:47:0x011b, B:49:0x0127, B:50:0x012c, B:51:0x012d, B:52:0x0132, B:55:0x0067, B:57:0x0073), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127 A[Catch: all -> 0x0058, CancellationException -> 0x014c, TryCatch #2 {CancellationException -> 0x014c, all -> 0x0058, blocks: (B:20:0x0054, B:21:0x007b, B:23:0x0085, B:26:0x00b7, B:30:0x00ce, B:32:0x00db, B:34:0x00e2, B:35:0x00e4, B:38:0x00fa, B:40:0x0102, B:41:0x0109, B:47:0x011b, B:49:0x0127, B:50:0x012c, B:51:0x012d, B:52:0x0132, B:55:0x0067, B:57:0x0073), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d A[Catch: all -> 0x0058, CancellationException -> 0x014c, TryCatch #2 {CancellationException -> 0x014c, all -> 0x0058, blocks: (B:20:0x0054, B:21:0x007b, B:23:0x0085, B:26:0x00b7, B:30:0x00ce, B:32:0x00db, B:34:0x00e2, B:35:0x00e4, B:38:0x00fa, B:40:0x0102, B:41:0x0109, B:47:0x011b, B:49:0x0127, B:50:0x012c, B:51:0x012d, B:52:0x0132, B:55:0x0067, B:57:0x0073), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0118 -> B:21:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        ChargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1 chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1;
        int i;
        fmt fmtVar;
        ?? r2;
        Object obj;
        Object value;
        ArrayList arrayList2;
        Collection collection;
        ChargersSubscriptionListResponseDto chargersSubscriptionListResponseDto;
        if (continuationImpl instanceof ChargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1) {
            chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1 = (ChargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1) continuationImpl;
            int i2 = chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.label;
                zl9 zl9Var = this.c;
                gua guaVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    arrayList2 = arrayList;
                } else if (i == 1) {
                    Collection collection2 = (List) chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$0;
                    kotlin.b.b(obj2);
                    collection = collection2;
                    r2 = collection;
                    fmtVar = (fmt) obj2;
                    chargersSubscriptionListResponseDto = (ChargersSubscriptionListResponseDto) fmtVar.a;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$0 = r2;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$1 = null;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$2 = fmtVar;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.label = 2;
                    if (zl9Var.a(chargersSubscriptionListResponseDto, chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = fmtVar.a;
                    if (((ChargersSubscriptionListResponseDto) obj).a.isEmpty()) {
                    }
                    if (((ChargersSubscriptionListResponseDto) obj).a.isEmpty()) {
                    }
                } else if (i == 2) {
                    fmtVar = (fmt) chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$2;
                    r2 = (List) chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$0;
                    kotlin.b.b(obj2);
                    obj = fmtVar.a;
                    if (((ChargersSubscriptionListResponseDto) obj).a.isEmpty() || !((ChargersSubscriptionListResponseDto) obj).b) {
                        if (((ChargersSubscriptionListResponseDto) obj).a.isEmpty()) {
                            throw new ChargersPollingRetriesExceededException();
                        }
                        throw new CancellationException();
                    }
                    r0 r0Var = guaVar.a;
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, Integer.valueOf(((Number) value).intValue() + 1)));
                    Long l = wwg.l(fmtVar).b;
                    long longValue = l != null ? l.longValue() : 2000L;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$0 = r2;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$1 = null;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$2 = null;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.label = 3;
                    if (kotlinx.coroutines.a.i(longValue, chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    arrayList2 = r2;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    ?? r13 = (List) chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$0;
                    kotlin.b.b(obj2);
                    arrayList2 = r13;
                }
                if (kotlinx.coroutines.a.p(chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.get_context())) {
                    cmt<ChargersSubscriptionListResponseDto> b = ((ChargersSubscriptionApi) this.a.get()).b(new ChargersSubscriptionListParamsDto(new ChargersSubscriptionListFiltersDto(arrayList2), ((Number) guaVar.a.getValue()).intValue()));
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$0 = arrayList2;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$1 = null;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$2 = null;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.label = 1;
                    obj2 = ru.yandex.taxi.network.api.a.b(b, null, chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1);
                    collection = arrayList2;
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    r2 = collection;
                    fmtVar = (fmt) obj2;
                    chargersSubscriptionListResponseDto = (ChargersSubscriptionListResponseDto) fmtVar.a;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$0 = r2;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$1 = null;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.L$2 = fmtVar;
                    chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.label = 2;
                    if (zl9Var.a(chargersSubscriptionListResponseDto, chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1) == coroutineSingletons) {
                    }
                    obj = fmtVar.a;
                    if (((ChargersSubscriptionListResponseDto) obj).a.isEmpty()) {
                    }
                    if (((ChargersSubscriptionListResponseDto) obj).a.isEmpty()) {
                    }
                }
                return zy11.a;
            }
        }
        chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1 = new ChargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1(this, continuationImpl);
        Object obj22 = chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.label;
        zl9 zl9Var2 = this.c;
        gua guaVar2 = this.b;
        if (i != 0) {
        }
        if (kotlinx.coroutines.a.p(chargersActiveSubscriptionsInteractor$pollActiveSubscriptions$1.get_context())) {
        }
        return zy11.a;
    }
}
