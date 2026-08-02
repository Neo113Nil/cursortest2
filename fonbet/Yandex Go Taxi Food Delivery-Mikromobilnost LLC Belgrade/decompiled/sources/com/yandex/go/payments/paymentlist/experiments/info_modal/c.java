package com.yandex.go.payments.paymentlist.experiments.info_modal;

import com.yandex.go.payments.paymentlist.experiments.info_modal.PaymentMethodSelectionInfoModalExperiment;
import defpackage.d6z;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.tsj0;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class c {
    public final q a;

    public c(rqo rqoVar) {
        PaymentMethodSelectionInfoModalExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(PaymentMethodSelectionInfoModalExperiment.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PaymentMethod$Type paymentMethod$Type, ContinuationImpl continuationImpl) {
        PaymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1 paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1;
        int i;
        PaymentMethodSelectionInfoModalExperiment paymentMethodSelectionInfoModalExperiment;
        Object obj;
        if (continuationImpl instanceof PaymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1) {
            paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1 = (PaymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1) continuationImpl;
            int i2 = paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1.L$0 = paymentMethod$Type;
                    paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1.label = 1;
                    obj2 = this.a.b(paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    paymentMethod$Type = (PaymentMethod$Type) paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1.L$0;
                    kotlin.b.b(obj2);
                }
                paymentMethodSelectionInfoModalExperiment = (PaymentMethodSelectionInfoModalExperiment) obj2;
                if (paymentMethodSelectionInfoModalExperiment.b) {
                    Iterator it = paymentMethodSelectionInfoModalExperiment.d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((PaymentMethodSelectionInfoModalExperiment.ModalDescription) obj).getE(), paymentMethod$Type.getCode())) {
                            break;
                        }
                    }
                    PaymentMethodSelectionInfoModalExperiment.ModalDescription modalDescription = (PaymentMethodSelectionInfoModalExperiment.ModalDescription) obj;
                    if (modalDescription != null && d6z.Z(paymentMethodSelectionInfoModalExperiment, modalDescription.getA()) && d6z.Z(paymentMethodSelectionInfoModalExperiment, modalDescription.getB()) && d6z.Z(paymentMethodSelectionInfoModalExperiment, modalDescription.getC())) {
                        return new tsj0(d6z.Y(paymentMethodSelectionInfoModalExperiment, modalDescription.getA()), d6z.Y(paymentMethodSelectionInfoModalExperiment, modalDescription.getB()), d6z.Y(paymentMethodSelectionInfoModalExperiment, modalDescription.getC()), modalDescription.getD(), modalDescription.getE());
                    }
                }
                return null;
            }
        }
        paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1 = new PaymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1(this, continuationImpl);
        Object obj22 = paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodSelectionInfoModalExperimentProvider$getModalDescription$1.label;
        if (i != 0) {
        }
        paymentMethodSelectionInfoModalExperiment = (PaymentMethodSelectionInfoModalExperiment) obj22;
        if (paymentMethodSelectionInfoModalExperiment.b) {
        }
        return null;
    }
}
