package com.yandex.go.navigator.gas_stations.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/navigator/gas_stations/models/GasStationSearchType;", "", "ON_ROUTE", "ON_AREA", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GasStationSearchType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GasStationSearchType[] $VALUES;
    public static final GasStationSearchType ON_AREA;
    public static final GasStationSearchType ON_ROUTE;

    static {
        GasStationSearchType gasStationSearchType = new GasStationSearchType("ON_ROUTE", 0);
        ON_ROUTE = gasStationSearchType;
        GasStationSearchType gasStationSearchType2 = new GasStationSearchType("ON_AREA", 1);
        ON_AREA = gasStationSearchType2;
        GasStationSearchType[] gasStationSearchTypeArr = {gasStationSearchType, gasStationSearchType2};
        $VALUES = gasStationSearchTypeArr;
        $ENTRIES = a.a(gasStationSearchTypeArr);
    }

    public static GasStationSearchType valueOf(String str) {
        return (GasStationSearchType) Enum.valueOf(GasStationSearchType.class, str);
    }

    public static GasStationSearchType[] values() {
        return (GasStationSearchType[]) $VALUES.clone();
    }
}
