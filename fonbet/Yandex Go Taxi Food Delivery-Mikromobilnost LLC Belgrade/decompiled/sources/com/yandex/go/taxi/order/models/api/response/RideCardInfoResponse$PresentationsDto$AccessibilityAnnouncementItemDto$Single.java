package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single", "Lcom/yandex/go/taxi/order/models/api/response/z3;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/y3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single extends z3 {
    public static final y3 Companion = new y3();
    public final String a;

    public RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single) && jl40.l(this.a, ((RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Single(text=", this.a, Extension.C_BRAKE);
    }

    public RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single() {
        this.a = null;
    }
}
