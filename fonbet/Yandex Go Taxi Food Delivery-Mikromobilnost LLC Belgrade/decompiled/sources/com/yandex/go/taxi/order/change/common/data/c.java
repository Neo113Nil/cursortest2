package com.yandex.go.taxi.order.change.common.data;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ d b;
    public final /* synthetic */ tse c;
    public final /* synthetic */ String w;

    public c(r0 r0Var, d dVar, tse tseVar, String str) {
        this.a = r0Var;
        this.b = dVar;
        this.c = tseVar;
        this.w = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1 orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1) {
            orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1 = (OrderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c, this.w);
                    orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1 = new OrderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
