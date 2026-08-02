package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$Accordion", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/h4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$Accordion extends a7 {
    public static final h4 Companion = new h4();
    public final String a;
    public final String b;
    public final HeaderAccordionDto c;
    public final ContentAccordionDto d;

    public RideCardItemDto$Accordion(int i, String str, String str2, HeaderAccordionDto headerAccordionDto, ContentAccordionDto contentAccordionDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = new HeaderAccordionDto(0);
        } else {
            this.c = headerAccordionDto;
        }
        if ((i & 8) == 0) {
            this.d = new ContentAccordionDto(0);
        } else {
            this.d = contentAccordionDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$Accordion)) {
            return false;
        }
        RideCardItemDto$Accordion rideCardItemDto$Accordion = (RideCardItemDto$Accordion) obj;
        return jl40.l(this.a, rideCardItemDto$Accordion.a) && jl40.l(this.b, rideCardItemDto$Accordion.b) && jl40.l(this.c, rideCardItemDto$Accordion.c) && jl40.l(this.d, rideCardItemDto$Accordion.d);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.a.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Accordion(id=", this.a, ", analyticsId=", this.b, ", header=");
        v.append(this.c);
        v.append(", content=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$Accordion() {
        HeaderAccordionDto headerAccordionDto = new HeaderAccordionDto(0);
        ContentAccordionDto contentAccordionDto = new ContentAccordionDto(0);
        this.a = "";
        this.b = null;
        this.c = headerAccordionDto;
        this.d = contentAccordionDto;
    }
}
