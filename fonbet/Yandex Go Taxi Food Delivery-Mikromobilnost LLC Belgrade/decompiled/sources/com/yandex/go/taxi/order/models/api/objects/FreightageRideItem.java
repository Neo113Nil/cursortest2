package com.yandex.go.taxi.order.models.api.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/FreightageRideItem;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/q", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FreightageRideItem {
    public static final q Companion = new q();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ FreightageRideItem(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreightageRideItem)) {
            return false;
        }
        FreightageRideItem freightageRideItem = (FreightageRideItem) obj;
        return jl40.l(this.a, freightageRideItem.a) && jl40.l(this.b, freightageRideItem.b) && jl40.l(this.c, freightageRideItem.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("FreightageRideItem(title=", this.a, ", imageTag=", this.b, ", description="), this.c, Extension.C_BRAKE);
    }

    public FreightageRideItem() {
        this.a = "";
        this.b = null;
        this.c = "";
    }
}
