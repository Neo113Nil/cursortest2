package com.yandex.go.navigator.order;

import defpackage.ny61;
import defpackage.q341;
import defpackage.s850;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NavigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1 navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1;
        int i;
        s850 s850Var;
        if (continuation instanceof NavigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1) {
            navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1 = (NavigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1) continuation;
            int i2 = navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    q341 q341Var = (q341) obj;
                    if (q341Var != null) {
                        String str = q341Var.a;
                        String str2 = q341Var.b;
                        String str3 = q341Var.c;
                        NavigationOrder$NavigationType navigationOrder$NavigationType = NavigationOrder$NavigationType.WALKING;
                        int i3 = q341Var.d;
                        s850Var = new s850(str, str2, str3, navigationOrder$NavigationType, i3, i3);
                    } else {
                        s850Var = null;
                    }
                    navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1.L$0 = null;
                    navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1.L$1 = null;
                    navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1.L$2 = null;
                    navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1.L$3 = null;
                    navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(s850Var, navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1 = new NavigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationOrdersRepositoryImpl$walkNavOrderFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
