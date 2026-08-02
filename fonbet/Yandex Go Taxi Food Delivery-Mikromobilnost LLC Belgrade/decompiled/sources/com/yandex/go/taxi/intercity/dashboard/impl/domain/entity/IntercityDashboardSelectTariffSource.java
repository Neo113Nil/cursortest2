package com.yandex.go.taxi.intercity.dashboard.impl.domain.entity;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/domain/entity/IntercityDashboardSelectTariffSource;", "", "UPDATE_DASHBOARD_CONTENT", "DEEPLINK", "USER", "SUMMARY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardSelectTariffSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityDashboardSelectTariffSource[] $VALUES;
    public static final IntercityDashboardSelectTariffSource DEEPLINK;
    public static final IntercityDashboardSelectTariffSource SUMMARY;
    public static final IntercityDashboardSelectTariffSource UPDATE_DASHBOARD_CONTENT;
    public static final IntercityDashboardSelectTariffSource USER;

    static {
        IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource = new IntercityDashboardSelectTariffSource("UPDATE_DASHBOARD_CONTENT", 0);
        UPDATE_DASHBOARD_CONTENT = intercityDashboardSelectTariffSource;
        IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource2 = new IntercityDashboardSelectTariffSource("DEEPLINK", 1);
        DEEPLINK = intercityDashboardSelectTariffSource2;
        IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource3 = new IntercityDashboardSelectTariffSource("USER", 2);
        USER = intercityDashboardSelectTariffSource3;
        IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource4 = new IntercityDashboardSelectTariffSource("SUMMARY", 3);
        SUMMARY = intercityDashboardSelectTariffSource4;
        IntercityDashboardSelectTariffSource[] intercityDashboardSelectTariffSourceArr = {intercityDashboardSelectTariffSource, intercityDashboardSelectTariffSource2, intercityDashboardSelectTariffSource3, intercityDashboardSelectTariffSource4};
        $VALUES = intercityDashboardSelectTariffSourceArr;
        $ENTRIES = a.a(intercityDashboardSelectTariffSourceArr);
    }

    public static IntercityDashboardSelectTariffSource valueOf(String str) {
        return (IntercityDashboardSelectTariffSource) Enum.valueOf(IntercityDashboardSelectTariffSource.class, str);
    }

    public static IntercityDashboardSelectTariffSource[] values() {
        return (IntercityDashboardSelectTariffSource[]) $VALUES.clone();
    }
}
