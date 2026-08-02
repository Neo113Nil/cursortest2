package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/OrderForegroundNotificationOverrides;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/o0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderForegroundNotificationOverrides {
    public static final o0 Companion = new o0();
    public final String a;
    public final String b;

    public /* synthetic */ OrderForegroundNotificationOverrides(int i, String str, String str2) {
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

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderForegroundNotificationOverrides)) {
            return false;
        }
        OrderForegroundNotificationOverrides orderForegroundNotificationOverrides = (OrderForegroundNotificationOverrides) obj;
        return jl40.l(this.a, orderForegroundNotificationOverrides.a) && jl40.l(this.b, orderForegroundNotificationOverrides.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("OrderForegroundNotificationOverrides(title=", this.a, ", body=", this.b, Extension.C_BRAKE);
    }

    public OrderForegroundNotificationOverrides(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public OrderForegroundNotificationOverrides() {
        this(null, null);
    }
}
