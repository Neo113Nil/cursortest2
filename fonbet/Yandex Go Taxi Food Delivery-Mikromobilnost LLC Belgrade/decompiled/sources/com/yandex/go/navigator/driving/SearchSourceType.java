package com.yandex.go.navigator.driving;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/navigator/driving/SearchSourceType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FILTER", "PETROL_STATION_SEARCH", "MOVE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchSourceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SearchSourceType[] $VALUES;
    public static final SearchSourceType FILTER;
    public static final SearchSourceType MOVE;
    public static final SearchSourceType PETROL_STATION_SEARCH;
    private final String value;

    static {
        SearchSourceType searchSourceType = new SearchSourceType("FILTER", 0, "filter");
        FILTER = searchSourceType;
        SearchSourceType searchSourceType2 = new SearchSourceType("PETROL_STATION_SEARCH", 1, "petrol_station_search");
        PETROL_STATION_SEARCH = searchSourceType2;
        SearchSourceType searchSourceType3 = new SearchSourceType("MOVE", 2, "move");
        MOVE = searchSourceType3;
        SearchSourceType[] searchSourceTypeArr = {searchSourceType, searchSourceType2, searchSourceType3};
        $VALUES = searchSourceTypeArr;
        $ENTRIES = kotlin.enums.a.a(searchSourceTypeArr);
    }

    public SearchSourceType(String str, int i, String str2) {
        this.value = str2;
    }

    public static SearchSourceType valueOf(String str) {
        return (SearchSourceType) Enum.valueOf(SearchSourceType.class, str);
    }

    public static SearchSourceType[] values() {
        return (SearchSourceType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
