package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.search.router.FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
import defpackage.h55;
import defpackage.jsd;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.o501;
import defpackage.ove;
import defpackage.q501;
import defpackage.tje;
import defpackage.v7w0;
import defpackage.w511;
import defpackage.wjs;
import defpackage.x7w0;
import defpackage.y50;
import defpackage.y7w0;
import defpackage.yvf0;
import defpackage.z7w0;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes12.dex */
public final class f extends h55 {
    public final y50 D;
    public final com.yandex.go.navigation.screen.c E;
    public final com.yandex.go.route.interactor.b F;
    public final yvf0 G;
    public final h H;
    public final yvf0 I;
    public final yvf0 J;
    public final com.yandex.go.mainscreen.superapp.impl.foundation.domain.g K;
    public final yvf0 L;
    public final ove M;

    public f(y50 y50Var, com.yandex.go.navigation.screen.c cVar, com.yandex.go.route.interactor.b bVar, yvf0 yvf0Var, h hVar, yvf0 yvf0Var2, yvf0 yvf0Var3, com.yandex.go.mainscreen.superapp.impl.foundation.domain.g gVar, yvf0 yvf0Var4, ove oveVar) {
        super(null);
        this.D = y50Var;
        this.E = cVar;
        this.F = bVar;
        this.G = yvf0Var;
        this.H = hVar;
        this.I = yvf0Var2;
        this.J = yvf0Var3;
        this.K = gVar;
        this.L = yvf0Var4;
        this.M = oveVar;
    }

    public static final void P(f fVar, AdditionalAction additionalAction, String str) {
        tje.N(fVar.o(), null, null, new SuperAppWhereToNavigationRouter$openSummary$1(fVar, additionalAction, str, null), 3);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        Q((z7w0) obj);
    }

    public final void Q(z7w0 z7w0Var) {
        if (z7w0Var instanceof x7w0) {
            x7w0 x7w0Var = (x7w0) z7w0Var;
            boolean z = x7w0Var.a;
            FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection = x7w0Var.b;
            AdditionalAction additionalAction = x7w0Var.c;
            String str = x7w0Var.d;
            boolean z2 = x7w0Var.e;
            String str2 = x7w0Var.f;
            this.K.a.a = true;
            D((m950) this.J.get(), new wjs(z, fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection, str, z2), new v7w0(this, additionalAction, str2));
            return;
        }
        if (!(z7w0Var instanceof y7w0)) {
            w511.b();
            return;
        }
        y7w0 y7w0Var = (y7w0) z7w0Var;
        AdditionalAction additionalAction2 = y7w0Var.a;
        String str3 = y7w0Var.b;
        m950 m950Var = (m950) this.G.get();
        Screen b = this.E.b();
        PointType pointType = PointType.DESTINATION;
        SourcePicker sourcePicker = SourcePicker.B_FROM_HOME;
        o501 o501Var = new o501(kyh0.address_search_modal_view_from, kyh0.address_search_modal_view_to, 14);
        D(m950Var, new jsd(pointType, sourcePicker, false, new q501(o501Var, o501Var), null, b == Screen.MAIN_V4 ? "superapp_main" : "pickup_location", null, 768), new v7w0(this, additionalAction2, str3));
    }

    public final void R(boolean z) {
        z7w0 z7w0Var = (z7w0) this.x;
        if (z7w0Var instanceof x7w0) {
            x7w0 x7w0Var = (x7w0) z7w0Var;
            Q(new x7w0(z, FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection.BACKWARD, x7w0Var.c, x7w0Var.d, x7w0Var.e, x7w0Var.f));
        } else if (z7w0Var instanceof y7w0) {
            Q(z7w0Var);
        }
    }
}
