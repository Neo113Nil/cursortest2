package com.ybsdk.feature.autotopup.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/domain/model/PaymentMethodType;", "", "<init>", "(Ljava/lang/String;I)V", "SavingsAccount", "Me2Me", "Card", "YandexAccount", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentMethodType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodType[] $VALUES;
    public static final PaymentMethodType SavingsAccount = new PaymentMethodType("SavingsAccount", 0);
    public static final PaymentMethodType Me2Me = new PaymentMethodType("Me2Me", 1);
    public static final PaymentMethodType Card = new PaymentMethodType("Card", 2);
    public static final PaymentMethodType YandexAccount = new PaymentMethodType("YandexAccount", 3);

    private static final /* synthetic */ PaymentMethodType[] $values() {
        return new PaymentMethodType[]{SavingsAccount, Me2Me, Card, YandexAccount};
    }

    static {
        PaymentMethodType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PaymentMethodType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PaymentMethodType valueOf(String str) {
        return (PaymentMethodType) Enum.valueOf(PaymentMethodType.class, str);
    }

    public static PaymentMethodType[] values() {
        return (PaymentMethodType[]) $VALUES.clone();
    }
}
