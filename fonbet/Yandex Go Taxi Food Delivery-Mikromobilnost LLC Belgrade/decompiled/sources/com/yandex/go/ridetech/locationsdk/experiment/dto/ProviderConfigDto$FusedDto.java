package com.yandex.go.ridetech.locationsdk.experiment.dto;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/ridetech/locationsdk/experiment/dto/ProviderConfigDto$FusedDto", "Lcom/yandex/go/ridetech/locationsdk/experiment/dto/f;", "Companion", "com/yandex/go/ridetech/locationsdk/experiment/dto/e", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProviderConfigDto$FusedDto extends f {
    public static final e Companion = new e();
    public final long b;
    public final Float c;
    public final AndroidProviderDiscardConfigDto d;
    public final String e;
    public final Long f;
    public final boolean g;

    public ProviderConfigDto$FusedDto(int i, long j, Float f, AndroidProviderDiscardConfigDto androidProviderDiscardConfigDto, String str, Long l, boolean z) {
        this.b = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
        if ((i & 4) == 0) {
            AndroidProviderDiscardConfigDto.Companion.getClass();
            this.d = AndroidProviderDiscardConfigDto.e;
        } else {
            this.d = androidProviderDiscardConfigDto;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderConfigDto$FusedDto)) {
            return false;
        }
        ProviderConfigDto$FusedDto providerConfigDto$FusedDto = (ProviderConfigDto$FusedDto) obj;
        return this.b == providerConfigDto$FusedDto.b && jl40.l(this.c, providerConfigDto$FusedDto.c) && jl40.l(this.d, providerConfigDto$FusedDto.d) && jl40.l(this.e, providerConfigDto$FusedDto.e) && jl40.l(this.f, providerConfigDto$FusedDto.f) && this.g == providerConfigDto$FusedDto.g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        Float f = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (f == null ? 0 : f.hashCode())) * 31)) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f;
        return Boolean.hashCode(this.g) + ((hashCode3 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FusedDto(intervalMs=" + this.b + ", minDistanceM=" + this.c + ", discardConfig=" + this.d + ", priority=" + this.e + ", fastestIntervalMs=" + this.f + ", preferHms=" + this.g + Extension.C_BRAKE;
    }

    public ProviderConfigDto$FusedDto() {
        AndroidProviderDiscardConfigDto.Companion.getClass();
        AndroidProviderDiscardConfigDto androidProviderDiscardConfigDto = AndroidProviderDiscardConfigDto.e;
        this.b = 0L;
        this.c = null;
        this.d = androidProviderDiscardConfigDto;
        this.e = null;
        this.f = null;
        this.g = false;
    }
}
