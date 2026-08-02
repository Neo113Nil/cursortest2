package com.lightside.cookies.coroutines;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes11.dex */
public final class a implements vpr {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ vpr b;
    public final /* synthetic */ zls c;

    public a(AtomicReference atomicReference, vpr vprVar, zls zlsVar) {
        this.a = atomicReference;
        this.b = vprVar;
        this.c = zlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt$withLatestFrom$1$1$2$emit$1 flowKt$withLatestFrom$1$1$2$emit$1;
        int i;
        vpr vprVar;
        if (continuation instanceof FlowKt$withLatestFrom$1$1$2$emit$1) {
            flowKt$withLatestFrom$1$1$2$emit$1 = (FlowKt$withLatestFrom$1$1$2$emit$1) continuation;
            int i2 = flowKt$withLatestFrom$1$1$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt$withLatestFrom$1$1$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flowKt$withLatestFrom$1$1$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt$withLatestFrom$1$1$2$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = this.a.get();
                    if (obj3 != null) {
                        vpr vprVar2 = this.b;
                        flowKt$withLatestFrom$1$1$2$emit$1.L$0 = vprVar2;
                        flowKt$withLatestFrom$1$1$2$emit$1.label = 1;
                        obj2 = this.c.invoke(obj, obj3, flowKt$withLatestFrom$1$1$2$emit$1);
                        if (obj2 != coroutineSingletons) {
                            vprVar = vprVar2;
                            flowKt$withLatestFrom$1$1$2$emit$1.L$0 = null;
                            flowKt$withLatestFrom$1$1$2$emit$1.label = 2;
                        }
                        return coroutineSingletons;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vprVar = (vpr) flowKt$withLatestFrom$1$1$2$emit$1.L$0;
                kotlin.b.b(obj2);
                flowKt$withLatestFrom$1$1$2$emit$1.L$0 = null;
                flowKt$withLatestFrom$1$1$2$emit$1.label = 2;
            }
        }
        flowKt$withLatestFrom$1$1$2$emit$1 = new FlowKt$withLatestFrom$1$1$2$emit$1(this, continuation);
        Object obj22 = flowKt$withLatestFrom$1$1$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt$withLatestFrom$1$1$2$emit$1.label;
        if (i != 0) {
        }
    }
}
