package com.yandex.go.payments.porttech.navigation;

import com.yandex.go.payments.porttech.domain.PorttechJsNativeApi;
import defpackage.hfa0;
import defpackage.tje;
import defpackage.zyz;

/* loaded from: classes13.dex */
public final class b implements zyz {
    public final /* synthetic */ d a;
    public final /* synthetic */ PorttechJsNativeApi b;
    public final /* synthetic */ String c;

    public b(d dVar, PorttechJsNativeApi porttechJsNativeApi, String str) {
        this.a = dVar;
        this.b = porttechJsNativeApi;
        this.c = str;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    @Override // defpackage.zyz
    public final void j(hfa0 hfa0Var) {
        tje.N(this.a.o(), null, null, new PorttechWebViewRouter$handleSelectPaymentMethod$2$onPaymentSelected$1(hfa0Var, this.a, this.b, this.c, null), 3);
    }
}
