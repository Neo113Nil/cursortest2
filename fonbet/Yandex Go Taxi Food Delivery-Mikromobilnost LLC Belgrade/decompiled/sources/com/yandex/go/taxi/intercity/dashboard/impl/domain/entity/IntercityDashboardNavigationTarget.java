package com.yandex.go.taxi.intercity.dashboard.impl.domain.entity;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/domain/entity/IntercityDashboardNavigationTarget;", "", "FLEX", "DUE_TIMETABLE", "SUMMARY", "DISCOVERY", "SUGGEST", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardNavigationTarget {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityDashboardNavigationTarget[] $VALUES;
    public static final IntercityDashboardNavigationTarget DISCOVERY;
    public static final IntercityDashboardNavigationTarget DUE_TIMETABLE;
    public static final IntercityDashboardNavigationTarget FLEX;
    public static final IntercityDashboardNavigationTarget SUGGEST;
    public static final IntercityDashboardNavigationTarget SUMMARY;

    static {
        IntercityDashboardNavigationTarget intercityDashboardNavigationTarget = new IntercityDashboardNavigationTarget("FLEX", 0);
        FLEX = intercityDashboardNavigationTarget;
        IntercityDashboardNavigationTarget intercityDashboardNavigationTarget2 = new IntercityDashboardNavigationTarget("DUE_TIMETABLE", 1);
        DUE_TIMETABLE = intercityDashboardNavigationTarget2;
        IntercityDashboardNavigationTarget intercityDashboardNavigationTarget3 = new IntercityDashboardNavigationTarget("SUMMARY", 2);
        SUMMARY = intercityDashboardNavigationTarget3;
        IntercityDashboardNavigationTarget intercityDashboardNavigationTarget4 = new IntercityDashboardNavigationTarget("DISCOVERY", 3);
        DISCOVERY = intercityDashboardNavigationTarget4;
        IntercityDashboardNavigationTarget intercityDashboardNavigationTarget5 = new IntercityDashboardNavigationTarget("SUGGEST", 4);
        SUGGEST = intercityDashboardNavigationTarget5;
        IntercityDashboardNavigationTarget[] intercityDashboardNavigationTargetArr = {intercityDashboardNavigationTarget, intercityDashboardNavigationTarget2, intercityDashboardNavigationTarget3, intercityDashboardNavigationTarget4, intercityDashboardNavigationTarget5};
        $VALUES = intercityDashboardNavigationTargetArr;
        $ENTRIES = a.a(intercityDashboardNavigationTargetArr);
    }

    public static IntercityDashboardNavigationTarget valueOf(String str) {
        return (IntercityDashboardNavigationTarget) Enum.valueOf(IntercityDashboardNavigationTarget.class, str);
    }

    public static IntercityDashboardNavigationTarget[] values() {
        return (IntercityDashboardNavigationTarget[]) $VALUES.clone();
    }
}
