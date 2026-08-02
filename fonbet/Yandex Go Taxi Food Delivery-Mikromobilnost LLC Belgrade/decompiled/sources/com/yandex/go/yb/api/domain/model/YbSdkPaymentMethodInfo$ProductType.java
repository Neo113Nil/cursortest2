package com.yandex.go.yb.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/yb/api/domain/model/YbSdkPaymentMethodInfo$ProductType", "", "Lcom/yandex/go/yb/api/domain/model/YbSdkPaymentMethodInfo$ProductType;", "WALLET", "PRO", "CREDIT_LIMIT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class YbSdkPaymentMethodInfo$ProductType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbSdkPaymentMethodInfo$ProductType[] $VALUES;
    public static final YbSdkPaymentMethodInfo$ProductType CREDIT_LIMIT;
    public static final YbSdkPaymentMethodInfo$ProductType PRO;
    public static final YbSdkPaymentMethodInfo$ProductType WALLET;

    static {
        YbSdkPaymentMethodInfo$ProductType ybSdkPaymentMethodInfo$ProductType = new YbSdkPaymentMethodInfo$ProductType("WALLET", 0);
        WALLET = ybSdkPaymentMethodInfo$ProductType;
        YbSdkPaymentMethodInfo$ProductType ybSdkPaymentMethodInfo$ProductType2 = new YbSdkPaymentMethodInfo$ProductType("PRO", 1);
        PRO = ybSdkPaymentMethodInfo$ProductType2;
        YbSdkPaymentMethodInfo$ProductType ybSdkPaymentMethodInfo$ProductType3 = new YbSdkPaymentMethodInfo$ProductType("CREDIT_LIMIT", 2);
        CREDIT_LIMIT = ybSdkPaymentMethodInfo$ProductType3;
        YbSdkPaymentMethodInfo$ProductType[] ybSdkPaymentMethodInfo$ProductTypeArr = {ybSdkPaymentMethodInfo$ProductType, ybSdkPaymentMethodInfo$ProductType2, ybSdkPaymentMethodInfo$ProductType3};
        $VALUES = ybSdkPaymentMethodInfo$ProductTypeArr;
        $ENTRIES = a.a(ybSdkPaymentMethodInfo$ProductTypeArr);
    }

    public static YbSdkPaymentMethodInfo$ProductType valueOf(String str) {
        return (YbSdkPaymentMethodInfo$ProductType) Enum.valueOf(YbSdkPaymentMethodInfo$ProductType.class, str);
    }

    public static YbSdkPaymentMethodInfo$ProductType[] values() {
        return (YbSdkPaymentMethodInfo$ProductType[]) $VALUES.clone();
    }
}
