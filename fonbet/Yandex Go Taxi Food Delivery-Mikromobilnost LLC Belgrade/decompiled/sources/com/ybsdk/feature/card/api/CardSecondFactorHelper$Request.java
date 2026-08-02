package com.ybsdk.feature.card.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/ybsdk/feature/card/api/CardSecondFactorHelper$Request", "", "Lcom/ybsdk/feature/card/api/CardSecondFactorHelper$Request;", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "ACTIVATION", "DELETION", "FREEZING", "SETTINGS", "PERIOD_LIMIT", "REQUISITES", "SET_PIN", "REISSUE", "SET_STATUS_SCREEN", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardSecondFactorHelper$Request {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardSecondFactorHelper$Request[] $VALUES;
    private final String key;
    public static final CardSecondFactorHelper$Request ACTIVATION = new CardSecondFactorHelper$Request("ACTIVATION", 0, "ACTIVATION_REQUEST_KEY");
    public static final CardSecondFactorHelper$Request DELETION = new CardSecondFactorHelper$Request("DELETION", 1, "DELETION_REQUEST_KEY");
    public static final CardSecondFactorHelper$Request FREEZING = new CardSecondFactorHelper$Request("FREEZING", 2, "FREEZING_REQUEST_KEY");
    public static final CardSecondFactorHelper$Request SETTINGS = new CardSecondFactorHelper$Request("SETTINGS", 3, "CARD_SETTINGS_REQUEST_KEY");
    public static final CardSecondFactorHelper$Request PERIOD_LIMIT = new CardSecondFactorHelper$Request("PERIOD_LIMIT", 4, "PERIOD_LIMIT_REQUEST_KEY");
    public static final CardSecondFactorHelper$Request REQUISITES = new CardSecondFactorHelper$Request("REQUISITES", 5, "REQUISITES");
    public static final CardSecondFactorHelper$Request SET_PIN = new CardSecondFactorHelper$Request("SET_PIN", 6, "SET_PIN");
    public static final CardSecondFactorHelper$Request REISSUE = new CardSecondFactorHelper$Request("REISSUE", 7, "CARD_REISSUE");
    public static final CardSecondFactorHelper$Request SET_STATUS_SCREEN = new CardSecondFactorHelper$Request("SET_STATUS_SCREEN", 8, "SET_STATUS_SCREEN_REQUEST_KEY");

    private static final /* synthetic */ CardSecondFactorHelper$Request[] $values() {
        return new CardSecondFactorHelper$Request[]{ACTIVATION, DELETION, FREEZING, SETTINGS, PERIOD_LIMIT, REQUISITES, SET_PIN, REISSUE, SET_STATUS_SCREEN};
    }

    static {
        CardSecondFactorHelper$Request[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CardSecondFactorHelper$Request(String str, int i, String str2) {
        this.key = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardSecondFactorHelper$Request valueOf(String str) {
        return (CardSecondFactorHelper$Request) Enum.valueOf(CardSecondFactorHelper$Request.class, str);
    }

    public static CardSecondFactorHelper$Request[] values() {
        return (CardSecondFactorHelper$Request[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
