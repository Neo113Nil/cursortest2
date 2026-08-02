package com.yandex.go.places.models.data.entities.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/ActionDto$OpenDeliveryFormActionDto", "Lcom/yandex/go/places/models/data/entities/network/s;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/f", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActionDto$OpenDeliveryFormActionDto extends s {
    public static final f Companion = new f();
    public final String a;
    public final String b;
    public final DeliveryOrderFormRoutePointDto c;

    public ActionDto$OpenDeliveryFormActionDto(int i, String str, String str2, DeliveryOrderFormRoutePointDto deliveryOrderFormRoutePointDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = deliveryOrderFormRoutePointDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionDto$OpenDeliveryFormActionDto)) {
            return false;
        }
        ActionDto$OpenDeliveryFormActionDto actionDto$OpenDeliveryFormActionDto = (ActionDto$OpenDeliveryFormActionDto) obj;
        return jl40.l(this.a, actionDto$OpenDeliveryFormActionDto.a) && jl40.l(this.b, actionDto$OpenDeliveryFormActionDto.b) && jl40.l(this.c, actionDto$OpenDeliveryFormActionDto.c);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        DeliveryOrderFormRoutePointDto deliveryOrderFormRoutePointDto = this.c;
        return b + (deliveryOrderFormRoutePointDto != null ? deliveryOrderFormRoutePointDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("OpenDeliveryFormActionDto(scenario=", this.a, ", mode=", this.b, ", presetPoint=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ActionDto$OpenDeliveryFormActionDto() {
        this.a = null;
        this.b = "";
        this.c = null;
    }
}
