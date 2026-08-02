package com.yandex.go.payments.acceptance.data;

import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentCancelRequest;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentStartRequest;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentStatusResponse;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.kud;
import defpackage.lud;
import defpackage.ny61;
import defpackage.r1e0;
import defpackage.wwg;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final AcceptancePaymentApi a;

    public a(AcceptancePaymentApi acceptancePaymentApi) {
        this.a = acceptancePaymentApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        AcceptancePaymentRepository$cancel$1 acceptancePaymentRepository$cancel$1;
        int i;
        if (continuationImpl instanceof AcceptancePaymentRepository$cancel$1) {
            acceptancePaymentRepository$cancel$1 = (AcceptancePaymentRepository$cancel$1) continuationImpl;
            int i2 = acceptancePaymentRepository$cancel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acceptancePaymentRepository$cancel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = acceptancePaymentRepository$cancel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = acceptancePaymentRepository$cancel$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<zy11> a = this.a.a(new AcceptancePaymentCancelRequest(str));
                    acceptancePaymentRepository$cancel$1.L$0 = null;
                    acceptancePaymentRepository$cancel$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.b(a, null, acceptancePaymentRepository$cancel$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        acceptancePaymentRepository$cancel$1 = new AcceptancePaymentRepository$cancel$1(this, continuationImpl);
        Object obj2 = acceptancePaymentRepository$cancel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = acceptancePaymentRepository$cancel$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[Catch: all -> 0x0066, CancellationException -> 0x006d, TryCatch #2 {CancellationException -> 0x006d, all -> 0x0066, blocks: (B:11:0x0028, B:12:0x0046, B:14:0x004e, B:15:0x0050, B:22:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        AcceptancePaymentRepository$getStatus$1 acceptancePaymentRepository$getStatus$1;
        int i;
        try {
            if (continuationImpl instanceof AcceptancePaymentRepository$getStatus$1) {
                acceptancePaymentRepository$getStatus$1 = (AcceptancePaymentRepository$getStatus$1) continuationImpl;
                int i2 = acceptancePaymentRepository$getStatus$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    acceptancePaymentRepository$getStatus$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = acceptancePaymentRepository$getStatus$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = acceptancePaymentRepository$getStatus$1.label;
                    if (i != 0) {
                        b.b(obj);
                        cmt<AcceptancePaymentStatusResponse> c = this.a.c(str);
                        acceptancePaymentRepository$getStatus$1.L$0 = null;
                        acceptancePaymentRepository$getStatus$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(c, null, acceptancePaymentRepository$getStatus$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    fmt fmtVar = (fmt) obj;
                    r1e0 n = wwg.n(fmtVar);
                    Long l = n != null ? n.b : null;
                    Object obj2 = fmtVar.a;
                    return new lud(((AcceptancePaymentStatusResponse) obj2).a, ((AcceptancePaymentStatusResponse) obj2).b, ((AcceptancePaymentStatusResponse) obj2).c, l);
                }
            }
            if (i != 0) {
            }
            fmt fmtVar2 = (fmt) obj;
            r1e0 n2 = wwg.n(fmtVar2);
            if (n2 != null) {
            }
            Object obj22 = fmtVar2.a;
            return new lud(((AcceptancePaymentStatusResponse) obj22).a, ((AcceptancePaymentStatusResponse) obj22).b, ((AcceptancePaymentStatusResponse) obj22).c, l);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new kud(th);
        }
        acceptancePaymentRepository$getStatus$1 = new AcceptancePaymentRepository$getStatus$1(this, continuationImpl);
        Object obj3 = acceptancePaymentRepository$getStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = acceptancePaymentRepository$getStatus$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        AcceptancePaymentRepository$start$1 acceptancePaymentRepository$start$1;
        int i;
        if (continuationImpl instanceof AcceptancePaymentRepository$start$1) {
            acceptancePaymentRepository$start$1 = (AcceptancePaymentRepository$start$1) continuationImpl;
            int i2 = acceptancePaymentRepository$start$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acceptancePaymentRepository$start$1.label = i2 - Integer.MIN_VALUE;
                Object obj = acceptancePaymentRepository$start$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = acceptancePaymentRepository$start$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<zy11> b = this.a.b(new AcceptancePaymentStartRequest(str));
                    acceptancePaymentRepository$start$1.L$0 = null;
                    acceptancePaymentRepository$start$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.b(b, null, acceptancePaymentRepository$start$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        acceptancePaymentRepository$start$1 = new AcceptancePaymentRepository$start$1(this, continuationImpl);
        Object obj2 = acceptancePaymentRepository$start$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = acceptancePaymentRepository$start$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
