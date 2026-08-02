package com.yandex.plus.home.feature.webviews.internal.smart;

import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import defpackage.asd0;
import defpackage.jse;
import defpackage.kio;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.v920;
import defpackage.yld0;
import java.util.List;

/* loaded from: classes2.dex */
public final class b extends com.yandex.plus.home.feature.webviews.internal.a {
    public String k;
    public String l;
    public final /* synthetic */ yld0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yld0 yld0Var, String str, com.yandex.plus.home.auth.b bVar, kio kioVar, com.yandex.plus.home.feature.webviews.internal.container.b bVar2, v920 v920Var, boolean z, jse jseVar) {
        super(str, bVar, kioVar, bVar2, v920Var, z, jseVar);
        this.m = yld0Var;
        WebViewType webViewType = WebViewType.HOME;
        this.k = yld0Var.f.a.toString();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final String b() {
        return this.l;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final String c() {
        return this.k;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void i() {
        ((asd0) this.m.b).dismiss();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void j(String str, List list) {
        yld0 yld0Var = this.m;
        ((asd0) yld0Var.b).openUrl(str, list);
        if (yld0Var.A) {
            return;
        }
        pzt0 pzt0Var = yld0Var.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        yld0Var.G = tje.N(yld0Var.e(), null, null, new PlusSmartWebPresenter$delegate$1$onLoadUrl$1(yld0Var, null), 3);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void m(String str) {
        this.l = str;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.a
    public final void n(String str) {
        this.k = str;
    }
}
