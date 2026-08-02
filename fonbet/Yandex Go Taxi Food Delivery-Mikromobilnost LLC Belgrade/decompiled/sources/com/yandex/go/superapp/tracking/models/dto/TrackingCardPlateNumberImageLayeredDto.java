package com.yandex.go.superapp.tracking.models.dto;

import defpackage.d401;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardPlateNumberImageLayeredDto;", "Ld401;", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/i", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardPlateNumberImageLayeredDto implements d401 {
    public static final i Companion = new i();
    public final TrackingCardPlateNumberObjectLayeredImageDto a;

    public /* synthetic */ TrackingCardPlateNumberImageLayeredDto(int i, TrackingCardPlateNumberObjectLayeredImageDto trackingCardPlateNumberObjectLayeredImageDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = trackingCardPlateNumberObjectLayeredImageDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final TrackingCardPlateNumberObjectLayeredImageDto getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrackingCardPlateNumberImageLayeredDto) && jl40.l(this.a, ((TrackingCardPlateNumberImageLayeredDto) obj).a);
    }

    public final int hashCode() {
        TrackingCardPlateNumberObjectLayeredImageDto trackingCardPlateNumberObjectLayeredImageDto = this.a;
        if (trackingCardPlateNumberObjectLayeredImageDto == null) {
            return 0;
        }
        return trackingCardPlateNumberObjectLayeredImageDto.hashCode();
    }

    public final String toString() {
        return "TrackingCardPlateNumberImageLayeredDto(image=" + this.a + Extension.C_BRAKE;
    }

    public TrackingCardPlateNumberImageLayeredDto() {
        this.a = null;
    }
}
