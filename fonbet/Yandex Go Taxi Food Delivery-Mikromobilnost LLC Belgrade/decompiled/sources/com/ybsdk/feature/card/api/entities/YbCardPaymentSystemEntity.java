package com.ybsdk.feature.card.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/card/api/entities/YbCardPaymentSystemEntity;", "", "<init>", "(Ljava/lang/String;I)V", "MIR", "AMERICAN_EXPRESS", "MASTERCARD", "VISA", "UNKNOWN", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YbCardPaymentSystemEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbCardPaymentSystemEntity[] $VALUES;
    public static final YbCardPaymentSystemEntity MIR = new YbCardPaymentSystemEntity("MIR", 0);
    public static final YbCardPaymentSystemEntity AMERICAN_EXPRESS = new YbCardPaymentSystemEntity("AMERICAN_EXPRESS", 1);
    public static final YbCardPaymentSystemEntity MASTERCARD = new YbCardPaymentSystemEntity("MASTERCARD", 2);
    public static final YbCardPaymentSystemEntity VISA = new YbCardPaymentSystemEntity("VISA", 3);
    public static final YbCardPaymentSystemEntity UNKNOWN = new YbCardPaymentSystemEntity("UNKNOWN", 4);

    private static final /* synthetic */ YbCardPaymentSystemEntity[] $values() {
        return new YbCardPaymentSystemEntity[]{MIR, AMERICAN_EXPRESS, MASTERCARD, VISA, UNKNOWN};
    }

    static {
        YbCardPaymentSystemEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YbCardPaymentSystemEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YbCardPaymentSystemEntity valueOf(String str) {
        return (YbCardPaymentSystemEntity) Enum.valueOf(YbCardPaymentSystemEntity.class, str);
    }

    public static YbCardPaymentSystemEntity[] values() {
        return (YbCardPaymentSystemEntity[]) $VALUES.clone();
    }
}
