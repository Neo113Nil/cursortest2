package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class m0 implements p0 {
    public final com.yandex.passport.sloth.i0 a;

    public m0(com.yandex.passport.sloth.i0 i0Var) {
        this.a = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && jl40.l(this.a, ((m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalRequestWish(request=" + this.a + ')';
    }
}
