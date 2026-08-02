package com.yandex.go.routestops.v2.ui;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.wg6;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ int c;

    public a(vpr vprVar, wg6 wg6Var, int i) {
        this.a = vprVar;
        this.b = wg6Var;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1 routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1) {
            routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1 = (RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((Number) obj).floatValue();
                    Float f = new Float(-this.b.f(this.c));
                    routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1 = new RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
