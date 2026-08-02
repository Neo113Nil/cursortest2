package com.yandex.go.payments.shared.family.invites;

import defpackage.hbp0;
import defpackage.owx;
import defpackage.s45;
import ru.yandex.taxi.gopayments.family.repository.FamilyUiStateRepository$Screen;

/* loaded from: classes13.dex */
public final class a extends s45 {
    public final /* synthetic */ d a;
    public final /* synthetic */ owx.c b;

    public a(d dVar, owx.c cVar) {
        this.a = dVar;
        this.b = cVar;
    }

    @Override // defpackage.s45
    public final void a(int i) {
    }

    @Override // defpackage.s45
    public final void b() {
    }

    @Override // defpackage.s45
    public final void c() {
        d dVar = this.a;
        dVar.c.a(FamilyUiStateRepository$Screen.FAMILY_INVITE);
        hbp0.e(dVar.e, null, null, new FamilyInvitesController$showInvite$1$onModalViewDismiss$1(dVar, null), 3);
    }

    @Override // defpackage.s45
    public final void d() {
        d dVar = this.a;
        dVar.c.b(FamilyUiStateRepository$Screen.FAMILY_INVITE);
        com.yandex.go.payments.shared.family.invites.data.a aVar = dVar.a;
        aVar.c.u(this.b.a, true);
    }
}
