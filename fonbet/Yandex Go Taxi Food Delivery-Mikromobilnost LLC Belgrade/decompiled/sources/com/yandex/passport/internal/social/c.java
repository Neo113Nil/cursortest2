package com.yandex.passport.internal.social;

import android.os.Bundle;
import defpackage.lta0;
import defpackage.oyr;
import defpackage.wst;
import defpackage.xyj0;
import defpackage.yst;

/* loaded from: classes11.dex */
public final class c implements wst {
    public final /* synthetic */ GoogleNativeSocialAuthActivity a;

    public c(GoogleNativeSocialAuthActivity googleNativeSocialAuthActivity) {
        this.a = googleNativeSocialAuthActivity;
    }

    @Override // defpackage.t4e
    public final void onConnected(Bundle bundle) {
        yst ystVar;
        wst wstVar;
        yst ystVar2;
        xyj0 xyj0Var;
        GoogleNativeSocialAuthActivity googleNativeSocialAuthActivity = this.a;
        ystVar = googleNativeSocialAuthActivity.googleApiClient;
        wstVar = googleNativeSocialAuthActivity.connectionCallbacks;
        ystVar.n(wstVar);
        ystVar2 = googleNativeSocialAuthActivity.googleApiClient;
        lta0 a = ystVar2.a();
        xyj0Var = googleNativeSocialAuthActivity.resultCallback;
        a.c(xyj0Var);
    }

    @Override // defpackage.t4e
    public final void onConnectionSuspended(int i) {
        NativeSocialHelper.onFailure(this.a, new Exception(oyr.i(i, "Connection suspended: status = ")));
    }
}
