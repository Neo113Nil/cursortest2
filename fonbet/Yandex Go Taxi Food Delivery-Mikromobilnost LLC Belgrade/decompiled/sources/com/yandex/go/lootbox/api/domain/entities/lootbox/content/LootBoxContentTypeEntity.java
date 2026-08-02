package com.yandex.go.lootbox.api.domain.entities.lootbox.content;

import defpackage.k4o;
import defpackage.spz;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/lootbox/api/domain/entities/lootbox/content/LootBoxContentTypeEntity;", "", "Companion", "spz", "UNKNOWN", "LOOT_BOX", "DIRECT_OFFER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxContentTypeEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LootBoxContentTypeEntity[] $VALUES;
    public static final spz Companion;
    public static final LootBoxContentTypeEntity DIRECT_OFFER;
    public static final LootBoxContentTypeEntity LOOT_BOX;
    public static final LootBoxContentTypeEntity UNKNOWN;

    static {
        LootBoxContentTypeEntity lootBoxContentTypeEntity = new LootBoxContentTypeEntity("UNKNOWN", 0);
        UNKNOWN = lootBoxContentTypeEntity;
        LootBoxContentTypeEntity lootBoxContentTypeEntity2 = new LootBoxContentTypeEntity("LOOT_BOX", 1);
        LOOT_BOX = lootBoxContentTypeEntity2;
        LootBoxContentTypeEntity lootBoxContentTypeEntity3 = new LootBoxContentTypeEntity("DIRECT_OFFER", 2);
        DIRECT_OFFER = lootBoxContentTypeEntity3;
        LootBoxContentTypeEntity[] lootBoxContentTypeEntityArr = {lootBoxContentTypeEntity, lootBoxContentTypeEntity2, lootBoxContentTypeEntity3};
        $VALUES = lootBoxContentTypeEntityArr;
        $ENTRIES = a.a(lootBoxContentTypeEntityArr);
        Companion = new spz();
    }

    public static LootBoxContentTypeEntity valueOf(String str) {
        return (LootBoxContentTypeEntity) Enum.valueOf(LootBoxContentTypeEntity.class, str);
    }

    public static LootBoxContentTypeEntity[] values() {
        return (LootBoxContentTypeEntity[]) $VALUES.clone();
    }
}
