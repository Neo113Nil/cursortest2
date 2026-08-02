package com.ybsdk.feature.accountdetails.internal.screens.accountdetails;

import android.net.Uri;
import defpackage.ds31;
import defpackage.h791;
import defpackage.hk;
import defpackage.jk;
import defpackage.p05;
import defpackage.pd;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.v0h;

/* loaded from: classes3.dex */
public final class a extends p05 {
    public final AccountDetailsParams B;
    public final com.ybsdk.feature.accountdetails.internal.interactors.a C;
    public final hk D;
    public final tfl0 E;

    public a(AccountDetailsParams accountDetailsParams, com.ybsdk.feature.accountdetails.internal.interactors.a aVar, hk hkVar, tfl0 tfl0Var) {
        super(new pd(10));
        this.B = accountDetailsParams;
        this.C = aVar;
        this.D = hkVar;
        this.E = tfl0Var;
        tje.N(ds31.a(this), null, null, new AccountDetailsViewModel$fetchDetails$1(this, null), 3);
    }

    @Override // defpackage.p05
    public final void b0() {
        this.E.e();
    }

    @Override // defpackage.p05
    public final boolean c0(Uri uri) {
        return h791.e(((jk) this.D).a, uri.toString(), false, null, 14) instanceof v0h;
    }

    @Override // defpackage.p05
    public final void d0() {
        tje.N(ds31.a(this), null, null, new AccountDetailsViewModel$fetchDetails$1(this, null), 3);
    }

    @Override // defpackage.p05
    public final void e0(String str) {
        jk jkVar = (jk) this.D;
        h791.f(jkVar.a, str, com.ybsdk.feature.webview.api.a.b(jkVar.b, str, null, null, 6));
    }
}
