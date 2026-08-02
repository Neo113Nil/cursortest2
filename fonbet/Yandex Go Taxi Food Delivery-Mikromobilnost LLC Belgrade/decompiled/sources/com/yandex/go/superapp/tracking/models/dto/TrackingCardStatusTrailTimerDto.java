package com.yandex.go.superapp.tracking.models.dto;

import defpackage.b501;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusTrailTimerDto;", "Lb501;", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/z", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardStatusTrailTimerDto implements b501 {
    public static final z Companion = new z();
    public final TrackingCardTimerDto a;

    public /* synthetic */ TrackingCardStatusTrailTimerDto(int i, TrackingCardTimerDto trackingCardTimerDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = trackingCardTimerDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final TrackingCardTimerDto getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrackingCardStatusTrailTimerDto) && jl40.l(this.a, ((TrackingCardStatusTrailTimerDto) obj).a);
    }

    public final int hashCode() {
        TrackingCardTimerDto trackingCardTimerDto = this.a;
        if (trackingCardTimerDto == null) {
            return 0;
        }
        return trackingCardTimerDto.hashCode();
    }

    public final String toString() {
        return "TrackingCardStatusTrailTimerDto(timer=" + this.a + Extension.C_BRAKE;
    }

    public TrackingCardStatusTrailTimerDto() {
        this.a = null;
    }
}
