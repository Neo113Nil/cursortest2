package com.yandex.go.routestops.v2.ui;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wg6;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ int c;

    public b(rol0 rol0Var, wg6 wg6Var, int i) {
        this.a = rol0Var;
        this.b = wg6Var;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1 routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1) {
            routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1 = (RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1 = new RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
