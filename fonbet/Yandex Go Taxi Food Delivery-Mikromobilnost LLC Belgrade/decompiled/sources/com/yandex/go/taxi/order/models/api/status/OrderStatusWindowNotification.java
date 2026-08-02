package com.yandex.go.taxi.order.models.api.status;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.o8s0;
import defpackage.s780;
import defpackage.unr0;
import defpackage.wh60;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/status/OrderStatusWindowNotification;", "Lwh60;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/status/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderStatusWindowNotification implements wh60 {
    public static final c Companion = new c();
    public static final i3y[] m;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final OrderStatusWindowButton f;
    public final OrderStatusWindowButton g;
    public final String h;
    public final ImageType i;
    public final o8s0 j;
    public final jsq0 k;
    public final boolean l;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new i3y[]{null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new s780(15)), null, kotlin.a.b(lazyThreadSafetyMode, new s780(16)), null};
    }

    public OrderStatusWindowNotification(int i, String str, String str2, String str3, String str4, String str5, OrderStatusWindowButton orderStatusWindowButton, OrderStatusWindowButton orderStatusWindowButton2, String str6, ImageType imageType, o8s0 o8s0Var, jsq0 jsq0Var, boolean z) {
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
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            OrderStatusWindowButton.Companion.getClass();
            this.f = OrderStatusWindowButton.e;
        } else {
            this.f = orderStatusWindowButton;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = orderStatusWindowButton2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = imageType;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = o8s0Var;
        }
        if ((i & 1024) == 0) {
            this.k = ksq0.a;
        } else {
            this.k = jsq0Var;
        }
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStatusWindowNotification)) {
            return false;
        }
        OrderStatusWindowNotification orderStatusWindowNotification = (OrderStatusWindowNotification) obj;
        return jl40.l(this.a, orderStatusWindowNotification.a) && jl40.l(this.b, orderStatusWindowNotification.b) && jl40.l(this.c, orderStatusWindowNotification.c) && jl40.l(this.d, orderStatusWindowNotification.d) && jl40.l(this.e, orderStatusWindowNotification.e) && jl40.l(this.f, orderStatusWindowNotification.f) && jl40.l(this.g, orderStatusWindowNotification.g) && jl40.l(this.h, orderStatusWindowNotification.h) && this.i == orderStatusWindowNotification.i && jl40.l(this.j, orderStatusWindowNotification.j) && jl40.l(this.k, orderStatusWindowNotification.k) && this.l == orderStatusWindowNotification.l;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        OrderStatusWindowButton orderStatusWindowButton = this.g;
        int hashCode2 = (hashCode + (orderStatusWindowButton == null ? 0 : orderStatusWindowButton.hashCode())) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ImageType imageType = this.i;
        int hashCode4 = (hashCode3 + (imageType == null ? 0 : imageType.hashCode())) * 31;
        o8s0 o8s0Var = this.j;
        return Boolean.hashCode(this.l) + unr0.c((hashCode4 + (o8s0Var != null ? o8s0Var.hashCode() : 0)) * 31, 31, this.k.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderStatusWindowNotification(title=", this.a, ", text=", this.b, ", notificationMessage=");
        g8e.D(v, this.c, ", reason=", this.d, ", id=");
        v.append(this.e);
        v.append(", primaryButton=");
        v.append(this.f);
        v.append(", secondaryButton=");
        v.append(this.g);
        v.append(", iconTag=");
        v.append(this.h);
        v.append(", imageType=");
        v.append(this.i);
        v.append(", showPolicy=");
        v.append(this.j);
        v.append(", availableStatuses=");
        v.append(this.k);
        v.append(", showChangePaymentMethodSection=");
        v.append(this.l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public OrderStatusWindowNotification() {
        OrderStatusWindowButton.Companion.getClass();
        OrderStatusWindowButton orderStatusWindowButton = OrderStatusWindowButton.e;
        jsq0 jsq0Var = ksq0.a;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = orderStatusWindowButton;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = jsq0Var;
        this.l = false;
    }
}
