package com.yandex.go.splash.v2;

import androidx.lifecycle.Lifecycle;
import defpackage.lz60;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes8.dex */
public final class e implements lz60 {
    public final tse a;
    public final Lifecycle b;
    public final g c;

    public e(tse tseVar, Lifecycle lifecycle, g gVar) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = gVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.a, null, null, new SplashScreenV2ImagePreloader$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SplashScreenV2ImagePreloader";
    }
}
