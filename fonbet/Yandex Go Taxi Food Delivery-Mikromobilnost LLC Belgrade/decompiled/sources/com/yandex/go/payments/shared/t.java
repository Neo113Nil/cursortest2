package com.yandex.go.payments.shared;

import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.data.model.response.SharedAccount;
import defpackage.e4a0;
import defpackage.fga0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.xnr0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ v b;

    public t(vpr vprVar, v vVar) {
        this.a = vprVar;
        this.b = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1 sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1;
        int i;
        boolean z;
        if (continuation instanceof SharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1) {
            sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1 = (SharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1) continuation;
            int i2 = sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((PaymentMethods) obj).f.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        SharedAccount sharedAccount = (SharedAccount) obj3;
                        fga0 fga0Var = this.b.b;
                        if (!sharedAccount.getG()) {
                            e4a0 c = fga0Var.c();
                            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.SHARED;
                            if (c != paymentMethod$Type || !jl40.l(sharedAccount.i(), fga0Var.q(paymentMethod$Type))) {
                                z = fga0Var.a.n(fga0Var.x).contains(sharedAccount.i());
                                if (z) {
                                    arrayList.add(obj3);
                                }
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new xnr0((SharedAccount) it.next()));
                    }
                    sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1.L$0 = null;
                    sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1.L$1 = null;
                    sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1.L$2 = null;
                    sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1.L$3 = null;
                    sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList2, sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1 = new SharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1(this, continuation);
        Object obj22 = sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentInteractor$observeInvitations$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
