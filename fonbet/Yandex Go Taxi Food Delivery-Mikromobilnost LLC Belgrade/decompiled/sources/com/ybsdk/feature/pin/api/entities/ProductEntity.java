package com.ybsdk.feature.pin.api.entities;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/pin/api/entities/ProductEntity;", "", "<init>", "(Ljava/lang/String;I)V", "PRO", "WALLET", "SPLIT", Card.CARD_TYPE_CREDIT, "CREDIT_LIMIT", "CREDIT_ACCOUNT", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProductEntity[] $VALUES;
    public static final ProductEntity PRO = new ProductEntity("PRO", 0);
    public static final ProductEntity WALLET = new ProductEntity("WALLET", 1);
    public static final ProductEntity SPLIT = new ProductEntity("SPLIT", 2);
    public static final ProductEntity CREDIT = new ProductEntity(Card.CARD_TYPE_CREDIT, 3);
    public static final ProductEntity CREDIT_LIMIT = new ProductEntity("CREDIT_LIMIT", 4);
    public static final ProductEntity CREDIT_ACCOUNT = new ProductEntity("CREDIT_ACCOUNT", 5);

    private static final /* synthetic */ ProductEntity[] $values() {
        return new ProductEntity[]{PRO, WALLET, SPLIT, CREDIT, CREDIT_LIMIT, CREDIT_ACCOUNT};
    }

    static {
        ProductEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ProductEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ProductEntity valueOf(String str) {
        return (ProductEntity) Enum.valueOf(ProductEntity.class, str);
    }

    public static ProductEntity[] values() {
        return (ProductEntity[]) $VALUES.clone();
    }
}
