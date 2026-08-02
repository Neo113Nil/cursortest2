package com.yandex.go.lootbox.impl.data.entities.network.common.content;

import com.yandex.go.lootbox.impl.data.entities.network.common.button.LootBoxButtonDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.o3z;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/lootbox/impl/data/entities/network/common/content/LootBoxContentLootBoxDto;", "Lcom/yandex/go/lootbox/impl/data/entities/network/common/content/b;", "Companion", "$serializer", "com/yandex/go/lootbox/impl/data/entities/network/common/content/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxContentLootBoxDto extends b {
    public static final c Companion = new c();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(15)), null};
    public final FormattedText a;
    public final FormattedText b;
    public final List c;
    public final LootBoxButtonDto d;

    public LootBoxContentLootBoxDto(int i, FormattedText formattedText, FormattedText formattedText2, List list, LootBoxButtonDto lootBoxButtonDto) {
        this.a = (i & 1) == 0 ? new FormattedText(0) : formattedText;
        if ((i & 2) == 0) {
            this.b = new FormattedText(0);
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = new LootBoxButtonDto(0);
        } else {
            this.d = lootBoxButtonDto;
        }
    }

    public LootBoxContentLootBoxDto() {
        FormattedText formattedText = new FormattedText(0);
        FormattedText formattedText2 = new FormattedText(0);
        LootBoxButtonDto lootBoxButtonDto = new LootBoxButtonDto(0);
        this.a = formattedText;
        this.b = formattedText2;
        this.c = EmptyList.a;
        this.d = lootBoxButtonDto;
    }
}
