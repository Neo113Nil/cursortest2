package com.yandex.go.ridetech.locationsdk.experiment.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/ridetech/locationsdk/experiment/dto/ProviderConfigDto$AndroidDto", "Lcom/yandex/go/ridetech/locationsdk/experiment/dto/f;", "Companion", "$serializer", "com/yandex/go/ridetech/locationsdk/experiment/dto/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProviderConfigDto$AndroidDto extends f {
    public static final d Companion = new d();
    public final long b;
    public final Float c;
    public final AndroidProviderDiscardConfigDto d;
    public final Long e;
    public final long f;
    public final boolean g;

    public ProviderConfigDto$AndroidDto(int i, long j, Float f, AndroidProviderDiscardConfigDto androidProviderDiscardConfigDto, Long l, long j2, boolean z) {
        if ((i & 1) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
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
            this.e = l;
        }
        if ((i & 16) == 0) {
            this.f = 0L;
        } else {
            this.f = j2;
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
        if (!(obj instanceof ProviderConfigDto$AndroidDto)) {
            return false;
        }
        ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto = (ProviderConfigDto$AndroidDto) obj;
        return this.b == providerConfigDto$AndroidDto.b && jl40.l(this.c, providerConfigDto$AndroidDto.c) && jl40.l(this.d, providerConfigDto$AndroidDto.d) && jl40.l(this.e, providerConfigDto$AndroidDto.e) && this.f == providerConfigDto$AndroidDto.f && this.g == providerConfigDto$AndroidDto.g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        Float f = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (f == null ? 0 : f.hashCode())) * 31)) * 31;
        Long l = this.e;
        return Boolean.hashCode(this.g) + qv10.c((hashCode2 + (l != null ? l.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidDto(intervalMs=");
        sb.append(this.b);
        sb.append(", minDistanceM=");
        sb.append(this.c);
        sb.append(", discardConfig=");
        sb.append(this.d);
        sb.append(", retryTimeoutMs=");
        sb.append(this.e);
        x4e.A(this.f, ", retryDelayMs=", ", includePassive=", sb);
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }

    public ProviderConfigDto$AndroidDto() {
        AndroidProviderDiscardConfigDto.Companion.getClass();
        AndroidProviderDiscardConfigDto androidProviderDiscardConfigDto = AndroidProviderDiscardConfigDto.e;
        this.b = 0L;
        this.c = null;
        this.d = androidProviderDiscardConfigDto;
        this.e = null;
        this.f = 0L;
        this.g = false;
    }
}
