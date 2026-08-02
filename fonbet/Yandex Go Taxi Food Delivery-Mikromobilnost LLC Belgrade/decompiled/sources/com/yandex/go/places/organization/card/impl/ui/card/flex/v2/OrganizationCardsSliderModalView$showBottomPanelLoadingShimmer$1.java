package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import com.yandex.go.places.models.data.entities.network.bottom_panel.OrganizationCardAnalyticsParams;
import defpackage.aq;
import defpackage.e730;
import defpackage.fnb0;
import defpackage.fr;
import defpackage.p1j0;
import defpackage.sy60;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class OrganizationCardsSliderModalView$showBottomPanelLoadingShimmer$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        fr frVar = (fr) obj;
        g gVar = (g) this.receiver;
        gVar.O.p(gVar.f0, frVar);
        com.yandex.go.places.organization.card.impl.domain.interactors.flex.b bVar = gVar.K;
        OrganizationCardAnalyticsParams organizationCardAnalyticsParams = gVar.f0;
        if (frVar instanceof aq) {
            com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar2 = bVar.h;
            aq aqVar = (aq) frVar;
            bVar2.m.d(new fnb0(15), new e730(aqVar.a, aqVar.b, organizationCardAnalyticsParams), sy60.Q2, p1j0.a);
        } else {
            bVar.g.a(frVar, null);
        }
        return zy11.a;
    }
}
