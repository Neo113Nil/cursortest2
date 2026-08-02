package com.yandex.go.payments.api.card;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/payments/api/card/CardScrollMode;", "", "HORIZONTAL", "VERTICAL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardScrollMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardScrollMode[] $VALUES;
    public static final CardScrollMode HORIZONTAL;
    public static final CardScrollMode VERTICAL;

    static {
        CardScrollMode cardScrollMode = new CardScrollMode("HORIZONTAL", 0);
        HORIZONTAL = cardScrollMode;
        CardScrollMode cardScrollMode2 = new CardScrollMode("VERTICAL", 1);
        VERTICAL = cardScrollMode2;
        CardScrollMode[] cardScrollModeArr = {cardScrollMode, cardScrollMode2};
        $VALUES = cardScrollModeArr;
        $ENTRIES = a.a(cardScrollModeArr);
    }

    public static CardScrollMode valueOf(String str) {
        return (CardScrollMode) Enum.valueOf(CardScrollMode.class, str);
    }

    public static CardScrollMode[] values() {
        return (CardScrollMode[]) $VALUES.clone();
    }
}
