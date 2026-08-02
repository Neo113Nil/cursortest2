package com.yandex.go.taxi.summary.verticalsummary.ui;

import defpackage.m3u0;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wg6;
import defpackage.zy11;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ androidx.compose.foundation.lazy.b A;
    public final /* synthetic */ m3u0 B;
    public final /* synthetic */ m0 a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List w;
    public final /* synthetic */ m3u0 x;
    public final /* synthetic */ oz40 y;
    public final /* synthetic */ androidx.compose.animation.core.a z;

    public c(m0 m0Var, wg6 wg6Var, int i, ListBuilder listBuilder, m3u0 m3u0Var, oz40 oz40Var, androidx.compose.animation.core.a aVar, androidx.compose.foundation.lazy.b bVar, m3u0 m3u0Var2) {
        this.a = m0Var;
        this.b = wg6Var;
        this.c = i;
        this.w = listBuilder;
        this.x = m3u0Var;
        this.y = oz40Var;
        this.z = aVar;
        this.A = bVar;
        this.B = m3u0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1 stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1) {
            stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1 = (StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1) continuation;
            int i2 = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B);
                    stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.L$0 = null;
                    stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.L$1 = null;
                    stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.L$2 = null;
                    stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(bVar, stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1 = new StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
