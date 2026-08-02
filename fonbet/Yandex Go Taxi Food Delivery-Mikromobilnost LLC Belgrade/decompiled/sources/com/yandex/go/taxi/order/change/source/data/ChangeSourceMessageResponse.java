package com.yandex.go.taxi.order.change.source.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/data/ChangeSourceMessageResponse;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/change/source/data/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ChangeSourceMessageResponse {
    public static final b Companion = new b();
    public final String a;
    public final String b;

    public /* synthetic */ ChangeSourceMessageResponse(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ChangeSourceMessageResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
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
        if (!(obj instanceof ChangeSourceMessageResponse)) {
            return false;
        }
        ChangeSourceMessageResponse changeSourceMessageResponse = (ChangeSourceMessageResponse) obj;
        return jl40.l(this.a, changeSourceMessageResponse.a) && jl40.l(this.b, changeSourceMessageResponse.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("ChangeSourceMessageResponse(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
