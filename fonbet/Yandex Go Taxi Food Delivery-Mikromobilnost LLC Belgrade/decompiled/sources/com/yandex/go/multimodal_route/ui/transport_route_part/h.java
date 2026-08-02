package com.yandex.go.multimodal_route.ui.transport_route_part;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.v311;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class h implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ v311 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public h(r0 r0Var, v311 v311Var, String str, String str2) {
        this.a = r0Var;
        this.b = v311Var;
        this.c = str;
        this.w = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TransportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1 transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TransportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1) {
            transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1 = (TransportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1) continuation;
            int i2 = transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar, this.b, this.c, this.w);
                    transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1.L$0 = null;
                    transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1.L$1 = null;
                    transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1.L$2 = null;
                    transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(gVar, transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1 = new TransportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportPartRouteStateRepositoryImpl$canShowTransportPartForOrderFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
