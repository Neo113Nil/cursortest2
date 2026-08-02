package com.yandex.go.flex.common.descriptors.action;

import com.yandex.go.flex.common.api.actions.ActionWithOnTapOnboarding;
import com.yandex.go.flex.common.api.actions.CityModeAction;
import com.yandex.go.flex.common.api.actions.CloseAction;
import com.yandex.go.flex.common.api.actions.DiscoveryAction;
import com.yandex.go.flex.common.api.actions.IntercityMainAction;
import com.yandex.go.flex.common.api.actions.MarketPlaceAction;
import com.yandex.go.flex.common.api.actions.OpenOrganizationCardAction;
import com.yandex.go.flex.common.api.actions.OpenOrganizationsListAction;
import com.yandex.go.flex.common.api.actions.ShowOnboardingAction;
import com.yandex.go.flex.common.api.actions.SummaryRedirectAction;
import com.yandex.go.flex.common.api.actions.TaxiRouteInputAction;
import com.yandex.go.flex.common.api.actions.WebCustomTabsAction;
import com.yandex.go.flex.common.api.actions.b0;
import com.yandex.go.flex.common.api.actions.c0;
import com.yandex.go.flex.common.api.actions.e0;
import com.yandex.go.flex.common.api.actions.i;
import com.yandex.go.flex.common.api.actions.i0;
import com.yandex.go.flex.common.api.actions.l;
import com.yandex.go.flex.common.api.actions.l0;
import com.yandex.go.flex.common.api.actions.m;
import com.yandex.go.flex.common.api.actions.m0;
import com.yandex.go.flex.common.api.actions.n0;
import com.yandex.go.flex.common.api.actions.r0;
import com.yandex.go.flex.common.api.actions.s0;
import com.yandex.go.flex.common.api.actions.u0;
import com.yandex.go.flex.common.api.actions.w0;
import com.yandex.go.flex.common.api.actions.x;
import com.yandex.go.flex.common.api.actions.y;
import com.yandex.go.flex.common.api.actions.z;
import defpackage.d9;
import defpackage.eqh;
import defpackage.g0c;
import defpackage.h3y;
import defpackage.mu;
import defpackage.n170;
import defpackage.ou;
import defpackage.pu;
import defpackage.pzr0;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.w030;
import defpackage.yvf0;
import defpackage.z0w0;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a {
    public final pzr0 a;
    public final com.yandex.go.shortcuts.impl.interactors.e b;
    public final n170 c;
    public final w030 d;
    public final h3y e;
    public final yvf0 f;
    public final ou g;
    public final d9 h = new d9(3, this);
    public pu i = new pu();

    public a(pzr0 pzr0Var, com.yandex.go.shortcuts.impl.interactors.e eVar, z0w0 z0w0Var, n170 n170Var, w030 w030Var, h3y h3yVar, eqh eqhVar) {
        this.a = pzr0Var;
        this.b = eVar;
        this.c = n170Var;
        this.d = w030Var;
        this.e = h3yVar;
        this.f = eqhVar;
        this.g = new ou(0, this, z0w0Var);
    }

    public final List a() {
        ActionDescriptorsRepository$getPagerActionDescriptors$1 actionDescriptorsRepository$getPagerActionDescriptors$1 = new ActionDescriptorsRepository$getPagerActionDescriptors$1(0, r0.INSTANCE, r0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0);
        List b = b();
        g0c a = qoi0.a(r0.class);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        ou ouVar = this.g;
        return scc.g(new mu("TaxiMainScreenAction", a, actionDescriptorsRepository$getPagerActionDescriptors$1, kotlin.a.b(lazyThreadSafetyMode, ouVar), b, false), new mu("TaxiRouteInputAction", qoi0.a(TaxiRouteInputAction.class), new ActionDescriptorsRepository$getPagerActionDescriptors$2(0, TaxiRouteInputAction.Companion, u0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("TaxiProceedAction", qoi0.a(s0.class), new ActionDescriptorsRepository$getPagerActionDescriptors$3(0, s0.INSTANCE, s0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("DeliveryDashboardAction", qoi0.a(l.class), new ActionDescriptorsRepository$getPagerActionDescriptors$4(0, l.INSTANCE, l.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("NavigatorAction", qoi0.a(z.class), new ActionDescriptorsRepository$getPagerActionDescriptors$5(0, z.INSTANCE, z.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("ServiceCatalogAction", qoi0.a(l0.class), new ActionDescriptorsRepository$getPagerActionDescriptors$6(0, l0.INSTANCE, l0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("DiscoveryAction", qoi0.a(DiscoveryAction.class), new ActionDescriptorsRepository$getPagerActionDescriptors$7(0, DiscoveryAction.Companion, m.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("CityModeAction", qoi0.a(CityModeAction.class), new ActionDescriptorsRepository$getPagerActionDescriptors$8(0, CityModeAction.Companion, com.yandex.go.flex.common.api.actions.f.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("MarketplaceAction", qoi0.a(MarketPlaceAction.class), new ActionDescriptorsRepository$getPagerActionDescriptors$9(0, MarketPlaceAction.Companion, y.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("IntercityMainAction", qoi0.a(IntercityMainAction.class), new ActionDescriptorsRepository$getPagerActionDescriptors$10(0, IntercityMainAction.Companion, x.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("CarTechAction", qoi0.a(com.yandex.go.flex.common.api.actions.d.class), new ActionDescriptorsRepository$getPagerActionDescriptors$11(0, com.yandex.go.flex.common.api.actions.d.INSTANCE, com.yandex.go.flex.common.api.actions.d.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("OrganizationDiscoveryAction", qoi0.a(i0.class), new ActionDescriptorsRepository$getPagerActionDescriptors$12(0, i0.INSTANCE, i0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("OpenOrganizationListAction", qoi0.a(OpenOrganizationsListAction.class), new ActionDescriptorsRepository$getPagerActionDescriptors$13(0, OpenOrganizationsListAction.Companion, c0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("WebCustomTabs", qoi0.a(WebCustomTabsAction.class), new ActionDescriptorsRepository$getPagerActionDescriptors$14(0, WebCustomTabsAction.Companion, w0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("OpenOrganizationCardAction", qoi0.a(OpenOrganizationCardAction.class), new ActionDescriptorsRepository$getPagerActionDescriptors$15(0, OpenOrganizationCardAction.Companion, b0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("ShowOnboardingAction", qoi0.a(ShowOnboardingAction.class), new ActionDescriptorsRepository$getPagerActionDescriptors$16(0, ShowOnboardingAction.Companion, m0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("ActionWithOnTapOnboarding", qoi0.a(ActionWithOnTapOnboarding.class), new ActionDescriptorsRepository$getPagerActionDescriptors$17(0, ActionWithOnTapOnboarding.Companion, com.yandex.go.flex.common.api.actions.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("SummaryRedirectAction", qoi0.a(SummaryRedirectAction.class), new ActionDescriptorsRepository$getPagerActionDescriptors$18(0, SummaryRedirectAction.Companion, n0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("CloseAction", qoi0.a(CloseAction.class), new ActionDescriptorsRepository$getPagerActionDescriptors$19(0, CloseAction.Companion, i.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false), new mu("OpenSuperappSearchAction", qoi0.a(e0.class), new ActionDescriptorsRepository$getPagerActionDescriptors$20(0, e0.INSTANCE, e0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, ouVar), b(), false));
    }

    public final List b() {
        pu puVar = this.i;
        if (puVar != null) {
            this.i = null;
        } else {
            puVar = null;
        }
        return puVar != null ? Collections.singletonList(puVar) : EmptyList.a;
    }

    public final List c() {
        return Collections.singletonList(new mu("MarkNotifyAction", qoi0.a(MarkNotifyAction.class), new ActionDescriptorsRepository$getSideEffectActionDescriptors$1(0, MarkNotifyAction.Companion, e.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, this.h), b(), false));
    }
}
