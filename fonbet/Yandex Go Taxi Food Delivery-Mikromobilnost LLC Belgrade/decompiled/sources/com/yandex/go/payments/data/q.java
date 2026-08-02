package com.yandex.go.payments.data;

import com.yandex.go.payments.data.model.UnbindPaymentMethodParam;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class q {
    public final UnbindPaymentMethodsApi a;

    public q(UnbindPaymentMethodsApi unbindPaymentMethodsApi) {
        this.a = unbindPaymentMethodsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        UnbindingPaymentMethodsRepository$unbindPaymentMethod$1 unbindingPaymentMethodsRepository$unbindPaymentMethod$1;
        int i;
        try {
            if (continuationImpl instanceof UnbindingPaymentMethodsRepository$unbindPaymentMethod$1) {
                unbindingPaymentMethodsRepository$unbindPaymentMethod$1 = (UnbindingPaymentMethodsRepository$unbindPaymentMethod$1) continuationImpl;
                int i2 = unbindingPaymentMethodsRepository$unbindPaymentMethod$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    unbindingPaymentMethodsRepository$unbindPaymentMethod$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = unbindingPaymentMethodsRepository$unbindPaymentMethod$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = unbindingPaymentMethodsRepository$unbindPaymentMethod$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<zy11> a = this.a.a(new UnbindPaymentMethodParam(str, str2));
                        unbindingPaymentMethodsRepository$unbindPaymentMethod$1.L$0 = null;
                        unbindingPaymentMethodsRepository$unbindPaymentMethod$1.L$1 = null;
                        unbindingPaymentMethodsRepository$unbindPaymentMethod$1.label = 1;
                        if (ru.yandex.taxi.network.api.a.d(a, unbindingPaymentMethodsRepository$unbindPaymentMethod$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        unbindingPaymentMethodsRepository$unbindPaymentMethod$1 = new UnbindingPaymentMethodsRepository$unbindPaymentMethod$1(this, continuationImpl);
        Object obj2 = unbindingPaymentMethodsRepository$unbindPaymentMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unbindingPaymentMethodsRepository$unbindPaymentMethod$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        UnbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1 unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1;
        int i;
        try {
            if (continuationImpl instanceof UnbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1) {
                unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1 = (UnbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1) continuationImpl;
                int i2 = unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<zy11> a = this.a.a(new UnbindPaymentMethodParam(str, str2));
                        unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1.L$0 = null;
                        unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1.L$1 = null;
                        unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1.label = 1;
                        if (ru.yandex.taxi.network.api.a.a(a, null, unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1 = new UnbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1(this, continuationImpl);
        Object obj2 = unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unbindingPaymentMethodsRepository$unbindPaymentMethodWithRetry$1.label;
    }
}
