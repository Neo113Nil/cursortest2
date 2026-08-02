package com.yandex.passport.common.ebs;

/* loaded from: classes15.dex */
public final class v extends w {
    public final BiometricAuthSdkProperties a;

    public v(BiometricAuthSdkProperties biometricAuthSdkProperties) {
        this.a = biometricAuthSdkProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.a.equals(((v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(properties=" + this.a + ')';
    }
}
