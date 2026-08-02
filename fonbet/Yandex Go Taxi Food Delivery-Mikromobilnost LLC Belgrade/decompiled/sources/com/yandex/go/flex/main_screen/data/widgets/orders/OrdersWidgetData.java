package com.yandex.go.flex.main_screen.data.widgets.orders;

import com.yandex.go.flex.main_screen.data.widgets.layout.dto.LayoutDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/data/widgets/orders/OrdersWidgetData;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/data/widgets/orders/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OrdersWidgetData {
    public static final a Companion = new a();
    public final String a;
    public final LayoutDto b;
    public final String c;

    public /* synthetic */ OrdersWidgetData(int i, String str, LayoutDto layoutDto, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = layoutDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersWidgetData)) {
            return false;
        }
        OrdersWidgetData ordersWidgetData = (OrdersWidgetData) obj;
        return jl40.l(this.a, ordersWidgetData.a) && jl40.l(this.b, ordersWidgetData.b) && jl40.l(this.c, ordersWidgetData.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LayoutDto layoutDto = this.b;
        int hashCode2 = (hashCode + (layoutDto == null ? 0 : layoutDto.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdersWidgetData(filter=");
        sb.append(this.a);
        sb.append(", layout=");
        sb.append(this.b);
        sb.append(", style=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public OrdersWidgetData() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
