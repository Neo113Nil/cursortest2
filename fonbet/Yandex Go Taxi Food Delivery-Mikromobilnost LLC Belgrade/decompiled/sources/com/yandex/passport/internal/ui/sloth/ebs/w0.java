package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class w0 implements z0 {
    public final com.yandex.passport.sloth.i0 a;

    public w0(com.yandex.passport.sloth.i0 i0Var) {
        this.a = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && jl40.l(this.a, ((w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalRequestWish(request=" + this.a + ')';
    }
}
