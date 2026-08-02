package com.yandex.go.multimodal_route.overlay;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bg30;
import defpackage.cg30;
import defpackage.gw40;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sy60;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ gw40 a;

    public a(gw40 gw40Var) {
        this.a = gw40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MultimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1 multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1;
        int i;
        gw40 gw40Var;
        bg30 bg30Var;
        cg30 cg30Var;
        if (continuation instanceof MultimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1) {
            multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1 = (MultimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.label;
                gw40Var = this.a;
                if (i != 0) {
                    b.b(obj2);
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    if (!gw40Var.E.b(taxiOrder.a, taxiOrder.b.b)) {
                        cg30 cg30Var2 = gw40Var.G;
                        if (cg30Var2 != null) {
                            cg30Var2.i();
                        }
                        gw40Var.G = null;
                        return zy11.a;
                    }
                    com.yandex.go.multimodal_route.ui.detailed_card.a aVar = gw40Var.F;
                    multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.label = 1;
                    obj2 = aVar.a(taxiOrder, multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                bg30Var = (bg30) obj2;
                if (bg30Var != null && !jl40.l(gw40Var.H, bg30Var)) {
                    cg30Var = gw40Var.G;
                    if (cg30Var != null) {
                        cg30Var.i();
                    }
                    gw40Var.G = null;
                    cg30 cg30Var3 = (cg30) gw40Var.D.get();
                    gw40Var.G = cg30Var3;
                    gw40Var.H = bg30Var;
                    gw40Var.A(cg30Var3, bg30Var, sy60.Q2);
                }
                return zy11.a;
            }
        }
        multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1 = new MultimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalTransportPartOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.label;
        gw40Var = this.a;
        if (i != 0) {
        }
        bg30Var = (bg30) obj22;
        if (bg30Var != null) {
            cg30Var = gw40Var.G;
            if (cg30Var != null) {
            }
            gw40Var.G = null;
            cg30 cg30Var32 = (cg30) gw40Var.D.get();
            gw40Var.G = cg30Var32;
            gw40Var.H = bg30Var;
            gw40Var.A(cg30Var32, bg30Var, sy60.Q2);
        }
        return zy11.a;
    }
}
