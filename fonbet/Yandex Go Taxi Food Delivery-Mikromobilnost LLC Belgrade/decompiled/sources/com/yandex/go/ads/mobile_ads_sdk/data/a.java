package com.yandex.go.ads.mobile_ads_sdk.data;

import com.yandex.go.ads.mobile_ads_sdk.data.experiment.MobileAdsSdkOptionsExperiment;
import defpackage.auu0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.jbh;
import defpackage.k8u;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.sbx;
import defpackage.t1b0;
import defpackage.zy11;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public static final k8u d;
    public final rqo a;
    public final cne0 b;
    public final MobileAdsSdkOptionsExperiment c;

    static {
        auu0 auu0Var = auu0.a;
        d = new k8u(auu0Var, auu0Var, 1);
    }

    public a(rqo rqoVar, dne0 dne0Var) {
        Map map;
        this.a = rqoVar;
        cne0 a = dne0Var.a("prefs_mobile_ads_options_experiment");
        this.b = a;
        MobileAdsSdkOptionsExperiment.Companion.getClass();
        MobileAdsSdkOptionsExperiment mobileAdsSdkOptionsExperiment = MobileAdsSdkOptionsExperiment.e;
        boolean g = a.g("is_enabled", mobileAdsSdkOptionsExperiment.b);
        String l = a.l("host_paths", null);
        this.c = new MobileAdsSdkOptionsExperiment(g, (l == null || (map = (Map) sbx.d.b(d, l)) == null) ? mobileAdsSdkOptionsExperiment.c : map);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MobileAdsSdkOptionsExperimentRepository$update$1 mobileAdsSdkOptionsExperimentRepository$update$1;
        int i;
        if (continuationImpl instanceof MobileAdsSdkOptionsExperimentRepository$update$1) {
            mobileAdsSdkOptionsExperimentRepository$update$1 = (MobileAdsSdkOptionsExperimentRepository$update$1) continuationImpl;
            int i2 = mobileAdsSdkOptionsExperimentRepository$update$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobileAdsSdkOptionsExperimentRepository$update$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobileAdsSdkOptionsExperimentRepository$update$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobileAdsSdkOptionsExperimentRepository$update$1.label;
                if (i != 0) {
                    b.b(obj);
                    t1b0 e = ((jbh) this.a).e(this.c);
                    mobileAdsSdkOptionsExperimentRepository$update$1.label = 1;
                    obj = e.b(mobileAdsSdkOptionsExperimentRepository$update$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                MobileAdsSdkOptionsExperiment mobileAdsSdkOptionsExperiment = (MobileAdsSdkOptionsExperiment) obj;
                boolean z = mobileAdsSdkOptionsExperiment.b;
                cne0 cne0Var = this.b;
                cne0Var.u("is_enabled", z);
                cne0Var.r("host_paths", sbx.d.c(mobileAdsSdkOptionsExperiment.c, d));
                return zy11.a;
            }
        }
        mobileAdsSdkOptionsExperimentRepository$update$1 = new MobileAdsSdkOptionsExperimentRepository$update$1(this, continuationImpl);
        Object obj2 = mobileAdsSdkOptionsExperimentRepository$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobileAdsSdkOptionsExperimentRepository$update$1.label;
        if (i != 0) {
        }
        MobileAdsSdkOptionsExperiment mobileAdsSdkOptionsExperiment2 = (MobileAdsSdkOptionsExperiment) obj2;
        boolean z2 = mobileAdsSdkOptionsExperiment2.b;
        cne0 cne0Var2 = this.b;
        cne0Var2.u("is_enabled", z2);
        cne0Var2.r("host_paths", sbx.d.c(mobileAdsSdkOptionsExperiment2.c, d));
        return zy11.a;
    }
}
