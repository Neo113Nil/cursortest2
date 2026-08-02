package com.yandex.go.taxi.order.models.api.status;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.s780;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/status/OrderStatusWindowAction;", "", "Companion", "com/yandex/go/taxi/order/models/api/status/a", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderStatusWindowAction {
    public static final a Companion = new a();
    public static final i3y[] i;
    public static final OrderStatusWindowAction j;
    public final ActionType a;
    public final ScreenType b;
    public final String c;
    public final RequiredCardBalance d;
    public final RequiredYangopayBalance e;
    public final String f;
    public final String g;
    public final boolean h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new s780(13)), kotlin.a.b(lazyThreadSafetyMode, new s780(14)), null, null, null, null, null, null};
        j = new OrderStatusWindowAction(0);
    }

    public /* synthetic */ OrderStatusWindowAction(int i2, ActionType actionType, ScreenType screenType, String str, RequiredCardBalance requiredCardBalance, RequiredYangopayBalance requiredYangopayBalance, String str2, String str3, boolean z) {
        this.a = (i2 & 1) == 0 ? ActionType.UNKNOWN : actionType;
        if ((i2 & 2) == 0) {
            this.b = ScreenType.UNKNOWN;
        } else {
            this.b = screenType;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = requiredCardBalance;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = requiredYangopayBalance;
        }
        if ((i2 & 32) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i2 & 64) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        if ((i2 & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStatusWindowAction)) {
            return false;
        }
        OrderStatusWindowAction orderStatusWindowAction = (OrderStatusWindowAction) obj;
        return this.a == orderStatusWindowAction.a && this.b == orderStatusWindowAction.b && jl40.l(this.c, orderStatusWindowAction.c) && jl40.l(this.d, orderStatusWindowAction.d) && jl40.l(this.e, orderStatusWindowAction.e) && jl40.l(this.f, orderStatusWindowAction.f) && jl40.l(this.g, orderStatusWindowAction.g) && this.h == orderStatusWindowAction.h;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        RequiredCardBalance requiredCardBalance = this.d;
        int hashCode3 = (hashCode2 + (requiredCardBalance == null ? 0 : requiredCardBalance.hashCode())) * 31;
        RequiredYangopayBalance requiredYangopayBalance = this.e;
        return Boolean.hashCode(this.h) + unr0.b(unr0.b((hashCode3 + (requiredYangopayBalance != null ? requiredYangopayBalance.a.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderStatusWindowAction(type=");
        sb.append(this.a);
        sb.append(", screen=");
        sb.append(this.b);
        sb.append(", deeplink=");
        sb.append(this.c);
        sb.append(", requiredBalance=");
        sb.append(this.d);
        sb.append(", requiredYangopayBalance=");
        sb.append(this.e);
        sb.append(", paymentMethodId=");
        sb.append(this.f);
        sb.append(", paymentMethodType=");
        return nnm.i(this.g, ", suggestChange=", Extension.C_BRAKE, sb, this.h);
    }

    public OrderStatusWindowAction() {
        this(0);
    }

    public OrderStatusWindowAction(int i2) {
        ActionType actionType = ActionType.UNKNOWN;
        ScreenType screenType = ScreenType.UNKNOWN;
        this.a = actionType;
        this.b = screenType;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = "";
        this.g = "";
        this.h = false;
    }
}
