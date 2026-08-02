package com.yandex.go.chargers.offer.passes.domain;

import com.yandex.go.chargers.offer.passes.data.g;
import com.yandex.go.chargers.offer.passes.data.model.PassPayment;
import com.yandex.go.chargers.offer.passes.data.model.PassPaymentType;
import com.yandex.go.chargers.offer.passes.data.model.PassPurchaseParams;
import com.yandex.go.chargers.offer.passes.domain.models.ChargersNoSelectedPaymentMethodException;
import defpackage.e2e0;
import defpackage.g8e;
import defpackage.m6a0;
import defpackage.nfa;
import defpackage.ny61;
import defpackage.ofa;
import defpackage.whb1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes12.dex */
public final class a {
    public final e2e0 a;
    public final g b;
    public final com.yandex.go.chargers.payments.data.a c;

    public a(e2e0 e2e0Var, g gVar, com.yandex.go.chargers.payments.data.a aVar) {
        this.a = e2e0Var;
        this.b = gVar;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        ChargersPassesInteractor$purchasePass$1 chargersPassesInteractor$purchasePass$1;
        int i;
        PassPaymentType passPaymentType;
        if (continuationImpl instanceof ChargersPassesInteractor$purchasePass$1) {
            chargersPassesInteractor$purchasePass$1 = (ChargersPassesInteractor$purchasePass$1) continuationImpl;
            int i2 = chargersPassesInteractor$purchasePass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesInteractor$purchasePass$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesInteractor$purchasePass$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesInteractor$purchasePass$1.label;
                if (i != 0) {
                    b.b(obj);
                    m6a0 d = this.c.c().d();
                    if (d == null) {
                        throw new ChargersNoSelectedPaymentMethodException();
                    }
                    chargersPassesInteractor$purchasePass$1.L$0 = null;
                    chargersPassesInteractor$purchasePass$1.L$1 = null;
                    chargersPassesInteractor$purchasePass$1.L$2 = null;
                    chargersPassesInteractor$purchasePass$1.I$0 = 1;
                    chargersPassesInteractor$purchasePass$1.label = 1;
                    g gVar = this.b;
                    ((ofa) gVar.b.a).getClass();
                    String str3 = d.b;
                    PaymentMethod$Type paymentMethod$Type = d.a;
                    int i3 = paymentMethod$Type == null ? -1 : nfa.a[paymentMethod$Type.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        passPaymentType = PassPaymentType.CARD;
                    } else if (i3 == 3) {
                        passPaymentType = PassPaymentType.GOOGLE_PAY;
                    } else {
                        if (i3 != 4) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Only payment types card, GOOGLE_PAY and corp methods are available her. Incoming type is: " + paymentMethod$Type);
                            whb1.c(null, illegalArgumentException);
                            throw illegalArgumentException;
                        }
                        passPaymentType = PassPaymentType.CORP;
                    }
                    obj = gVar.c(new PassPurchaseParams(str, new PassPayment(passPaymentType, str3), g8e.o("chargers-", str2), Boolean.TRUE), chargersPassesInteractor$purchasePass$1);
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
                String str4 = (String) obj;
                this.a.d("SUPER_PASS_PURCHASING_POLLING_SERVICE", str4);
                return str4;
            }
        }
        chargersPassesInteractor$purchasePass$1 = new ChargersPassesInteractor$purchasePass$1(this, continuationImpl);
        Object obj2 = chargersPassesInteractor$purchasePass$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesInteractor$purchasePass$1.label;
        if (i != 0) {
        }
        String str42 = (String) obj2;
        this.a.d("SUPER_PASS_PURCHASING_POLLING_SERVICE", str42);
        return str42;
    }
}
