package com.yandex.passport.internal.ui.sloth.webauthn;

import com.yandex.passport.sloth.i0;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class s implements v {
    public final i0 a;

    public s(i0 i0Var) {
        this.a = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && jl40.l(this.a, ((s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalRequestWish(request=" + this.a + ')';
    }
}
