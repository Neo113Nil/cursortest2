package com.yandex.payment.sdk.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/payment/sdk/ui/CardInput$State", "", "Lcom/yandex/payment/sdk/ui/CardInput$State;", "CARD_NUMBER", "CARD_NUMBER_VALID", "CARD_DETAILS", "CARD_DETAILS_VALID", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardInput$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardInput$State[] $VALUES;
    public static final CardInput$State CARD_DETAILS;
    public static final CardInput$State CARD_DETAILS_VALID;
    public static final CardInput$State CARD_NUMBER;
    public static final CardInput$State CARD_NUMBER_VALID;

    static {
        CardInput$State cardInput$State = new CardInput$State("CARD_NUMBER", 0);
        CARD_NUMBER = cardInput$State;
        CardInput$State cardInput$State2 = new CardInput$State("CARD_NUMBER_VALID", 1);
        CARD_NUMBER_VALID = cardInput$State2;
        CardInput$State cardInput$State3 = new CardInput$State("CARD_DETAILS", 2);
        CARD_DETAILS = cardInput$State3;
        CardInput$State cardInput$State4 = new CardInput$State("CARD_DETAILS_VALID", 3);
        CARD_DETAILS_VALID = cardInput$State4;
        CardInput$State[] cardInput$StateArr = {cardInput$State, cardInput$State2, cardInput$State3, cardInput$State4};
        $VALUES = cardInput$StateArr;
        $ENTRIES = kotlin.enums.a.a(cardInput$StateArr);
    }

    public static CardInput$State valueOf(String str) {
        return (CardInput$State) Enum.valueOf(CardInput$State.class, str);
    }

    public static CardInput$State[] values() {
        return (CardInput$State[]) $VALUES.clone();
    }
}
