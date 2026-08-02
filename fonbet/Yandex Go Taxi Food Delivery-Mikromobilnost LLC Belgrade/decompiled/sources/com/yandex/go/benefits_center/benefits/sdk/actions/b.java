package com.yandex.go.benefits_center.benefits.sdk.actions;

import defpackage.dw;
import defpackage.kr;
import defpackage.n6u;
import defpackage.tje;
import defpackage.tse;
import defpackage.wgr;

/* loaded from: classes.dex */
public final class b implements dw {
    public final tse a;
    public final wgr b;

    public b(tse tseVar, wgr wgrVar) {
        this.a = tseVar;
        this.b = wgrVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        if ((krVar instanceof ActivateTaxiPromoCodeAction) || (krVar instanceof DeactivateTaxiPromoCodeAction) || (krVar instanceof ShowTicketBannerAction) || (krVar instanceof ScootersUseAction) || (krVar instanceof ShowNotificationAction) || (krVar instanceof OpenActivatingScreenAction) || (krVar instanceof ClaimBenefitAction)) {
            tje.N(this.a, null, null, new BenefitsCenterActionHandler$handle$1(this, krVar, null), 3);
        }
    }
}
