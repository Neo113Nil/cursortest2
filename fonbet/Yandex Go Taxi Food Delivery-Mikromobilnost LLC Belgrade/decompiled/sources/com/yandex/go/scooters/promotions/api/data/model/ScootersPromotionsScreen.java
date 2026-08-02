package com.yandex.go.scooters.promotions.api.data.model;

import defpackage.doo0;
import defpackage.gsq0;
import defpackage.h5o0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/scooters/promotions/api/data/model/ScootersPromotionsScreen;", "", "Companion", "doo0", "SCOOTERS_ORDER_RESERVATION", "SCOOTERS_ORDER_RIDING", "SCOOTERS_ORDER_PARKING", "SCOOTERS_FEEDBACK_FINISH", "SCOOTERS_FEEDBACK_CANCEL", "SCOOTERS_DISCOVERY", "SCOOTERS_OFFER", "go-client-android.features.scooters.promotions:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPromotionsScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPromotionsScreen[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final doo0 Companion;
    public static final ScootersPromotionsScreen SCOOTERS_DISCOVERY;
    public static final ScootersPromotionsScreen SCOOTERS_FEEDBACK_CANCEL;
    public static final ScootersPromotionsScreen SCOOTERS_FEEDBACK_FINISH;
    public static final ScootersPromotionsScreen SCOOTERS_OFFER;
    public static final ScootersPromotionsScreen SCOOTERS_ORDER_PARKING;
    public static final ScootersPromotionsScreen SCOOTERS_ORDER_RESERVATION;
    public static final ScootersPromotionsScreen SCOOTERS_ORDER_RIDING;

    static {
        ScootersPromotionsScreen scootersPromotionsScreen = new ScootersPromotionsScreen("SCOOTERS_ORDER_RESERVATION", 0);
        SCOOTERS_ORDER_RESERVATION = scootersPromotionsScreen;
        ScootersPromotionsScreen scootersPromotionsScreen2 = new ScootersPromotionsScreen("SCOOTERS_ORDER_RIDING", 1);
        SCOOTERS_ORDER_RIDING = scootersPromotionsScreen2;
        ScootersPromotionsScreen scootersPromotionsScreen3 = new ScootersPromotionsScreen("SCOOTERS_ORDER_PARKING", 2);
        SCOOTERS_ORDER_PARKING = scootersPromotionsScreen3;
        ScootersPromotionsScreen scootersPromotionsScreen4 = new ScootersPromotionsScreen("SCOOTERS_FEEDBACK_FINISH", 3);
        SCOOTERS_FEEDBACK_FINISH = scootersPromotionsScreen4;
        ScootersPromotionsScreen scootersPromotionsScreen5 = new ScootersPromotionsScreen("SCOOTERS_FEEDBACK_CANCEL", 4);
        SCOOTERS_FEEDBACK_CANCEL = scootersPromotionsScreen5;
        ScootersPromotionsScreen scootersPromotionsScreen6 = new ScootersPromotionsScreen("SCOOTERS_DISCOVERY", 5);
        SCOOTERS_DISCOVERY = scootersPromotionsScreen6;
        ScootersPromotionsScreen scootersPromotionsScreen7 = new ScootersPromotionsScreen("SCOOTERS_OFFER", 6);
        SCOOTERS_OFFER = scootersPromotionsScreen7;
        ScootersPromotionsScreen[] scootersPromotionsScreenArr = {scootersPromotionsScreen, scootersPromotionsScreen2, scootersPromotionsScreen3, scootersPromotionsScreen4, scootersPromotionsScreen5, scootersPromotionsScreen6, scootersPromotionsScreen7};
        $VALUES = scootersPromotionsScreenArr;
        $ENTRIES = a.a(scootersPromotionsScreenArr);
        Companion = new doo0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(22));
    }

    public static ScootersPromotionsScreen valueOf(String str) {
        return (ScootersPromotionsScreen) Enum.valueOf(ScootersPromotionsScreen.class, str);
    }

    public static ScootersPromotionsScreen[] values() {
        return (ScootersPromotionsScreen[]) $VALUES.clone();
    }
}
