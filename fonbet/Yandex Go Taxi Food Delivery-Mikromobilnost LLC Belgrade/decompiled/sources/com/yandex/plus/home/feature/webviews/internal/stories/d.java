package com.yandex.plus.home.feature.webviews.internal.stories;

import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import defpackage.jse;
import defpackage.kio;
import defpackage.nsu;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.v920;
import defpackage.xk41;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends com.yandex.plus.home.feature.webviews.internal.a {
    public final /* synthetic */ e k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, com.yandex.plus.home.auth.b bVar, kio kioVar, com.yandex.plus.home.feature.webviews.internal.container.b bVar2, v920 v920Var, boolean z, jse jseVar) {
        super(str, bVar, kioVar, bVar2, v920Var, z, jseVar);
        this.k = eVar;
        WebViewType webViewType = WebViewType.HOME;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final String b() {
        return this.k.g.c.getStoriesAuthCallbackUrl();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final String c() {
        return this.k.g.c.getStoriesUrl();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void i() {
        ((xk41) this.k.b).dismiss(false);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void j(String str, List list) {
        e eVar = this.k;
        ((nsu) eVar.X.getValue()).j = false;
        eVar.Y = false;
        ((xk41) eVar.b).openUrl(str, eVar.g.a, list);
        if (eVar.E) {
            return;
        }
        pzt0 pzt0Var = eVar.P;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        eVar.P = tje.N(eVar.e(), null, null, new WebStoriesPresenter$delegate$1$onLoadUrl$1(eVar, null), 3);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void m(String str) {
        this.k.g.c.r(str);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void n(String str) {
        this.k.g.c.s(str);
    }
}
