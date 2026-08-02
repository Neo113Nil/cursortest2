package com.yandex.go.splash.v2;

import defpackage.d6z;
import defpackage.ny61;
import defpackage.urt0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SplashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1 splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SplashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1) {
            splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1 = (SplashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1) continuation;
            int i2 = splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SplashScreenV2Experiment splashScreenV2Experiment = (SplashScreenV2Experiment) obj;
                    this.b.getClass();
                    boolean z = splashScreenV2Experiment.b;
                    String Y = d6z.Y(splashScreenV2Experiment, splashScreenV2Experiment.e);
                    String str = splashScreenV2Experiment.f;
                    if (str == null) {
                        str = "";
                    }
                    urt0 urt0Var = new urt0(Y, splashScreenV2Experiment.g, str, "", z);
                    splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1.L$0 = null;
                    splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1.L$1 = null;
                    splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1.L$2 = null;
                    splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1.L$3 = null;
                    splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(urt0Var, splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1 = new SplashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashScreenV2ExperimentRepository$splashScreenV2ConfigFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
