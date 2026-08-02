package com.yandex.go.chargers.passes.data;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.wfa;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/passes/data/ChargersPassesBuyStatusResponseDto$Success", "Lwfa;", "Companion", "com/yandex/go/chargers/passes/data/j0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassesBuyStatusResponseDto$Success implements wfa {
    public static final j0 Companion = new j0();
    public final String a;
    public final String b;
    public final ChargersPassesBuyStatusScreenDto c;

    public /* synthetic */ ChargersPassesBuyStatusResponseDto$Success(int i, String str, String str2, ChargersPassesBuyStatusScreenDto chargersPassesBuyStatusScreenDto) {
        this.a = (i & 1) == 0 ? "success" : str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = new ChargersPassesBuyStatusScreenDto(0);
        } else {
            this.c = chargersPassesBuyStatusScreenDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassesBuyStatusResponseDto$Success)) {
            return false;
        }
        ChargersPassesBuyStatusResponseDto$Success chargersPassesBuyStatusResponseDto$Success = (ChargersPassesBuyStatusResponseDto$Success) obj;
        return jl40.l(this.a, chargersPassesBuyStatusResponseDto$Success.a) && jl40.l(this.b, chargersPassesBuyStatusResponseDto$Success.b) && jl40.l(this.c, chargersPassesBuyStatusResponseDto$Success.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("Success(status=", this.a, ", passId=", this.b, ", ui=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ChargersPassesBuyStatusResponseDto$Success() {
        ChargersPassesBuyStatusScreenDto chargersPassesBuyStatusScreenDto = new ChargersPassesBuyStatusScreenDto(0);
        this.a = "success";
        this.b = "";
        this.c = chargersPassesBuyStatusScreenDto;
    }
}
