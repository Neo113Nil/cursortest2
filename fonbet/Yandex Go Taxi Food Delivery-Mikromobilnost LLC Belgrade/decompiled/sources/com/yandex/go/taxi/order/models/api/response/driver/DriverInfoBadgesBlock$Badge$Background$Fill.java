package com.yandex.go.taxi.order.models.api.response.driver;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/driver/DriverInfoBadgesBlock$Badge$Background$Fill", "Lcom/yandex/go/taxi/order/models/api/response/driver/i;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/driver/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DriverInfoBadgesBlock$Badge$Background$Fill implements i {
    public static final e Companion = new e();
    public final String a;

    public /* synthetic */ DriverInfoBadgesBlock$Badge$Background$Fill(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DriverInfoBadgesBlock$Badge$Background$Fill) && jl40.l(this.a, ((DriverInfoBadgesBlock$Badge$Background$Fill) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Fill(color=", this.a, Extension.C_BRAKE);
    }

    public DriverInfoBadgesBlock$Badge$Background$Fill() {
        this.a = null;
    }
}
