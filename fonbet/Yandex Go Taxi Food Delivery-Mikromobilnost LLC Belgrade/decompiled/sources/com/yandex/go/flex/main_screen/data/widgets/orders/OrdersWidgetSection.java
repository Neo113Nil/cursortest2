package com.yandex.go.flex.main_screen.data.widgets.orders;

import defpackage.b64;
import defpackage.g4t0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kz60;
import defpackage.pyp0;
import defpackage.unr0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/data/widgets/orders/OrdersWidgetSection;", "Lpyp0;", "Companion", "$serializer", "com/yandex/go/flex/main_screen/data/widgets/orders/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OrdersWidgetSection extends pyp0 {
    public static final b Companion = new b();
    public static final i3y[] g = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(24)), null, null, null};
    public final String a;
    public final String b;
    public final Map c;
    public final List d;
    public final OrdersWidgetData e;
    public final boolean f;

    public OrdersWidgetSection(int i, String str, String str2, Map map, List list, OrdersWidgetData ordersWidgetData, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = "orders_widgets";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 8) == 0) {
            this.d = Collections.singletonList(g4t0.INSTANCE);
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = ordersWidgetData;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
    }

    @Override // defpackage.pyp0
    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.pyp0
    /* renamed from: d, reason: from getter */
    public final boolean getB() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersWidgetSection)) {
            return false;
        }
        OrdersWidgetSection ordersWidgetSection = (OrdersWidgetSection) obj;
        return jl40.l(this.a, ordersWidgetSection.a) && jl40.l(this.b, ordersWidgetSection.b) && jl40.l(this.c, ordersWidgetSection.c) && jl40.l(this.d, ordersWidgetSection.d) && jl40.l(this.e, ordersWidgetSection.e) && this.f == ordersWidgetSection.f;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.d(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        OrdersWidgetData ordersWidgetData = this.e;
        return Boolean.hashCode(this.f) + ((c + (ordersWidgetData == null ? 0 : ordersWidgetData.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrdersWidgetSection(id=", this.a, ", type=", this.b, ", actions=");
        v.append(this.c);
        v.append(", behaviour=");
        v.append(this.d);
        v.append(", data=");
        v.append(this.e);
        v.append(", reloadable=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public OrdersWidgetSection() {
        this(63);
    }

    public OrdersWidgetSection(int i) {
        String str;
        if ((i & 1) == 0) {
            str = "orders_widgets";
        } else {
            str = "";
        }
        Map f = kotlin.collections.b.f();
        List singletonList = Collections.singletonList(g4t0.INSTANCE);
        this.a = str;
        this.b = "orders_widgets";
        this.c = f;
        this.d = singletonList;
        this.e = null;
        this.f = false;
    }
}
