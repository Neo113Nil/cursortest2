package com.yandex.passport.internal.ui.authsdk;

import defpackage.m50;
import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AuthSdkActivity b;

    public /* synthetic */ a(AuthSdkActivity authSdkActivity, int i) {
        this.a = i;
        this.b = authSdkActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        m50 slothLauncher_delegate$lambda$1;
        zy11 showError$lambda$7;
        int i = this.a;
        AuthSdkActivity authSdkActivity = this.b;
        switch (i) {
            case 0:
                slothLauncher_delegate$lambda$1 = AuthSdkActivity.slothLauncher_delegate$lambda$1(authSdkActivity);
                return slothLauncher_delegate$lambda$1;
            default:
                showError$lambda$7 = AuthSdkActivity.showError$lambda$7(authSdkActivity);
                return showError$lambda$7;
        }
    }
}
