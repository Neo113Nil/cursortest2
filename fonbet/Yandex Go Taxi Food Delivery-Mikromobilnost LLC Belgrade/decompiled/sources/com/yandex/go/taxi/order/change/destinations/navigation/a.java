package com.yandex.go.taxi.order.change.destinations.navigation;

import android.content.Context;
import com.yandex.go.address.models.Address;
import defpackage.hhs0;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.pyx0;
import defpackage.s5w0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tyx0;
import defpackage.uyx0;
import defpackage.w030;
import defpackage.wfd;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a extends pgd {
    public final Context F;
    public final w030 G;
    public final hhs0 H;
    public final mu5 I;

    public a(Context context, w030 w030Var, hhs0 hhs0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = hhs0Var;
        this.I = new mu5(new s5w0(17, this));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        Object value;
        pyx0 pyx0Var = (pyx0) obj;
        List list = pyx0Var.a.b().t().b;
        List list2 = pyx0Var.b;
        hhs0 hhs0Var = this.H;
        hhs0Var.getClass();
        List<Address> list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        for (Address address : list3) {
            arrayList.add(new tyx0(address.B().hashCode(), address.D1()));
        }
        List<Address> list4 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
        for (Address address2 : list4) {
            arrayList2.add(new tyx0(address2.B().hashCode(), address2.D1()));
        }
        r0 r0Var = (r0) hhs0Var.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, new uyx0(((uyx0) value).a, arrayList.hashCode(), arrayList2)));
        tje.N(o(), null, null, new TaxiOrderChangeDestinationsRouter$monitorDismiss$$inlined$collectIn$1(e.t(e.I(pyx0Var.a.a(), new TaxiOrderChangeDestinationsRouter$monitorDismiss$1(2, null))), null, this), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.I;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
