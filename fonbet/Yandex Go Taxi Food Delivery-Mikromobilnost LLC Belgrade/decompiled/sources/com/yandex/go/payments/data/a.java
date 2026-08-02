package com.yandex.go.payments.data;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ListPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1 listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof ListPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1) {
            listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1 = (ListPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    if (list != null) {
                        listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(list, listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1 = new ListPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = listPaymentMethodsRepository$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
