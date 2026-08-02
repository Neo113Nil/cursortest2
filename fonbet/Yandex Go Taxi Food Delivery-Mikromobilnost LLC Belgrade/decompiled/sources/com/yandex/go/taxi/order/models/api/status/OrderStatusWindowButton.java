package com.yandex.go.taxi.order.models.api.status;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/status/OrderStatusWindowButton;", "", "Companion", "com/yandex/go/taxi/order/models/api/status/b", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderStatusWindowButton {
    public static final b Companion = new b();
    public static final OrderStatusWindowButton e = new OrderStatusWindowButton(0);
    public final String a;
    public final String b;
    public final String c;
    public final OrderStatusWindowAction d;

    public OrderStatusWindowButton(int i, String str, String str2, String str3, OrderStatusWindowAction orderStatusWindowAction) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) != 0) {
            this.d = orderStatusWindowAction;
        } else {
            OrderStatusWindowAction.Companion.getClass();
            this.d = OrderStatusWindowAction.j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStatusWindowButton)) {
            return false;
        }
        OrderStatusWindowButton orderStatusWindowButton = (OrderStatusWindowButton) obj;
        return jl40.l(this.a, orderStatusWindowButton.a) && jl40.l(this.b, orderStatusWindowButton.b) && jl40.l(this.c, orderStatusWindowButton.c) && jl40.l(this.d, orderStatusWindowButton.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderStatusWindowButton(text=", this.a, ", color=", this.b, ", textColor=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public OrderStatusWindowButton() {
        this(0);
    }

    public OrderStatusWindowButton(int i) {
        OrderStatusWindowAction.Companion.getClass();
        OrderStatusWindowAction orderStatusWindowAction = OrderStatusWindowAction.j;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = orderStatusWindowAction;
    }
}
