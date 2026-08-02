package com.ybsdk.feature.card.internal.interactors.requisites;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/card/internal/interactors/requisites/CardProductId;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Split", "CorpCard", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CardProductId {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardProductId[] $VALUES;
    public static final CardProductId CorpCard;
    public static final CardProductId Split;
    private final String value;

    static {
        CardProductId cardProductId = new CardProductId("Split", 0, "split");
        Split = cardProductId;
        CardProductId cardProductId2 = new CardProductId("CorpCard", 1, "corp_card");
        CorpCard = cardProductId2;
        CardProductId[] cardProductIdArr = {cardProductId, cardProductId2};
        $VALUES = cardProductIdArr;
        $ENTRIES = kotlin.enums.a.a(cardProductIdArr);
    }

    public CardProductId(String str, int i, String str2) {
        this.value = str2;
    }

    public static CardProductId valueOf(String str) {
        return (CardProductId) Enum.valueOf(CardProductId.class, str);
    }

    public static CardProductId[] values() {
        return (CardProductId[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
