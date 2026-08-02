package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tvp0;
import defpackage.wpp0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/SearchOverlayType;", "", "Companion", "tvp0", JCP.RAW_PREFIX, "UBER_LONG_SEARCH", "SEARCH_CARS_OVERLAY_STRATEGY", "FAST", "ORDINARY", "LONG", "DISPLAY_BANNERS", "SEARCH_COMPANIONS", "QUEUE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SearchOverlayType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SearchOverlayType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final tvp0 Companion;
    public static final SearchOverlayType DISPLAY_BANNERS;
    public static final SearchOverlayType FAST;
    public static final SearchOverlayType LONG;
    public static final SearchOverlayType NONE;
    public static final SearchOverlayType ORDINARY;
    public static final SearchOverlayType QUEUE;
    public static final SearchOverlayType SEARCH_CARS_OVERLAY_STRATEGY;
    public static final SearchOverlayType SEARCH_COMPANIONS;
    public static final SearchOverlayType UBER_LONG_SEARCH;

    static {
        SearchOverlayType searchOverlayType = new SearchOverlayType(JCP.RAW_PREFIX, 0);
        NONE = searchOverlayType;
        SearchOverlayType searchOverlayType2 = new SearchOverlayType("UBER_LONG_SEARCH", 1);
        UBER_LONG_SEARCH = searchOverlayType2;
        SearchOverlayType searchOverlayType3 = new SearchOverlayType("SEARCH_CARS_OVERLAY_STRATEGY", 2);
        SEARCH_CARS_OVERLAY_STRATEGY = searchOverlayType3;
        SearchOverlayType searchOverlayType4 = new SearchOverlayType("FAST", 3);
        FAST = searchOverlayType4;
        SearchOverlayType searchOverlayType5 = new SearchOverlayType("ORDINARY", 4);
        ORDINARY = searchOverlayType5;
        SearchOverlayType searchOverlayType6 = new SearchOverlayType("LONG", 5);
        LONG = searchOverlayType6;
        SearchOverlayType searchOverlayType7 = new SearchOverlayType("DISPLAY_BANNERS", 6);
        DISPLAY_BANNERS = searchOverlayType7;
        SearchOverlayType searchOverlayType8 = new SearchOverlayType("SEARCH_COMPANIONS", 7);
        SEARCH_COMPANIONS = searchOverlayType8;
        SearchOverlayType searchOverlayType9 = new SearchOverlayType("QUEUE", 8);
        QUEUE = searchOverlayType9;
        SearchOverlayType[] searchOverlayTypeArr = {searchOverlayType, searchOverlayType2, searchOverlayType3, searchOverlayType4, searchOverlayType5, searchOverlayType6, searchOverlayType7, searchOverlayType8, searchOverlayType9};
        $VALUES = searchOverlayTypeArr;
        $ENTRIES = kotlin.enums.a.a(searchOverlayTypeArr);
        Companion = new tvp0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wpp0(10));
    }

    public static SearchOverlayType valueOf(String str) {
        return (SearchOverlayType) Enum.valueOf(SearchOverlayType.class, str);
    }

    public static SearchOverlayType[] values() {
        return (SearchOverlayType[]) $VALUES.clone();
    }
}
