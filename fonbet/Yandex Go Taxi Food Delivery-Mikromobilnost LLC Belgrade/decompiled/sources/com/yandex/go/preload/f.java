package com.yandex.go.preload;

import defpackage.dld0;
import defpackage.exx;
import defpackage.fxx;
import defpackage.gxx;
import defpackage.h55;
import defpackage.iph;
import defpackage.ny61;
import defpackage.tje;
import defpackage.w511;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes13.dex */
public final class f extends h55 {
    public final dld0 D;
    public final MainUiAvailabilityMonitor E;
    public final ru.yandex.taxi.startup.launch.response.e F;
    public final a G;
    public final zuj0 H;

    public f(dld0 dld0Var, MainUiAvailabilityMonitor mainUiAvailabilityMonitor, ru.yandex.taxi.startup.launch.response.e eVar, a aVar, zuj0 zuj0Var) {
        super(null);
        this.D = dld0Var;
        this.E = mainUiAvailabilityMonitor;
        this.F = eVar;
        this.G = aVar;
        this.H = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(f fVar, ContinuationImpl continuationImpl) {
        PreloadWaitingRouterImpl$waitLaunch$1 preloadWaitingRouterImpl$waitLaunch$1;
        int i;
        gxx gxxVar;
        a aVar = fVar.G;
        if (continuationImpl instanceof PreloadWaitingRouterImpl$waitLaunch$1) {
            preloadWaitingRouterImpl$waitLaunch$1 = (PreloadWaitingRouterImpl$waitLaunch$1) continuationImpl;
            int i2 = preloadWaitingRouterImpl$waitLaunch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preloadWaitingRouterImpl$waitLaunch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = preloadWaitingRouterImpl$waitLaunch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preloadWaitingRouterImpl$waitLaunch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PreloadWaitingRouterImpl$waitLaunch$responseOrError$1 preloadWaitingRouterImpl$waitLaunch$responseOrError$1 = new PreloadWaitingRouterImpl$waitLaunch$responseOrError$1(fVar, null);
                    preloadWaitingRouterImpl$waitLaunch$1.label = 1;
                    obj = kotlinx.coroutines.a.w(30000L, preloadWaitingRouterImpl$waitLaunch$responseOrError$1, preloadWaitingRouterImpl$waitLaunch$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                gxxVar = (gxx) obj;
                if (!(gxxVar instanceof fxx)) {
                    iph iphVar = aVar.c;
                    Double a = aVar.a(PreloadAnalytics$EventMarker.WAITING);
                    iphVar.getClass();
                    HashMap hashMap = new HashMap();
                    if (a != null) {
                        hashMap.put("duration", a);
                    }
                    iphVar.a.a("DelayUntilFirstLaunch.complete", hashMap, 1, new HashMap());
                } else if (gxxVar instanceof exx) {
                    iph iphVar2 = aVar.c;
                    Double a2 = aVar.a(PreloadAnalytics$EventMarker.WAITING);
                    iphVar2.getClass();
                    HashMap hashMap2 = new HashMap();
                    if (a2 != null) {
                        hashMap2.put("duration", a2);
                    }
                    iphVar2.a.a("DelayUntilFirstLaunch.error", hashMap2, 1, new HashMap());
                } else {
                    if (gxxVar != null) {
                        w511.b();
                        return null;
                    }
                    iph iphVar3 = aVar.c;
                    Double a3 = aVar.a(PreloadAnalytics$EventMarker.WAITING);
                    iphVar3.getClass();
                    HashMap hashMap3 = new HashMap();
                    if (a3 != null) {
                        hashMap3.put("duration", a3);
                    }
                    iphVar3.a.a("DelayUntilFirstLaunch.timeout", hashMap3, 1, new HashMap());
                }
                return zy11.a;
            }
        }
        preloadWaitingRouterImpl$waitLaunch$1 = new PreloadWaitingRouterImpl$waitLaunch$1(fVar, continuationImpl);
        Object obj2 = preloadWaitingRouterImpl$waitLaunch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preloadWaitingRouterImpl$waitLaunch$1.label;
        if (i != 0) {
        }
        gxxVar = (gxx) obj2;
        if (!(gxxVar instanceof fxx)) {
        }
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        r0 r0Var = this.E.d;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        r0 r0Var = this.E.d;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new PreloadWaitingRouterImpl$onLaunch$1(this, null), 1);
    }
}
