package com.yandex.passport.common.ebs;

import defpackage.unr0;

/* loaded from: classes15.dex */
public final class h {
    public final boolean a;
    public final boolean b;

    public h(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiometricCheckAgeByTrackIdResult(isFaceRecognized=");
        sb.append(this.a);
        sb.append(", isFlowSuccessful=");
        return unr0.u(sb, this.b, ')');
    }
}
