package com.yandex.go.ridetech.locationsdk.experiment.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ridetech/locationsdk/experiment/dto/AndroidProviderDiscardConfigDto;", "", "Companion", "com/yandex/go/ridetech/locationsdk/experiment/dto/a", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AndroidProviderDiscardConfigDto {
    public static final a Companion = new a();
    public static final AndroidProviderDiscardConfigDto e = new AndroidProviderDiscardConfigDto(12);
    public final Long a;
    public final boolean b;
    public final Long c;
    public final Long d;

    public /* synthetic */ AndroidProviderDiscardConfigDto(int i, Long l, boolean z, Long l2, Long l3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidProviderDiscardConfigDto)) {
            return false;
        }
        AndroidProviderDiscardConfigDto androidProviderDiscardConfigDto = (AndroidProviderDiscardConfigDto) obj;
        return jl40.l(this.a, androidProviderDiscardConfigDto.a) && this.b == androidProviderDiscardConfigDto.b && jl40.l(this.c, androidProviderDiscardConfigDto.c) && jl40.l(this.d, androidProviderDiscardConfigDto.d);
    }

    public final int hashCode() {
        Long l = this.a;
        int e2 = unr0.e((l == null ? 0 : l.hashCode()) * 31, 31, this.b);
        Long l2 = this.c;
        int hashCode = (e2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        return hashCode + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "AndroidProviderDiscardConfigDto(throttleLoggingMs=" + this.a + ", allowMock=" + this.b + ", maxAgeRealtimeMs=" + this.c + ", maxAheadOfTimeRealtimeMs=" + this.d + Extension.C_BRAKE;
    }

    public AndroidProviderDiscardConfigDto(int i) {
        this.a = (i & 1) != 0 ? null : 180000L;
        this.b = false;
        this.c = null;
        this.d = null;
    }

    public AndroidProviderDiscardConfigDto() {
        this(15);
    }
}
