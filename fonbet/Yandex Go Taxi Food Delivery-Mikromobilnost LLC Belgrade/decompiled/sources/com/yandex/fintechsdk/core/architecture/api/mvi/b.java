package com.yandex.fintechsdk.core.architecture.api.mvi;

import androidx.lifecycle.Lifecycle;
import defpackage.eja1;
import defpackage.ni9;
import defpackage.oi9;
import defpackage.pey;
import defpackage.qju0;
import defpackage.tje;
import defpackage.tls;
import defpackage.uwl0;
import defpackage.v7w;
import defpackage.wc5;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public abstract class b {
    public static final void a(qju0 qju0Var, wls wlsVar) {
        a aVar = ((wc5) qju0Var).b;
        StoreExtensionsKt$intent$1 storeExtensionsKt$intent$1 = new StoreExtensionsKt$intent$1(wlsVar, null);
        Object d = aVar.d.d(storeExtensionsKt$intent$1);
        ni9 ni9Var = oi9.b;
        if (d instanceof ni9) {
            tje.N(aVar.a, null, null, new FintechStore$intent$1(storeExtensionsKt$intent$1, aVar, null), 3);
        }
    }

    public static void b(wc5 wc5Var, pey peyVar, tls tlsVar, tls tlsVar2) {
        tje.N(eja1.s(peyVar), null, null, new StoreExtensionsKt$observe$1$1(peyVar, Lifecycle.State.STARTED, tlsVar, tlsVar2, wc5Var, null), 3);
    }

    public static final Object c(v7w v7wVar, tls tlsVar, Continuation continuation) {
        ((FintechStore$context$1) v7wVar.a.a).invoke(new uwl0(14, tlsVar), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11.a;
    }

    public static final Object d(v7w v7wVar, Object obj, Continuation continuation) {
        Object invoke = ((FintechStore$context$2) v7wVar.a.b).invoke(obj, continuation);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : zy11.a;
    }
}
