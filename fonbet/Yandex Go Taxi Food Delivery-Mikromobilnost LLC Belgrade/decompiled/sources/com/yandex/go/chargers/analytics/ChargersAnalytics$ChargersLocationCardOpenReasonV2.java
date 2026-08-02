package com.yandex.go.chargers.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersLocationCardOpenReasonV2", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersLocationCardOpenReasonV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Map", "BackFromCamera", "Deeplink", "BLEPush", "DiscountsAndPromocodes", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersLocationCardOpenReasonV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersLocationCardOpenReasonV2[] $VALUES;
    public static final ChargersAnalytics$ChargersLocationCardOpenReasonV2 BLEPush;
    public static final ChargersAnalytics$ChargersLocationCardOpenReasonV2 BackFromCamera;
    public static final ChargersAnalytics$ChargersLocationCardOpenReasonV2 Deeplink;
    public static final ChargersAnalytics$ChargersLocationCardOpenReasonV2 DiscountsAndPromocodes;
    public static final ChargersAnalytics$ChargersLocationCardOpenReasonV2 Map;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersLocationCardOpenReasonV2 chargersAnalytics$ChargersLocationCardOpenReasonV2 = new ChargersAnalytics$ChargersLocationCardOpenReasonV2("Map", 0, PolicyMappingsExtension.MAP);
        Map = chargersAnalytics$ChargersLocationCardOpenReasonV2;
        ChargersAnalytics$ChargersLocationCardOpenReasonV2 chargersAnalytics$ChargersLocationCardOpenReasonV22 = new ChargersAnalytics$ChargersLocationCardOpenReasonV2("BackFromCamera", 1, "back_from_camera");
        BackFromCamera = chargersAnalytics$ChargersLocationCardOpenReasonV22;
        ChargersAnalytics$ChargersLocationCardOpenReasonV2 chargersAnalytics$ChargersLocationCardOpenReasonV23 = new ChargersAnalytics$ChargersLocationCardOpenReasonV2("Deeplink", 2, Constants.DEEPLINK);
        Deeplink = chargersAnalytics$ChargersLocationCardOpenReasonV23;
        ChargersAnalytics$ChargersLocationCardOpenReasonV2 chargersAnalytics$ChargersLocationCardOpenReasonV24 = new ChargersAnalytics$ChargersLocationCardOpenReasonV2("BLEPush", 3, "BLE_push");
        BLEPush = chargersAnalytics$ChargersLocationCardOpenReasonV24;
        ChargersAnalytics$ChargersLocationCardOpenReasonV2 chargersAnalytics$ChargersLocationCardOpenReasonV25 = new ChargersAnalytics$ChargersLocationCardOpenReasonV2("DiscountsAndPromocodes", 4, "discounts_and_promocodes");
        DiscountsAndPromocodes = chargersAnalytics$ChargersLocationCardOpenReasonV25;
        ChargersAnalytics$ChargersLocationCardOpenReasonV2[] chargersAnalytics$ChargersLocationCardOpenReasonV2Arr = {chargersAnalytics$ChargersLocationCardOpenReasonV2, chargersAnalytics$ChargersLocationCardOpenReasonV22, chargersAnalytics$ChargersLocationCardOpenReasonV23, chargersAnalytics$ChargersLocationCardOpenReasonV24, chargersAnalytics$ChargersLocationCardOpenReasonV25};
        $VALUES = chargersAnalytics$ChargersLocationCardOpenReasonV2Arr;
        $ENTRIES = a.a(chargersAnalytics$ChargersLocationCardOpenReasonV2Arr);
    }

    public ChargersAnalytics$ChargersLocationCardOpenReasonV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersLocationCardOpenReasonV2 valueOf(String str) {
        return (ChargersAnalytics$ChargersLocationCardOpenReasonV2) Enum.valueOf(ChargersAnalytics$ChargersLocationCardOpenReasonV2.class, str);
    }

    public static ChargersAnalytics$ChargersLocationCardOpenReasonV2[] values() {
        return (ChargersAnalytics$ChargersLocationCardOpenReasonV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
