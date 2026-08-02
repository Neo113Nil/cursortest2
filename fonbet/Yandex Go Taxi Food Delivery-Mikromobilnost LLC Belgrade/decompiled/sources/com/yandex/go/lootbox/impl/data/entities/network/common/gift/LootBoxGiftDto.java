package com.yandex.go.lootbox.impl.data.entities.network.common.gift;

import com.yandex.go.lootbox.impl.data.entities.network.common.action.b;
import com.yandex.go.lootbox.impl.data.entities.network.common.action.d;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/lootbox/impl/data/entities/network/common/gift/LootBoxGiftDto;", "", "Companion", "$serializer", "com/yandex/go/lootbox/impl/data/entities/network/common/gift/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxGiftDto {
    public static final a Companion = new a();
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final String d;
    public final b e;

    public /* synthetic */ LootBoxGiftDto(int i, FormattedText formattedText, FormattedText formattedText2, String str, String str2, b bVar) {
        int i2 = 0;
        this.a = (i & 1) == 0 ? new FormattedText(i2) : formattedText;
        if ((i & 2) == 0) {
            this.b = new FormattedText(i2);
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = d.INSTANCE;
        } else {
            this.e = bVar;
        }
    }

    public LootBoxGiftDto() {
        int i = 0;
        FormattedText formattedText = new FormattedText(i);
        FormattedText formattedText2 = new FormattedText(i);
        d dVar = d.INSTANCE;
        this.a = formattedText;
        this.b = formattedText2;
        this.c = "";
        this.d = "";
        this.e = dVar;
    }
}
