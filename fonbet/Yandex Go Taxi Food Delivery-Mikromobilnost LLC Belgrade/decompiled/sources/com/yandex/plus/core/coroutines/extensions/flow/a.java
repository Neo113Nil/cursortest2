package com.yandex.plus.core.coroutines.extensions.flow;

import defpackage.hqr;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Ref$ObjectRef b;

    public a(vpr vprVar, Ref$ObjectRef ref$ObjectRef) {
        this.a = vprVar;
        this.b = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowHistory$Companion$withPrevious$1$1$emit$1 flowHistory$Companion$withPrevious$1$1$emit$1;
        int i;
        T t;
        if (continuation instanceof FlowHistory$Companion$withPrevious$1$1$emit$1) {
            flowHistory$Companion$withPrevious$1$1$emit$1 = (FlowHistory$Companion$withPrevious$1$1$emit$1) continuation;
            int i2 = flowHistory$Companion$withPrevious$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowHistory$Companion$withPrevious$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flowHistory$Companion$withPrevious$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowHistory$Companion$withPrevious$1$1$emit$1.label;
                Ref$ObjectRef ref$ObjectRef = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hqr hqrVar = new hqr(ref$ObjectRef.element, obj);
                    flowHistory$Companion$withPrevious$1$1$emit$1.L$0 = obj;
                    flowHistory$Companion$withPrevious$1$1$emit$1.label = 1;
                    t = obj;
                    if (this.a.emit(hqrVar, flowHistory$Companion$withPrevious$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = flowHistory$Companion$withPrevious$1$1$emit$1.L$0;
                    kotlin.b.b(obj2);
                    t = obj3;
                }
                ref$ObjectRef.element = t;
                return zy11.a;
            }
        }
        flowHistory$Companion$withPrevious$1$1$emit$1 = new FlowHistory$Companion$withPrevious$1$1$emit$1(this, continuation);
        Object obj22 = flowHistory$Companion$withPrevious$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowHistory$Companion$withPrevious$1$1$emit$1.label;
        Ref$ObjectRef ref$ObjectRef2 = this.b;
        if (i != 0) {
        }
        ref$ObjectRef2.element = t;
        return zy11.a;
    }
}
