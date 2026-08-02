package com.ybsdk.di.modules.features;

import com.ybsdk.di.modules.features.CardFeatureModule;
import defpackage.al8;
import defpackage.h791;
import defpackage.j3h;
import defpackage.np41;
import defpackage.v0h;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes3.dex */
public final class c implements al8 {
    public final /* synthetic */ yvf0 a;
    public final /* synthetic */ np41 b;
    public final /* synthetic */ com.ybsdk.rconfig.b c;

    public c(xvf0 xvf0Var, np41 np41Var, com.ybsdk.rconfig.b bVar) {
        this.a = xvf0Var;
        this.b = np41Var;
        this.c = bVar;
    }

    public final boolean a(String str) {
        return h791.e((j3h) this.a.get(), str, true, null, 12) instanceof v0h;
    }

    public final void b(String str) {
        h791.f((j3h) this.a.get(), str, com.ybsdk.feature.webview.api.a.b(this.b, str, CardFeatureModule.CardBankBlockWebViewCloseCallback.INSTANCE, null, 4));
    }

    public final void c(String str) {
        h791.f((j3h) this.a.get(), str, ((com.ybsdk.feature.webview.internal.a) this.b).f(str));
    }
}
