package com.yandex.go.taxi.order.models.api;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jc9;
import defpackage.jl40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/ChangeOrderState$Unavailable", "Lcom/yandex/go/taxi/order/models/api/e;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ChangeOrderState$Unavailable extends e {
    public static final d Companion = new d();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(4)), null};
    public final ChangeOrderState$Source a;
    public final OrderChangesDto.Notification b;

    public ChangeOrderState$Unavailable(int i, ChangeOrderState$Source changeOrderState$Source, OrderChangesDto.Notification notification) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = changeOrderState$Source;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = notification;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.e
    /* renamed from: a */
    public final String getA() {
        return null;
    }

    @Override // com.yandex.go.taxi.order.models.api.e
    /* renamed from: b, reason: from getter */
    public final ChangeOrderState$Source getB() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeOrderState$Unavailable)) {
            return false;
        }
        ChangeOrderState$Unavailable changeOrderState$Unavailable = (ChangeOrderState$Unavailable) obj;
        return this.a == changeOrderState$Unavailable.a && jl40.l(this.b, changeOrderState$Unavailable.b);
    }

    public final int hashCode() {
        ChangeOrderState$Source changeOrderState$Source = this.a;
        int hashCode = (changeOrderState$Source == null ? 0 : changeOrderState$Source.hashCode()) * 31;
        OrderChangesDto.Notification notification = this.b;
        return hashCode + (notification != null ? notification.hashCode() : 0);
    }

    public final String toString() {
        return "Unavailable(source=" + this.a + ", notification=" + this.b + Extension.C_BRAKE;
    }

    public ChangeOrderState$Unavailable(ChangeOrderState$Source changeOrderState$Source, OrderChangesDto.Notification notification) {
        this.a = changeOrderState$Source;
        this.b = notification;
    }

    public ChangeOrderState$Unavailable() {
        this(null, null);
    }
}
