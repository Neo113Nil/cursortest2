package com.yandex.passport.internal.ui.sloth.ebs;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vng;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class BiometricVerificationActivity$onCreate$properties$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        ((f) this.receiver).getClass();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(bundle, BiometricVerificationProperties.class, "biometric_verification_props") : bundle.getParcelable("biometric_verification_props");
        if (parcelable != null) {
            return (BiometricVerificationProperties) parcelable;
        }
        ny61.r("can't get required parcelable biometric_verification_props");
        return null;
    }
}
