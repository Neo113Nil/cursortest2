package com.yandex.go.scooters.subscription.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/scooters/subscription/api/ScootersSubscriptionPayload$SubscriptionFromScreen", "", "Lcom/yandex/go/scooters/subscription/api/ScootersSubscriptionPayload$SubscriptionFromScreen;", "DISCOVERY", "OFFER", "go-client-android.features.scooters.subscription:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersSubscriptionPayload$SubscriptionFromScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersSubscriptionPayload$SubscriptionFromScreen[] $VALUES;
    public static final ScootersSubscriptionPayload$SubscriptionFromScreen DISCOVERY;
    public static final ScootersSubscriptionPayload$SubscriptionFromScreen OFFER;

    static {
        ScootersSubscriptionPayload$SubscriptionFromScreen scootersSubscriptionPayload$SubscriptionFromScreen = new ScootersSubscriptionPayload$SubscriptionFromScreen("DISCOVERY", 0);
        DISCOVERY = scootersSubscriptionPayload$SubscriptionFromScreen;
        ScootersSubscriptionPayload$SubscriptionFromScreen scootersSubscriptionPayload$SubscriptionFromScreen2 = new ScootersSubscriptionPayload$SubscriptionFromScreen("OFFER", 1);
        OFFER = scootersSubscriptionPayload$SubscriptionFromScreen2;
        ScootersSubscriptionPayload$SubscriptionFromScreen[] scootersSubscriptionPayload$SubscriptionFromScreenArr = {scootersSubscriptionPayload$SubscriptionFromScreen, scootersSubscriptionPayload$SubscriptionFromScreen2};
        $VALUES = scootersSubscriptionPayload$SubscriptionFromScreenArr;
        $ENTRIES = a.a(scootersSubscriptionPayload$SubscriptionFromScreenArr);
    }

    public static ScootersSubscriptionPayload$SubscriptionFromScreen valueOf(String str) {
        return (ScootersSubscriptionPayload$SubscriptionFromScreen) Enum.valueOf(ScootersSubscriptionPayload$SubscriptionFromScreen.class, str);
    }

    public static ScootersSubscriptionPayload$SubscriptionFromScreen[] values() {
        return (ScootersSubscriptionPayload$SubscriptionFromScreen[]) $VALUES.clone();
    }
}
