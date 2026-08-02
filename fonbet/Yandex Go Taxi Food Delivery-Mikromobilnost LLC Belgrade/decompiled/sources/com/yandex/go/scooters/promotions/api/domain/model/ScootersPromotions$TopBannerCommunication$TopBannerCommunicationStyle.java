package com.yandex.go.scooters.promotions.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/scooters/promotions/api/domain/model/ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle", "", "Lcom/yandex/go/scooters/promotions/api/domain/model/ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle;", "INFO", "WARNING", "ERROR", "go-client-android.features.scooters.promotions:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle[] $VALUES;
    public static final ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle ERROR;
    public static final ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle INFO;
    public static final ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle WARNING;

    static {
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle = new ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle("INFO", 0);
        INFO = scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle;
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle2 = new ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle("WARNING", 1);
        WARNING = scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle2;
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle3 = new ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle("ERROR", 2);
        ERROR = scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle3;
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle[] scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyleArr = {scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle, scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle2, scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle3};
        $VALUES = scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyleArr;
        $ENTRIES = a.a(scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyleArr);
    }

    public static ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle valueOf(String str) {
        return (ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle) Enum.valueOf(ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle.class, str);
    }

    public static ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle[] values() {
        return (ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle[]) $VALUES.clone();
    }
}
