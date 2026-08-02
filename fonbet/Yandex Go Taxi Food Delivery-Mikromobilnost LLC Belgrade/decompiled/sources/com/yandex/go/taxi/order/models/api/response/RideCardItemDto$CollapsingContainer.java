package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$CollapsingContainer", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/r4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$CollapsingContainer extends a7 {
    public static final r4 Companion = new r4();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(17)), null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public RideCardItemDto$CollapsingContainer(String str, int i, String str2, String str3, List list) {
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$CollapsingContainer)) {
            return false;
        }
        RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer = (RideCardItemDto$CollapsingContainer) obj;
        return jl40.l(this.a, rideCardItemDto$CollapsingContainer.a) && jl40.l(this.b, rideCardItemDto$CollapsingContainer.b) && jl40.l(this.c, rideCardItemDto$CollapsingContainer.c) && jl40.l(this.d, rideCardItemDto$CollapsingContainer.d);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return c + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.n.l(", fallbackDividerId=", this.d, Extension.C_BRAKE, b64.v("CollapsingContainer(id=", this.a, ", analyticsId=", this.b, ", itemsId="), this.c);
    }

    public RideCardItemDto$CollapsingContainer() {
        this.a = "";
        this.b = null;
        this.c = EmptyList.a;
        this.d = null;
    }
}
