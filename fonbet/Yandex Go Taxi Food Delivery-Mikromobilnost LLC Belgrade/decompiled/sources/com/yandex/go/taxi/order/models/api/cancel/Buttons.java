package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.rm6;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.Orientation;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/Buttons;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/x", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Buttons {
    public static final x Companion = new x();
    public static final i3y[] c;
    public final Orientation a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new rm6(21)), kotlin.a.b(lazyThreadSafetyMode, new rm6(23))};
    }

    public /* synthetic */ Buttons(int i, Orientation orientation, List list) {
        this.a = (i & 1) == 0 ? Orientation.VERTICAL : orientation;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buttons)) {
            return false;
        }
        Buttons buttons = (Buttons) obj;
        return this.a == buttons.a && jl40.l(this.b, buttons.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Buttons(orientation=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }

    public Buttons() {
        this.a = Orientation.VERTICAL;
        this.b = EmptyList.a;
    }
}
