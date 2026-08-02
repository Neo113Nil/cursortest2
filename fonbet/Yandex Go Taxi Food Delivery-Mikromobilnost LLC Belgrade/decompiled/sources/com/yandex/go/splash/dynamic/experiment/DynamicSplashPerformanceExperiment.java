package com.yandex.go.splash.dynamic.experiment;

import defpackage.gsq0;
import defpackage.vn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/splash/dynamic/experiment/DynamicSplashPerformanceExperiment;", "Lvn11;", "Companion", "com/yandex/go/splash/dynamic/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DynamicSplashPerformanceExperiment implements vn11 {
    public static final a Companion = new a();
    public static final DynamicSplashPerformanceExperiment c = new DynamicSplashPerformanceExperiment(0);
    public final boolean b;

    public /* synthetic */ DynamicSplashPerformanceExperiment(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public DynamicSplashPerformanceExperiment(int i) {
        this.b = false;
    }

    public DynamicSplashPerformanceExperiment() {
        this(0);
    }
}
