package com.yandex.go.taxi.order.recalculation.model.request;

import defpackage.ew50;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/recalculation/model/request/NewRoutePriceParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/recalculation/model/request/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class NewRoutePriceParam {
    public static final b Companion = new b();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ew50(21)), null};
    public final String a;
    public final List b;
    public final String c;

    public /* synthetic */ NewRoutePriceParam(int i, String str, String str2, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, NewRoutePriceParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewRoutePriceParam)) {
            return false;
        }
        NewRoutePriceParam newRoutePriceParam = (NewRoutePriceParam) obj;
        return jl40.l(this.a, newRoutePriceParam.a) && jl40.l(this.b, newRoutePriceParam.b) && jl40.l(this.c, newRoutePriceParam.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(xvz.r("NewRoutePriceParam(orderId=", this.a, ", destinations=", this.b, ", previousRecalculationsId="), this.c, Extension.C_BRAKE);
    }

    public NewRoutePriceParam(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }
}
