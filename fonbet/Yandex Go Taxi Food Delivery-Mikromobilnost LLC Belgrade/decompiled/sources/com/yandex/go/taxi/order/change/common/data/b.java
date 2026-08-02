package com.yandex.go.taxi.order.change.common.data;

import defpackage.noh;
import defpackage.ny61;
import defpackage.tb9;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;
    public final /* synthetic */ tse c;
    public final /* synthetic */ String w;

    public b(vpr vprVar, d dVar, tse tseVar, String str) {
        this.a = vprVar;
        this.b = dVar;
        this.c = tseVar;
        this.w = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1 orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1) {
            orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1 = (OrderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set<tb9> set = (Set) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                    for (tb9 tb9Var : set) {
                        d dVar = this.b;
                        LinkedHashMap linkedHashMap = dVar.i;
                        String str = tb9Var.b;
                        Object obj3 = linkedHashMap.get(str);
                        if (obj3 == null) {
                            obj3 = tje.h(this.c, null, null, new OrderChangesPollRepository$attach$1$2$1$1$1(dVar, this.w, tb9Var, null), 3);
                            linkedHashMap.put(str, obj3);
                        }
                        arrayList.add((noh) obj3);
                    }
                    orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1 = new OrderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderChangesPollRepository$attach$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
