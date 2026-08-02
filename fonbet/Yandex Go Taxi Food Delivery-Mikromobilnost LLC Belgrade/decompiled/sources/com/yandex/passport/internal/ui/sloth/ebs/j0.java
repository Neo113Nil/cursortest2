package com.yandex.passport.internal.ui.sloth.ebs;

import com.yandex.passport.common.ebs.BiometricAuthSdkProperties;

/* loaded from: classes2.dex */
public final class j0 implements l0 {
    public final BiometricAuthSdkProperties a;

    static {
        com.yandex.passport.common.ebs.a aVar = BiometricAuthSdkProperties.Companion;
    }

    public j0(BiometricAuthSdkProperties biometricAuthSdkProperties) {
        this.a = biometricAuthSdkProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.a.equals(((j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowBiometricVerificationSdk(properties=" + this.a + ')';
    }
}
