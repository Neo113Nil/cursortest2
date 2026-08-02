package com.yandex.go.chargers.offer.data.api;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferKeyDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersOfferKeyDto {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ ChargersOfferKeyDto(int i, Boolean bool, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ChargersOfferKeyDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersOfferKeyDto)) {
            return false;
        }
        ChargersOfferKeyDto chargersOfferKeyDto = (ChargersOfferKeyDto) obj;
        return jl40.l(this.a, chargersOfferKeyDto.a) && jl40.l(this.b, chargersOfferKeyDto.b) && jl40.l(this.c, chargersOfferKeyDto.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return nzs.d(b64.v("ChargersOfferKeyDto(type=", this.a, ", id=", this.b, ", value="), this.c, Extension.C_BRAKE);
    }

    public ChargersOfferKeyDto(String str, String str2, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = bool;
    }
}
