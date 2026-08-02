package com.yandex.go.multimodal_route.network.models;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/TaxiTransportInfoRequestDto;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TaxiTransportInfoRequestDto {
    public static final r Companion = new r();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ TaxiTransportInfoRequestDto(String str, int i, String str2, boolean z) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, TaxiTransportInfoRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiTransportInfoRequestDto)) {
            return false;
        }
        TaxiTransportInfoRequestDto taxiTransportInfoRequestDto = (TaxiTransportInfoRequestDto) obj;
        return jl40.l(this.a, taxiTransportInfoRequestDto.a) && jl40.l(this.b, taxiTransportInfoRequestDto.b) && this.c == taxiTransportInfoRequestDto.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return x4e.i(b64.v("TaxiTransportInfoRequestDto(taxiOrderId=", this.a, ", offerId=", this.b, ", isRideCompleted="), this.c, Extension.C_BRAKE);
    }

    public TaxiTransportInfoRequestDto(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
