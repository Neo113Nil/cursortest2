package com.yandex.go.order.ui.order_list_modal_height.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kz60;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/ui/order_list_modal_height/data/OrderListModalRatioHeightExperiment;", "Lw96;", "Companion", "com/yandex/go/order/ui/order_list_modal_height/data/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OrderListModalRatioHeightExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(20))};
    public static final OrderListModalRatioHeightExperiment e = new OrderListModalRatioHeightExperiment(2);
    public final boolean b;
    public final List c;

    public /* synthetic */ OrderListModalRatioHeightExperiment(int i, List list) {
        this.b = true;
        if ((i & 1) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderListModalRatioHeightExperiment)) {
            return false;
        }
        OrderListModalRatioHeightExperiment orderListModalRatioHeightExperiment = (OrderListModalRatioHeightExperiment) obj;
        return this.b == orderListModalRatioHeightExperiment.b && jl40.l(this.c, orderListModalRatioHeightExperiment.c);
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "OrderListModalRatioHeightExperiment(enabled=" + this.b + ", configTree=" + this.c + Extension.C_BRAKE;
    }

    public OrderListModalRatioHeightExperiment(int i) {
        this.b = (i & 1) != 0;
        this.c = EmptyList.a;
    }

    public OrderListModalRatioHeightExperiment() {
        this(3);
    }
}
