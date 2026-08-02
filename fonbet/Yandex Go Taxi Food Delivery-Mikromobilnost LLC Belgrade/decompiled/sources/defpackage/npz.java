package defpackage;

import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentDirectOfferDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentLootBoxDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentTypeDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.d;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class npz extends lnt {
    public static final npz f = new npz();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, d.INSTANCE.serializer(), qoi0.a(d.class));
    }

    @Override // defpackage.h9
    public final List f() {
        LootBoxContentTypeDto lootBoxContentTypeDto = LootBoxContentTypeDto.LOOTBOX;
        f9 f9Var = new f9((String) h().invoke(lootBoxContentTypeDto), LootBoxContentLootBoxDto.Companion.serializer(), qoi0.a(LootBoxContentLootBoxDto.class));
        LootBoxContentTypeDto lootBoxContentTypeDto2 = LootBoxContentTypeDto.DIRECT_OFFER;
        return Arrays.asList(f9Var, new f9((String) h().invoke(lootBoxContentTypeDto2), LootBoxContentDirectOfferDto.Companion.serializer(), qoi0.a(LootBoxContentDirectOfferDto.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return LootBoxContentTypeDto.Companion.serializer();
    }
}
