package com.yandex.go.lootbox.impl.data.entities.network.common.user_info;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/lootbox/impl/data/entities/network/common/user_info/LootBoxUserInfoDto;", "", "Companion", "$serializer", "com/yandex/go/lootbox/impl/data/entities/network/common/user_info/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LootBoxUserInfoDto {
    public static final a Companion = new a();
    public final String a;
    public final String b;

    public /* synthetic */ LootBoxUserInfoDto(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LootBoxUserInfoDto)) {
            return false;
        }
        LootBoxUserInfoDto lootBoxUserInfoDto = (LootBoxUserInfoDto) obj;
        return jl40.l(this.a, lootBoxUserInfoDto.a) && jl40.l(this.b, lootBoxUserInfoDto.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("LootBoxUserInfoDto(tariff=", this.a, ", zone=", this.b, Extension.C_BRAKE);
    }

    public LootBoxUserInfoDto(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public LootBoxUserInfoDto() {
        this(null, null);
    }
}
