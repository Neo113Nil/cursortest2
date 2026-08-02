package com.yandex.fintechsdk.data.payment.method.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/fintechsdk/data/payment/method/api/model/CardBindingCurrency;", "", "RUB", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardBindingCurrency {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardBindingCurrency[] $VALUES;
    public static final CardBindingCurrency RUB;

    static {
        CardBindingCurrency cardBindingCurrency = new CardBindingCurrency("RUB", 0);
        RUB = cardBindingCurrency;
        CardBindingCurrency[] cardBindingCurrencyArr = {cardBindingCurrency};
        $VALUES = cardBindingCurrencyArr;
        $ENTRIES = a.a(cardBindingCurrencyArr);
    }

    public static CardBindingCurrency valueOf(String str) {
        return (CardBindingCurrency) Enum.valueOf(CardBindingCurrency.class, str);
    }

    public static CardBindingCurrency[] values() {
        return (CardBindingCurrency[]) $VALUES.clone();
    }
}
