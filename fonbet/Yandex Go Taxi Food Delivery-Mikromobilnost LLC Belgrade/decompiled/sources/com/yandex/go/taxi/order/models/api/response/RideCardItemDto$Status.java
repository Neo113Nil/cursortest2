package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.response.status.RideCardStatusProperties;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qjk0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$Status", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Lqjk0;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/v5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$Status extends a7 implements qjk0 {
    public static final v5 Companion = new v5();
    public final String a;
    public final SlotItemDto b;
    public final String c;
    public final RideCardStatusProperties d;
    public final RideCardTimerDto e;

    public RideCardItemDto$Status(int i, String str, SlotItemDto slotItemDto, String str2, RideCardStatusProperties rideCardStatusProperties, RideCardTimerDto rideCardTimerDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = slotItemDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = rideCardStatusProperties;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = rideCardTimerDto;
        }
    }

    @Override // defpackage.qjk0
    /* renamed from: d, reason: from getter */
    public final RideCardTimerDto getG() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$Status)) {
            return false;
        }
        RideCardItemDto$Status rideCardItemDto$Status = (RideCardItemDto$Status) obj;
        return jl40.l(this.a, rideCardItemDto$Status.a) && jl40.l(this.b, rideCardItemDto$Status.b) && jl40.l(this.c, rideCardItemDto$Status.c) && jl40.l(this.d, rideCardItemDto$Status.d) && jl40.l(this.e, rideCardItemDto$Status.e);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SlotItemDto slotItemDto = this.b;
        int hashCode2 = (hashCode + (slotItemDto == null ? 0 : slotItemDto.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        RideCardStatusProperties rideCardStatusProperties = this.d;
        int hashCode4 = (hashCode3 + (rideCardStatusProperties == null ? 0 : rideCardStatusProperties.hashCode())) * 31;
        RideCardTimerDto rideCardTimerDto = this.e;
        return hashCode4 + (rideCardTimerDto != null ? rideCardTimerDto.hashCode() : 0);
    }

    public final String toString() {
        return "Status(id=" + this.a + ", slot=" + this.b + ", analyticsId=" + this.c + ", properties=" + this.d + ", timer=" + this.e + Extension.C_BRAKE;
    }

    public RideCardItemDto$Status(String str, SlotItemDto slotItemDto, String str2, RideCardStatusProperties rideCardStatusProperties, RideCardTimerDto rideCardTimerDto) {
        this.a = str;
        this.b = slotItemDto;
        this.c = str2;
        this.d = rideCardStatusProperties;
        this.e = rideCardTimerDto;
    }

    public RideCardItemDto$Status() {
        this("", null, null, null, null);
    }
}
