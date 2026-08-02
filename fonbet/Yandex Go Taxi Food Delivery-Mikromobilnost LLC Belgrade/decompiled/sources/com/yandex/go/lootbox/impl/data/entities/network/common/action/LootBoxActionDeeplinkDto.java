package com.yandex.go.lootbox.impl.data.entities.network.common.action;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/lootbox/impl/data/entities/network/common/action/LootBoxActionDeeplinkDto;", "Lcom/yandex/go/lootbox/impl/data/entities/network/common/action/b;", "Companion", "$serializer", "com/yandex/go/lootbox/impl/data/entities/network/common/action/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxActionDeeplinkDto extends b {
    public static final a Companion = new a();
    public final String a;

    public LootBoxActionDeeplinkDto(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public LootBoxActionDeeplinkDto() {
        this.a = "";
    }
}
