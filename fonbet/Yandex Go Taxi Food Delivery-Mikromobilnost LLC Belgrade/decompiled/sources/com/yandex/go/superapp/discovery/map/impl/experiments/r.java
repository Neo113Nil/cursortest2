package com.yandex.go.superapp.discovery.map.impl.experiments;

import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class r {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperAppDiscoveryMapExperiment.CategoryFilterType.values().length];
        try {
            iArr[SuperAppDiscoveryMapExperiment.CategoryFilterType.SCOOTERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperAppDiscoveryMapExperiment.CategoryFilterType.TRANSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuperAppDiscoveryMapExperiment.CategoryFilterType.FAVOURITES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SuperAppDiscoveryMapExperiment.CategoryFilterType.CHARGERS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SuperAppDiscoveryMapExperiment.CategoryFilterType.CATEGORY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SuperAppDiscoveryMapExperiment.CategoryFilterType.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
