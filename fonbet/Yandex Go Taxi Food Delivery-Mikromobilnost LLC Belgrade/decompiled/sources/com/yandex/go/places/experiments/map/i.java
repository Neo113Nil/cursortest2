package com.yandex.go.places.experiments.map;

import com.yandex.go.places.experiments.map.PlacesMapScreenExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlacesMapScreenExperiment.RevealingState.values().length];
        try {
            iArr[PlacesMapScreenExperiment.RevealingState.COMPACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacesMapScreenExperiment.RevealingState.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlacesMapScreenExperiment.RevealingState.COLLAPSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PlacesMapScreenExperiment.Screen.values().length];
        try {
            iArr2[PlacesMapScreenExperiment.Screen.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PlacesMapScreenExperiment.Screen.ORGANIZATION_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PlacesMapScreenExperiment.Screen.ORGANIZATION_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PlacesMapScreenExperiment.Screen.ORGANIZATION_LIST_V2.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PlacesMapScreenExperiment.Screen.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
