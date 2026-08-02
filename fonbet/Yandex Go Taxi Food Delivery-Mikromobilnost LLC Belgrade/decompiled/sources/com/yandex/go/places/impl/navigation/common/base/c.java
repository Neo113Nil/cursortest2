package com.yandex.go.places.impl.navigation.common.base;

import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import defpackage.am80;
import defpackage.at3;
import defpackage.bcc0;
import defpackage.bgc;
import defpackage.ccc0;
import defpackage.cm80;
import defpackage.j75;
import defpackage.l75;
import defpackage.m75;
import defpackage.sls;
import defpackage.tje;
import defpackage.ul80;
import defpackage.xl80;
import defpackage.yl80;
import defpackage.zl80;
import java.util.List;

/* loaded from: classes13.dex */
public final class c {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    public final void a(ul80 ul80Var, boolean z, bgc bgcVar) {
        d dVar = this.a;
        tje.N(dVar.o(), null, null, new BasePlacesRouter$InnerStarterNavigator$openFlexScreen$1(dVar, ul80Var, z, bgcVar, null), 3);
    }

    public final void c(xl80 xl80Var, boolean z, boolean z2, sls slsVar) {
        d dVar = this.a;
        dVar.U().a();
        dVar.V.d(new bcc0(xl80Var, PlacesNavigationEntry$Source.STARTER));
        dVar.T().h(xl80Var.c, new BasePlacesRouter$InnerStarterNavigator$openOrganizationCard$1(xl80Var, z, null), new l75(0), new j75(slsVar, dVar));
    }

    public final void d(yl80 yl80Var, boolean z, sls slsVar) {
        d dVar = this.a;
        dVar.V.b(new bcc0(yl80Var, PlacesNavigationEntry$Source.STARTER));
        dVar.S(new BasePlacesRouter$InnerStarterNavigator$openOrganizationsList$1(dVar, yl80Var, z, slsVar, null));
    }

    public final void f(zl80 zl80Var) {
        d dVar = this.a;
        b T = dVar.T();
        tje.N(T.a.o(), null, null, new BasePlacesRouter$InnerNavigator$openPaymentsCheckout$1(T.a, T, zl80Var, new BasePlacesRouter$InnerStarterNavigator$openPaymentsCheckout$1(0, dVar.T(), b.class, "backIfNoChildren", "backIfNoChildren()V", 0), null), 3);
    }

    public final void g(am80 am80Var) {
        d dVar = this.a;
        dVar.T().g(am80Var, new BasePlacesRouter$InnerStarterNavigator$openPaymentsResult$1(0, dVar.T(), b.class, "backIfNoChildren", "backIfNoChildren()V", 0));
    }

    public final void h(cm80 cm80Var, boolean z) {
        d dVar = this.a;
        ccc0 ccc0Var = dVar.V;
        if (z) {
            bcc0 bcc0Var = (bcc0) kotlin.collections.a.R((List) ccc0Var.a.getValue());
            if (!((bcc0Var != null ? bcc0Var.a : null) instanceof cm80)) {
                ccc0Var.b(new bcc0(cm80Var, PlacesNavigationEntry$Source.INTERNAL));
            }
        }
        b T = dVar.T();
        BasePlacesRouter$InnerStarterNavigator$openSearchList$1 basePlacesRouter$InnerStarterNavigator$openSearchList$1 = BasePlacesRouter$InnerStarterNavigator$openSearchList$1.b;
        BasePlacesRouter$InnerStarterNavigator$openSearchList$2 basePlacesRouter$InnerStarterNavigator$openSearchList$2 = new BasePlacesRouter$InnerStarterNavigator$openSearchList$2(cm80Var, null);
        m75 m75Var = new m75(dVar, 0);
        at3 at3Var = new at3(27);
        d dVar2 = T.a;
        dVar2.S(new BasePlacesRouter$InnerNavigator$launchChildRouterReplacing$2(basePlacesRouter$InnerStarterNavigator$openSearchList$2, basePlacesRouter$InnerStarterNavigator$openSearchList$1, dVar2, z, at3Var, m75Var, null));
    }
}
