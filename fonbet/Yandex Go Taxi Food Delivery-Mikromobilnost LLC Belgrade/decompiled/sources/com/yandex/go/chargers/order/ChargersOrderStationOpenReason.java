package com.yandex.go.chargers.order;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/chargers/order/ChargersOrderStationOpenReason;", "", "Map", "DiscountsAndPromocodes", "go-client-android.features.chargers.order:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOrderStationOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersOrderStationOpenReason[] $VALUES;
    public static final ChargersOrderStationOpenReason DiscountsAndPromocodes;
    public static final ChargersOrderStationOpenReason Map;

    static {
        ChargersOrderStationOpenReason chargersOrderStationOpenReason = new ChargersOrderStationOpenReason("Map", 0);
        Map = chargersOrderStationOpenReason;
        ChargersOrderStationOpenReason chargersOrderStationOpenReason2 = new ChargersOrderStationOpenReason("DiscountsAndPromocodes", 1);
        DiscountsAndPromocodes = chargersOrderStationOpenReason2;
        ChargersOrderStationOpenReason[] chargersOrderStationOpenReasonArr = {chargersOrderStationOpenReason, chargersOrderStationOpenReason2};
        $VALUES = chargersOrderStationOpenReasonArr;
        $ENTRIES = a.a(chargersOrderStationOpenReasonArr);
    }

    public static ChargersOrderStationOpenReason valueOf(String str) {
        return (ChargersOrderStationOpenReason) Enum.valueOf(ChargersOrderStationOpenReason.class, str);
    }

    public static ChargersOrderStationOpenReason[] values() {
        return (ChargersOrderStationOpenReason[]) $VALUES.clone();
    }
}
