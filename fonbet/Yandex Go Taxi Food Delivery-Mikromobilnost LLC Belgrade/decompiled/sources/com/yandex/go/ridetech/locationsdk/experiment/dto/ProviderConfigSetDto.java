package com.yandex.go.ridetech.locationsdk.experiment.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ridetech/locationsdk/experiment/dto/ProviderConfigSetDto;", "", "Companion", "$serializer", "com/yandex/go/ridetech/locationsdk/experiment/dto/g", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProviderConfigSetDto {
    public static final g Companion = new g();
    public final ProviderConfigDto$AndroidDto a;
    public final ProviderConfigDto$AndroidDto b;
    public final ProviderConfigDto$AndroidDto c;
    public final ProviderConfigDto$FusedDto d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ ProviderConfigSetDto(int i, ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto, ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto2, ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto3, ProviderConfigDto$FusedDto providerConfigDto$FusedDto, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = providerConfigDto$AndroidDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = providerConfigDto$AndroidDto2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = providerConfigDto$AndroidDto3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = providerConfigDto$FusedDto;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderConfigSetDto)) {
            return false;
        }
        ProviderConfigSetDto providerConfigSetDto = (ProviderConfigSetDto) obj;
        return jl40.l(this.a, providerConfigSetDto.a) && jl40.l(this.b, providerConfigSetDto.b) && jl40.l(this.c, providerConfigSetDto.c) && jl40.l(this.d, providerConfigSetDto.d) && this.e == providerConfigSetDto.e && this.f == providerConfigSetDto.f;
    }

    public final int hashCode() {
        ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto = this.a;
        int hashCode = (providerConfigDto$AndroidDto == null ? 0 : providerConfigDto$AndroidDto.hashCode()) * 31;
        ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto2 = this.b;
        int hashCode2 = (hashCode + (providerConfigDto$AndroidDto2 == null ? 0 : providerConfigDto$AndroidDto2.hashCode())) * 31;
        ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto3 = this.c;
        int hashCode3 = (hashCode2 + (providerConfigDto$AndroidDto3 == null ? 0 : providerConfigDto$AndroidDto3.hashCode())) * 31;
        ProviderConfigDto$FusedDto providerConfigDto$FusedDto = this.d;
        return Boolean.hashCode(this.f) + unr0.e((hashCode3 + (providerConfigDto$FusedDto != null ? providerConfigDto$FusedDto.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProviderConfigSetDto(gps=");
        sb.append(this.a);
        sb.append(", network=");
        sb.append(this.b);
        sb.append(", passive=");
        sb.append(this.c);
        sb.append(", fused=");
        sb.append(this.d);
        sb.append(", mapkitToggle=");
        return smw0.k(", goLbsToggle=", Extension.C_BRAKE, sb, this.e, this.f);
    }

    public ProviderConfigSetDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = false;
    }
}
