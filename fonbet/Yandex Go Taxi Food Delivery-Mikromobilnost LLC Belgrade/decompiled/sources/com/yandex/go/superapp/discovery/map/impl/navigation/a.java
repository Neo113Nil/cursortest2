package com.yandex.go.superapp.discovery.map.impl.navigation;

import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ tls b;

    public a(vpr vprVar, tls tlsVar) {
        this.a = vprVar;
        this.b = tlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1 superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1) {
            superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1 = (SuperAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1) continuation;
            int i2 = superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object invoke = this.b.invoke((SuperAppDiscoveryMapOverlayState) obj);
                    superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1.L$0 = null;
                    superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1.L$1 = null;
                    superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1.L$2 = null;
                    superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1.L$3 = null;
                    superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(invoke, superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1) == coroutineSingletons) {
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
        superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1 = new SuperAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
