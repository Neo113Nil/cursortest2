package com.yandex.go.chargers.station.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/station/api/ChargersStationOpenReason;", "", "Map", "BackFromCamera", "Deeplink", "BlePush", "DiscountsAndPromocodes", "go-client-android.features.chargers.station:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersStationOpenReason[] $VALUES;
    public static final ChargersStationOpenReason BackFromCamera;
    public static final ChargersStationOpenReason BlePush;
    public static final ChargersStationOpenReason Deeplink;
    public static final ChargersStationOpenReason DiscountsAndPromocodes;
    public static final ChargersStationOpenReason Map;

    static {
        ChargersStationOpenReason chargersStationOpenReason = new ChargersStationOpenReason("Map", 0);
        Map = chargersStationOpenReason;
        ChargersStationOpenReason chargersStationOpenReason2 = new ChargersStationOpenReason("BackFromCamera", 1);
        BackFromCamera = chargersStationOpenReason2;
        ChargersStationOpenReason chargersStationOpenReason3 = new ChargersStationOpenReason("Deeplink", 2);
        Deeplink = chargersStationOpenReason3;
        ChargersStationOpenReason chargersStationOpenReason4 = new ChargersStationOpenReason("BlePush", 3);
        BlePush = chargersStationOpenReason4;
        ChargersStationOpenReason chargersStationOpenReason5 = new ChargersStationOpenReason("DiscountsAndPromocodes", 4);
        DiscountsAndPromocodes = chargersStationOpenReason5;
        ChargersStationOpenReason[] chargersStationOpenReasonArr = {chargersStationOpenReason, chargersStationOpenReason2, chargersStationOpenReason3, chargersStationOpenReason4, chargersStationOpenReason5};
        $VALUES = chargersStationOpenReasonArr;
        $ENTRIES = a.a(chargersStationOpenReasonArr);
    }

    public static ChargersStationOpenReason valueOf(String str) {
        return (ChargersStationOpenReason) Enum.valueOf(ChargersStationOpenReason.class, str);
    }

    public static ChargersStationOpenReason[] values() {
        return (ChargersStationOpenReason[]) $VALUES.clone();
    }
}
