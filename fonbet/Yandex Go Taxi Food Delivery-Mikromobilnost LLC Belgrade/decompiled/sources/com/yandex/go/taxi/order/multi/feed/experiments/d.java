package com.yandex.go.taxi.order.multi.feed.experiments;

import com.yandex.go.taxi.order.multi.feed.experiments.TaxiOrderFeedStateSettingsExperiment;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaxiOrderFeedStateSettingsExperiment.StateDto.State.values().length];
        try {
            iArr[TaxiOrderFeedStateSettingsExperiment.StateDto.State.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiOrderFeedStateSettingsExperiment.StateDto.State.MINIMIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
