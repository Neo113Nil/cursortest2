package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.sjk0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$TipsSelector", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/q6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$TipsSelector extends a7 {
    public static final q6 Companion = new q6();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(14))};
    public final String a;
    public final String b;
    public final Integer c;
    public final SlotItemDto d;
    public final List e;

    public RideCardItemDto$TipsSelector(int i, String str, String str2, Integer num, SlotItemDto slotItemDto, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = slotItemDto;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$TipsSelector)) {
            return false;
        }
        RideCardItemDto$TipsSelector rideCardItemDto$TipsSelector = (RideCardItemDto$TipsSelector) obj;
        return jl40.l(this.a, rideCardItemDto$TipsSelector.a) && jl40.l(this.b, rideCardItemDto$TipsSelector.b) && jl40.l(this.c, rideCardItemDto$TipsSelector.c) && jl40.l(this.d, rideCardItemDto$TipsSelector.d) && jl40.l(this.e, rideCardItemDto$TipsSelector.e);
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
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        SlotItemDto slotItemDto = this.d;
        return this.e.hashCode() + ((hashCode3 + (slotItemDto != null ? slotItemDto.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TipsSelector(id=", this.a, ", analyticsId=", this.b, ", subscriptionTipsPosition=");
        v.append(this.c);
        v.append(", subscriptionSlot=");
        v.append(this.d);
        v.append(", choices=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }

    public RideCardItemDto$TipsSelector() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = EmptyList.a;
    }
}
