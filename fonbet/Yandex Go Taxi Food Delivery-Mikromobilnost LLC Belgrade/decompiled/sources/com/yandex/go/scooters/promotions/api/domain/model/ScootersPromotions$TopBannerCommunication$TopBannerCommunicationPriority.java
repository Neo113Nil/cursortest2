package com.yandex.go.scooters.promotions.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/scooters/promotions/api/domain/model/ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority", "", "Lcom/yandex/go/scooters/promotions/api/domain/model/ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority;", "LOW", "DEFAULT", "HIGH", "go-client-android.features.scooters.promotions:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority[] $VALUES;
    public static final ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority DEFAULT;
    public static final ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority HIGH;
    public static final ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority LOW;

    static {
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority = new ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority("LOW", 0);
        LOW = scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority;
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority2 = new ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority("DEFAULT", 1);
        DEFAULT = scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority2;
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority3 = new ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority("HIGH", 2);
        HIGH = scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority3;
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority[] scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriorityArr = {scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority, scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority2, scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority3};
        $VALUES = scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriorityArr;
        $ENTRIES = a.a(scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriorityArr);
    }

    public static ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority valueOf(String str) {
        return (ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority) Enum.valueOf(ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority.class, str);
    }

    public static ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority[] values() {
        return (ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority[]) $VALUES.clone();
    }
}
