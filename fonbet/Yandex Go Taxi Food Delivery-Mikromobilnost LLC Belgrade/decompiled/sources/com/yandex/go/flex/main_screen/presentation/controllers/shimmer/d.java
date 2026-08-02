package com.yandex.go.flex.main_screen.presentation.controllers.shimmer;

import defpackage.jl40;
import defpackage.jvr0;
import defpackage.ncw0;
import defpackage.ny61;
import defpackage.pcw0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ShimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ShimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) {
            shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 = (ShimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    jvr0 jvr0Var = new jvr0(jl40.l(((pcw0) obj).a, ncw0.a));
                    shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(jvr0Var, shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 = new ShimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shimmerContentPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
