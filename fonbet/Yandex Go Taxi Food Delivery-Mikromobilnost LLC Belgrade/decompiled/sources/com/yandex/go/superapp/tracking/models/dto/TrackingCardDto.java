package com.yandex.go.superapp.tracking.models.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nhz0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardDto;", "", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/h", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardDto {
    public static final h Companion = new h();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(20)), null};
    public final TrackingCardStatusDto a;
    public final List b;
    public final TrackingCardRatingSelectorDto c;

    public /* synthetic */ TrackingCardDto(int i, TrackingCardStatusDto trackingCardStatusDto, List list, TrackingCardRatingSelectorDto trackingCardRatingSelectorDto) {
        this.a = (i & 1) == 0 ? new TrackingCardStatusDto(0) : trackingCardStatusDto;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = trackingCardRatingSelectorDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final TrackingCardStatusDto getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingCardDto)) {
            return false;
        }
        TrackingCardDto trackingCardDto = (TrackingCardDto) obj;
        return jl40.l(this.a, trackingCardDto.a) && jl40.l(this.b, trackingCardDto.b) && jl40.l(this.c, trackingCardDto.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        TrackingCardRatingSelectorDto trackingCardRatingSelectorDto = this.c;
        return c + (trackingCardRatingSelectorDto == null ? 0 : trackingCardRatingSelectorDto.hashCode());
    }

    public final String toString() {
        return "TrackingCardDto(status=" + this.a + ", extraButtons=" + this.b + ", ratingSelector=" + this.c + Extension.C_BRAKE;
    }

    public TrackingCardDto() {
        this.a = new TrackingCardStatusDto(0);
        this.b = EmptyList.a;
        this.c = null;
    }
}
