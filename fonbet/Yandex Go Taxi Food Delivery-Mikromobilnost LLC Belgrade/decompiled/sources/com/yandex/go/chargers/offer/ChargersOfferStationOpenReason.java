package com.yandex.go.chargers.offer;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/chargers/offer/ChargersOfferStationOpenReason;", "", "Map", "DiscountsAndPromocodes", "go-client-android.features.chargers.offer:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOfferStationOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersOfferStationOpenReason[] $VALUES;
    public static final ChargersOfferStationOpenReason DiscountsAndPromocodes;
    public static final ChargersOfferStationOpenReason Map;

    static {
        ChargersOfferStationOpenReason chargersOfferStationOpenReason = new ChargersOfferStationOpenReason("Map", 0);
        Map = chargersOfferStationOpenReason;
        ChargersOfferStationOpenReason chargersOfferStationOpenReason2 = new ChargersOfferStationOpenReason("DiscountsAndPromocodes", 1);
        DiscountsAndPromocodes = chargersOfferStationOpenReason2;
        ChargersOfferStationOpenReason[] chargersOfferStationOpenReasonArr = {chargersOfferStationOpenReason, chargersOfferStationOpenReason2};
        $VALUES = chargersOfferStationOpenReasonArr;
        $ENTRIES = a.a(chargersOfferStationOpenReasonArr);
    }

    public static ChargersOfferStationOpenReason valueOf(String str) {
        return (ChargersOfferStationOpenReason) Enum.valueOf(ChargersOfferStationOpenReason.class, str);
    }

    public static ChargersOfferStationOpenReason[] values() {
        return (ChargersOfferStationOpenReason[]) $VALUES.clone();
    }
}
