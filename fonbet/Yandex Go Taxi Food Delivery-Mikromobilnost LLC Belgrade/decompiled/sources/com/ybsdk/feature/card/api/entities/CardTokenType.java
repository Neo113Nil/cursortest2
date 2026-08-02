package com.ybsdk.feature.card.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/card/api/entities/CardTokenType;", "", "<init>", "(Ljava/lang/String;I)V", "GOOGLE_PAY", "APPLE_PAY", "MIR_PAY", "SAMSUNG_PAY", "YANDEX_PAY", "SBER_PAY", "UNKNOWN", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardTokenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardTokenType[] $VALUES;
    public static final CardTokenType GOOGLE_PAY = new CardTokenType("GOOGLE_PAY", 0);
    public static final CardTokenType APPLE_PAY = new CardTokenType("APPLE_PAY", 1);
    public static final CardTokenType MIR_PAY = new CardTokenType("MIR_PAY", 2);
    public static final CardTokenType SAMSUNG_PAY = new CardTokenType("SAMSUNG_PAY", 3);
    public static final CardTokenType YANDEX_PAY = new CardTokenType("YANDEX_PAY", 4);
    public static final CardTokenType SBER_PAY = new CardTokenType("SBER_PAY", 5);
    public static final CardTokenType UNKNOWN = new CardTokenType("UNKNOWN", 6);

    private static final /* synthetic */ CardTokenType[] $values() {
        return new CardTokenType[]{GOOGLE_PAY, APPLE_PAY, MIR_PAY, SAMSUNG_PAY, YANDEX_PAY, SBER_PAY, UNKNOWN};
    }

    static {
        CardTokenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CardTokenType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardTokenType valueOf(String str) {
        return (CardTokenType) Enum.valueOf(CardTokenType.class, str);
    }

    public static CardTokenType[] values() {
        return (CardTokenType[]) $VALUES.clone();
    }
}
