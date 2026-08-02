package com.yandex.passport.internal.sloth.performers.webcard;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class e implements f {
    public final Throwable a;

    public e(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && jl40.l(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("ShowError(throwable="), this.a, ')');
    }
}
