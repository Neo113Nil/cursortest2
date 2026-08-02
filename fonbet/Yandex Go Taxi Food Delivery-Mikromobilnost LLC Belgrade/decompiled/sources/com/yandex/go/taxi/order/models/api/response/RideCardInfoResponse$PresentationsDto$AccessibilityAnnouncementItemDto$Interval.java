package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval", "Lcom/yandex/go/taxi/order/models/api/response/z3;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/w3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval extends z3 {
    public static final w3 Companion = new w3();
    public final String a;
    public final String b;
    public final Long c;

    public RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval(int i, String str, String str2, Long l) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval)) {
            return false;
        }
        RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval rideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval = (RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval) obj;
        return jl40.l(this.a, rideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval.a) && jl40.l(this.b, rideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval.b) && jl40.l(this.c, rideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Interval(template=", this.a, ", sourceId=", this.b, ", delay=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
