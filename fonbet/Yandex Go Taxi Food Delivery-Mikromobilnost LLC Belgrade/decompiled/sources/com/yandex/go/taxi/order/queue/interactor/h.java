package com.yandex.go.taxi.order.queue.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import com.yandex.go.taxi.order.models.api.response.r7;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l b;

    public h(vpr vprVar, l lVar) {
        this.a = vprVar;
        this.b = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x010c, code lost:
    
        if (r11.emit(r12, r2) != r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ec, code lost:
    
        if (r0.b(r13, r2) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        QueueInteractor$queueModelFlow$$inlined$map$1$2$1 queueInteractor$queueModelFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        SearchInfoResponse$QueueSearch.QueueInfo queueInfo;
        Object b;
        vpr vprVar2;
        SearchInfoResponse$QueueSearch.QueueInfo queueInfo2;
        TaxiOrder taxiOrder;
        l lVar = this.b;
        d dVar = lVar.g;
        if (continuation instanceof QueueInteractor$queueModelFlow$$inlined$map$1$2$1) {
            queueInteractor$queueModelFlow$$inlined$map$1$2$1 = (QueueInteractor$queueModelFlow$$inlined$map$1$2$1) continuation;
            int i2 = queueInteractor$queueModelFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                queueInteractor$queueModelFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = queueInteractor$queueModelFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = queueInteractor$queueModelFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TaxiOrder taxiOrder2 = (TaxiOrder) obj;
                    dVar.getClass();
                    r7 r7Var = taxiOrder2.V().l0;
                    SearchInfoResponse$QueueSearch.QueueInfo a = r7Var instanceof SearchInfoResponse$QueueSearch ? ((SearchInfoResponse$QueueSearch) r7Var).a : d.a(taxiOrder2);
                    vprVar = this.a;
                    if (a != null) {
                        String str = taxiOrder2.a;
                        int i3 = a.g;
                        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$0 = null;
                        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$1 = null;
                        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$2 = null;
                        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$3 = null;
                        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$4 = vprVar;
                        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$5 = null;
                        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$6 = taxiOrder2;
                        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$7 = a;
                        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$8 = null;
                        queueInteractor$queueModelFlow$$inlined$map$1$2$1.label = 1;
                        b = dVar.b(i3, str, queueInteractor$queueModelFlow$$inlined$map$1$2$1);
                        if (b != coroutineSingletons) {
                            vprVar2 = vprVar;
                            queueInfo2 = a;
                            taxiOrder = taxiOrder2;
                        }
                        return coroutineSingletons;
                    }
                    queueInfo = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$0 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$1 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$2 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$3 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$4 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$5 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$6 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$7 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$8 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.label = 3;
                } else if (i == 1) {
                    queueInfo2 = (SearchInfoResponse$QueueSearch.QueueInfo) queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$7;
                    TaxiOrder taxiOrder3 = (TaxiOrder) queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$6;
                    vpr vprVar3 = (vpr) queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    taxiOrder = taxiOrder3;
                    vprVar2 = vprVar3;
                    b = obj2;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    queueInfo2 = (SearchInfoResponse$QueueSearch.QueueInfo) queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$7;
                    vprVar2 = (vpr) queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    vpr vprVar4 = vprVar2;
                    queueInfo = queueInfo2;
                    vprVar = vprVar4;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$0 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$1 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$2 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$3 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$4 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$5 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$6 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$7 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$8 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.label = 3;
                }
                if (!((Boolean) b).booleanValue()) {
                    com.yandex.go.taxi.order.domain.repositories.e eVar = lVar.e;
                    String str2 = taxiOrder.a;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$0 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$1 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$2 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$3 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$5 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$6 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$7 = queueInfo2;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$8 = null;
                    queueInteractor$queueModelFlow$$inlined$map$1$2$1.label = 2;
                }
                vpr vprVar42 = vprVar2;
                queueInfo = queueInfo2;
                vprVar = vprVar42;
                queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$0 = null;
                queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$1 = null;
                queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$2 = null;
                queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$3 = null;
                queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$4 = null;
                queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$5 = null;
                queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$6 = null;
                queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$7 = null;
                queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$8 = null;
                queueInteractor$queueModelFlow$$inlined$map$1$2$1.label = 3;
            }
        }
        queueInteractor$queueModelFlow$$inlined$map$1$2$1 = new QueueInteractor$queueModelFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = queueInteractor$queueModelFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = queueInteractor$queueModelFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        if (!((Boolean) b).booleanValue()) {
        }
        vpr vprVar422 = vprVar2;
        queueInfo = queueInfo2;
        vprVar = vprVar422;
        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$0 = null;
        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$1 = null;
        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$2 = null;
        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$3 = null;
        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$4 = null;
        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$5 = null;
        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$6 = null;
        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$7 = null;
        queueInteractor$queueModelFlow$$inlined$map$1$2$1.L$8 = null;
        queueInteractor$queueModelFlow$$inlined$map$1$2$1.label = 3;
    }
}
