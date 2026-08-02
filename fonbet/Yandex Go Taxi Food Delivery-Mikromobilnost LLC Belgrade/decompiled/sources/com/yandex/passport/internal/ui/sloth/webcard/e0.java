package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class e0 implements f0 {
    public final com.yandex.passport.sloth.a1 a;

    public e0(com.yandex.passport.sloth.a1 a1Var) {
        this.a = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && jl40.l(this.a, ((e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothResultWish(result=" + this.a + ')';
    }
}
