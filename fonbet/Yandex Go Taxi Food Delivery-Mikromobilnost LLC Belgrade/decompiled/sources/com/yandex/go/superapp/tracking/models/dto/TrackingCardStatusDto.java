package com.yandex.go.superapp.tracking.models.dto;

import defpackage.b501;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.y401;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusDto;", "", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/o", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardStatusDto {
    public static final o Companion = new o();
    public final y401 a;
    public final TrackingCardStatusTextDto b;
    public final TrackingCardStatusTextDto c;
    public final b501 d;

    public /* synthetic */ TrackingCardStatusDto(int i, y401 y401Var, TrackingCardStatusTextDto trackingCardStatusTextDto, TrackingCardStatusTextDto trackingCardStatusTextDto2, b501 b501Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = y401Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = trackingCardStatusTextDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = trackingCardStatusTextDto2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = b501Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final y401 getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final TrackingCardStatusTextDto getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final TrackingCardStatusTextDto getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final b501 getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingCardStatusDto)) {
            return false;
        }
        TrackingCardStatusDto trackingCardStatusDto = (TrackingCardStatusDto) obj;
        return jl40.l(this.a, trackingCardStatusDto.a) && jl40.l(this.b, trackingCardStatusDto.b) && jl40.l(this.c, trackingCardStatusDto.c) && jl40.l(this.d, trackingCardStatusDto.d);
    }

    public final int hashCode() {
        y401 y401Var = this.a;
        int hashCode = (y401Var == null ? 0 : y401Var.hashCode()) * 31;
        TrackingCardStatusTextDto trackingCardStatusTextDto = this.b;
        int hashCode2 = (hashCode + (trackingCardStatusTextDto == null ? 0 : trackingCardStatusTextDto.hashCode())) * 31;
        TrackingCardStatusTextDto trackingCardStatusTextDto2 = this.c;
        int hashCode3 = (hashCode2 + (trackingCardStatusTextDto2 == null ? 0 : trackingCardStatusTextDto2.hashCode())) * 31;
        b501 b501Var = this.d;
        return hashCode3 + (b501Var != null ? b501Var.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingCardStatusDto(lead=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", trail=" + this.d + Extension.C_BRAKE;
    }

    public TrackingCardStatusDto(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public TrackingCardStatusDto() {
        this(0);
    }
}
