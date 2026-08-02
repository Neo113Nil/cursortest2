package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class x implements z {
    public final com.yandex.passport.internal.ui.f a;

    public x(com.yandex.passport.internal.ui.f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && jl40.l(this.a, ((x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChangePassword(data=" + this.a + ')';
    }
}
