package com.yandex.go.superapp.tracking.models.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.r9v;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardRatingSelectorDto;", "", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/n", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardRatingSelectorDto {
    public static final n Companion = new n();
    public final String a;
    public final r9v b;
    public final r9v c;
    public final r9v d;

    public /* synthetic */ TrackingCardRatingSelectorDto(int i, String str, r9v r9vVar, r9v r9vVar2, r9v r9vVar3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = r9vVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = r9vVar2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = r9vVar3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingCardRatingSelectorDto)) {
            return false;
        }
        TrackingCardRatingSelectorDto trackingCardRatingSelectorDto = (TrackingCardRatingSelectorDto) obj;
        return jl40.l(this.a, trackingCardRatingSelectorDto.a) && jl40.l(this.b, trackingCardRatingSelectorDto.b) && jl40.l(this.c, trackingCardRatingSelectorDto.c) && jl40.l(this.d, trackingCardRatingSelectorDto.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        r9v r9vVar = this.b;
        int hashCode2 = (hashCode + (r9vVar == null ? 0 : r9vVar.hashCode())) * 31;
        r9v r9vVar2 = this.c;
        int hashCode3 = (hashCode2 + (r9vVar2 == null ? 0 : r9vVar2.hashCode())) * 31;
        r9v r9vVar3 = this.d;
        return hashCode3 + (r9vVar3 != null ? r9vVar3.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingCardRatingSelectorDto(selectedColor=" + this.a + ", selectedImage=" + this.b + ", unselectedImage=" + this.c + ", backgroundGlowImage=" + this.d + Extension.C_BRAKE;
    }

    public TrackingCardRatingSelectorDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
