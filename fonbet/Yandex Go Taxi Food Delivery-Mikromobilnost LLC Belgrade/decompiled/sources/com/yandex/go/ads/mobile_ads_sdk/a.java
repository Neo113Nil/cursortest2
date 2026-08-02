package com.yandex.go.ads.mobile_ads_sdk;

import defpackage.h3y;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yw60;

/* loaded from: classes.dex */
public final class a implements yw60 {
    public final tt2 a;
    public final tse b;
    public final com.yandex.go.ads.mobile_ads_sdk.data.a c;
    public final h3y d;

    public a(tt2 tt2Var, tse tseVar, com.yandex.go.ads.mobile_ads_sdk.data.a aVar, h3y h3yVar) {
        this.a = tt2Var;
        this.b = tseVar;
        this.c = aVar;
        this.d = h3yVar;
    }

    @Override // defpackage.yw60
    public final void a(boolean z) {
        if (z) {
            this.a.getClass();
            tje.N(this.b, uyj.a, null, new MobileAdsInitializer$onAppResumed$1(this, null), 2);
        }
    }

    @Override // defpackage.yw60
    public final void e() {
        if (this.c.c.b) {
            this.a.getClass();
            sjh sjhVar = uyj.a;
            tje.N(this.b, mdh.b, null, new MobileAdsInitializer$onAppCreated$1(this, null), 2);
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "MobileAdsInitializer";
    }
}
