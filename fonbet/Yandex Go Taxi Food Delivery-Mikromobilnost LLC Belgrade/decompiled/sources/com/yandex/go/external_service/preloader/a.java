package com.yandex.go.external_service.preloader;

import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.lz60;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes.dex */
public final class a implements lz60 {
    public final hit a;
    public final tt2 b;
    public final h3y c;

    public a(tt2 tt2Var, hit hitVar, h3y h3yVar) {
        this.a = hitVar;
        this.b = tt2Var;
        this.c = h3yVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        hbp0 hbp0Var = this.a.a;
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new PreloaderLargestContentfulPaintListener$onLargestContentfulPaint$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PreloaderLargestContentfulPaintListener";
    }
}
