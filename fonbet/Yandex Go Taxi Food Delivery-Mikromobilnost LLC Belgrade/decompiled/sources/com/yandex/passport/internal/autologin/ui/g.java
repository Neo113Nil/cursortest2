package com.yandex.passport.internal.autologin.ui;

import com.yandex.passport.api.a0;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class g {
    public final a0 a;
    public final com.yandex.passport.api.i b;

    public g(a0 a0Var, com.yandex.passport.api.i iVar) {
        this.a = a0Var;
        this.b = iVar;
    }

    public final com.yandex.passport.api.i a() {
        return this.b;
    }

    public final a0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return jl40.l(this.a, gVar.a) && jl40.l(this.b, gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoLoginWithAccountParams(properties=" + this.a + ", account=" + this.b + ')';
    }
}
