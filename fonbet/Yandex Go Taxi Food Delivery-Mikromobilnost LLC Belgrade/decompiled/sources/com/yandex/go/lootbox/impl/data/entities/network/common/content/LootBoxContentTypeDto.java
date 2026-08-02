package com.yandex.go.lootbox.impl.data.entities.network.common.content;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.o3z;
import defpackage.rpz;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/lootbox/impl/data/entities/network/common/content/LootBoxContentTypeDto;", "", "Companion", "rpz", "UNKNOWN", "LOOTBOX", "DIRECT_OFFER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxContentTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LootBoxContentTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final rpz Companion;
    public static final LootBoxContentTypeDto DIRECT_OFFER;
    public static final LootBoxContentTypeDto LOOTBOX;
    public static final LootBoxContentTypeDto UNKNOWN;

    static {
        LootBoxContentTypeDto lootBoxContentTypeDto = new LootBoxContentTypeDto("UNKNOWN", 0);
        UNKNOWN = lootBoxContentTypeDto;
        LootBoxContentTypeDto lootBoxContentTypeDto2 = new LootBoxContentTypeDto("LOOTBOX", 1);
        LOOTBOX = lootBoxContentTypeDto2;
        LootBoxContentTypeDto lootBoxContentTypeDto3 = new LootBoxContentTypeDto("DIRECT_OFFER", 2);
        DIRECT_OFFER = lootBoxContentTypeDto3;
        LootBoxContentTypeDto[] lootBoxContentTypeDtoArr = {lootBoxContentTypeDto, lootBoxContentTypeDto2, lootBoxContentTypeDto3};
        $VALUES = lootBoxContentTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(lootBoxContentTypeDtoArr);
        Companion = new rpz();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(16));
    }

    public static LootBoxContentTypeDto valueOf(String str) {
        return (LootBoxContentTypeDto) Enum.valueOf(LootBoxContentTypeDto.class, str);
    }

    public static LootBoxContentTypeDto[] values() {
        return (LootBoxContentTypeDto[]) $VALUES.clone();
    }
}
