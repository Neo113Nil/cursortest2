package com.yandex.go.xiva.domain;

import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes11.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public a(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1 taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1) {
            taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1 = (TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(kotlinx.coroutines.flow.e.t(new d(((o2y0) it.next()).a(), this.b)));
                    }
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1 = new TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
