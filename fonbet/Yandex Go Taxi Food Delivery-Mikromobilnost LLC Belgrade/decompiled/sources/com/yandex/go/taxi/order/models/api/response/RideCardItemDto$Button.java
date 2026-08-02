package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.slot.dto.BadgeItemDto;
import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$Button", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/n4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$Button extends a7 {
    public static final n4 Companion = new n4();
    public static final i3y[] h = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(11)), null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final SlotButtonDto.WidthStrategy d;
    public final SlotButtonDto.Properties e;
    public final SlotItemDto f;
    public final BadgeItemDto g;

    public RideCardItemDto$Button(int i, String str, String str2, String str3, SlotButtonDto.WidthStrategy widthStrategy, SlotButtonDto.Properties properties, SlotItemDto slotItemDto, BadgeItemDto badgeItemDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = SlotButtonDto.WidthStrategy.DEFAULT;
        } else {
            this.d = widthStrategy;
        }
        if ((i & 16) == 0) {
            this.e = new SlotButtonDto.Properties(0);
        } else {
            this.e = properties;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = slotItemDto;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = badgeItemDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$Button)) {
            return false;
        }
        RideCardItemDto$Button rideCardItemDto$Button = (RideCardItemDto$Button) obj;
        return jl40.l(this.a, rideCardItemDto$Button.a) && jl40.l(this.b, rideCardItemDto$Button.b) && jl40.l(this.c, rideCardItemDto$Button.c) && this.d == rideCardItemDto$Button.d && jl40.l(this.e, rideCardItemDto$Button.e) && jl40.l(this.f, rideCardItemDto$Button.f) && jl40.l(this.g, rideCardItemDto$Button.g);
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
        String str2 = this.c;
        int hashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        SlotItemDto slotItemDto = this.f;
        int hashCode4 = (hashCode3 + (slotItemDto == null ? 0 : slotItemDto.hashCode())) * 31;
        BadgeItemDto badgeItemDto = this.g;
        return hashCode4 + (badgeItemDto != null ? badgeItemDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Button(id=", this.a, ", analyticsId=", this.b, ", a11y=");
        v.append(this.c);
        v.append(", widthStrategy=");
        v.append(this.d);
        v.append(", properties=");
        v.append(this.e);
        v.append(", slot=");
        v.append(this.f);
        v.append(", badge=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$Button() {
        SlotButtonDto.WidthStrategy widthStrategy = SlotButtonDto.WidthStrategy.DEFAULT;
        SlotButtonDto.Properties properties = new SlotButtonDto.Properties(0);
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = widthStrategy;
        this.e = properties;
        this.f = null;
        this.g = null;
    }
}
