package com.yandex.go.payments.paymentlist.domain.converter;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/yandex/go/payments/paymentlist/domain/converter/PaymentMethodsConverter$PaymentOptionGroupType", "", "Lcom/yandex/go/payments/paymentlist/domain/converter/PaymentMethodsConverter$PaymentOptionGroupType;", "", "orderNumber", CA20Status.STATUS_USER_I, "a", "()I", "", "wireName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "SELECTED_OPTION_UNAVAILABLE", Card.CARD_TYPE_LOYALTY, "YB", "TIPS", "TOKENS", "CARDS", "OTHERS", "BUSINESS_ACCOUNTS", "UNAVAILABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
final class PaymentMethodsConverter$PaymentOptionGroupType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsConverter$PaymentOptionGroupType[] $VALUES;
    public static final PaymentMethodsConverter$PaymentOptionGroupType BUSINESS_ACCOUNTS;
    public static final PaymentMethodsConverter$PaymentOptionGroupType CARDS;
    public static final PaymentMethodsConverter$PaymentOptionGroupType LOYALTY;
    public static final PaymentMethodsConverter$PaymentOptionGroupType OTHERS;
    public static final PaymentMethodsConverter$PaymentOptionGroupType SELECTED_OPTION_UNAVAILABLE;
    public static final PaymentMethodsConverter$PaymentOptionGroupType TIPS;
    public static final PaymentMethodsConverter$PaymentOptionGroupType TOKENS;
    public static final PaymentMethodsConverter$PaymentOptionGroupType UNAVAILABLE;
    public static final PaymentMethodsConverter$PaymentOptionGroupType YB;
    private final int orderNumber;
    private final String wireName;

    static {
        PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType = new PaymentMethodsConverter$PaymentOptionGroupType("SELECTED_OPTION_UNAVAILABLE", 0, 1, "SELECTED_OPTION_UNAVAILABLE");
        SELECTED_OPTION_UNAVAILABLE = paymentMethodsConverter$PaymentOptionGroupType;
        PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType2 = new PaymentMethodsConverter$PaymentOptionGroupType(Card.CARD_TYPE_LOYALTY, 1, 3, Card.CARD_TYPE_LOYALTY);
        LOYALTY = paymentMethodsConverter$PaymentOptionGroupType2;
        PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType3 = new PaymentMethodsConverter$PaymentOptionGroupType("YB", 2, 4, "YB");
        YB = paymentMethodsConverter$PaymentOptionGroupType3;
        PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType4 = new PaymentMethodsConverter$PaymentOptionGroupType("TIPS", 3, 5, "TIPS");
        TIPS = paymentMethodsConverter$PaymentOptionGroupType4;
        PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType5 = new PaymentMethodsConverter$PaymentOptionGroupType("TOKENS", 4, 6, "TOKENS");
        TOKENS = paymentMethodsConverter$PaymentOptionGroupType5;
        PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType6 = new PaymentMethodsConverter$PaymentOptionGroupType("CARDS", 5, 7, "CARDS");
        CARDS = paymentMethodsConverter$PaymentOptionGroupType6;
        PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType7 = new PaymentMethodsConverter$PaymentOptionGroupType("OTHERS", 6, 8, "OTHERS");
        OTHERS = paymentMethodsConverter$PaymentOptionGroupType7;
        PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType8 = new PaymentMethodsConverter$PaymentOptionGroupType("BUSINESS_ACCOUNTS", 7, 9, "BUSINESS_ACCOUNTS");
        BUSINESS_ACCOUNTS = paymentMethodsConverter$PaymentOptionGroupType8;
        PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType9 = new PaymentMethodsConverter$PaymentOptionGroupType("UNAVAILABLE", 8, 10, "UNAVAILABLE");
        UNAVAILABLE = paymentMethodsConverter$PaymentOptionGroupType9;
        PaymentMethodsConverter$PaymentOptionGroupType[] paymentMethodsConverter$PaymentOptionGroupTypeArr = {paymentMethodsConverter$PaymentOptionGroupType, paymentMethodsConverter$PaymentOptionGroupType2, paymentMethodsConverter$PaymentOptionGroupType3, paymentMethodsConverter$PaymentOptionGroupType4, paymentMethodsConverter$PaymentOptionGroupType5, paymentMethodsConverter$PaymentOptionGroupType6, paymentMethodsConverter$PaymentOptionGroupType7, paymentMethodsConverter$PaymentOptionGroupType8, paymentMethodsConverter$PaymentOptionGroupType9};
        $VALUES = paymentMethodsConverter$PaymentOptionGroupTypeArr;
        $ENTRIES = kotlin.enums.a.a(paymentMethodsConverter$PaymentOptionGroupTypeArr);
    }

    public PaymentMethodsConverter$PaymentOptionGroupType(String str, int i, int i2, String str2) {
        this.orderNumber = i2;
        this.wireName = str2;
    }

    public static PaymentMethodsConverter$PaymentOptionGroupType valueOf(String str) {
        return (PaymentMethodsConverter$PaymentOptionGroupType) Enum.valueOf(PaymentMethodsConverter$PaymentOptionGroupType.class, str);
    }

    public static PaymentMethodsConverter$PaymentOptionGroupType[] values() {
        return (PaymentMethodsConverter$PaymentOptionGroupType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getOrderNumber() {
        return this.orderNumber;
    }

    /* renamed from: b, reason: from getter */
    public final String getWireName() {
        return this.wireName;
    }
}
