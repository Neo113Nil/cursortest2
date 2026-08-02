package com.yandex.go.dynamic.impl.domain.interactror;

import defpackage.g7n;
import defpackage.jy60;
import defpackage.mth;
import defpackage.tje;
import defpackage.tse;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.g;

/* loaded from: classes.dex */
public final class a implements jy60 {
    public final tse a;
    public final g7n b;
    public final g c;

    public a(tse tseVar, g7n g7nVar, g gVar) {
        this.a = tseVar;
        this.b = g7nVar;
        this.c = gVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "DynamicFeatureAnalyticsInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.a, null, null, new DynamicFeatureAnalyticsInteractor$onFirstContentfulPaint$$inlined$safeCollectIn$1(new m0(new mth(this.b.c, 6), this.c.a(HProv.PP_LCD_QUERY), new DynamicFeatureAnalyticsInteractor$onFirstContentfulPaint$1(3, null)), null, this), 3);
    }
}
