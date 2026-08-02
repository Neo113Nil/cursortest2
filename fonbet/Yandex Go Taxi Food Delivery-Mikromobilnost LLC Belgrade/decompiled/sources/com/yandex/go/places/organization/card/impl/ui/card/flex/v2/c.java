package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import com.yandex.go.places.models.data.entities.network.bottom_panel.OrganizationCardAnalyticsParams;
import defpackage.be6;
import defpackage.rg80;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final /* synthetic */ class c implements wls {
    public final /* synthetic */ g a;
    public final /* synthetic */ rg80 b;

    public /* synthetic */ c(g gVar, rg80 rg80Var) {
        this.a = gVar;
        this.b = rg80Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        be6 be6Var = (be6) obj;
        g gVar = this.a;
        tje.N(gVar.Jg(), null, null, new OrganizationCardsSliderPresenter$createRouterHolder$bottomPanelParser$1$1(this.b, gVar, (OrganizationCardAnalyticsParams) obj2, be6Var, null), 3);
        return zy11.a;
    }
}
