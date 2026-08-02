package com.yandex.go.taxi.order.models.api.cost_center;

import defpackage.gsq0;
import defpackage.hxe;
import defpackage.i3y;
import defpackage.jl40;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cost_center/CostCenterRideStatus;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cost_center/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CostCenterRideStatus {
    public static final b Companion = new b();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hxe(0))};
    public final boolean a;
    public final List b;

    public /* synthetic */ CostCenterRideStatus(int i, boolean z, List list) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CostCenterRideStatus)) {
            return false;
        }
        CostCenterRideStatus costCenterRideStatus = (CostCenterRideStatus) obj;
        return this.a == costCenterRideStatus.a && jl40.l(this.b, costCenterRideStatus.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CostCenterRideStatus(canChange=" + this.a + ", values=" + this.b + Extension.C_BRAKE;
    }

    public CostCenterRideStatus() {
        this.a = false;
        this.b = EmptyList.a;
    }
}
