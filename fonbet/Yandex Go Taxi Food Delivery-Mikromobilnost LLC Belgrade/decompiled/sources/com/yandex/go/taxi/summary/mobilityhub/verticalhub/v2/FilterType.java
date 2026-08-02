package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/FilterType;", "", "TRANSPORT_TYPE_SELECTOR", "DUE_SELECTOR", "MUTUAL_EXCLUSIVE_FILTER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FilterType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FilterType[] $VALUES;
    public static final FilterType DUE_SELECTOR;
    public static final FilterType MUTUAL_EXCLUSIVE_FILTER;
    public static final FilterType TRANSPORT_TYPE_SELECTOR;

    static {
        FilterType filterType = new FilterType("TRANSPORT_TYPE_SELECTOR", 0);
        TRANSPORT_TYPE_SELECTOR = filterType;
        FilterType filterType2 = new FilterType("DUE_SELECTOR", 1);
        DUE_SELECTOR = filterType2;
        FilterType filterType3 = new FilterType("MUTUAL_EXCLUSIVE_FILTER", 2);
        MUTUAL_EXCLUSIVE_FILTER = filterType3;
        FilterType[] filterTypeArr = {filterType, filterType2, filterType3};
        $VALUES = filterTypeArr;
        $ENTRIES = kotlin.enums.a.a(filterTypeArr);
    }

    public static FilterType valueOf(String str) {
        return (FilterType) Enum.valueOf(FilterType.class, str);
    }

    public static FilterType[] values() {
        return (FilterType[]) $VALUES.clone();
    }
}
