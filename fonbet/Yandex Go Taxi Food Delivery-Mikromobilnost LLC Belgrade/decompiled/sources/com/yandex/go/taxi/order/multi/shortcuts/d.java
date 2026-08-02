package com.yandex.go.taxi.order.multi.shortcuts;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ yaf0 c;

    public d(jqr jqrVar, e eVar, yaf0 yaf0Var) {
        this.a = jqrVar;
        this.b = eVar;
        this.c = yaf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderShortcutViewSource$start$$inlined$map$1$1 orderShortcutViewSource$start$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderShortcutViewSource$start$$inlined$map$1$1) {
            orderShortcutViewSource$start$$inlined$map$1$1 = (OrderShortcutViewSource$start$$inlined$map$1$1) continuation;
            int i2 = orderShortcutViewSource$start$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderShortcutViewSource$start$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderShortcutViewSource$start$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderShortcutViewSource$start$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b, this.c);
                    orderShortcutViewSource$start$$inlined$map$1$1.L$0 = null;
                    orderShortcutViewSource$start$$inlined$map$1$1.L$1 = null;
                    orderShortcutViewSource$start$$inlined$map$1$1.L$2 = null;
                    orderShortcutViewSource$start$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, orderShortcutViewSource$start$$inlined$map$1$1) == coroutineSingletons) {
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
        orderShortcutViewSource$start$$inlined$map$1$1 = new OrderShortcutViewSource$start$$inlined$map$1$1(this, continuation);
        Object obj2 = orderShortcutViewSource$start$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderShortcutViewSource$start$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
