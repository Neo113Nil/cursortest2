package com.yandex.go.splash.v2;

import defpackage.evu0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.trt0;
import defpackage.urt0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class f implements vpr {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SplashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1 splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1;
        int i;
        String a;
        Object e;
        if (continuation instanceof SplashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1) {
            splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1 = (SplashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1) continuation;
            int i2 = splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.label;
                g gVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    urt0 urt0Var = (urt0) obj;
                    boolean z = urt0Var.a;
                    String str = urt0Var.c;
                    if (!z || evu0.J(str)) {
                        trt0 trt0Var = gVar.e;
                        trt0Var.a.setValue(trt0Var, trt0.b[0], null);
                        return zy11.a;
                    }
                    a = ((m7x0) gVar.c).a(str);
                    com.yandex.go.image.domain.requests.g gVar2 = (com.yandex.go.image.domain.requests.g) gVar.b.e();
                    gVar2.c(a);
                    splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                    splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                    splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                    splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.L$3 = a;
                    splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.label = 1;
                    e = ru.yandex.taxi.utils.a.e(gVar2, splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a = (String) splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.L$3;
                    kotlin.b.b(obj2);
                    e = ((Result) obj2).getValue();
                }
                if (!(e instanceof Result.Failure)) {
                    trt0 trt0Var2 = gVar.e;
                    trt0Var2.a.setValue(trt0Var2, trt0.b[0], a);
                }
                return zy11.a;
            }
        }
        splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1 = new SplashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1(this, continuation);
        Object obj22 = splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashScreenV2Interactor$preloadSplashV2Image$2$invokeSuspend$$inlined$safeCollect$2$1.label;
        g gVar3 = this.a;
        if (i != 0) {
        }
        if (!(e instanceof Result.Failure)) {
        }
        return zy11.a;
    }
}
