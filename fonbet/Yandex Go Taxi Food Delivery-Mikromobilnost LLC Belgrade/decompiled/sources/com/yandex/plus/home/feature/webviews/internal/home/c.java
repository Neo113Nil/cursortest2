package com.yandex.plus.home.feature.webviews.internal.home;

import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import defpackage.esd0;
import defpackage.jse;
import defpackage.kio;
import defpackage.nsu;
import defpackage.pzt0;
import defpackage.s4d0;
import defpackage.tje;
import defpackage.v920;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends com.yandex.plus.home.feature.webviews.internal.a {
    public final /* synthetic */ d k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, com.yandex.plus.home.auth.b bVar, kio kioVar, v920 v920Var, com.yandex.plus.home.feature.webviews.internal.container.b bVar2, boolean z, jse jseVar) {
        super(str, bVar, kioVar, bVar2, v920Var, z, jseVar);
        this.k = dVar;
        WebViewType webViewType = WebViewType.HOME;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final String b() {
        return this.k.g.getHomeAuthCallbackUrl();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final String c() {
        return this.k.g.getHomeUrl();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void i() {
        ((s4d0) this.k.b).dismiss();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void j(String str, List list) {
        d dVar = this.k;
        ((nsu) dVar.c0.getValue()).j = false;
        dVar.V = false;
        dVar.P.a.g(esd0.a);
        ((s4d0) dVar.b).openUrl(str, list);
        if (dVar.I) {
            return;
        }
        pzt0 pzt0Var = dVar.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.U = tje.N(dVar.e(), null, null, new PlusHomeWebPresenter$delegate$1$onLoadUrl$1(dVar, null), 3);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void m(String str) {
        this.k.g.l(str);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void n(String str) {
        this.k.g.m(str);
    }
}
