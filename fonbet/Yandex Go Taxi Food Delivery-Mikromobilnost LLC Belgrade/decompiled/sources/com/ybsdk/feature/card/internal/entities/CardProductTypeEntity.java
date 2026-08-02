package com.ybsdk.feature.card.internal.entities;

import defpackage.k4o;
import defpackage.zl8;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/card/internal/entities/CardProductTypeEntity;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "zl8", "WALLET", "PRO", "CREDIT_LIMIT", "SPLIT", "UNKNOWN", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardProductTypeEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardProductTypeEntity[] $VALUES;
    public static final zl8 Companion;
    public static final CardProductTypeEntity WALLET = new CardProductTypeEntity("WALLET", 0);
    public static final CardProductTypeEntity PRO = new CardProductTypeEntity("PRO", 1);
    public static final CardProductTypeEntity CREDIT_LIMIT = new CardProductTypeEntity("CREDIT_LIMIT", 2);
    public static final CardProductTypeEntity SPLIT = new CardProductTypeEntity("SPLIT", 3);
    public static final CardProductTypeEntity UNKNOWN = new CardProductTypeEntity("UNKNOWN", 4);

    private static final /* synthetic */ CardProductTypeEntity[] $values() {
        return new CardProductTypeEntity[]{WALLET, PRO, CREDIT_LIMIT, SPLIT, UNKNOWN};
    }

    static {
        CardProductTypeEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new zl8();
    }

    private CardProductTypeEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardProductTypeEntity valueOf(String str) {
        return (CardProductTypeEntity) Enum.valueOf(CardProductTypeEntity.class, str);
    }

    public static CardProductTypeEntity[] values() {
        return (CardProductTypeEntity[]) $VALUES.clone();
    }
}
