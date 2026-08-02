package com.yandex.go.taxi.tariffs.internal.routestats.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/tariffs/internal/routestats/models/RouteStatsMode;", "", "LIGHT", "FULL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RouteStatsMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteStatsMode[] $VALUES;
    public static final RouteStatsMode FULL;
    public static final RouteStatsMode LIGHT;

    static {
        RouteStatsMode routeStatsMode = new RouteStatsMode("LIGHT", 0);
        LIGHT = routeStatsMode;
        RouteStatsMode routeStatsMode2 = new RouteStatsMode("FULL", 1);
        FULL = routeStatsMode2;
        RouteStatsMode[] routeStatsModeArr = {routeStatsMode, routeStatsMode2};
        $VALUES = routeStatsModeArr;
        $ENTRIES = a.a(routeStatsModeArr);
    }

    public static RouteStatsMode valueOf(String str) {
        return (RouteStatsMode) Enum.valueOf(RouteStatsMode.class, str);
    }

    public static RouteStatsMode[] values() {
        return (RouteStatsMode[]) $VALUES.clone();
    }
}
