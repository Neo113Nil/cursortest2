package com.yandex.go.places.organization.card.impl.ui.card.flex.v1;

import defpackage.fva0;
import defpackage.m9c0;
import defpackage.r7c0;
import defpackage.tje;

/* loaded from: classes13.dex */
public final class a implements r7c0 {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.r7c0
    public final void b() {
        c cVar = this.a;
        tje.N(cVar.Jg(), null, null, new OrganizationCardFlexPresenter$flexRouter$2$2$onDocumentRendered$1(cVar, null), 3);
        m9c0 m9c0Var = cVar.a0;
        int i = m9c0Var.d + 1;
        m9c0Var.d = i;
        if (i == 3) {
            fva0.b(m9c0Var.a, "Places.FlexOrganizationCard.Shown", null, null, 6);
        }
    }

    @Override // defpackage.r7c0
    public final void c() {
        c cVar = this.a;
        tje.N(cVar.Jg(), null, null, new OrganizationCardFlexPresenter$flexRouter$2$2$onDocumentLoadingFailed$1(cVar, null), 3);
    }

    @Override // defpackage.r7c0
    public final void d() {
        c cVar = this.a;
        tje.N(cVar.Jg(), null, null, new OrganizationCardFlexPresenter$flexRouter$2$2$onDocumentLoadingStarted$1(cVar, null), 3);
    }
}
