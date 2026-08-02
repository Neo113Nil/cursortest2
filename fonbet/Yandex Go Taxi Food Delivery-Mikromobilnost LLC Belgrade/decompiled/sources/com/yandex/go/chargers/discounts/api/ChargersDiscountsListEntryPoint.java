package com.yandex.go.chargers.discounts.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/discounts/api/ChargersDiscountsListEntryPoint;", "", "DISCOVERY", "OFFER", "DEEPLINK", "FEEDBACK", "DISCOVERY_PROMO_NOTCH", "go-client-android.features.chargers.discounts:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountsListEntryPoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersDiscountsListEntryPoint[] $VALUES;
    public static final ChargersDiscountsListEntryPoint DEEPLINK;
    public static final ChargersDiscountsListEntryPoint DISCOVERY;
    public static final ChargersDiscountsListEntryPoint DISCOVERY_PROMO_NOTCH;
    public static final ChargersDiscountsListEntryPoint FEEDBACK;
    public static final ChargersDiscountsListEntryPoint OFFER;

    static {
        ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint = new ChargersDiscountsListEntryPoint("DISCOVERY", 0);
        DISCOVERY = chargersDiscountsListEntryPoint;
        ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint2 = new ChargersDiscountsListEntryPoint("OFFER", 1);
        OFFER = chargersDiscountsListEntryPoint2;
        ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint3 = new ChargersDiscountsListEntryPoint("DEEPLINK", 2);
        DEEPLINK = chargersDiscountsListEntryPoint3;
        ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint4 = new ChargersDiscountsListEntryPoint("FEEDBACK", 3);
        FEEDBACK = chargersDiscountsListEntryPoint4;
        ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint5 = new ChargersDiscountsListEntryPoint("DISCOVERY_PROMO_NOTCH", 4);
        DISCOVERY_PROMO_NOTCH = chargersDiscountsListEntryPoint5;
        ChargersDiscountsListEntryPoint[] chargersDiscountsListEntryPointArr = {chargersDiscountsListEntryPoint, chargersDiscountsListEntryPoint2, chargersDiscountsListEntryPoint3, chargersDiscountsListEntryPoint4, chargersDiscountsListEntryPoint5};
        $VALUES = chargersDiscountsListEntryPointArr;
        $ENTRIES = a.a(chargersDiscountsListEntryPointArr);
    }

    public static ChargersDiscountsListEntryPoint valueOf(String str) {
        return (ChargersDiscountsListEntryPoint) Enum.valueOf(ChargersDiscountsListEntryPoint.class, str);
    }

    public static ChargersDiscountsListEntryPoint[] values() {
        return (ChargersDiscountsListEntryPoint[]) $VALUES.clone();
    }
}
