package com.yandex.go.taxi.order.queue.interactor;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import com.yandex.go.taxi.order.queue.presentation.QueueInitialState;
import defpackage.dkg0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l b;
    public final /* synthetic */ o2y0 c;

    public j(vpr vprVar, l lVar, o2y0 o2y0Var) {
        this.a = vprVar;
        this.b = lVar;
        this.c = o2y0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f4, code lost:
    
        if (r11.emit(r13, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        QueueInteractor$queueModelFlow$$inlined$map$2$2$1 queueInteractor$queueModelFlow$$inlined$map$2$2$1;
        Object obj2;
        CoroutineSingletons coroutineSingletons;
        int i;
        vpr vprVar;
        dkg0 dkg0Var;
        vpr vprVar2;
        SearchInfoResponse$QueueSearch.QueueInfo queueInfo;
        if (continuation instanceof QueueInteractor$queueModelFlow$$inlined$map$2$2$1) {
            queueInteractor$queueModelFlow$$inlined$map$2$2$1 = (QueueInteractor$queueModelFlow$$inlined$map$2$2$1) continuation;
            int i2 = queueInteractor$queueModelFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                queueInteractor$queueModelFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = queueInteractor$queueModelFlow$$inlined$map$2$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = queueInteractor$queueModelFlow$$inlined$map$2$2$1.label;
                o2y0 o2y0Var = this.c;
                l lVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SearchInfoResponse$QueueSearch.QueueInfo queueInfo2 = (SearchInfoResponse$QueueSearch.QueueInfo) obj;
                    vprVar = this.a;
                    if (queueInfo2 != null) {
                        d dVar = lVar.g;
                        String str = o2y0Var.b().a;
                        int i3 = queueInfo2.g;
                        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$0 = null;
                        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$1 = null;
                        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$2 = null;
                        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$3 = null;
                        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$4 = vprVar;
                        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$5 = null;
                        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$6 = null;
                        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$7 = queueInfo2;
                        queueInteractor$queueModelFlow$$inlined$map$2$2$1.label = 1;
                        obj2 = dVar.b(i3, str, queueInteractor$queueModelFlow$$inlined$map$2$2$1);
                        if (obj2 != coroutineSingletons) {
                            vprVar2 = vprVar;
                            queueInfo = queueInfo2;
                        }
                        return coroutineSingletons;
                    }
                    dkg0Var = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$0 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$1 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$2 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$3 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$4 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$5 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$6 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$7 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$8 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.label = 3;
                } else if (i == 1) {
                    queueInfo = (SearchInfoResponse$QueueSearch.QueueInfo) queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$7;
                    vprVar2 = (vpr) queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$4;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$4;
                    kotlin.b.b(obj2);
                    dkg0Var = (dkg0) obj2;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$0 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$1 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$2 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$3 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$4 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$5 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$6 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$7 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$8 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.label = 3;
                }
                QueueInitialState queueInitialState = !((Boolean) obj2).booleanValue() ? QueueInitialState.MAIN : QueueInitialState.UPDATE;
                com.yandex.go.taxi.order.queue.mapper.a aVar = lVar.d;
                queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$0 = null;
                queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$1 = null;
                queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$2 = null;
                queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$3 = null;
                queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$4 = vprVar2;
                queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$5 = null;
                queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$6 = null;
                queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$7 = null;
                queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$8 = null;
                queueInteractor$queueModelFlow$$inlined$map$2$2$1.label = 2;
                obj2 = aVar.b(o2y0Var, queueInfo, queueInitialState, queueInteractor$queueModelFlow$$inlined$map$2$2$1);
                if (obj2 != coroutineSingletons) {
                    vprVar = vprVar2;
                    dkg0Var = (dkg0) obj2;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$0 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$1 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$2 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$3 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$4 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$5 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$6 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$7 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$8 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$2$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        queueInteractor$queueModelFlow$$inlined$map$2$2$1 = new QueueInteractor$queueModelFlow$$inlined$map$2$2$1(this, continuation);
        obj2 = queueInteractor$queueModelFlow$$inlined$map$2$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = queueInteractor$queueModelFlow$$inlined$map$2$2$1.label;
        o2y0 o2y0Var2 = this.c;
        l lVar2 = this.b;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        com.yandex.go.taxi.order.queue.mapper.a aVar2 = lVar2.d;
        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$0 = null;
        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$1 = null;
        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$2 = null;
        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$3 = null;
        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$4 = vprVar2;
        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$5 = null;
        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$6 = null;
        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$7 = null;
        queueInteractor$queueModelFlow$$inlined$map$2$2$1.L$8 = null;
        queueInteractor$queueModelFlow$$inlined$map$2$2$1.label = 2;
        obj2 = aVar2.b(o2y0Var2, queueInfo, queueInitialState, queueInteractor$queueModelFlow$$inlined$map$2$2$1);
        if (obj2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
