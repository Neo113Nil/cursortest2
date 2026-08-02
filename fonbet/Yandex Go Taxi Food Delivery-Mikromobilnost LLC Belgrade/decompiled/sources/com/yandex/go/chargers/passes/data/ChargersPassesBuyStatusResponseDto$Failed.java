package com.yandex.go.chargers.passes.data;

import com.yandex.go.chargers.error.api.ChargersErrorDetailsDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.wfa;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/passes/data/ChargersPassesBuyStatusResponseDto$Failed", "Lwfa;", "Companion", "com/yandex/go/chargers/passes/data/g0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassesBuyStatusResponseDto$Failed implements wfa {
    public static final g0 Companion = new g0();
    public final String a;
    public final ChargersPassesBuyStatusScreenDto b;
    public final ChargersErrorDetailsDto c;

    public ChargersPassesBuyStatusResponseDto$Failed(int i, String str, ChargersPassesBuyStatusScreenDto chargersPassesBuyStatusScreenDto, ChargersErrorDetailsDto chargersErrorDetailsDto) {
        this.a = (i & 1) == 0 ? "failed" : str;
        if ((i & 2) == 0) {
            this.b = new ChargersPassesBuyStatusScreenDto(0);
        } else {
            this.b = chargersPassesBuyStatusScreenDto;
        }
        if ((i & 4) != 0) {
            this.c = chargersErrorDetailsDto;
        } else {
            ChargersErrorDetailsDto.Companion.getClass();
            this.c = ChargersErrorDetailsDto.d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassesBuyStatusResponseDto$Failed)) {
            return false;
        }
        ChargersPassesBuyStatusResponseDto$Failed chargersPassesBuyStatusResponseDto$Failed = (ChargersPassesBuyStatusResponseDto$Failed) obj;
        return jl40.l(this.a, chargersPassesBuyStatusResponseDto$Failed.a) && jl40.l(this.b, chargersPassesBuyStatusResponseDto$Failed.b) && jl40.l(this.c, chargersPassesBuyStatusResponseDto$Failed.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Failed(status=" + this.a + ", ui=" + this.b + ", errorDetails=" + this.c + Extension.C_BRAKE;
    }

    public ChargersPassesBuyStatusResponseDto$Failed() {
        ChargersPassesBuyStatusScreenDto chargersPassesBuyStatusScreenDto = new ChargersPassesBuyStatusScreenDto(0);
        ChargersErrorDetailsDto.Companion.getClass();
        ChargersErrorDetailsDto chargersErrorDetailsDto = ChargersErrorDetailsDto.d;
        this.a = "failed";
        this.b = chargersPassesBuyStatusScreenDto;
        this.c = chargersErrorDetailsDto;
    }
}
