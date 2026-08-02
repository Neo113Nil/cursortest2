package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/MultimodalPointsDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/g1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MultimodalPointsDto {
    public static final g1 Companion = new g1();
    public final zzs a;
    public final zzs b;

    public /* synthetic */ MultimodalPointsDto(int i, zzs zzsVar, zzs zzsVar2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zzsVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zzsVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultimodalPointsDto)) {
            return false;
        }
        MultimodalPointsDto multimodalPointsDto = (MultimodalPointsDto) obj;
        return jl40.l(this.a, multimodalPointsDto.a) && jl40.l(this.b, multimodalPointsDto.b);
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        int hashCode = (zzsVar == null ? 0 : zzsVar.hashCode()) * 31;
        zzs zzsVar2 = this.b;
        return hashCode + (zzsVar2 != null ? zzsVar2.hashCode() : 0);
    }

    public final String toString() {
        return "MultimodalPointsDto(pickupPoint=" + this.a + ", dropoffPoint=" + this.b + Extension.C_BRAKE;
    }

    public MultimodalPointsDto() {
        this.a = null;
        this.b = null;
    }
}
