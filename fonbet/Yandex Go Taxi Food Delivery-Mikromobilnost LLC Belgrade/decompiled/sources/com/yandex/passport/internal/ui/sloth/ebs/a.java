package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.hs31;
import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiometricVerificationActivity b;

    public /* synthetic */ a(BiometricVerificationActivity biometricVerificationActivity, int i) {
        this.a = i;
        this.b = biometricVerificationActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        hs31 onNewIntent$lambda$6;
        int i = this.a;
        BiometricVerificationActivity biometricVerificationActivity = this.b;
        switch (i) {
            case 0:
                onNewIntent$lambda$6 = BiometricVerificationActivity.onNewIntent$lambda$6(biometricVerificationActivity);
                return onNewIntent$lambda$6;
            default:
                biometricVerificationActivity.finish();
                return zy11.a;
        }
    }
}
