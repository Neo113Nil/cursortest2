package com.yandex.go.chargers.qr.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/qr/api/ChargersQrOpenReason;", "", "DISCOVERY", "STATION_CARD", "RETURN_CHARGER", "ACTIVE_ORDER_CARD", "go-client-android.features.chargers.qr:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersQrOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersQrOpenReason[] $VALUES;
    public static final ChargersQrOpenReason ACTIVE_ORDER_CARD;
    public static final ChargersQrOpenReason DISCOVERY;
    public static final ChargersQrOpenReason RETURN_CHARGER;
    public static final ChargersQrOpenReason STATION_CARD;

    static {
        ChargersQrOpenReason chargersQrOpenReason = new ChargersQrOpenReason("DISCOVERY", 0);
        DISCOVERY = chargersQrOpenReason;
        ChargersQrOpenReason chargersQrOpenReason2 = new ChargersQrOpenReason("STATION_CARD", 1);
        STATION_CARD = chargersQrOpenReason2;
        ChargersQrOpenReason chargersQrOpenReason3 = new ChargersQrOpenReason("RETURN_CHARGER", 2);
        RETURN_CHARGER = chargersQrOpenReason3;
        ChargersQrOpenReason chargersQrOpenReason4 = new ChargersQrOpenReason("ACTIVE_ORDER_CARD", 3);
        ACTIVE_ORDER_CARD = chargersQrOpenReason4;
        ChargersQrOpenReason[] chargersQrOpenReasonArr = {chargersQrOpenReason, chargersQrOpenReason2, chargersQrOpenReason3, chargersQrOpenReason4};
        $VALUES = chargersQrOpenReasonArr;
        $ENTRIES = a.a(chargersQrOpenReasonArr);
    }

    public static ChargersQrOpenReason valueOf(String str) {
        return (ChargersQrOpenReason) Enum.valueOf(ChargersQrOpenReason.class, str);
    }

    public static ChargersQrOpenReason[] values() {
        return (ChargersQrOpenReason[]) $VALUES.clone();
    }
}
