package com.yandex.go.superapp.tracking.models.dto;

import defpackage.d401;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.r9v;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardPlateNumberImagePlainDto;", "Ld401;", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/k", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardPlateNumberImagePlainDto implements d401 {
    public static final k Companion = new k();
    public final r9v a;

    public /* synthetic */ TrackingCardPlateNumberImagePlainDto(int i, r9v r9vVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = r9vVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final r9v getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrackingCardPlateNumberImagePlainDto) && jl40.l(this.a, ((TrackingCardPlateNumberImagePlainDto) obj).a);
    }

    public final int hashCode() {
        r9v r9vVar = this.a;
        if (r9vVar == null) {
            return 0;
        }
        return r9vVar.hashCode();
    }

    public final String toString() {
        return "TrackingCardPlateNumberImagePlainDto(image=" + this.a + Extension.C_BRAKE;
    }

    public TrackingCardPlateNumberImagePlainDto() {
        this.a = null;
    }
}
