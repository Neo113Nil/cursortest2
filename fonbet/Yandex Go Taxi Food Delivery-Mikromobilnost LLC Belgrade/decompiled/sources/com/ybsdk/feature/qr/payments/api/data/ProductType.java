package com.ybsdk.feature.qr.payments.api.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/data/ProductType;", "", "<init>", "(Ljava/lang/String;I)V", "WALLET", "CREDIT_LIMIT", "PRO", "EXTERNAL_BANK", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProductType[] $VALUES;
    public static final ProductType WALLET = new ProductType("WALLET", 0);
    public static final ProductType CREDIT_LIMIT = new ProductType("CREDIT_LIMIT", 1);
    public static final ProductType PRO = new ProductType("PRO", 2);
    public static final ProductType EXTERNAL_BANK = new ProductType("EXTERNAL_BANK", 3);

    private static final /* synthetic */ ProductType[] $values() {
        return new ProductType[]{WALLET, CREDIT_LIMIT, PRO, EXTERNAL_BANK};
    }

    static {
        ProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ProductType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ProductType valueOf(String str) {
        return (ProductType) Enum.valueOf(ProductType.class, str);
    }

    public static ProductType[] values() {
        return (ProductType[]) $VALUES.clone();
    }
}
