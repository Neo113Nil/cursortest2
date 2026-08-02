package com.yandex.go.navigator.gas_stations.repositories;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/gas_stations/repositories/GasStationsSearchResult;", "", "LOADING", "SUCCESS", "FAIL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GasStationsSearchResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GasStationsSearchResult[] $VALUES;
    public static final GasStationsSearchResult FAIL;
    public static final GasStationsSearchResult LOADING;
    public static final GasStationsSearchResult SUCCESS;

    static {
        GasStationsSearchResult gasStationsSearchResult = new GasStationsSearchResult("LOADING", 0);
        LOADING = gasStationsSearchResult;
        GasStationsSearchResult gasStationsSearchResult2 = new GasStationsSearchResult("SUCCESS", 1);
        SUCCESS = gasStationsSearchResult2;
        GasStationsSearchResult gasStationsSearchResult3 = new GasStationsSearchResult("FAIL", 2);
        FAIL = gasStationsSearchResult3;
        GasStationsSearchResult[] gasStationsSearchResultArr = {gasStationsSearchResult, gasStationsSearchResult2, gasStationsSearchResult3};
        $VALUES = gasStationsSearchResultArr;
        $ENTRIES = kotlin.enums.a.a(gasStationsSearchResultArr);
    }

    public static GasStationsSearchResult valueOf(String str) {
        return (GasStationsSearchResult) Enum.valueOf(GasStationsSearchResult.class, str);
    }

    public static GasStationsSearchResult[] values() {
        return (GasStationsSearchResult[]) $VALUES.clone();
    }
}
