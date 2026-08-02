package com.yandex.go.taxi.order.queue.interactor;

import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ l b;
    public final /* synthetic */ o2y0 c;

    public k(tpr tprVar, l lVar, o2y0 o2y0Var) {
        this.a = tprVar;
        this.b = lVar;
        this.c = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        QueueInteractor$queueModelFlow$$inlined$map$2$1 queueInteractor$queueModelFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof QueueInteractor$queueModelFlow$$inlined$map$2$1) {
            queueInteractor$queueModelFlow$$inlined$map$2$1 = (QueueInteractor$queueModelFlow$$inlined$map$2$1) continuation;
            int i2 = queueInteractor$queueModelFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                queueInteractor$queueModelFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = queueInteractor$queueModelFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = queueInteractor$queueModelFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b, this.c);
                    queueInteractor$queueModelFlow$$inlined$map$2$1.L$0 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$1.L$1 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$1.L$2 = null;
                    queueInteractor$queueModelFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(jVar, queueInteractor$queueModelFlow$$inlined$map$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        queueInteractor$queueModelFlow$$inlined$map$2$1 = new QueueInteractor$queueModelFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = queueInteractor$queueModelFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = queueInteractor$queueModelFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
