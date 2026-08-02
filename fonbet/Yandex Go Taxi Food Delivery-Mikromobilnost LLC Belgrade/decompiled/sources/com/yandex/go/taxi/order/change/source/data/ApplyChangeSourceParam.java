package com.yandex.go.taxi.order.change.source.data;

import com.yandex.go.address.models.Address;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly1;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/data/ApplyChangeSourceParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/change/source/data/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ApplyChangeSourceParam {
    public static final a Companion = new a();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(29))};
    public final String a;
    public final Address b;
    public final SourceChangeReason c;

    public /* synthetic */ ApplyChangeSourceParam(int i, String str, Address address, SourceChangeReason sourceChangeReason) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ApplyChangeSourceParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = address;
        if ((i & 4) == 0) {
            this.c = SourceChangeReason.PICKUP_POINT_MANUAL;
        } else {
            this.c = sourceChangeReason;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyChangeSourceParam)) {
            return false;
        }
        ApplyChangeSourceParam applyChangeSourceParam = (ApplyChangeSourceParam) obj;
        return jl40.l(this.a, applyChangeSourceParam.a) && jl40.l(this.b, applyChangeSourceParam.b) && this.c == applyChangeSourceParam.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ApplyChangeSourceParam(orderId=" + this.a + ", address=" + this.b + ", reason=" + this.c + Extension.C_BRAKE;
    }

    public ApplyChangeSourceParam(String str, Address address, SourceChangeReason sourceChangeReason) {
        this.a = str;
        this.b = address;
        this.c = sourceChangeReason;
    }
}
