package com.yandex.go.flex.common.router.web_view;

import defpackage.ag41;
import defpackage.bi41;
import defpackage.cu41;
import defpackage.enr;
import defpackage.i790;
import defpackage.m790;
import defpackage.scg;
import defpackage.tje;

/* loaded from: classes12.dex */
public final class a implements bi41 {
    public final /* synthetic */ enr a;
    public final /* synthetic */ b b;

    public a(enr enrVar, b bVar) {
        this.a = enrVar;
        this.b = bVar;
    }

    @Override // defpackage.bi41
    public final void onPageFinished(String str) {
        ((ag41) ((scg) this.b.R()).a()).c(cu41.c);
    }

    @Override // defpackage.bi41
    public final void onPageLoadingError(m790 m790Var) {
        b bVar = this.b;
        ((ag41) ((scg) bVar.R()).a()).b(true);
        if (m790Var instanceof i790) {
            tje.N(bVar.o(), null, null, new FlexWebViewRouter$showInternal$loadingListener$1$onPageLoadingError$1(bVar, this.a, null), 3);
        }
    }

    @Override // defpackage.bi41
    public final void onPageStarted(String str) {
        this.a.b.onPageStarted(str);
    }
}
