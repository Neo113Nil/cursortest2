package com.yandex.go.taxi.order.change.source.data;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/data/CheckChangeSourceParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/change/source/data/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CheckChangeSourceParam {
    public static final f Companion = new f();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(19))};
    public final String a;
    public final List b;

    public /* synthetic */ CheckChangeSourceParam(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, CheckChangeSourceParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckChangeSourceParam)) {
            return false;
        }
        CheckChangeSourceParam checkChangeSourceParam = (CheckChangeSourceParam) obj;
        return jl40.l(this.a, checkChangeSourceParam.a) && jl40.l(this.b, checkChangeSourceParam.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("CheckChangeSourceParam(orderId=", this.a, ", geoPoints=", Extension.C_BRAKE, this.b);
    }

    public CheckChangeSourceParam(String str, List list) {
        this.a = str;
        this.b = list;
    }
}
