package com.yandex.go.superapp.tracking.models.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusTextDto;", "", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/t", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardStatusTextDto {
    public static final t Companion = new t();
    public final FormattedText a;
    public final boolean b;
    public final TrackingCardTimerDto c;

    public /* synthetic */ TrackingCardStatusTextDto(int i, FormattedText formattedText, boolean z, TrackingCardTimerDto trackingCardTimerDto) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, TrackingCardStatusTextDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = formattedText;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = trackingCardTimerDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final TrackingCardTimerDto getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingCardStatusTextDto)) {
            return false;
        }
        TrackingCardStatusTextDto trackingCardStatusTextDto = (TrackingCardStatusTextDto) obj;
        return jl40.l(this.a, trackingCardStatusTextDto.a) && this.b == trackingCardStatusTextDto.b && jl40.l(this.c, trackingCardStatusTextDto.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.a.hashCode() * 31, 31, this.b);
        TrackingCardTimerDto trackingCardTimerDto = this.c;
        return e + (trackingCardTimerDto == null ? 0 : trackingCardTimerDto.hashCode());
    }

    public final String toString() {
        return "TrackingCardStatusTextDto(text=" + this.a + ", isShimmering=" + this.b + ", timer=" + this.c + Extension.C_BRAKE;
    }
}
