package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.qv10;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/RequiredPropertyInfoDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/u", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RequiredPropertyInfoDto {
    public static final u Companion = new u();
    public final String a;
    public final int b;

    public /* synthetic */ RequiredPropertyInfoDto(int i, String str, int i2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, RequiredPropertyInfoDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequiredPropertyInfoDto)) {
            return false;
        }
        RequiredPropertyInfoDto requiredPropertyInfoDto = (RequiredPropertyInfoDto) obj;
        return jl40.l(this.a, requiredPropertyInfoDto.a) && this.b == requiredPropertyInfoDto.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "RequiredPropertyInfoDto(text=", this.a, ", fillOrder=", Extension.C_BRAKE);
    }
}
