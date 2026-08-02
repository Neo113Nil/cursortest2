package com.ybsdk.di.modules.features;

import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.feature.passport.api.PassportAuthorizationUrlError;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.j3h;
import defpackage.l3h;
import defpackage.mr41;
import defpackage.ppp0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes3.dex */
public final class w implements mr41 {
    public final /* synthetic */ com.ybsdk.common.repositiories.auth.b a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ j3h c;
    public final /* synthetic */ ppp0 d;

    public w(com.ybsdk.common.repositiories.auth.b bVar, tse tseVar, j3h j3hVar, ppp0 ppp0Var) {
        this.a = bVar;
        this.b = tseVar;
        this.c = j3hVar;
        this.d = ppp0Var;
    }

    public final boolean a(Throwable th) {
        PassportAuthorizationUrlError passportAuthorizationUrlError = th instanceof PassportAuthorizationUrlError ? (PassportAuthorizationUrlError) th : null;
        boolean z = false;
        if (passportAuthorizationUrlError != null && passportAuthorizationUrlError.getNeedsRelogin()) {
            z = true;
        }
        if (z) {
            tje.N(this.b, null, null, new WebViewFeatureModule$provideLogoutHelper$1$logoutIfNeeded$1(this.a.d, this.d, null), 3);
            ((l3h) this.c).d(com.ybsdk.feature.deeplink.api.a.a(DeeplinkAction.LogoutAccount.INSTANCE, DeeplinkNavigation.Add.INSTANCE));
        }
        return z;
    }
}
