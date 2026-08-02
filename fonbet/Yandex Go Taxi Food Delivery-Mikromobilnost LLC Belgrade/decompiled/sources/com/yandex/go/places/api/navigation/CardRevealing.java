package com.yandex.go.places.api.navigation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/places/api/navigation/CardRevealing;", "", "EXPANDED", "COMPACT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardRevealing {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardRevealing[] $VALUES;
    public static final CardRevealing COMPACT;
    public static final CardRevealing EXPANDED;

    static {
        CardRevealing cardRevealing = new CardRevealing("EXPANDED", 0);
        EXPANDED = cardRevealing;
        CardRevealing cardRevealing2 = new CardRevealing("COMPACT", 1);
        COMPACT = cardRevealing2;
        CardRevealing[] cardRevealingArr = {cardRevealing, cardRevealing2};
        $VALUES = cardRevealingArr;
        $ENTRIES = a.a(cardRevealingArr);
    }

    public static CardRevealing valueOf(String str) {
        return (CardRevealing) Enum.valueOf(CardRevealing.class, str);
    }

    public static CardRevealing[] values() {
        return (CardRevealing[]) $VALUES.clone();
    }
}
