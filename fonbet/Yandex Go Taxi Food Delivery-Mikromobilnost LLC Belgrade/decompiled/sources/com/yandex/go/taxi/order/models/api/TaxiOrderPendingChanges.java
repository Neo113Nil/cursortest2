package com.yandex.go.taxi.order.models.api;

import com.yandex.go.taxi.order.models.api.TaxiOrderPendingChanges;
import defpackage.d0l0;
import defpackage.g8r0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lv90;
import defpackage.s5w0;
import defpackage.sls;
import defpackage.v6o0;
import defpackage.vfc;
import defpackage.z2y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrderPendingChanges;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/l", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TaxiOrderPendingChanges {
    public static final l Companion = new l();
    public static final i3y[] f;
    public final lv90 a;
    public final d0l0 b;
    public final List c;
    public final List d;
    public final i3y e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new z2y0(15)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(16))};
    }

    public TaxiOrderPendingChanges(int i, lv90 lv90Var, d0l0 d0l0Var, List list, List list2) {
        if ((i & 1) == 0) {
            lv90.Companion.getClass();
            lv90Var = lv90.g;
        }
        this.a = lv90Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d0l0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list2;
        }
        final int i2 = 0;
        this.e = kotlin.a.a(new sls(this) { // from class: w3y0
            public final /* synthetic */ TaxiOrderPendingChanges b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                TaxiOrderPendingChanges taxiOrderPendingChanges = this.b;
                switch (i3) {
                }
                return a.M(taxiOrderPendingChanges.d);
            }
        });
    }

    public static TaxiOrderPendingChanges b(TaxiOrderPendingChanges taxiOrderPendingChanges, lv90 lv90Var, d0l0 d0l0Var, List list, List list2, int i) {
        if ((i & 1) != 0) {
            lv90Var = taxiOrderPendingChanges.a;
        }
        if ((i & 2) != 0) {
            d0l0Var = taxiOrderPendingChanges.b;
        }
        if ((i & 4) != 0) {
            list = taxiOrderPendingChanges.c;
        }
        if ((i & 8) != 0) {
            list2 = taxiOrderPendingChanges.d;
        }
        return new TaxiOrderPendingChanges(lv90Var, d0l0Var, list, list2);
    }

    public final TaxiOrderPendingChanges a(e eVar) {
        ArrayList arrayList = new ArrayList(this.d);
        arrayList.removeIf(new v6o0(3, new s5w0(19, eVar)));
        arrayList.add(eVar);
        return b(this, null, null, null, arrayList, 7);
    }

    /* renamed from: c, reason: from getter */
    public final List getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final lv90 getA() {
        return this.a;
    }

    public final List e() {
        return (List) this.e.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderPendingChanges)) {
            return false;
        }
        TaxiOrderPendingChanges taxiOrderPendingChanges = (TaxiOrderPendingChanges) obj;
        return jl40.l(this.a, taxiOrderPendingChanges.a) && jl40.l(this.b, taxiOrderPendingChanges.b) && jl40.l(this.c, taxiOrderPendingChanges.c) && jl40.l(this.d, taxiOrderPendingChanges.d);
    }

    /* renamed from: f, reason: from getter */
    public final d0l0 getB() {
        return this.b;
    }

    public final void g(ChangeOrderState$Source changeOrderState$Source) {
        List list = this.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            e eVar = (e) obj;
            if ((eVar != null ? eVar.getA() : null) != changeOrderState$Source) {
                arrayList.add(obj);
            }
        }
        b(this, null, null, null, arrayList, 7);
    }

    public final TaxiOrderPendingChanges h(e eVar) {
        return b(this, null, null, null, kotlin.collections.a.j0(this.d, eVar), 7);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d0l0 d0l0Var = this.b;
        int hashCode2 = (hashCode + (d0l0Var == null ? 0 : d0l0Var.hashCode())) * 31;
        List list = this.c;
        return this.d.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final TaxiOrderPendingChanges i(String str) {
        ArrayList arrayList = new ArrayList(this.d);
        arrayList.removeIf(new v6o0(4, new g8r0(str, 18)));
        return b(this, null, null, null, arrayList, 7);
    }

    public final TaxiOrderPendingChanges j(List list) {
        return b(this, null, null, list, null, 11);
    }

    public final TaxiOrderPendingChanges k(lv90 lv90Var) {
        return b(this, lv90Var, null, null, null, 14);
    }

    public final TaxiOrderPendingChanges l(d0l0 d0l0Var) {
        return b(this, null, d0l0Var, null, null, 13);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiOrderPendingChanges(payment=");
        sb.append(this.a);
        sb.append(", route=");
        sb.append(this.b);
        sb.append(", costCenterValues=");
        return vfc.p(sb, this.c, ", changes=", this.d, Extension.C_BRAKE);
    }

    public TaxiOrderPendingChanges() {
        this(0);
    }

    public TaxiOrderPendingChanges(lv90 lv90Var, d0l0 d0l0Var, List list, List list2) {
        this.a = lv90Var;
        this.b = d0l0Var;
        this.c = list;
        this.d = list2;
        final int i = 1;
        this.e = kotlin.a.a(new sls(this) { // from class: w3y0
            public final /* synthetic */ TaxiOrderPendingChanges b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                TaxiOrderPendingChanges taxiOrderPendingChanges = this.b;
                switch (i3) {
                }
                return a.M(taxiOrderPendingChanges.d);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxiOrderPendingChanges(int i) {
        this(lv90.g, null, null, EmptyList.a);
        lv90.Companion.getClass();
    }
}
