package com.ybsdk.network.dto.common;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/network/dto/common/Product;", "", "<init>", "(Ljava/lang/String;I)V", "PRO", "WALLET", "SPLIT", Card.CARD_TYPE_CREDIT, "CREDIT_LIMIT", "CREDIT_ACCOUNT", "UNKNOWN", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Product {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Product[] $VALUES;
    public static final Product PRO = new Product("PRO", 0);
    public static final Product WALLET = new Product("WALLET", 1);
    public static final Product SPLIT = new Product("SPLIT", 2);
    public static final Product CREDIT = new Product(Card.CARD_TYPE_CREDIT, 3);
    public static final Product CREDIT_LIMIT = new Product("CREDIT_LIMIT", 4);
    public static final Product CREDIT_ACCOUNT = new Product("CREDIT_ACCOUNT", 5);
    public static final Product UNKNOWN = new Product("UNKNOWN", 6);

    private static final /* synthetic */ Product[] $values() {
        return new Product[]{PRO, WALLET, SPLIT, CREDIT, CREDIT_LIMIT, CREDIT_ACCOUNT, UNKNOWN};
    }

    static {
        Product[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Product(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Product valueOf(String str) {
        return (Product) Enum.valueOf(Product.class, str);
    }

    public static Product[] values() {
        return (Product[]) $VALUES.clone();
    }
}
