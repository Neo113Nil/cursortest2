package com.yandex.payment.sdk.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/payment/sdk/ui/CardInputMode;", "", "BindOnly", "PayAndBind", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardInputMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardInputMode[] $VALUES;
    public static final CardInputMode BindOnly;
    public static final CardInputMode PayAndBind;

    static {
        CardInputMode cardInputMode = new CardInputMode("BindOnly", 0);
        BindOnly = cardInputMode;
        CardInputMode cardInputMode2 = new CardInputMode("PayAndBind", 1);
        PayAndBind = cardInputMode2;
        CardInputMode[] cardInputModeArr = {cardInputMode, cardInputMode2};
        $VALUES = cardInputModeArr;
        $ENTRIES = kotlin.enums.a.a(cardInputModeArr);
    }

    public static CardInputMode valueOf(String str) {
        return (CardInputMode) Enum.valueOf(CardInputMode.class, str);
    }

    public static CardInputMode[] values() {
        return (CardInputMode[]) $VALUES.clone();
    }
}
