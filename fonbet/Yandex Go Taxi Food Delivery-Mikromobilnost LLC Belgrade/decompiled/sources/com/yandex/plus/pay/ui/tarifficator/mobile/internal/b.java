package com.yandex.plus.pay.ui.tarifficator.mobile.internal;

import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.PlusTarifficatorMobileArguments;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.PlusTarifficatorMobileResult;
import com.yandex.plus.pay.ui.tarifficator.api.PlusTarifficatorScreen;
import defpackage.apd0;
import defpackage.c60;
import defpackage.eia0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.w511;
import defpackage.wnd0;
import defpackage.yod0;
import defpackage.zod0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b {
    public final String a;
    public final c60 b;

    public b(String str, c60 c60Var) {
        this.a = str;
        this.b = c60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, wnd0 wnd0Var, ContinuationImpl continuationImpl) {
        PaymentScenarioManager$startPaymentScenario$1 paymentScenarioManager$startPaymentScenario$1;
        int i;
        PlusTarifficatorMobileArguments.PreferredMode preferredMode;
        Object b;
        PlusTarifficatorMobileArguments.Screen screen;
        PlusTarifficatorMobileResult plusTarifficatorMobileResult;
        if (continuationImpl instanceof PaymentScenarioManager$startPaymentScenario$1) {
            paymentScenarioManager$startPaymentScenario$1 = (PaymentScenarioManager$startPaymentScenario$1) continuationImpl;
            int i2 = paymentScenarioManager$startPaymentScenario$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentScenarioManager$startPaymentScenario$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentScenarioManager$startPaymentScenario$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentScenarioManager$startPaymentScenario$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    UUID randomUUID = UUID.randomUUID();
                    Map map = wnd0Var.b;
                    EmptySet emptySet = EmptySet.a;
                    ArrayList arrayList = new ArrayList(tcc.n(emptySet, 10));
                    Iterator<E> it = emptySet.iterator();
                    while (it.hasNext()) {
                        int i3 = eia0.a[((PlusTarifficatorScreen) it.next()).ordinal()];
                        if (i3 == 1) {
                            screen = PlusTarifficatorMobileArguments.Screen.UPSALE;
                        } else if (i3 == 2) {
                            screen = PlusTarifficatorMobileArguments.Screen.FAMILY;
                        } else if (i3 == 3) {
                            screen = PlusTarifficatorMobileArguments.Screen.CONTACTS;
                        } else if (i3 == 4) {
                            screen = PlusTarifficatorMobileArguments.Screen.SUCCESS;
                        } else {
                            if (i3 != 5) {
                                w511.b();
                                return null;
                            }
                            screen = PlusTarifficatorMobileArguments.Screen.ERROR;
                        }
                        arrayList.add(screen);
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList);
                    int i4 = eia0.b[wnd0Var.a.ordinal()];
                    if (i4 == 1) {
                        preferredMode = PlusTarifficatorMobileArguments.PreferredMode.SILENT;
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        preferredMode = PlusTarifficatorMobileArguments.PreferredMode.DEFAULT;
                    }
                    PlusTarifficatorMobileArguments plusTarifficatorMobileArguments = new PlusTarifficatorMobileArguments(randomUUID, offer, plusPayPaymentAnalyticsParams, map, N0, preferredMode, null);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.a aVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.a(this.a);
                    paymentScenarioManager$startPaymentScenario$1.L$0 = null;
                    paymentScenarioManager$startPaymentScenario$1.L$1 = null;
                    paymentScenarioManager$startPaymentScenario$1.L$2 = null;
                    paymentScenarioManager$startPaymentScenario$1.L$3 = null;
                    paymentScenarioManager$startPaymentScenario$1.label = 1;
                    b = this.b.b(aVar, plusTarifficatorMobileArguments, paymentScenarioManager$startPaymentScenario$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                plusTarifficatorMobileResult = (PlusTarifficatorMobileResult) b;
                if (plusTarifficatorMobileResult != null) {
                    return new yod0();
                }
                if (plusTarifficatorMobileResult instanceof PlusTarifficatorMobileResult.PaymentError) {
                    PlusTarifficatorMobileResult.PaymentError paymentError = (PlusTarifficatorMobileResult.PaymentError) plusTarifficatorMobileResult;
                    return new zod0(paymentError.getReason(), paymentError.getErrorScreenSkipped());
                }
                if (plusTarifficatorMobileResult instanceof PlusTarifficatorMobileResult.PaymentSuccess) {
                    return new apd0(((PlusTarifficatorMobileResult.PaymentSuccess) plusTarifficatorMobileResult).getSuccessScreenSkipped());
                }
                if (plusTarifficatorMobileResult instanceof PlusTarifficatorMobileResult.PaymentCancel) {
                    return new yod0();
                }
                w511.b();
                return null;
            }
        }
        paymentScenarioManager$startPaymentScenario$1 = new PaymentScenarioManager$startPaymentScenario$1(this, continuationImpl);
        Object obj2 = paymentScenarioManager$startPaymentScenario$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentScenarioManager$startPaymentScenario$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        plusTarifficatorMobileResult = (PlusTarifficatorMobileResult) b;
        if (plusTarifficatorMobileResult != null) {
        }
    }
}
