package com.yandex.go.experiments.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/experiments/api/ExperimentSource;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "UNKNOWN", "LAUNCH", "FINAL_SUGGEST", "PRODUCTS", "ZONE_INFO", "TOTW", "ROUTESTATS", "SCOOTERS_CONFIG", "SHUTTLES_INFO", "go-client-android.internal_libs:annotation"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExperimentSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExperimentSource[] $VALUES;
    public static final ExperimentSource FINAL_SUGGEST;
    public static final ExperimentSource LAUNCH;
    public static final ExperimentSource PRODUCTS;
    public static final ExperimentSource ROUTESTATS;
    public static final ExperimentSource SCOOTERS_CONFIG;
    public static final ExperimentSource SHUTTLES_INFO;
    public static final ExperimentSource TOTW;
    public static final ExperimentSource UNKNOWN;
    public static final ExperimentSource ZONE_INFO;
    private final String value;

    static {
        ExperimentSource experimentSource = new ExperimentSource("UNKNOWN", 0, "");
        UNKNOWN = experimentSource;
        ExperimentSource experimentSource2 = new ExperimentSource("LAUNCH", 1, "launch");
        LAUNCH = experimentSource2;
        ExperimentSource experimentSource3 = new ExperimentSource("FINAL_SUGGEST", 2, "finalsuggest");
        FINAL_SUGGEST = experimentSource3;
        ExperimentSource experimentSource4 = new ExperimentSource("PRODUCTS", 3, "products");
        PRODUCTS = experimentSource4;
        ExperimentSource experimentSource5 = new ExperimentSource("ZONE_INFO", 4, "zoneinfo");
        ZONE_INFO = experimentSource5;
        ExperimentSource experimentSource6 = new ExperimentSource("TOTW", 5, "taxiontheway");
        TOTW = experimentSource6;
        ExperimentSource experimentSource7 = new ExperimentSource("ROUTESTATS", 6, "routestats");
        ROUTESTATS = experimentSource7;
        ExperimentSource experimentSource8 = new ExperimentSource("SCOOTERS_CONFIG", 7, "scooters/v1/config");
        SCOOTERS_CONFIG = experimentSource8;
        ExperimentSource experimentSource9 = new ExperimentSource("SHUTTLES_INFO", 8, "shuttle-control/v1/booking/information");
        SHUTTLES_INFO = experimentSource9;
        ExperimentSource[] experimentSourceArr = {experimentSource, experimentSource2, experimentSource3, experimentSource4, experimentSource5, experimentSource6, experimentSource7, experimentSource8, experimentSource9};
        $VALUES = experimentSourceArr;
        $ENTRIES = a.a(experimentSourceArr);
    }

    public ExperimentSource(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ExperimentSource valueOf(String str) {
        return (ExperimentSource) Enum.valueOf(ExperimentSource.class, str);
    }

    public static ExperimentSource[] values() {
        return (ExperimentSource[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
