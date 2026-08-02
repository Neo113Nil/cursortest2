package com.ybsdk.api.entities;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.gg51;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/api/entities/YBProduct;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "gg51", "PRO", "WALLET", "SPLIT", "CREDIT_ACCOUNT", Card.CARD_TYPE_CREDIT, "CREDIT_LIMIT", "yb-sdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBProduct {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBProduct[] $VALUES;
    public static final gg51 Companion;
    public static final YBProduct PRO = new YBProduct("PRO", 0);
    public static final YBProduct WALLET = new YBProduct("WALLET", 1);
    public static final YBProduct SPLIT = new YBProduct("SPLIT", 2);
    public static final YBProduct CREDIT_ACCOUNT = new YBProduct("CREDIT_ACCOUNT", 3);
    public static final YBProduct CREDIT = new YBProduct(Card.CARD_TYPE_CREDIT, 4);
    public static final YBProduct CREDIT_LIMIT = new YBProduct("CREDIT_LIMIT", 5);

    private static final /* synthetic */ YBProduct[] $values() {
        return new YBProduct[]{PRO, WALLET, SPLIT, CREDIT_ACCOUNT, CREDIT, CREDIT_LIMIT};
    }

    static {
        YBProduct[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new gg51();
    }

    private YBProduct(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBProduct valueOf(String str) {
        return (YBProduct) Enum.valueOf(YBProduct.class, str);
    }

    public static YBProduct[] values() {
        return (YBProduct[]) $VALUES.clone();
    }
}
