package com.yandex.go.multimodal_route.routers;

import com.yandex.go.multimodal_route.interactors.d;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.bg30;
import defpackage.bs40;
import defpackage.cg30;
import defpackage.ew40;
import defpackage.fay0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.q6s0;
import defpackage.sy60;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ bs40 a;

    public a(bs40 bs40Var) {
        this.a = bs40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MultimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1 multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1;
        int i;
        ew40 ew40Var;
        pex0 m;
        String str;
        if (continuation instanceof MultimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1) {
            multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1 = (MultimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                MultimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1 multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$12 = multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1;
                Object obj2 = multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$12.label;
                bs40 bs40Var = this.a;
                if (i != 0) {
                    b.b(obj2);
                    ew40Var = (ew40) obj;
                    cg30 cg30Var = bs40Var.I;
                    if (cg30Var != null) {
                        cg30Var.i();
                    }
                    bs40Var.I = null;
                    if (ew40Var != null && (m = ((k) bs40Var.F).m()) != null && (str = m.b) != null) {
                        d dVar = bs40Var.E;
                        multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$12.L$0 = null;
                        multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$12.L$1 = null;
                        multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$12.L$2 = ew40Var;
                        multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$12.L$3 = null;
                        multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$12.label = 1;
                        obj2 = d.b(dVar, str, null, null, null, null, null, null, multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$12, HProv.PP_DELETE_SAVED_PASSWD);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ew40Var = (ew40) multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$12.L$2;
                b.b(obj2);
                fay0 fay0Var = (fay0) obj2;
                List a = bs40Var.G.c().a();
                cg30 cg30Var2 = (cg30) bs40Var.H.get();
                bs40Var.I = cg30Var2;
                bs40Var.A(cg30Var2, new bg30(ew40Var.a, fay0Var, a, new q6s0(false, true), null, 232), sy60.Q2);
                return zy11.a;
            }
        }
        multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1 = new MultimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1(this, continuation);
        MultimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1 multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$122 = multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$1;
        Object obj22 = multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalPreorderRouteOverlayRouterImpl$onLaunch$$inlined$safeCollectIn$1$2$122.label;
        bs40 bs40Var2 = this.a;
        if (i != 0) {
        }
        fay0 fay0Var2 = (fay0) obj22;
        List a2 = bs40Var2.G.c().a();
        cg30 cg30Var22 = (cg30) bs40Var2.H.get();
        bs40Var2.I = cg30Var22;
        bs40Var2.A(cg30Var22, new bg30(ew40Var.a, fay0Var2, a2, new q6s0(false, true), null, 232), sy60.Q2);
        return zy11.a;
    }
}
