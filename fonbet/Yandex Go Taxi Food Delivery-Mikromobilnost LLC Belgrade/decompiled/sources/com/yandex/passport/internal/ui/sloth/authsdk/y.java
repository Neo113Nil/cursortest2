package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class y implements b0 {
    public final com.yandex.passport.sloth.i0 a;

    public y(com.yandex.passport.sloth.i0 i0Var) {
        this.a = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && jl40.l(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalRequestWish(request=" + this.a + ')';
    }
}
