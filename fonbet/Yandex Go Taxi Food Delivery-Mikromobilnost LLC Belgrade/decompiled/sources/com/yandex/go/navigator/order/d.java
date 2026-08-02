package com.yandex.go.navigator.order;

import defpackage.avj0;
import defpackage.hf50;
import defpackage.jf50;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.s850;
import defpackage.v2h0;
import defpackage.vd50;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ vd50 b;

    public d(vpr vprVar, vd50 vd50Var) {
        this.a = vprVar;
        this.b = vd50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NavigatorOrderRepository$special$$inlined$map$1$2$1 navigatorOrderRepository$special$$inlined$map$1$2$1;
        int i;
        s850 s850Var;
        if (continuation instanceof NavigatorOrderRepository$special$$inlined$map$1$2$1) {
            navigatorOrderRepository$special$$inlined$map$1$2$1 = (NavigatorOrderRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = navigatorOrderRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorOrderRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigatorOrderRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorOrderRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    jf50 jf50Var = (jf50) obj;
                    if (jf50Var instanceof hf50) {
                        hf50 hf50Var = (hf50) jf50Var;
                        s850Var = new s850(hf50Var.a, ((avj0) this.b.a).i(kyh0.navigator_widget_title, hf50Var.b), hf50Var.c, NavigationOrder$NavigationType.AUTO, v2h0.ic_navigator_shortcut, v2h0.ic_navigator_shortcut_inverted);
                    } else {
                        s850Var = null;
                    }
                    navigatorOrderRepository$special$$inlined$map$1$2$1.L$0 = null;
                    navigatorOrderRepository$special$$inlined$map$1$2$1.L$1 = null;
                    navigatorOrderRepository$special$$inlined$map$1$2$1.L$2 = null;
                    navigatorOrderRepository$special$$inlined$map$1$2$1.L$3 = null;
                    navigatorOrderRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(s850Var, navigatorOrderRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        navigatorOrderRepository$special$$inlined$map$1$2$1 = new NavigatorOrderRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = navigatorOrderRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorOrderRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
