package com.yandex.go.taxi.order.perf.experiment;

import com.yandex.go.taxi.order.perf.experiment.TaxiOrderPerfTweaksExperiment;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaxiOrderPerfTweaksExperiment.DelayType.values().length];
        try {
            iArr[TaxiOrderPerfTweaksExperiment.DelayType.FCP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiOrderPerfTweaksExperiment.DelayType.LCP_DEFAULTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaxiOrderPerfTweaksExperiment.DelayType.LCP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
