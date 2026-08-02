package com.yandex.go.pickuppoints.impl;

import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType.values().length];
        try {
            iArr[ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType.MAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType.OPEN_COPTER_CITY_TOURS_SELECTOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
