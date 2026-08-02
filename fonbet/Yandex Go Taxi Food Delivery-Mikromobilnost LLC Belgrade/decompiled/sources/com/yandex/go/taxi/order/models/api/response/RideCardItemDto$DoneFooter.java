package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$DoneFooter", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/y4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$DoneFooter extends a7 {
    public static final y4 Companion = new y4();
    public final String a;
    public final String b;
    public final SlotItemDto c;

    public RideCardItemDto$DoneFooter(int i, String str, String str2, SlotItemDto slotItemDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = slotItemDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$DoneFooter)) {
            return false;
        }
        RideCardItemDto$DoneFooter rideCardItemDto$DoneFooter = (RideCardItemDto$DoneFooter) obj;
        return jl40.l(this.a, rideCardItemDto$DoneFooter.a) && jl40.l(this.b, rideCardItemDto$DoneFooter.b) && jl40.l(this.c, rideCardItemDto$DoneFooter.c);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SlotItemDto slotItemDto = this.c;
        return hashCode2 + (slotItemDto != null ? slotItemDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DoneFooter(id=", this.a, ", analyticsId=", this.b, ", slot=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$DoneFooter(String str, String str2, SlotItemDto slotItemDto) {
        this.a = str;
        this.b = str2;
        this.c = slotItemDto;
    }

    public RideCardItemDto$DoneFooter() {
        this("", null, null);
    }
}
