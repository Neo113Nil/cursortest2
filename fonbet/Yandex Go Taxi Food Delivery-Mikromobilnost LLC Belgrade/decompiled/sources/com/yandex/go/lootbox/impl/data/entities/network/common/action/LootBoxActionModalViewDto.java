package com.yandex.go.lootbox.impl.data.entities.network.common.action;

import com.yandex.go.lootbox.impl.data.entities.network.common.button.LootBoxButtonDto;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/lootbox/impl/data/entities/network/common/action/LootBoxActionModalViewDto;", "Lcom/yandex/go/lootbox/impl/data/entities/network/common/action/b;", "Companion", "$serializer", "com/yandex/go/lootbox/impl/data/entities/network/common/action/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxActionModalViewDto extends b {
    public static final c Companion = new c();
    public final String a;
    public final FormattedText b;
    public final String c;
    public final LootBoxButtonDto d;

    public LootBoxActionModalViewDto(int i, String str, FormattedText formattedText, String str2, LootBoxButtonDto lootBoxButtonDto) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = new FormattedText(0);
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = new LootBoxButtonDto(0);
        } else {
            this.d = lootBoxButtonDto;
        }
    }

    public LootBoxActionModalViewDto() {
        FormattedText formattedText = new FormattedText(0);
        LootBoxButtonDto lootBoxButtonDto = new LootBoxButtonDto(0);
        this.a = "";
        this.b = formattedText;
        this.c = "";
        this.d = lootBoxButtonDto;
    }
}
