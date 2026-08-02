package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.ly3;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$ActionButtons", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/j4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$ActionButtons extends a7 {
    public static final j4 Companion = new j4();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(9))};
    public final String a;
    public final String b;
    public final List c;

    public RideCardItemDto$ActionButtons(int i, String str, String str2, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$ActionButtons)) {
            return false;
        }
        RideCardItemDto$ActionButtons rideCardItemDto$ActionButtons = (RideCardItemDto$ActionButtons) obj;
        return jl40.l(this.a, rideCardItemDto$ActionButtons.a) && jl40.l(this.b, rideCardItemDto$ActionButtons.b) && jl40.l(this.c, rideCardItemDto$ActionButtons.c);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return ly3.s(b64.v("ActionButtons(id=", this.a, ", analyticsId=", this.b, ", buttons="), this.c, Extension.C_BRAKE);
    }

    public RideCardItemDto$ActionButtons(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public RideCardItemDto$ActionButtons() {
        this("", null, EmptyList.a);
    }
}
