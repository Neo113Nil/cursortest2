package com.yandex.passport.biometric.ui.verification;

import com.yandex.passport.biometric.ui.verification.e;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class d extends e.a {
    public final Exception a;

    public d(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && jl40.l(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.a + ')';
    }
}
