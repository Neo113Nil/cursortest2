package com.ybsdk.core.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/core/analytics/DeeplinkParamsFilter;", "", "<init>", "(Ljava/lang/String;I)V", "REMOVE", "FORMAT_URL", "KEEP", "MASK", "UNKNOWN", "MAP_RECURSIVE", "MAP_URL_RECURSIVE", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DeeplinkParamsFilter {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeeplinkParamsFilter[] $VALUES;
    public static final DeeplinkParamsFilter REMOVE = new DeeplinkParamsFilter("REMOVE", 0);
    public static final DeeplinkParamsFilter FORMAT_URL = new DeeplinkParamsFilter("FORMAT_URL", 1);
    public static final DeeplinkParamsFilter KEEP = new DeeplinkParamsFilter("KEEP", 2);
    public static final DeeplinkParamsFilter MASK = new DeeplinkParamsFilter("MASK", 3);
    public static final DeeplinkParamsFilter UNKNOWN = new DeeplinkParamsFilter("UNKNOWN", 4);
    public static final DeeplinkParamsFilter MAP_RECURSIVE = new DeeplinkParamsFilter("MAP_RECURSIVE", 5);
    public static final DeeplinkParamsFilter MAP_URL_RECURSIVE = new DeeplinkParamsFilter("MAP_URL_RECURSIVE", 6);

    private static final /* synthetic */ DeeplinkParamsFilter[] $values() {
        return new DeeplinkParamsFilter[]{REMOVE, FORMAT_URL, KEEP, MASK, UNKNOWN, MAP_RECURSIVE, MAP_URL_RECURSIVE};
    }

    static {
        DeeplinkParamsFilter[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DeeplinkParamsFilter(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DeeplinkParamsFilter valueOf(String str) {
        return (DeeplinkParamsFilter) Enum.valueOf(DeeplinkParamsFilter.class, str);
    }

    public static DeeplinkParamsFilter[] values() {
        return (DeeplinkParamsFilter[]) $VALUES.clone();
    }
}
