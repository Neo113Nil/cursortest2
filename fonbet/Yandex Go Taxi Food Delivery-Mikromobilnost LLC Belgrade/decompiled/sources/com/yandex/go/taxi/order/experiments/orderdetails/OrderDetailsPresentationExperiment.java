package com.yandex.go.taxi.order.experiments.orderdetails;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.kz60;
import defpackage.nsq0;
import defpackage.osq0;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/orderdetails/OrderDetailsPresentationExperiment;", "Lw96;", "Companion", "com/yandex/go/taxi/order/experiments/orderdetails/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OrderDetailsPresentationExperiment extends w96 {
    public static final e Companion = new e();
    public static final i3y[] g;
    public static final OrderDetailsPresentationExperiment h;
    public final boolean b;
    public final boolean c;
    public final jsq0 d;
    public final List e;
    public final nsq0 f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new kz60(15)), kotlin.a.b(lazyThreadSafetyMode, new kz60(16)), kotlin.a.b(lazyThreadSafetyMode, new kz60(17))};
        h = new OrderDetailsPresentationExperiment(0);
    }

    public OrderDetailsPresentationExperiment(int i, boolean z, boolean z2, jsq0 jsq0Var, List list, nsq0 nsq0Var) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = ksq0.a;
        } else {
            this.d = jsq0Var;
        }
        if ((i & 8) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 16) == 0) {
            this.f = osq0.a;
        } else {
            this.f = nsq0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsPresentationExperiment)) {
            return false;
        }
        OrderDetailsPresentationExperiment orderDetailsPresentationExperiment = (OrderDetailsPresentationExperiment) obj;
        return this.b == orderDetailsPresentationExperiment.b && this.c == orderDetailsPresentationExperiment.c && jl40.l(this.d, orderDetailsPresentationExperiment.d) && jl40.l(this.e, orderDetailsPresentationExperiment.e) && jl40.l(this.f, orderDetailsPresentationExperiment.f);
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.f.a.hashCode() + unr0.c(unr0.c(unr0.e(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d.a), 31, this.e);
    }

    public final String toString() {
        StringBuilder u = qv10.u("OrderDetailsPresentationExperiment(enabled=", ", showDetailsOnOrder=", ", hideMapDriveStates=", this.b, this.c);
        u.append(this.d);
        u.append(", singleOrderOpenServices=");
        u.append(this.e);
        u.append(", cacheParams=");
        u.append(this.f);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public OrderDetailsPresentationExperiment() {
        this(0);
    }

    public OrderDetailsPresentationExperiment(int i) {
        jsq0 jsq0Var = ksq0.a;
        nsq0 nsq0Var = osq0.a;
        this.b = false;
        this.c = false;
        this.d = jsq0Var;
        this.e = EmptyList.a;
        this.f = nsq0Var;
    }
}
