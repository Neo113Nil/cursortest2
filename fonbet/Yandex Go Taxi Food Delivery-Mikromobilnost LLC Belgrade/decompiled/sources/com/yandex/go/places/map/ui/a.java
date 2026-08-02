package com.yandex.go.places.map.ui;

import defpackage.l8x;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vpr;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ Ref$LongRef a;
    public final /* synthetic */ long b;
    public final /* synthetic */ y6f0 c;
    public final /* synthetic */ Ref$ObjectRef w;
    public final /* synthetic */ Ref$ObjectRef x;

    public a(Ref$LongRef ref$LongRef, long j, y6f0 y6f0Var, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        this.a = ref$LongRef;
        this.b = j;
        this.c = y6f0Var;
        this.w = ref$ObjectRef;
        this.x = ref$ObjectRef2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, pzt0] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PinsUtilsKt$throttleFirstAndLast$1$1$emit$1 pinsUtilsKt$throttleFirstAndLast$1$1$emit$1;
        int i;
        long j;
        l8x l8xVar;
        if (continuation instanceof PinsUtilsKt$throttleFirstAndLast$1$1$emit$1) {
            pinsUtilsKt$throttleFirstAndLast$1$1$emit$1 = (PinsUtilsKt$throttleFirstAndLast$1$1$emit$1) continuation;
            int i2 = pinsUtilsKt$throttleFirstAndLast$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinsUtilsKt$throttleFirstAndLast$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pinsUtilsKt$throttleFirstAndLast$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinsUtilsKt$throttleFirstAndLast$1$1$emit$1.label;
                Ref$ObjectRef ref$ObjectRef = this.w;
                Ref$LongRef ref$LongRef = this.a;
                Ref$ObjectRef ref$ObjectRef2 = this.x;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = currentTimeMillis - ref$LongRef.element;
                    PinsUtilsKt$throttleFirstAndLast$1$1$emit$1 pinsUtilsKt$throttleFirstAndLast$1$1$emit$12 = pinsUtilsKt$throttleFirstAndLast$1$1$emit$1;
                    if (j2 < this.b) {
                        ref$ObjectRef.element = obj;
                        l8x l8xVar2 = (l8x) ref$ObjectRef2.element;
                        if (l8xVar2 != null) {
                            l8xVar2.a(null);
                        }
                        long j3 = this.b;
                        y6f0 y6f0Var = this.c;
                        ref$ObjectRef2.element = tje.N(y6f0Var, null, null, new PinsUtilsKt$throttleFirstAndLast$1$1$1(j3, j2, ref$ObjectRef, y6f0Var, ref$LongRef, null), 3);
                        return zy11.a;
                    }
                    pinsUtilsKt$throttleFirstAndLast$1$1$emit$12.L$0 = null;
                    pinsUtilsKt$throttleFirstAndLast$1$1$emit$12.J$0 = currentTimeMillis;
                    pinsUtilsKt$throttleFirstAndLast$1$1$emit$12.J$1 = j2;
                    pinsUtilsKt$throttleFirstAndLast$1$1$emit$12.label = 1;
                    if (((x6f0) this.c).y.o(obj, pinsUtilsKt$throttleFirstAndLast$1$1$emit$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j = currentTimeMillis;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = pinsUtilsKt$throttleFirstAndLast$1$1$emit$1.J$0;
                    kotlin.b.b(obj2);
                }
                ref$LongRef.element = j;
                ref$ObjectRef.element = null;
                l8xVar = (l8x) ref$ObjectRef2.element;
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                return zy11.a;
            }
        }
        pinsUtilsKt$throttleFirstAndLast$1$1$emit$1 = new PinsUtilsKt$throttleFirstAndLast$1$1$emit$1(this, continuation);
        Object obj22 = pinsUtilsKt$throttleFirstAndLast$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinsUtilsKt$throttleFirstAndLast$1$1$emit$1.label;
        Ref$ObjectRef ref$ObjectRef3 = this.w;
        Ref$LongRef ref$LongRef2 = this.a;
        Ref$ObjectRef ref$ObjectRef22 = this.x;
        if (i != 0) {
        }
        ref$LongRef2.element = j;
        ref$ObjectRef3.element = null;
        l8xVar = (l8x) ref$ObjectRef22.element;
        if (l8xVar != null) {
        }
        return zy11.a;
    }
}
