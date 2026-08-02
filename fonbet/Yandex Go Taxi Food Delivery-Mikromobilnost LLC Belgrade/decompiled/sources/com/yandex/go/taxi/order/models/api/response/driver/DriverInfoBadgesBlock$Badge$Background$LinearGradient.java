package com.yandex.go.taxi.order.models.api.response.driver;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/driver/DriverInfoBadgesBlock$Badge$Background$LinearGradient", "Lcom/yandex/go/taxi/order/models/api/response/driver/i;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/driver/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DriverInfoBadgesBlock$Badge$Background$LinearGradient implements i {
    public static final f Companion = new f();
    public final String a;
    public final String b;

    public /* synthetic */ DriverInfoBadgesBlock$Badge$Background$LinearGradient(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriverInfoBadgesBlock$Badge$Background$LinearGradient)) {
            return false;
        }
        DriverInfoBadgesBlock$Badge$Background$LinearGradient driverInfoBadgesBlock$Badge$Background$LinearGradient = (DriverInfoBadgesBlock$Badge$Background$LinearGradient) obj;
        return jl40.l(this.a, driverInfoBadgesBlock$Badge$Background$LinearGradient.a) && jl40.l(this.b, driverInfoBadgesBlock$Badge$Background$LinearGradient.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("LinearGradient(startColor=", this.a, ", endColor=", this.b, Extension.C_BRAKE);
    }

    public DriverInfoBadgesBlock$Badge$Background$LinearGradient() {
        this.a = null;
        this.b = null;
    }
}
