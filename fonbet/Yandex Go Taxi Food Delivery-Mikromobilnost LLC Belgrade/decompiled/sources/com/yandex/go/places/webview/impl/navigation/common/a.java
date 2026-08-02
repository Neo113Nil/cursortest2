package com.yandex.go.places.webview.impl.navigation.common;

import defpackage.ag41;
import defpackage.bi41;
import defpackage.cu41;
import defpackage.hf41;
import defpackage.i790;
import defpackage.m790;
import defpackage.scg;
import defpackage.tje;

/* loaded from: classes13.dex */
public final class a implements bi41 {
    public final /* synthetic */ hf41 a;
    public final /* synthetic */ b b;

    public a(hf41 hf41Var, b bVar) {
        this.a = hf41Var;
        this.b = bVar;
    }

    @Override // defpackage.bi41
    public final void onPageFinished(String str) {
        ((ag41) ((scg) this.b.X()).a()).c(cu41.c);
    }

    @Override // defpackage.bi41
    public final void onPageLoadingError(m790 m790Var) {
        b bVar = this.b;
        ((ag41) ((scg) bVar.X()).a()).b(true);
        if (m790Var instanceof i790) {
            tje.N(bVar.o(), null, null, new BasePlacesWebRouter$showInternal$loadingListener$1$onPageLoadingError$1(bVar, this.a, null), 3);
        }
    }

    @Override // defpackage.bi41
    public final void onPageStarted(String str) {
        this.a.c.onPageStarted(str);
    }
}
