package com.yandex.go.lootbox.impl.data.entities.network.activation;

import com.yandex.go.lootbox.impl.data.entities.network.common.content.d;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/lootbox/impl/data/entities/network/activation/LootBoxActivationResponseDto;", "", "Companion", "$serializer", "com/yandex/go/lootbox/impl/data/entities/network/activation/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxActivationResponseDto {
    public static final b Companion = new b();
    public final com.yandex.go.lootbox.impl.data.entities.network.common.content.b a;

    public /* synthetic */ LootBoxActivationResponseDto(int i, com.yandex.go.lootbox.impl.data.entities.network.common.content.b bVar) {
        if ((i & 1) == 0) {
            this.a = d.INSTANCE;
        } else {
            this.a = bVar;
        }
    }

    public LootBoxActivationResponseDto() {
        this.a = d.INSTANCE;
    }
}
