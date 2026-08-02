package com.yandex.go.splash.v2;

import defpackage.d6z;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.urt0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public d(rqo rqoVar) {
        SplashScreenV2Experiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(SplashScreenV2Experiment.i);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (SplashScreenV2Experiment) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        SplashScreenV2ExperimentRepository$splashScreenV2Config$1 splashScreenV2ExperimentRepository$splashScreenV2Config$1;
        int i;
        String str;
        if (continuationImpl instanceof SplashScreenV2ExperimentRepository$splashScreenV2Config$1) {
            splashScreenV2ExperimentRepository$splashScreenV2Config$1 = (SplashScreenV2ExperimentRepository$splashScreenV2Config$1) continuationImpl;
            int i2 = splashScreenV2ExperimentRepository$splashScreenV2Config$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashScreenV2ExperimentRepository$splashScreenV2Config$1.label = i2 - Integer.MIN_VALUE;
                Object obj = splashScreenV2ExperimentRepository$splashScreenV2Config$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashScreenV2ExperimentRepository$splashScreenV2Config$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    splashScreenV2ExperimentRepository$splashScreenV2Config$1.L$0 = this;
                    splashScreenV2ExperimentRepository$splashScreenV2Config$1.label = 1;
                    obj = this.a.b(splashScreenV2ExperimentRepository$splashScreenV2Config$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (d) splashScreenV2ExperimentRepository$splashScreenV2Config$1.L$0;
                    kotlin.b.b(obj);
                }
                SplashScreenV2Experiment splashScreenV2Experiment = (SplashScreenV2Experiment) obj;
                this.getClass();
                boolean z = splashScreenV2Experiment.b;
                String Y = d6z.Y(splashScreenV2Experiment, splashScreenV2Experiment.e);
                str = splashScreenV2Experiment.f;
                if (str == null) {
                    str = "";
                }
                return new urt0(Y, splashScreenV2Experiment.g, str, "", z);
            }
        }
        splashScreenV2ExperimentRepository$splashScreenV2Config$1 = new SplashScreenV2ExperimentRepository$splashScreenV2Config$1(this, continuationImpl);
        Object obj2 = splashScreenV2ExperimentRepository$splashScreenV2Config$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashScreenV2ExperimentRepository$splashScreenV2Config$1.label;
        if (i != 0) {
        }
        SplashScreenV2Experiment splashScreenV2Experiment2 = (SplashScreenV2Experiment) obj2;
        this.getClass();
        boolean z2 = splashScreenV2Experiment2.b;
        String Y2 = d6z.Y(splashScreenV2Experiment2, splashScreenV2Experiment2.e);
        str = splashScreenV2Experiment2.f;
        if (str == null) {
        }
        return new urt0(Y2, splashScreenV2Experiment2.g, str, "", z2);
    }
}
