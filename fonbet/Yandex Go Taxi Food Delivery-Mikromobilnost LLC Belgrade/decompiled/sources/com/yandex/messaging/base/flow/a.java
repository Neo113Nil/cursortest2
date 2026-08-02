package com.yandex.messaging.base.flow;

import defpackage.dvw;
import defpackage.j18;
import defpackage.l8x;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.seu;
import defpackage.vpr;
import java.util.Collections;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements n4u0 {
    public final List a;
    public final Object b;
    public final /* synthetic */ Object c;

    public a(Boolean bool) {
        this.c = bool;
        this.a = Collections.singletonList(bool);
        this.b = bool;
    }

    @Override // defpackage.hnr0
    public final List b() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r6.s() != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r7.emit(r6.c, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SingleStateFlowKt$SingleStateFlow$1$collect$1 singleStateFlowKt$SingleStateFlow$1$collect$1;
        int i;
        if (continuation instanceof SingleStateFlowKt$SingleStateFlow$1$collect$1) {
            singleStateFlowKt$SingleStateFlow$1$collect$1 = (SingleStateFlowKt$SingleStateFlow$1$collect$1) continuation;
            int i2 = singleStateFlowKt$SingleStateFlow$1$collect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleStateFlowKt$SingleStateFlow$1$collect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleStateFlowKt$SingleStateFlow$1$collect$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = singleStateFlowKt$SingleStateFlow$1$collect$1.label;
                if (i != 0) {
                    b.b(obj);
                    l8x l8xVar = (l8x) singleStateFlowKt$SingleStateFlow$1$collect$1.get_context().get(seu.C);
                    if (l8xVar != null) {
                        kotlinx.coroutines.a.l(l8xVar);
                    }
                    singleStateFlowKt$SingleStateFlow$1$collect$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        ny61.A();
                        return null;
                    }
                    b.b(obj);
                }
                singleStateFlowKt$SingleStateFlow$1$collect$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(singleStateFlowKt$SingleStateFlow$1$collect$1));
                j18Var.u();
            }
        }
        singleStateFlowKt$SingleStateFlow$1$collect$1 = new SingleStateFlowKt$SingleStateFlow$1$collect$1(this, continuation);
        Object obj3 = singleStateFlowKt$SingleStateFlow$1$collect$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleStateFlowKt$SingleStateFlow$1$collect$1.label;
        if (i != 0) {
        }
        singleStateFlowKt$SingleStateFlow$1$collect$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(singleStateFlowKt$SingleStateFlow$1$collect$1));
        j18Var2.u();
    }

    @Override // defpackage.n4u0
    public final Object getValue() {
        return this.b;
    }
}
