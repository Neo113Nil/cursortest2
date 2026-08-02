package com.yandex.go.lootbox.impl.data.entities.network.common.content;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/lootbox/impl/data/entities/network/common/content/LootBoxContentDirectOfferDto;", "Lcom/yandex/go/lootbox/impl/data/entities/network/common/content/b;", "Companion", "$serializer", "com/yandex/go/lootbox/impl/data/entities/network/common/content/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxContentDirectOfferDto extends b {
    public static final a Companion = new a();
    public final com.yandex.go.lootbox.impl.data.entities.network.common.action.b a;

    public LootBoxContentDirectOfferDto(int i, com.yandex.go.lootbox.impl.data.entities.network.common.action.b bVar) {
        if ((i & 1) == 0) {
            this.a = com.yandex.go.lootbox.impl.data.entities.network.common.action.d.INSTANCE;
        } else {
            this.a = bVar;
        }
    }

    public LootBoxContentDirectOfferDto() {
        this.a = com.yandex.go.lootbox.impl.data.entities.network.common.action.d.INSTANCE;
    }
}
