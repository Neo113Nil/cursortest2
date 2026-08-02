package com.yandex.go.scooters.subscription.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/scooters/subscription/api/ScootersSubscriptionEntryPoint;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OFFER_PROMOBLOCK", "OFFER_BOOK_BUTTON", "DEEPLINK", "go-client-android.features.scooters.subscription:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersSubscriptionEntryPoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersSubscriptionEntryPoint[] $VALUES;
    public static final ScootersSubscriptionEntryPoint DEEPLINK;
    public static final ScootersSubscriptionEntryPoint OFFER_BOOK_BUTTON;
    public static final ScootersSubscriptionEntryPoint OFFER_PROMOBLOCK;
    private final String value;

    static {
        ScootersSubscriptionEntryPoint scootersSubscriptionEntryPoint = new ScootersSubscriptionEntryPoint("OFFER_PROMOBLOCK", 0, "scooters_offer_promoblock");
        OFFER_PROMOBLOCK = scootersSubscriptionEntryPoint;
        ScootersSubscriptionEntryPoint scootersSubscriptionEntryPoint2 = new ScootersSubscriptionEntryPoint("OFFER_BOOK_BUTTON", 1, "scooters_offer_book_button");
        OFFER_BOOK_BUTTON = scootersSubscriptionEntryPoint2;
        ScootersSubscriptionEntryPoint scootersSubscriptionEntryPoint3 = new ScootersSubscriptionEntryPoint("DEEPLINK", 2, "scooters_deeplink");
        DEEPLINK = scootersSubscriptionEntryPoint3;
        ScootersSubscriptionEntryPoint[] scootersSubscriptionEntryPointArr = {scootersSubscriptionEntryPoint, scootersSubscriptionEntryPoint2, scootersSubscriptionEntryPoint3};
        $VALUES = scootersSubscriptionEntryPointArr;
        $ENTRIES = a.a(scootersSubscriptionEntryPointArr);
    }

    public ScootersSubscriptionEntryPoint(String str, int i, String str2) {
        this.value = str2;
    }

    public static ScootersSubscriptionEntryPoint valueOf(String str) {
        return (ScootersSubscriptionEntryPoint) Enum.valueOf(ScootersSubscriptionEntryPoint.class, str);
    }

    public static ScootersSubscriptionEntryPoint[] values() {
        return (ScootersSubscriptionEntryPoint[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
