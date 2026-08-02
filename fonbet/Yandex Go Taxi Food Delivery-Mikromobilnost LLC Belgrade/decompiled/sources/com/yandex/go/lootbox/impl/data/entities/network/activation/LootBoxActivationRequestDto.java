package com.yandex.go.lootbox.impl.data.entities.network.activation;

import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentTypeDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.user_info.LootBoxUserInfoDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.o3z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/lootbox/impl/data/entities/network/activation/LootBoxActivationRequestDto;", "", "Companion", "$serializer", "com/yandex/go/lootbox/impl/data/entities/network/activation/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LootBoxActivationRequestDto {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(14)), null};
    public final String a;
    public final LootBoxContentTypeDto b;
    public final LootBoxUserInfoDto c;

    public /* synthetic */ LootBoxActivationRequestDto(int i, String str, LootBoxContentTypeDto lootBoxContentTypeDto, LootBoxUserInfoDto lootBoxUserInfoDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = LootBoxContentTypeDto.UNKNOWN;
        } else {
            this.b = lootBoxContentTypeDto;
        }
        if ((i & 4) == 0) {
            this.c = new LootBoxUserInfoDto(null, null);
        } else {
            this.c = lootBoxUserInfoDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LootBoxActivationRequestDto)) {
            return false;
        }
        LootBoxActivationRequestDto lootBoxActivationRequestDto = (LootBoxActivationRequestDto) obj;
        return jl40.l(this.a, lootBoxActivationRequestDto.a) && this.b == lootBoxActivationRequestDto.b && jl40.l(this.c, lootBoxActivationRequestDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LootBoxActivationRequestDto(id=" + this.a + ", type=" + this.b + ", userInfo=" + this.c + Extension.C_BRAKE;
    }

    public LootBoxActivationRequestDto(String str, LootBoxContentTypeDto lootBoxContentTypeDto, LootBoxUserInfoDto lootBoxUserInfoDto) {
        this.a = str;
        this.b = lootBoxContentTypeDto;
        this.c = lootBoxUserInfoDto;
    }

    public LootBoxActivationRequestDto() {
        this("", LootBoxContentTypeDto.UNKNOWN, new LootBoxUserInfoDto(null, null));
    }
}
