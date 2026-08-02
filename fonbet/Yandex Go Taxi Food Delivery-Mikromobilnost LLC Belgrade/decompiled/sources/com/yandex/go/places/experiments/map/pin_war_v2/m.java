package com.yandex.go.places.experiments.map.pin_war_v2;

import com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[PlacesPinWarV2Experiment.LabelRenderingMode.values().length];
        try {
            iArr[PlacesPinWarV2Experiment.LabelRenderingMode.INDEPENDENT_LABEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacesPinWarV2Experiment.LabelRenderingMode.EMBEDDED_IN_ICON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PlacesPinWarV2Experiment.GeometryEasing.values().length];
        try {
            iArr2[PlacesPinWarV2Experiment.GeometryEasing.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PlacesPinWarV2Experiment.GeometryEasing.EASE_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PlacesPinWarV2Experiment.GeometryEasing.EASE_OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PlacesPinWarV2Experiment.GeometryEasing.EASE_IN_OUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[PlacesPinWarV2Experiment.ZoomStep.values().length];
        try {
            iArr3[PlacesPinWarV2Experiment.ZoomStep.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[PlacesPinWarV2Experiment.ZoomStep.HALF.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[PlacesPinWarV2Experiment.ZoomStep.QUARTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[PlacesPinWarV2Experiment.ZoomStep.EIGHTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
        int[] iArr4 = new int[PlacesPinWarV2Experiment.CameraRedrawMode.Mode.values().length];
        try {
            iArr4[PlacesPinWarV2Experiment.CameraRedrawMode.Mode.IMMEDIATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[PlacesPinWarV2Experiment.CameraRedrawMode.Mode.NEVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[PlacesPinWarV2Experiment.CameraRedrawMode.Mode.DEFERRED_WITH_TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        d = iArr4;
    }
}
