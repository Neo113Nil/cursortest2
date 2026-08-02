package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.ojk0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$Generic", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Lojk0;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/d5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$Generic extends a7 implements ojk0 {
    public static final d5 Companion = new d5();
    public final String a;
    public final String b;
    public final SlotItemDto c;
    public final String d;

    public RideCardItemDto$Generic(int i, String str, String str2, SlotItemDto slotItemDto, String str3) {
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    @Override // defpackage.ojk0
    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$Generic)) {
            return false;
        }
        RideCardItemDto$Generic rideCardItemDto$Generic = (RideCardItemDto$Generic) obj;
        return jl40.l(this.a, rideCardItemDto$Generic.a) && jl40.l(this.b, rideCardItemDto$Generic.b) && jl40.l(this.c, rideCardItemDto$Generic.c) && jl40.l(this.d, rideCardItemDto$Generic.d);
    }

    @Override // defpackage.ojk0
    /* renamed from: f, reason: from getter */
    public final SlotItemDto getC() {
        return this.c;
    }

    @Override // defpackage.ojk0
    /* renamed from: getBackgroundColor, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.ojk0
    public final RideCardItemDto$Type getType() {
        return RideCardItemDto$Type.GENERIC_BASED;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SlotItemDto slotItemDto = this.c;
        int hashCode3 = (hashCode2 + (slotItemDto == null ? 0 : slotItemDto.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Generic(id=", this.a, ", analyticsId=", this.b, ", slot=");
        v.append(this.c);
        v.append(", backgroundColor=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$Generic(String str, String str2, SlotItemDto slotItemDto, String str3) {
        this.a = str;
        this.b = str2;
        this.c = slotItemDto;
        this.d = str3;
    }

    public RideCardItemDto$Generic() {
        this("", null, null, null);
    }
}
