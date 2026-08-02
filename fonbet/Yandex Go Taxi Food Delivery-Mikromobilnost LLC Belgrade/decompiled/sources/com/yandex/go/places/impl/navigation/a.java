package com.yandex.go.places.impl.navigation;

import com.yandex.go.places.impl.navigation.a;
import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import defpackage.bcc0;
import defpackage.ccc0;
import defpackage.dm80;
import defpackage.gtq0;
import defpackage.h55;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.kl80;
import defpackage.ll80;
import defpackage.m950;
import defpackage.ml80;
import defpackage.nl80;
import defpackage.oep0;
import defpackage.ol80;
import defpackage.pep0;
import defpackage.pl80;
import defpackage.ql80;
import defpackage.rfc0;
import defpackage.sls;
import defpackage.udc0;
import defpackage.w511;
import defpackage.yl80;
import defpackage.yn5;
import defpackage.yvf0;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a {
    public final oep0 a;
    public final yvf0 b;
    public final rfc0 c;
    public final yvf0 d;
    public final i3y e;
    public final i3y f;

    public a(oep0 oep0Var, yvf0 yvf0Var, rfc0 rfc0Var, yvf0 yvf0Var2) {
        this.a = oep0Var;
        this.b = yvf0Var;
        this.c = rfc0Var;
        this.d = yvf0Var2;
        final int i = 0;
        this.e = kotlin.a.a(new sls(this) { // from class: bi80
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        return (udc0) aVar.b.get();
                    default:
                        return (com.yandex.go.places.impl.navigation.discovery.map.a) aVar.d.get();
                }
            }
        });
        final int i2 = 1;
        this.f = kotlin.a.a(new sls(this) { // from class: bi80
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        return (udc0) aVar.b.get();
                    default:
                        return (com.yandex.go.places.impl.navigation.discovery.map.a) aVar.d.get();
                }
            }
        });
    }

    public final void a(dm80 dm80Var, kl80 kl80Var) {
        ql80 ql80Var;
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        i3y i3yVar = this.e;
        boolean u = gtq0.u((udc0) i3yVar.getValue());
        i3y i3yVar2 = this.f;
        boolean u2 = gtq0.u((com.yandex.go.places.impl.navigation.discovery.map.a) i3yVar2.getValue());
        rfc0 rfc0Var = this.c;
        boolean z = rfc0Var.c != null;
        ll80 ll80Var = ll80.a;
        ml80 ml80Var = ml80.a;
        if (u) {
            OrganizationDiscoveryNavigatorImpl$getLaunchMode$1 organizationDiscoveryNavigatorImpl$getLaunchMode$1 = OrganizationDiscoveryNavigatorImpl$getLaunchMode$1.b;
            if (dm80Var instanceof yl80) {
                ql80Var = (ql80) organizationDiscoveryNavigatorImpl$getLaunchMode$1.invoke(dm80Var);
            }
            ql80Var = ll80Var;
        } else if (u2 && z) {
            OrganizationDiscoveryNavigatorImpl$getLaunchMode$2 organizationDiscoveryNavigatorImpl$getLaunchMode$2 = OrganizationDiscoveryNavigatorImpl$getLaunchMode$2.b;
            if (dm80Var instanceof yl80) {
                ql80Var = (ql80) organizationDiscoveryNavigatorImpl$getLaunchMode$2.invoke(dm80Var);
            }
            ql80Var = ll80Var;
        } else {
            ql80Var = ml80Var;
        }
        if (ql80Var.equals(ll80Var)) {
            return;
        }
        if (ql80Var.equals(ml80Var)) {
            ((pep0) this.a).f(new yn5(5, (udc0) i3yVar.getValue(), kl80Var), dm80Var, hxx.a);
            return;
        }
        if (!(ql80Var instanceof pl80)) {
            w511.b();
            return;
        }
        pl80 pl80Var = (pl80) ql80Var;
        if (pl80Var instanceof ol80) {
            udc0 udc0Var = (udc0) i3yVar.getValue();
            yl80 yl80Var = ((ol80) ql80Var).a;
            d dVar = udc0Var.J;
            if (dVar != null && yl80Var != null) {
                ccc0 ccc0Var = dVar.V;
                bcc0 bcc0Var = new bcc0(yl80Var, PlacesNavigationEntry$Source.STARTER);
                r0 r0Var = ccc0Var.a;
                do {
                    value2 = r0Var.getValue();
                    arrayList2 = new ArrayList();
                    for (Object obj : (List) value2) {
                        if (!(((bcc0) obj).a instanceof yl80)) {
                            arrayList2.add(obj);
                        }
                    }
                } while (!r0Var.k(value2, kotlin.collections.a.o0(arrayList2, bcc0Var)));
            }
        } else {
            if (!(pl80Var instanceof nl80)) {
                w511.b();
                return;
            }
            com.yandex.go.places.impl.navigation.discovery.map.a aVar = (com.yandex.go.places.impl.navigation.discovery.map.a) i3yVar2.getValue();
            yl80 yl80Var2 = ((nl80) ql80Var).a;
            if (yl80Var2 == null) {
                aVar.getClass();
            } else {
                ccc0 ccc0Var2 = aVar.V;
                bcc0 bcc0Var2 = new bcc0(yl80Var2, PlacesNavigationEntry$Source.STARTER);
                r0 r0Var2 = ccc0Var2.a;
                do {
                    value = r0Var2.getValue();
                    arrayList = new ArrayList();
                    for (Object obj2 : (List) value) {
                        if (!(((bcc0) obj2).a instanceof yl80)) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!r0Var2.k(value, kotlin.collections.a.o0(arrayList, bcc0Var2)));
            }
        }
        m950 m950Var = rfc0Var.c;
        if (m950Var != null) {
            if (!gtq0.u(m950Var)) {
                m950Var = null;
            }
            if (m950Var != null) {
                ((h55) m950Var).i();
            }
        }
        rfc0Var.c = null;
    }
}
