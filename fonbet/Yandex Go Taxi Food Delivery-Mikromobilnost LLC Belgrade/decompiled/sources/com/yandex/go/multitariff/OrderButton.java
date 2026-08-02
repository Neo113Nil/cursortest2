package com.yandex.go.multitariff;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multitariff/OrderButton;", "", "Companion", "com/yandex/go/multitariff/c", "$serializer", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OrderButton {
    public static final c Companion = new c();
    public static final OrderButton c = new OrderButton(0);
    public final boolean a;
    public final String b;

    public /* synthetic */ OrderButton(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderButton)) {
            return false;
        }
        OrderButton orderButton = (OrderButton) obj;
        return this.a == orderButton.a && jl40.l(this.b, orderButton.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xvz.m("OrderButton(isEnabled=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }

    public OrderButton() {
        this(0);
    }

    public OrderButton(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public /* synthetic */ OrderButton(int i) {
        this(true, "");
    }
}
