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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/ChangeOrderState$Success", "Lcom/yandex/go/taxi/order/models/api/e;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ChangeOrderState$Success extends e {
    public static final c Companion = new c();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(3)), null};
    public final String a;
    public final ChangeOrderState$Source b;
    public final OrderChangesDto.Notification c;

    public ChangeOrderState$Success(int i, String str, ChangeOrderState$Source changeOrderState$Source, OrderChangesDto.Notification notification) {
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
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = notification;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.e
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // com.yandex.go.taxi.order.models.api.e
    /* renamed from: b, reason: from getter */
    public final ChangeOrderState$Source getA() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeOrderState$Success)) {
            return false;
        }
        ChangeOrderState$Success changeOrderState$Success = (ChangeOrderState$Success) obj;
        return jl40.l(this.a, changeOrderState$Success.a) && this.b == changeOrderState$Success.b && jl40.l(this.c, changeOrderState$Success.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ChangeOrderState$Source changeOrderState$Source = this.b;
        int hashCode2 = (hashCode + (changeOrderState$Source == null ? 0 : changeOrderState$Source.hashCode())) * 31;
        OrderChangesDto.Notification notification = this.c;
        return hashCode2 + (notification != null ? notification.hashCode() : 0);
    }

    public final String toString() {
        return "Success(changeId=" + this.a + ", source=" + this.b + ", notification=" + this.c + Extension.C_BRAKE;
    }

    public ChangeOrderState$Success() {
        this(null, 7);
    }

    public ChangeOrderState$Success(String str, ChangeOrderState$Source changeOrderState$Source, OrderChangesDto.Notification notification) {
        this.a = str;
        this.b = changeOrderState$Source;
        this.c = notification;
    }

    public /* synthetic */ ChangeOrderState$Success(OrderChangesDto.Notification notification, int i) {
        this(null, null, (i & 4) != 0 ? null : notification);
    }
}
