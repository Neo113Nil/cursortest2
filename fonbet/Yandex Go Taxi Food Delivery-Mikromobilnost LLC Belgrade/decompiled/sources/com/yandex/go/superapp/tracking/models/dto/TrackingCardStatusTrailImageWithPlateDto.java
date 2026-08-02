package com.yandex.go.superapp.tracking.models.dto;

import defpackage.b501;
import defpackage.d401;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusTrailImageWithPlateDto;", "Lb501;", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/v", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardStatusTrailImageWithPlateDto implements b501 {
    public static final v Companion = new v();
    public final d401 a;
    public final String b;

    public /* synthetic */ TrackingCardStatusTrailImageWithPlateDto(int i, d401 d401Var, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d401Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final d401 getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingCardStatusTrailImageWithPlateDto)) {
            return false;
        }
        TrackingCardStatusTrailImageWithPlateDto trackingCardStatusTrailImageWithPlateDto = (TrackingCardStatusTrailImageWithPlateDto) obj;
        return jl40.l(this.a, trackingCardStatusTrailImageWithPlateDto.a) && jl40.l(this.b, trackingCardStatusTrailImageWithPlateDto.b);
    }

    public final int hashCode() {
        d401 d401Var = this.a;
        int hashCode = (d401Var == null ? 0 : d401Var.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingCardStatusTrailImageWithPlateDto(image=" + this.a + ", plateText=" + this.b + Extension.C_BRAKE;
    }

    public TrackingCardStatusTrailImageWithPlateDto() {
        this.a = null;
        this.b = null;
    }
}
