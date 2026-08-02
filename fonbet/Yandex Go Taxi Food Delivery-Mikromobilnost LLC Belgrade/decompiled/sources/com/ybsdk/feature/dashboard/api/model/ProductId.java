package com.ybsdk.feature.dashboard.api.model;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import defpackage.n8f0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/dashboard/api/model/ProductId;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "n8f0", "WALLET", "PRO", "SPLIT", "CREDIT_LIMIT", "CREDIT_ACCOUNT", Card.CARD_TYPE_CREDIT, "feature-dashboard-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductId {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProductId[] $VALUES;
    public static final n8f0 Companion;
    private final String value;
    public static final ProductId WALLET = new ProductId("WALLET", 0, "wallet");
    public static final ProductId PRO = new ProductId("PRO", 1, "pro");
    public static final ProductId SPLIT = new ProductId("SPLIT", 2, "split");
    public static final ProductId CREDIT_LIMIT = new ProductId("CREDIT_LIMIT", 3, "credit_limit");
    public static final ProductId CREDIT_ACCOUNT = new ProductId("CREDIT_ACCOUNT", 4, "credit_account");
    public static final ProductId CREDIT = new ProductId(Card.CARD_TYPE_CREDIT, 5, "credit");

    private static final /* synthetic */ ProductId[] $values() {
        return new ProductId[]{WALLET, PRO, SPLIT, CREDIT_LIMIT, CREDIT_ACCOUNT, CREDIT};
    }

    static {
        ProductId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new n8f0();
    }

    private ProductId(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ProductId valueOf(String str) {
        return (ProductId) Enum.valueOf(ProductId.class, str);
    }

    public static ProductId[] values() {
        return (ProductId[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
