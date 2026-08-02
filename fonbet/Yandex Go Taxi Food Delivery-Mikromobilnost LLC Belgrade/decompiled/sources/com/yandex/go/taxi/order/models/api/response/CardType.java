package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.np8;
import defpackage.we8;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CardType;", "", "Companion", "np8", "CLASSIC", "TWO_BUTTON", "THREE_BUTTON", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CardType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final CardType CLASSIC;
    public static final np8 Companion;
    public static final CardType THREE_BUTTON;
    public static final CardType TWO_BUTTON;

    static {
        CardType cardType = new CardType("CLASSIC", 0);
        CLASSIC = cardType;
        CardType cardType2 = new CardType("TWO_BUTTON", 1);
        TWO_BUTTON = cardType2;
        CardType cardType3 = new CardType("THREE_BUTTON", 2);
        THREE_BUTTON = cardType3;
        CardType[] cardTypeArr = {cardType, cardType2, cardType3};
        $VALUES = cardTypeArr;
        $ENTRIES = kotlin.enums.a.a(cardTypeArr);
        Companion = new np8();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new we8(9));
    }

    public static CardType valueOf(String str) {
        return (CardType) Enum.valueOf(CardType.class, str);
    }

    public static CardType[] values() {
        return (CardType[]) $VALUES.clone();
    }
}
