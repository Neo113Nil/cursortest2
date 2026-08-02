package com.yandex.go.routestats;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/routestats/PrefetchRouteStatsMode;", "", "DISABLED", "ONLY_FIRST", "FIRST_TWO", "ALL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PrefetchRouteStatsMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PrefetchRouteStatsMode[] $VALUES;
    public static final PrefetchRouteStatsMode ALL;
    public static final PrefetchRouteStatsMode DISABLED;
    public static final PrefetchRouteStatsMode FIRST_TWO;
    public static final PrefetchRouteStatsMode ONLY_FIRST;

    static {
        PrefetchRouteStatsMode prefetchRouteStatsMode = new PrefetchRouteStatsMode("DISABLED", 0);
        DISABLED = prefetchRouteStatsMode;
        PrefetchRouteStatsMode prefetchRouteStatsMode2 = new PrefetchRouteStatsMode("ONLY_FIRST", 1);
        ONLY_FIRST = prefetchRouteStatsMode2;
        PrefetchRouteStatsMode prefetchRouteStatsMode3 = new PrefetchRouteStatsMode("FIRST_TWO", 2);
        FIRST_TWO = prefetchRouteStatsMode3;
        PrefetchRouteStatsMode prefetchRouteStatsMode4 = new PrefetchRouteStatsMode("ALL", 3);
        ALL = prefetchRouteStatsMode4;
        PrefetchRouteStatsMode[] prefetchRouteStatsModeArr = {prefetchRouteStatsMode, prefetchRouteStatsMode2, prefetchRouteStatsMode3, prefetchRouteStatsMode4};
        $VALUES = prefetchRouteStatsModeArr;
        $ENTRIES = kotlin.enums.a.a(prefetchRouteStatsModeArr);
    }

    public static PrefetchRouteStatsMode valueOf(String str) {
        return (PrefetchRouteStatsMode) Enum.valueOf(PrefetchRouteStatsMode.class, str);
    }

    public static PrefetchRouteStatsMode[] values() {
        return (PrefetchRouteStatsMode[]) $VALUES.clone();
    }
}
