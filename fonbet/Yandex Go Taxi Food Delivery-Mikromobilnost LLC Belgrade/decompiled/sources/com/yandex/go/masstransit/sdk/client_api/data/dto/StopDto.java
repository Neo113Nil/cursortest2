package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.qje;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/StopDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/i0", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StopDto {
    public static final i0 Companion = new i0();
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ StopDto(int i, String str, String str2, String str3, Boolean bool, Boolean bool2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, StopDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopDto)) {
            return false;
        }
        StopDto stopDto = (StopDto) obj;
        return jl40.l(this.a, stopDto.a) && jl40.l(this.b, stopDto.b) && jl40.l(this.c, stopDto.c) && jl40.l(this.d, stopDto.d) && jl40.l(this.e, stopDto.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("StopDto(id=", this.a, ", title=", this.b, ", subtitle=");
        tse0.A(v, this.c, ", isSelectable=", this.d, ", isSelected=");
        return nzs.d(v, this.e, Extension.C_BRAKE);
    }
}
