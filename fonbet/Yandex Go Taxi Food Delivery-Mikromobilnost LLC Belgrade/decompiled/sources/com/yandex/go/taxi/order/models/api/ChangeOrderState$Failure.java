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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/ChangeOrderState$Failure", "Lcom/yandex/go/taxi/order/models/api/e;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ChangeOrderState$Failure extends e {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(0)), null};
    public final String a;
    public final ChangeOrderState$Source b;
    public final OrderChangesDto.Notification c;

    public ChangeOrderState$Failure(int i, String str, ChangeOrderState$Source changeOrderState$Source, OrderChangesDto.Notification notification) {
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
    public final ChangeOrderState$Source getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeOrderState$Failure)) {
            return false;
        }
        ChangeOrderState$Failure changeOrderState$Failure = (ChangeOrderState$Failure) obj;
        return jl40.l(this.a, changeOrderState$Failure.a) && this.b == changeOrderState$Failure.b && jl40.l(this.c, changeOrderState$Failure.c);
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
        return "Failure(changeId=" + this.a + ", source=" + this.b + ", notification=" + this.c + Extension.C_BRAKE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeOrderState$Failure() {
        this((String) null, (ChangeOrderState$Source) (0 == true ? 1 : 0), (OrderChangesDto.Notification) (0 == true ? 1 : 0), 7);
    }

    public ChangeOrderState$Failure(String str, ChangeOrderState$Source changeOrderState$Source, OrderChangesDto.Notification notification) {
        this.a = str;
        this.b = changeOrderState$Source;
        this.c = notification;
    }

    public /* synthetic */ ChangeOrderState$Failure(String str, ChangeOrderState$Source changeOrderState$Source, OrderChangesDto.Notification notification, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : changeOrderState$Source, (i & 4) != 0 ? null : notification);
    }
}
