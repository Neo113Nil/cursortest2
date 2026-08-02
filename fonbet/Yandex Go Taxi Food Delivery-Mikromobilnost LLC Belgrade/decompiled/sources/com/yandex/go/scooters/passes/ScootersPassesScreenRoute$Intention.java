package com.yandex.go.scooters.passes;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/scooters/passes/ScootersPassesScreenRoute$Intention", "", "Lcom/yandex/go/scooters/passes/ScootersPassesScreenRoute$Intention;", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "PURCHASE", Card.ACTIVE, "ACTIVE_RENEW", "ACTIVE_RENEW_DISABLING", "ACTIVE_FREEZING", "ACTIVE_WINBACK", "SUCCESS_PURCHASE", "go-client-android.features.scooters.passes:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPassesScreenRoute$Intention {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPassesScreenRoute$Intention[] $VALUES;
    public static final ScootersPassesScreenRoute$Intention ACTIVE;
    public static final ScootersPassesScreenRoute$Intention ACTIVE_FREEZING;
    public static final ScootersPassesScreenRoute$Intention ACTIVE_RENEW;
    public static final ScootersPassesScreenRoute$Intention ACTIVE_RENEW_DISABLING;
    public static final ScootersPassesScreenRoute$Intention ACTIVE_WINBACK;
    public static final ScootersPassesScreenRoute$Intention PURCHASE;
    public static final ScootersPassesScreenRoute$Intention SUCCESS_PURCHASE;
    private final String value;

    static {
        ScootersPassesScreenRoute$Intention scootersPassesScreenRoute$Intention = new ScootersPassesScreenRoute$Intention("PURCHASE", 0, "purchase");
        PURCHASE = scootersPassesScreenRoute$Intention;
        ScootersPassesScreenRoute$Intention scootersPassesScreenRoute$Intention2 = new ScootersPassesScreenRoute$Intention(Card.ACTIVE, 1, ClidProvider.APP_ACTIVE);
        ACTIVE = scootersPassesScreenRoute$Intention2;
        ScootersPassesScreenRoute$Intention scootersPassesScreenRoute$Intention3 = new ScootersPassesScreenRoute$Intention("ACTIVE_RENEW", 2, "active-renew");
        ACTIVE_RENEW = scootersPassesScreenRoute$Intention3;
        ScootersPassesScreenRoute$Intention scootersPassesScreenRoute$Intention4 = new ScootersPassesScreenRoute$Intention("ACTIVE_RENEW_DISABLING", 3, "active-renew-disabling");
        ACTIVE_RENEW_DISABLING = scootersPassesScreenRoute$Intention4;
        ScootersPassesScreenRoute$Intention scootersPassesScreenRoute$Intention5 = new ScootersPassesScreenRoute$Intention("ACTIVE_FREEZING", 4, "active-freezing");
        ACTIVE_FREEZING = scootersPassesScreenRoute$Intention5;
        ScootersPassesScreenRoute$Intention scootersPassesScreenRoute$Intention6 = new ScootersPassesScreenRoute$Intention("ACTIVE_WINBACK", 5, "active-winback");
        ACTIVE_WINBACK = scootersPassesScreenRoute$Intention6;
        ScootersPassesScreenRoute$Intention scootersPassesScreenRoute$Intention7 = new ScootersPassesScreenRoute$Intention("SUCCESS_PURCHASE", 6, "success-purchase");
        SUCCESS_PURCHASE = scootersPassesScreenRoute$Intention7;
        ScootersPassesScreenRoute$Intention[] scootersPassesScreenRoute$IntentionArr = {scootersPassesScreenRoute$Intention, scootersPassesScreenRoute$Intention2, scootersPassesScreenRoute$Intention3, scootersPassesScreenRoute$Intention4, scootersPassesScreenRoute$Intention5, scootersPassesScreenRoute$Intention6, scootersPassesScreenRoute$Intention7};
        $VALUES = scootersPassesScreenRoute$IntentionArr;
        $ENTRIES = kotlin.enums.a.a(scootersPassesScreenRoute$IntentionArr);
    }

    public ScootersPassesScreenRoute$Intention(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ScootersPassesScreenRoute$Intention valueOf(String str) {
        return (ScootersPassesScreenRoute$Intention) Enum.valueOf(ScootersPassesScreenRoute$Intention.class, str);
    }

    public static ScootersPassesScreenRoute$Intention[] values() {
        return (ScootersPassesScreenRoute$Intention[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
