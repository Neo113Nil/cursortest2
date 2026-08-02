package com.yandex.go.chargers.dvizh_subscription.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/chargers/dvizh_subscription/api/ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint", "", "Lcom/yandex/go/chargers/dvizh_subscription/api/ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DISCOVERY", "FEEDBACK", "OFFER", "ACTIVE_ORDER", "DEEPLINK", "go-client-android.features.chargers.dvizh_subscription:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint[] $VALUES;
    public static final ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint ACTIVE_ORDER;
    public static final ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint DEEPLINK;
    public static final ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint DISCOVERY;
    public static final ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint FEEDBACK;
    public static final ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint OFFER;
    private final String value;

    static {
        ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint = new ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint("DISCOVERY", 0, "chargers_discovery");
        DISCOVERY = chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint;
        ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint2 = new ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint("FEEDBACK", 1, "chargers_feedback");
        FEEDBACK = chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint2;
        ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint3 = new ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint("OFFER", 2, "chargers_offer");
        OFFER = chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint3;
        ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint4 = new ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint("ACTIVE_ORDER", 3, "chargers_active_order");
        ACTIVE_ORDER = chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint4;
        ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint5 = new ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint("DEEPLINK", 4, "chargers_deeplink");
        DEEPLINK = chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint5;
        ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint[] chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPointArr = {chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint, chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint2, chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint3, chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint4, chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint5};
        $VALUES = chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPointArr;
        $ENTRIES = a.a(chargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPointArr);
    }

    public ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint valueOf(String str) {
        return (ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint) Enum.valueOf(ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint.class, str);
    }

    public static ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint[] values() {
        return (ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
