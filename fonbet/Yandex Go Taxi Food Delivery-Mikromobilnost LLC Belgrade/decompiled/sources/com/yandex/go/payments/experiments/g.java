package com.yandex.go.payments.experiments;

import com.yandex.go.payments.experiments.PaymentMethodsServiceExperiment;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g {
    public final t1b0 a;

    public g(rqo rqoVar) {
        PaymentMethodsServiceExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(PaymentMethodsServiceExperiment.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PaymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1 paymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1;
        int i;
        PaymentMethodsServiceExperiment paymentMethodsServiceExperiment;
        if (continuationImpl instanceof PaymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1) {
            paymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1 = (PaymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1) continuationImpl;
            int i2 = paymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1.label = 1;
                    obj = this.a.b(paymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1);
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
                paymentMethodsServiceExperiment = (PaymentMethodsServiceExperiment) obj;
                PaymentMethodsServiceExperiment.PaymentMethodsService paymentMethodsService = new PaymentMethodsServiceExperiment.PaymentMethodsService(PaymentMethodsServiceExperiment.LpmEntryPoint.DEBTS, PaymentMethodsServiceExperiment.ServiceEndpoint.LIST_PAYMENT_METHODS);
                if (paymentMethodsServiceExperiment.b) {
                    List list = paymentMethodsServiceExperiment.c;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (jl40.l((PaymentMethodsServiceExperiment.PaymentMethodsService) it.next(), paymentMethodsService)) {
                                break;
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        paymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1 = new PaymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1(this, continuationImpl);
        Object obj2 = paymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsServiceExperimentRepository$isLpmForDebtEnabled$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        paymentMethodsServiceExperiment = (PaymentMethodsServiceExperiment) obj2;
        PaymentMethodsServiceExperiment.PaymentMethodsService paymentMethodsService2 = new PaymentMethodsServiceExperiment.PaymentMethodsService(PaymentMethodsServiceExperiment.LpmEntryPoint.DEBTS, PaymentMethodsServiceExperiment.ServiceEndpoint.LIST_PAYMENT_METHODS);
        if (paymentMethodsServiceExperiment.b) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PaymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1 paymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1;
        int i;
        PaymentMethodsServiceExperiment paymentMethodsServiceExperiment;
        if (continuationImpl instanceof PaymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1) {
            paymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1 = (PaymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1) continuationImpl;
            int i2 = paymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1.label = 1;
                    obj = this.a.b(paymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1);
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
                paymentMethodsServiceExperiment = (PaymentMethodsServiceExperiment) obj;
                PaymentMethodsServiceExperiment.PaymentMethodsService paymentMethodsService = new PaymentMethodsServiceExperiment.PaymentMethodsService(PaymentMethodsServiceExperiment.LpmEntryPoint.PROFILE, PaymentMethodsServiceExperiment.ServiceEndpoint.LIST_PAYMENT_METHODS);
                if (paymentMethodsServiceExperiment.b) {
                    List list = paymentMethodsServiceExperiment.c;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (jl40.l((PaymentMethodsServiceExperiment.PaymentMethodsService) it.next(), paymentMethodsService)) {
                                break;
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        paymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1 = new PaymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1(this, continuationImpl);
        Object obj2 = paymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsServiceExperimentRepository$isLpmForMenuEnabled$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        paymentMethodsServiceExperiment = (PaymentMethodsServiceExperiment) obj2;
        PaymentMethodsServiceExperiment.PaymentMethodsService paymentMethodsService2 = new PaymentMethodsServiceExperiment.PaymentMethodsService(PaymentMethodsServiceExperiment.LpmEntryPoint.PROFILE, PaymentMethodsServiceExperiment.ServiceEndpoint.LIST_PAYMENT_METHODS);
        if (paymentMethodsServiceExperiment.b) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PaymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1 paymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1;
        int i;
        PaymentMethodsServiceExperiment paymentMethodsServiceExperiment;
        if (continuationImpl instanceof PaymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1) {
            paymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1 = (PaymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1) continuationImpl;
            int i2 = paymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1.label = 1;
                    obj = this.a.b(paymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1);
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
                paymentMethodsServiceExperiment = (PaymentMethodsServiceExperiment) obj;
                PaymentMethodsServiceExperiment.PaymentMethodsService paymentMethodsService = new PaymentMethodsServiceExperiment.PaymentMethodsService(PaymentMethodsServiceExperiment.LpmEntryPoint.RIDE, PaymentMethodsServiceExperiment.ServiceEndpoint.LIST_PAYMENT_METHODS);
                if (paymentMethodsServiceExperiment.b) {
                    List list = paymentMethodsServiceExperiment.c;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (jl40.l((PaymentMethodsServiceExperiment.PaymentMethodsService) it.next(), paymentMethodsService)) {
                                break;
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        paymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1 = new PaymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1(this, continuationImpl);
        Object obj2 = paymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsServiceExperimentRepository$isLpmForRideEnabled$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        paymentMethodsServiceExperiment = (PaymentMethodsServiceExperiment) obj2;
        PaymentMethodsServiceExperiment.PaymentMethodsService paymentMethodsService2 = new PaymentMethodsServiceExperiment.PaymentMethodsService(PaymentMethodsServiceExperiment.LpmEntryPoint.RIDE, PaymentMethodsServiceExperiment.ServiceEndpoint.LIST_PAYMENT_METHODS);
        if (paymentMethodsServiceExperiment.b) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
