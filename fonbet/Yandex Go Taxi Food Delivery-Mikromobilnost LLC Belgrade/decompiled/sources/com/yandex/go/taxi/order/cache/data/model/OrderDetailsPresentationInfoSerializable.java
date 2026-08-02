package com.yandex.go.taxi.order.cache.data.model;

import com.yandex.go.taxi.order.cache.api.data.model.OrderCacheParams;
import com.yandex.go.taxi.order.cache.api.data.model.OrderType;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kz60;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/cache/data/model/OrderDetailsPresentationInfoSerializable;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/cache/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OrderDetailsPresentationInfoSerializable {
    public static final a Companion = new a();
    public static final i3y[] h;
    public final String a;
    public final long b;
    public final long c;
    public final OrderCacheParams.Service d;
    public final String e;
    public final String f;
    public final OrderType g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new kz60(18)), null, null, kotlin.a.b(lazyThreadSafetyMode, new kz60(19))};
    }

    public /* synthetic */ OrderDetailsPresentationInfoSerializable(int i, String str, long j, long j2, OrderCacheParams.Service service, String str2, String str3, OrderType orderType) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j2;
        }
        if ((i & 8) == 0) {
            this.d = OrderCacheParams.Service.UNKNOWN;
        } else {
            this.d = service;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = OrderType.DEFAULT;
        } else {
            this.g = orderType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsPresentationInfoSerializable)) {
            return false;
        }
        OrderDetailsPresentationInfoSerializable orderDetailsPresentationInfoSerializable = (OrderDetailsPresentationInfoSerializable) obj;
        return jl40.l(this.a, orderDetailsPresentationInfoSerializable.a) && this.b == orderDetailsPresentationInfoSerializable.b && this.c == orderDetailsPresentationInfoSerializable.c && this.d == orderDetailsPresentationInfoSerializable.d && jl40.l(this.e, orderDetailsPresentationInfoSerializable.e) && jl40.l(this.f, orderDetailsPresentationInfoSerializable.f) && this.g == orderDetailsPresentationInfoSerializable.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b((this.d.hashCode() + qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder l = x4e.l("OrderDetailsPresentationInfoSerializable(orderId=", this.a, ", deadlineTimestamp=", this.b);
        x4e.A(this.c, ", loadingTimeoutMs=", ", service=", l);
        l.append(this.d);
        l.append(", scooterNumber=");
        l.append(this.e);
        l.append(", offerId=");
        l.append(this.f);
        l.append(", orderType=");
        l.append(this.g);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public OrderDetailsPresentationInfoSerializable() {
        this(null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP);
    }

    public OrderDetailsPresentationInfoSerializable(String str, long j, long j2, OrderCacheParams.Service service, String str2, String str3, OrderType orderType) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = service;
        this.e = str2;
        this.f = str3;
        this.g = orderType;
    }

    public /* synthetic */ OrderDetailsPresentationInfoSerializable(String str, OrderCacheParams.Service service, String str2, String str3, OrderType orderType, int i) {
        this((i & 1) != 0 ? "" : str, 0L, 0L, (i & 8) != 0 ? OrderCacheParams.Service.UNKNOWN : service, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? OrderType.DEFAULT : orderType);
    }
}
