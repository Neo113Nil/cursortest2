package com.yandex.go.superapp.tracking.models.dto;

import defpackage.b501;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusTrailButtonDto;", "Lb501;", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/u", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardStatusTrailButtonDto implements b501 {
    public static final u Companion = new u();
    public final TrackingCardButtonDto a;

    public /* synthetic */ TrackingCardStatusTrailButtonDto(int i, TrackingCardButtonDto trackingCardButtonDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = trackingCardButtonDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrackingCardStatusTrailButtonDto) && jl40.l(this.a, ((TrackingCardStatusTrailButtonDto) obj).a);
    }

    public final int hashCode() {
        TrackingCardButtonDto trackingCardButtonDto = this.a;
        if (trackingCardButtonDto == null) {
            return 0;
        }
        return trackingCardButtonDto.hashCode();
    }

    public final String toString() {
        return "TrackingCardStatusTrailButtonDto(button=" + this.a + Extension.C_BRAKE;
    }

    public TrackingCardStatusTrailButtonDto() {
        this.a = null;
    }
}
