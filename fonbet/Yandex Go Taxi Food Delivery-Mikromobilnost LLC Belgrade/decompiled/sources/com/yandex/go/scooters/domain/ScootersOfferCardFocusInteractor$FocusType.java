package com.yandex.go.scooters.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/scooters/domain/ScootersOfferCardFocusInteractor$FocusType", "", "Lcom/yandex/go/scooters/domain/ScootersOfferCardFocusInteractor$FocusType;", "FOCUS_ON_USER", "FOCUS_ON_ROUTE", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersOfferCardFocusInteractor$FocusType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersOfferCardFocusInteractor$FocusType[] $VALUES;
    public static final ScootersOfferCardFocusInteractor$FocusType FOCUS_ON_ROUTE;
    public static final ScootersOfferCardFocusInteractor$FocusType FOCUS_ON_USER;

    static {
        ScootersOfferCardFocusInteractor$FocusType scootersOfferCardFocusInteractor$FocusType = new ScootersOfferCardFocusInteractor$FocusType("FOCUS_ON_USER", 0);
        FOCUS_ON_USER = scootersOfferCardFocusInteractor$FocusType;
        ScootersOfferCardFocusInteractor$FocusType scootersOfferCardFocusInteractor$FocusType2 = new ScootersOfferCardFocusInteractor$FocusType("FOCUS_ON_ROUTE", 1);
        FOCUS_ON_ROUTE = scootersOfferCardFocusInteractor$FocusType2;
        ScootersOfferCardFocusInteractor$FocusType[] scootersOfferCardFocusInteractor$FocusTypeArr = {scootersOfferCardFocusInteractor$FocusType, scootersOfferCardFocusInteractor$FocusType2};
        $VALUES = scootersOfferCardFocusInteractor$FocusTypeArr;
        $ENTRIES = kotlin.enums.a.a(scootersOfferCardFocusInteractor$FocusTypeArr);
    }

    public static ScootersOfferCardFocusInteractor$FocusType valueOf(String str) {
        return (ScootersOfferCardFocusInteractor$FocusType) Enum.valueOf(ScootersOfferCardFocusInteractor$FocusType.class, str);
    }

    public static ScootersOfferCardFocusInteractor$FocusType[] values() {
        return (ScootersOfferCardFocusInteractor$FocusType[]) $VALUES.clone();
    }
}
