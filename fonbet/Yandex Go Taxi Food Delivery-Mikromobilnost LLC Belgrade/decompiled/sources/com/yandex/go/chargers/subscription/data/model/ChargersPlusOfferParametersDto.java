package com.yandex.go.chargers.subscription.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/subscription/data/model/ChargersPlusOfferParametersDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/subscription/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPlusOfferParametersDto {
    public static final e Companion = new e();
    public final String a;
    public final String b;
    public final String c;
    public final ChargersPlusAnalyticsParams d;
    public final String e;
    public final boolean f;
    public final ChargersPlusFilters g;
    public final ChargersPlusLoadedFilters h;

    public /* synthetic */ ChargersPlusOfferParametersDto(int i, String str, String str2, String str3, ChargersPlusAnalyticsParams chargersPlusAnalyticsParams, String str4, boolean z, ChargersPlusFilters chargersPlusFilters, ChargersPlusLoadedFilters chargersPlusLoadedFilters) {
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
            this.d = null;
        } else {
            this.d = chargersPlusAnalyticsParams;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = chargersPlusFilters;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = chargersPlusLoadedFilters;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPlusOfferParametersDto)) {
            return false;
        }
        ChargersPlusOfferParametersDto chargersPlusOfferParametersDto = (ChargersPlusOfferParametersDto) obj;
        return jl40.l(this.a, chargersPlusOfferParametersDto.a) && jl40.l(this.b, chargersPlusOfferParametersDto.b) && jl40.l(this.c, chargersPlusOfferParametersDto.c) && jl40.l(this.d, chargersPlusOfferParametersDto.d) && jl40.l(this.e, chargersPlusOfferParametersDto.e) && this.f == chargersPlusOfferParametersDto.f && jl40.l(this.g, chargersPlusOfferParametersDto.g) && jl40.l(this.h, chargersPlusOfferParametersDto.h);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ChargersPlusAnalyticsParams chargersPlusAnalyticsParams = this.d;
        int hashCode = (b + (chargersPlusAnalyticsParams == null ? 0 : chargersPlusAnalyticsParams.hashCode())) * 31;
        String str = this.e;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        ChargersPlusFilters chargersPlusFilters = this.g;
        int hashCode2 = (e + (chargersPlusFilters == null ? 0 : chargersPlusFilters.hashCode())) * 31;
        ChargersPlusLoadedFilters chargersPlusLoadedFilters = this.h;
        return hashCode2 + (chargersPlusLoadedFilters != null ? chargersPlusLoadedFilters.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChargersPlusOfferParametersDto(serviceName=", this.a, ", productTarget=", this.b, ", sessionId=");
        v.append(this.c);
        v.append(", analyticsParams=");
        v.append(this.d);
        v.append(", serviceChannel=");
        tse0.y(this.e, ", offlineModeEnabled=", ", filters=", v, this.f);
        v.append(this.g);
        v.append(", loadedFilters=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ChargersPlusOfferParametersDto(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = null;
        this.h = null;
    }

    public ChargersPlusOfferParametersDto() {
        this(0);
    }
}
