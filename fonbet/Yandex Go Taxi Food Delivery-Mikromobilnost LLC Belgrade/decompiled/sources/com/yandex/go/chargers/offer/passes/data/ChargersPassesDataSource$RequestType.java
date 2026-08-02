package com.yandex.go.chargers.offer.passes.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/offer/passes/data/ChargersPassesDataSource$RequestType", "", "Lcom/yandex/go/chargers/offer/passes/data/ChargersPassesDataSource$RequestType;", "PURCHASE", "STATE_CHANGE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ChargersPassesDataSource$RequestType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersPassesDataSource$RequestType[] $VALUES;
    public static final ChargersPassesDataSource$RequestType PURCHASE;
    public static final ChargersPassesDataSource$RequestType STATE_CHANGE;

    static {
        ChargersPassesDataSource$RequestType chargersPassesDataSource$RequestType = new ChargersPassesDataSource$RequestType("PURCHASE", 0);
        PURCHASE = chargersPassesDataSource$RequestType;
        ChargersPassesDataSource$RequestType chargersPassesDataSource$RequestType2 = new ChargersPassesDataSource$RequestType("STATE_CHANGE", 1);
        STATE_CHANGE = chargersPassesDataSource$RequestType2;
        ChargersPassesDataSource$RequestType[] chargersPassesDataSource$RequestTypeArr = {chargersPassesDataSource$RequestType, chargersPassesDataSource$RequestType2};
        $VALUES = chargersPassesDataSource$RequestTypeArr;
        $ENTRIES = kotlin.enums.a.a(chargersPassesDataSource$RequestTypeArr);
    }

    public static ChargersPassesDataSource$RequestType valueOf(String str) {
        return (ChargersPassesDataSource$RequestType) Enum.valueOf(ChargersPassesDataSource$RequestType.class, str);
    }

    public static ChargersPassesDataSource$RequestType[] values() {
        return (ChargersPassesDataSource$RequestType[]) $VALUES.clone();
    }
}
