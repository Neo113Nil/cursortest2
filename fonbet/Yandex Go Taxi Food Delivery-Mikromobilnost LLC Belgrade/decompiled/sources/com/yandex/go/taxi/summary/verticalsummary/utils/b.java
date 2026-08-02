package com.yandex.go.taxi.summary.verticalsummary.utils;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ wls b;

    public b(rol0 rol0Var, wls wlsVar) {
        this.a = rol0Var;
        this.b = wlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1 lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof LazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1) {
            lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1 = (LazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1) continuation;
            int i2 = lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.L$0 = null;
                    lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.L$1 = null;
                    lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.L$2 = null;
                    lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(aVar, lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1 = new LazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
