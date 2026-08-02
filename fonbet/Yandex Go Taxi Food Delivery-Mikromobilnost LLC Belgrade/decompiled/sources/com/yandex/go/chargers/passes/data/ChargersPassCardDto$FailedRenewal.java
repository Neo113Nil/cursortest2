package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/passes/data/ChargersPassCardDto$FailedRenewal", "Lcom/yandex/go/chargers/passes/data/r;", "Companion", "com/yandex/go/chargers/passes/data/p", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassCardDto$FailedRenewal extends r {
    public static final p Companion = new p();
    public final String a;
    public final ChargersPassButtonDto b;

    public ChargersPassCardDto$FailedRenewal(int i, String str, ChargersPassButtonDto chargersPassButtonDto) {
        this.a = (i & 1) == 0 ? "failed_renewal" : str;
        if ((i & 2) == 0) {
            this.b = new ChargersPassButtonDto(0);
        } else {
            this.b = chargersPassButtonDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassCardDto$FailedRenewal)) {
            return false;
        }
        ChargersPassCardDto$FailedRenewal chargersPassCardDto$FailedRenewal = (ChargersPassCardDto$FailedRenewal) obj;
        return jl40.l(this.a, chargersPassCardDto$FailedRenewal.a) && jl40.l(this.b, chargersPassCardDto$FailedRenewal.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FailedRenewal(type=" + this.a + ", actionButton=" + this.b + Extension.C_BRAKE;
    }

    public ChargersPassCardDto$FailedRenewal() {
        ChargersPassButtonDto chargersPassButtonDto = new ChargersPassButtonDto(0);
        this.a = "failed_renewal";
        this.b = chargersPassButtonDto;
    }
}
