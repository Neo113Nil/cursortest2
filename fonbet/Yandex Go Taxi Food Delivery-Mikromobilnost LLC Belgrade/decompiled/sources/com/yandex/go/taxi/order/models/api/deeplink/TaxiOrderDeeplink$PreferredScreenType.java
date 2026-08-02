package com.yandex.go.taxi.order.models.api.deeplink;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j0y0;
import defpackage.k4o;
import defpackage.mpx0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/models/api/deeplink/TaxiOrderDeeplink$PreferredScreenType", "", "Lcom/yandex/go/taxi/order/models/api/deeplink/TaxiOrderDeeplink$PreferredScreenType;", "Companion", "j0y0", "ORDER_WITH_FEED", "DEFAULT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderDeeplink$PreferredScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderDeeplink$PreferredScreenType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final j0y0 Companion;
    public static final TaxiOrderDeeplink$PreferredScreenType DEFAULT;
    public static final TaxiOrderDeeplink$PreferredScreenType ORDER_WITH_FEED;

    static {
        TaxiOrderDeeplink$PreferredScreenType taxiOrderDeeplink$PreferredScreenType = new TaxiOrderDeeplink$PreferredScreenType("ORDER_WITH_FEED", 0);
        ORDER_WITH_FEED = taxiOrderDeeplink$PreferredScreenType;
        TaxiOrderDeeplink$PreferredScreenType taxiOrderDeeplink$PreferredScreenType2 = new TaxiOrderDeeplink$PreferredScreenType("DEFAULT", 1);
        DEFAULT = taxiOrderDeeplink$PreferredScreenType2;
        TaxiOrderDeeplink$PreferredScreenType[] taxiOrderDeeplink$PreferredScreenTypeArr = {taxiOrderDeeplink$PreferredScreenType, taxiOrderDeeplink$PreferredScreenType2};
        $VALUES = taxiOrderDeeplink$PreferredScreenTypeArr;
        $ENTRIES = a.a(taxiOrderDeeplink$PreferredScreenTypeArr);
        Companion = new j0y0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mpx0(14));
    }

    public static TaxiOrderDeeplink$PreferredScreenType valueOf(String str) {
        return (TaxiOrderDeeplink$PreferredScreenType) Enum.valueOf(TaxiOrderDeeplink$PreferredScreenType.class, str);
    }

    public static TaxiOrderDeeplink$PreferredScreenType[] values() {
        return (TaxiOrderDeeplink$PreferredScreenType[]) $VALUES.clone();
    }
}
