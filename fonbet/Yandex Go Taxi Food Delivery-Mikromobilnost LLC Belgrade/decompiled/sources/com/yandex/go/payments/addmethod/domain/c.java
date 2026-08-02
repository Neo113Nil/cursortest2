package com.yandex.go.payments.addmethod.domain;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.d0l0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1 addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1) {
            addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1 = (AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1) continuation;
            int i2 = addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ZoneAddress zoneAddress = ((d0l0) obj).a;
                    Zone zone = zoneAddress != null ? zoneAddress.b : null;
                    addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1.L$0 = null;
                    addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1.L$1 = null;
                    addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1.L$2 = null;
                    addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1.L$3 = null;
                    addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(zone, addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1 = new AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
