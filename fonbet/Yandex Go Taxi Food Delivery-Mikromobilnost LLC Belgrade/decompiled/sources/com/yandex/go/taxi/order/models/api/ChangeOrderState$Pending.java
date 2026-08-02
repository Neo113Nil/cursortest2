package com.yandex.go.taxi.order.models.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jc9;
import defpackage.jl40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/ChangeOrderState$Pending", "Lcom/yandex/go/taxi/order/models/api/e;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ChangeOrderState$Pending extends e {
    public static final b Companion = new b();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(1))};
    public final String a;
    public final ChangeOrderState$Source b;

    public ChangeOrderState$Pending(int i, String str, ChangeOrderState$Source changeOrderState$Source) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = changeOrderState$Source;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.e
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // com.yandex.go.taxi.order.models.api.e
    /* renamed from: b, reason: from getter */
    public final ChangeOrderState$Source getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeOrderState$Pending)) {
            return false;
        }
        ChangeOrderState$Pending changeOrderState$Pending = (ChangeOrderState$Pending) obj;
        return jl40.l(this.a, changeOrderState$Pending.a) && this.b == changeOrderState$Pending.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ChangeOrderState$Source changeOrderState$Source = this.b;
        return hashCode + (changeOrderState$Source != null ? changeOrderState$Source.hashCode() : 0);
    }

    public final String toString() {
        return "Pending(changeId=" + this.a + ", source=" + this.b + Extension.C_BRAKE;
    }

    public ChangeOrderState$Pending(String str, ChangeOrderState$Source changeOrderState$Source) {
        this.a = str;
        this.b = changeOrderState$Source;
    }

    public ChangeOrderState$Pending() {
        this(null, null);
    }
}
