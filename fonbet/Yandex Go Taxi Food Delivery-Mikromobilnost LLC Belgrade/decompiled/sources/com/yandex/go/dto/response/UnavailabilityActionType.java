package com.yandex.go.dto.response;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/dto/response/UnavailabilityActionType;", "", "UNSUPPORTED", "DEEPLINK", "OPEN_SUMMARY_ADDRESS", "OPEN_ORDER_POPUP", "OPEN_TARIFF_CARD", "OPEN_FLEX_SCREEN", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnavailabilityActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UnavailabilityActionType[] $VALUES;
    public static final UnavailabilityActionType DEEPLINK;
    public static final UnavailabilityActionType OPEN_FLEX_SCREEN;
    public static final UnavailabilityActionType OPEN_ORDER_POPUP;
    public static final UnavailabilityActionType OPEN_SUMMARY_ADDRESS;
    public static final UnavailabilityActionType OPEN_TARIFF_CARD;
    public static final UnavailabilityActionType UNSUPPORTED;

    static {
        UnavailabilityActionType unavailabilityActionType = new UnavailabilityActionType("UNSUPPORTED", 0);
        UNSUPPORTED = unavailabilityActionType;
        UnavailabilityActionType unavailabilityActionType2 = new UnavailabilityActionType("DEEPLINK", 1);
        DEEPLINK = unavailabilityActionType2;
        UnavailabilityActionType unavailabilityActionType3 = new UnavailabilityActionType("OPEN_SUMMARY_ADDRESS", 2);
        OPEN_SUMMARY_ADDRESS = unavailabilityActionType3;
        UnavailabilityActionType unavailabilityActionType4 = new UnavailabilityActionType("OPEN_ORDER_POPUP", 3);
        OPEN_ORDER_POPUP = unavailabilityActionType4;
        UnavailabilityActionType unavailabilityActionType5 = new UnavailabilityActionType("OPEN_TARIFF_CARD", 4);
        OPEN_TARIFF_CARD = unavailabilityActionType5;
        UnavailabilityActionType unavailabilityActionType6 = new UnavailabilityActionType("OPEN_FLEX_SCREEN", 5);
        OPEN_FLEX_SCREEN = unavailabilityActionType6;
        UnavailabilityActionType[] unavailabilityActionTypeArr = {unavailabilityActionType, unavailabilityActionType2, unavailabilityActionType3, unavailabilityActionType4, unavailabilityActionType5, unavailabilityActionType6};
        $VALUES = unavailabilityActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(unavailabilityActionTypeArr);
    }

    public static UnavailabilityActionType valueOf(String str) {
        return (UnavailabilityActionType) Enum.valueOf(UnavailabilityActionType.class, str);
    }

    public static UnavailabilityActionType[] values() {
        return (UnavailabilityActionType[]) $VALUES.clone();
    }
}
