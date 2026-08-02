package com.ybsdk.feature.card.api.entities;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;", "", "<init>", "(Ljava/lang/String;I)V", "FROZEN", Card.ACTIVE, "DELETED", "BLOCKED", "REISSUE", "UNKNOWN", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YbCardStatusEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbCardStatusEntity[] $VALUES;
    public static final YbCardStatusEntity FROZEN = new YbCardStatusEntity("FROZEN", 0);
    public static final YbCardStatusEntity ACTIVE = new YbCardStatusEntity(Card.ACTIVE, 1);
    public static final YbCardStatusEntity DELETED = new YbCardStatusEntity("DELETED", 2);
    public static final YbCardStatusEntity BLOCKED = new YbCardStatusEntity("BLOCKED", 3);
    public static final YbCardStatusEntity REISSUE = new YbCardStatusEntity("REISSUE", 4);
    public static final YbCardStatusEntity UNKNOWN = new YbCardStatusEntity("UNKNOWN", 5);

    private static final /* synthetic */ YbCardStatusEntity[] $values() {
        return new YbCardStatusEntity[]{FROZEN, ACTIVE, DELETED, BLOCKED, REISSUE, UNKNOWN};
    }

    static {
        YbCardStatusEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YbCardStatusEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YbCardStatusEntity valueOf(String str) {
        return (YbCardStatusEntity) Enum.valueOf(YbCardStatusEntity.class, str);
    }

    public static YbCardStatusEntity[] values() {
        return (YbCardStatusEntity[]) $VALUES.clone();
    }
}
