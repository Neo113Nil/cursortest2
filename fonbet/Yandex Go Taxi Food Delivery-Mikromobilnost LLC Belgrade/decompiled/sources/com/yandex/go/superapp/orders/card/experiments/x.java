package com.yandex.go.superapp.orders.card.experiments;

import com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class x {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperappTrackingCardExperiment.HorizontalPlacement.values().length];
        try {
            iArr[SuperappTrackingCardExperiment.HorizontalPlacement.Lead.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperappTrackingCardExperiment.HorizontalPlacement.Trail.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
