package com.yandex.go.preorder.lifecycle;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class j implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ m b;

    public j(tpr tprVar, m mVar) {
        this.a = tprVar;
        this.b = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1 sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1;
        int i;
        if (continuation instanceof SourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1) {
            sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1 = (SourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1) continuation;
            int i2 = sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = new i(vprVar, this.b);
                    sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1.L$0 = null;
                    sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1.L$1 = null;
                    sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1.L$2 = null;
                    sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(iVar, sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1) == coroutineSingletons) {
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
        sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1 = new SourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1(this, continuation);
        Object obj2 = sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointDestinationChangeListener$trackRouteDestinationChanges$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
