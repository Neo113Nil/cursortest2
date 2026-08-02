package com.yandex.go.communications.banners;

import androidx.lifecycle.Lifecycle;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;
import ru.yandex.taxi.banners.model.h;

/* loaded from: classes.dex */
public final class b implements jy60 {
    public final Lifecycle a;
    public final tse b;
    public final h c;

    public b(Lifecycle lifecycle, tse tseVar, h hVar) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = hVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PromotionsActivityLifecycleListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.b, null, null, new PromotionsProviderListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
