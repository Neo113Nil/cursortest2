package com.yandex.go.payments.domain;

import com.yandex.go.payments.data.model.PaymentMethodsBankIcons;
import defpackage.am2;
import defpackage.auu0;
import defpackage.eex;
import defpackage.jju0;
import defpackage.k8u;
import defpackage.ny61;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class z {
    public final com.yandex.go.utils.storage.json.b a;
    public final com.yandex.go.utils.storage.json.b b;

    public z(eex eexVar) {
        String str = "payment-methods";
        am2 am2Var = new am2(str, "banks_icons", kotlin.collections.b.f());
        auu0 auu0Var = auu0.a;
        KSerializer serializer = PaymentMethodsBankIcons.Companion.serializer();
        eexVar.getClass();
        this.a = eexVar.c(am2Var, new k8u(auu0Var, serializer, 1));
        this.b = eexVar.c(new am2(str, "banks_icons_url", ""), auu0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PaymentMethodsBanksIconsStorage$banksIcons$1 paymentMethodsBanksIconsStorage$banksIcons$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsBanksIconsStorage$banksIcons$1) {
            paymentMethodsBanksIconsStorage$banksIcons$1 = (PaymentMethodsBanksIconsStorage$banksIcons$1) continuationImpl;
            int i2 = paymentMethodsBanksIconsStorage$banksIcons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsBanksIconsStorage$banksIcons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsBanksIconsStorage$banksIcons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsBanksIconsStorage$banksIcons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsBanksIconsStorage$banksIcons$1.label = 1;
                    obj = this.a.e(paymentMethodsBanksIconsStorage$banksIcons$1);
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
                return ((jju0) obj).a();
            }
        }
        paymentMethodsBanksIconsStorage$banksIcons$1 = new PaymentMethodsBanksIconsStorage$banksIcons$1(this, continuationImpl);
        Object obj2 = paymentMethodsBanksIconsStorage$banksIcons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBanksIconsStorage$banksIcons$1.label;
        if (i != 0) {
        }
        return ((jju0) obj2).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PaymentMethodsBanksIconsStorage$url$1 paymentMethodsBanksIconsStorage$url$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsBanksIconsStorage$url$1) {
            paymentMethodsBanksIconsStorage$url$1 = (PaymentMethodsBanksIconsStorage$url$1) continuationImpl;
            int i2 = paymentMethodsBanksIconsStorage$url$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsBanksIconsStorage$url$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsBanksIconsStorage$url$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsBanksIconsStorage$url$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsBanksIconsStorage$url$1.label = 1;
                    obj = this.b.e(paymentMethodsBanksIconsStorage$url$1);
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
                return ((jju0) obj).a();
            }
        }
        paymentMethodsBanksIconsStorage$url$1 = new PaymentMethodsBanksIconsStorage$url$1(this, continuationImpl);
        Object obj2 = paymentMethodsBanksIconsStorage$url$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBanksIconsStorage$url$1.label;
        if (i != 0) {
        }
        return ((jju0) obj2).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r6.a.d(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Map map, ContinuationImpl continuationImpl) {
        PaymentMethodsBanksIconsStorage$write$1 paymentMethodsBanksIconsStorage$write$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsBanksIconsStorage$write$1) {
            paymentMethodsBanksIconsStorage$write$1 = (PaymentMethodsBanksIconsStorage$write$1) continuationImpl;
            int i2 = paymentMethodsBanksIconsStorage$write$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsBanksIconsStorage$write$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsBanksIconsStorage$write$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsBanksIconsStorage$write$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsBanksIconsStorage$write$1.L$0 = null;
                    paymentMethodsBanksIconsStorage$write$1.L$1 = str;
                    paymentMethodsBanksIconsStorage$write$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) paymentMethodsBanksIconsStorage$write$1.L$1;
                    kotlin.b.b(obj);
                }
                paymentMethodsBanksIconsStorage$write$1.L$0 = null;
                paymentMethodsBanksIconsStorage$write$1.L$1 = null;
                paymentMethodsBanksIconsStorage$write$1.label = 2;
                Object d = this.b.d(str, paymentMethodsBanksIconsStorage$write$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        paymentMethodsBanksIconsStorage$write$1 = new PaymentMethodsBanksIconsStorage$write$1(this, continuationImpl);
        Object obj2 = paymentMethodsBanksIconsStorage$write$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBanksIconsStorage$write$1.label;
        if (i != 0) {
        }
        paymentMethodsBanksIconsStorage$write$1.L$0 = null;
        paymentMethodsBanksIconsStorage$write$1.L$1 = null;
        paymentMethodsBanksIconsStorage$write$1.label = 2;
        Object d2 = this.b.d(str, paymentMethodsBanksIconsStorage$write$1);
        if (d2 != coroutineSingletons2) {
        }
    }
}
