package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/VerticalTariffDto;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/u6", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class VerticalTariffDto {
    public static final u6 Companion = new u6();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public /* synthetic */ VerticalTariffDto(String str, String str2, String str3, String str4, boolean z, int i) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalTariffDto)) {
            return false;
        }
        VerticalTariffDto verticalTariffDto = (VerticalTariffDto) obj;
        return jl40.l(this.a, verticalTariffDto.a) && jl40.l(this.b, verticalTariffDto.b) && jl40.l(this.c, verticalTariffDto.c) && this.d == verticalTariffDto.d && jl40.l(this.e, verticalTariffDto.e);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("VerticalTariffDto(tariffClass=", this.a, ", name=", this.b, ", description=");
        tse0.y(this.c, ", useTariffTitle=", ", mode=", v, this.d);
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public VerticalTariffDto() {
        this(null, 31, null, null, false);
    }

    public VerticalTariffDto(String str, int i, String str2, String str3, boolean z) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        z = (i & 8) != 0 ? false : z;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = null;
    }
}
