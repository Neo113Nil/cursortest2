package com.yandex.go.lootbox.impl.data.entities.network.common.button;

import com.yandex.go.lootbox.impl.data.entities.network.common.action.b;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/lootbox/impl/data/entities/network/common/button/LootBoxButtonDto;", "", "Companion", "$serializer", "com/yandex/go/lootbox/impl/data/entities/network/common/button/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxButtonDto {
    public static final a Companion = new a();
    public final String a;
    public final FormattedText b;
    public final b c;

    public /* synthetic */ LootBoxButtonDto(int i, String str, FormattedText formattedText, b bVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new FormattedText(0);
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bVar;
        }
    }

    public LootBoxButtonDto() {
        this(0);
    }

    public LootBoxButtonDto(int i) {
        FormattedText formattedText = new FormattedText(0);
        this.a = "";
        this.b = formattedText;
        this.c = null;
    }
}
