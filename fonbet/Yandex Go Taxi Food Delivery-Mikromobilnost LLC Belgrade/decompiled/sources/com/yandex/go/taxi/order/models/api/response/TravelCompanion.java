package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TravelCompanion;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/w8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TravelCompanion {
    public static final w8 Companion = new w8();
    public final CompanionHeader a;
    public final CompanionBody b;
    public final Feedback c;

    public /* synthetic */ TravelCompanion(int i, CompanionHeader companionHeader, CompanionBody companionBody, Feedback feedback) {
        this.a = (i & 1) == 0 ? new CompanionHeader(0) : companionHeader;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = companionBody;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = feedback;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelCompanion)) {
            return false;
        }
        TravelCompanion travelCompanion = (TravelCompanion) obj;
        return jl40.l(this.a, travelCompanion.a) && jl40.l(this.b, travelCompanion.b) && jl40.l(this.c, travelCompanion.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CompanionBody companionBody = this.b;
        int hashCode2 = (hashCode + (companionBody == null ? 0 : companionBody.hashCode())) * 31;
        Feedback feedback = this.c;
        return hashCode2 + (feedback != null ? feedback.hashCode() : 0);
    }

    public final String toString() {
        return "TravelCompanion(header=" + this.a + ", body=" + this.b + ", feedback=" + this.c + Extension.C_BRAKE;
    }

    public TravelCompanion() {
        this.a = new CompanionHeader(0);
        this.b = null;
        this.c = null;
    }
}
