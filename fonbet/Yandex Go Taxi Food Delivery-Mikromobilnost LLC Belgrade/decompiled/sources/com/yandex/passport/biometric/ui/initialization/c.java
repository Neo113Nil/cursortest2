package com.yandex.passport.biometric.ui.initialization;

import com.yandex.passport.biometric.ui.initialization.d;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class c extends d.a {
    public final Exception a;

    public c(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && jl40.l(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.a + ')';
    }
}
