package com.ybsdk.feature.card.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/card/api/entities/CardCarouselProductType;", "", "<init>", "(Ljava/lang/String;I)V", "WALLET", "PRO", "CREDIT_LIMIT", "CORP_CARD", "UNKNOWN", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardCarouselProductType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardCarouselProductType[] $VALUES;
    public static final CardCarouselProductType WALLET = new CardCarouselProductType("WALLET", 0);
    public static final CardCarouselProductType PRO = new CardCarouselProductType("PRO", 1);
    public static final CardCarouselProductType CREDIT_LIMIT = new CardCarouselProductType("CREDIT_LIMIT", 2);
    public static final CardCarouselProductType CORP_CARD = new CardCarouselProductType("CORP_CARD", 3);
    public static final CardCarouselProductType UNKNOWN = new CardCarouselProductType("UNKNOWN", 4);

    private static final /* synthetic */ CardCarouselProductType[] $values() {
        return new CardCarouselProductType[]{WALLET, PRO, CREDIT_LIMIT, CORP_CARD, UNKNOWN};
    }

    static {
        CardCarouselProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CardCarouselProductType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardCarouselProductType valueOf(String str) {
        return (CardCarouselProductType) Enum.valueOf(CardCarouselProductType.class, str);
    }

    public static CardCarouselProductType[] values() {
        return (CardCarouselProductType[]) $VALUES.clone();
    }
}
