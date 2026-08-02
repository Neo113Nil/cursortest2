package com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates;

import defpackage.acu;
import defpackage.fsd0;
import defpackage.h0w;
import defpackage.jse;
import defpackage.rzf0;
import defpackage.tpr;
import defpackage.z250;

/* loaded from: classes2.dex */
public final class e extends c {
    public final com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f k;

    public e(jse jseVar, rzf0 rzf0Var, z250 z250Var, h0w h0wVar, com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.a aVar, com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.host.a aVar2, fsd0 fsd0Var, com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f fVar) {
        super(jseVar, rzf0Var, z250Var, h0wVar, aVar, aVar2);
        this.k = fVar;
        com.yandex.plus.home.common.utils.c.c(new acu(fsd0Var.b, 1), this.f, new HomeButtonSectionDelegate$1(this, null));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.c
    public final tpr d() {
        return this.k.d;
    }

    public final void j(String str, String str2) {
        i(new HomeButtonSectionDelegate$requestSubscriptionInfo$1(this, str, str2, null));
    }
}
