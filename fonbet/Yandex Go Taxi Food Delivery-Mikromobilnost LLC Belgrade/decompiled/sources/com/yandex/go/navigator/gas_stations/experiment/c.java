package com.yandex.go.navigator.gas_stations.experiment;

import com.yandex.go.navigator.utils.LineSide;
import defpackage.d6z;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.vhy;
import defpackage.zts;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c {
    public final t1b0 a;
    public final tpr b;

    public c(rqo rqoVar) {
        d dVar = NavigatorGasStationsExperiment.Companion;
        dVar.getClass();
        NavigatorGasStationsExperiment navigatorGasStationsExperiment = NavigatorGasStationsExperiment.i;
        t1b0 e = ((jbh) rqoVar).e(navigatorGasStationsExperiment);
        this.a = e;
        tpr a = e.a();
        dVar.getClass();
        this.b = com.yandex.go.coroutines.b.d(a, new GasStationsExperimentRepository$special$$inlined$start$1(navigatorGasStationsExperiment, null));
    }

    public static zts b(NavigatorGasStationsExperiment navigatorGasStationsExperiment) {
        String Y = d6z.Y(navigatorGasStationsExperiment, navigatorGasStationsExperiment.d);
        String Y2 = d6z.Y(navigatorGasStationsExperiment, navigatorGasStationsExperiment.e);
        boolean z = navigatorGasStationsExperiment.f;
        vhy vhyVar = LineSide.Companion;
        String str = navigatorGasStationsExperiment.g;
        vhyVar.getClass();
        return new zts(Y, Y2, z, jl40.l(str, "right") ? LineSide.Right : jl40.l(str, "left") ? LineSide.Left : LineSide.All);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GasStationsExperimentRepository$config$1 gasStationsExperimentRepository$config$1;
        int i;
        if (continuationImpl instanceof GasStationsExperimentRepository$config$1) {
            gasStationsExperimentRepository$config$1 = (GasStationsExperimentRepository$config$1) continuationImpl;
            int i2 = gasStationsExperimentRepository$config$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsExperimentRepository$config$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsExperimentRepository$config$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsExperimentRepository$config$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gasStationsExperimentRepository$config$1.L$0 = this;
                    gasStationsExperimentRepository$config$1.label = 1;
                    obj = this.a.b(gasStationsExperimentRepository$config$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (c) gasStationsExperimentRepository$config$1.L$0;
                    kotlin.b.b(obj);
                }
                this.getClass();
                return b((NavigatorGasStationsExperiment) obj);
            }
        }
        gasStationsExperimentRepository$config$1 = new GasStationsExperimentRepository$config$1(this, continuationImpl);
        Object obj2 = gasStationsExperimentRepository$config$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsExperimentRepository$config$1.label;
        if (i != 0) {
        }
        this.getClass();
        return b((NavigatorGasStationsExperiment) obj2);
    }
}
