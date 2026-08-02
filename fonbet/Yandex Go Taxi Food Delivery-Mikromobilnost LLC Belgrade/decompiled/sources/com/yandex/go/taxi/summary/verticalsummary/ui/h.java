package com.yandex.go.taxi.summary.verticalsummary.ui;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wg6;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ int c;

    public h(rol0 rol0Var, wg6 wg6Var, int i) {
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
        VerticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1 verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof VerticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1) {
            verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1 = (VerticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar, this.b, this.c);
                    verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(gVar, verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1 = new VerticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
