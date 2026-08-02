package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;

/* loaded from: classes2.dex */
public final class s1 {
    public final Uid a;
    public final String b;

    static {
        int i = Uid.$stable;
    }

    public s1(Uid uid, String str) {
        this.a = uid;
        this.b = str;
    }

    public final Uid a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.a.equals(s1Var.a) && this.b.equals(s1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(uid=" + this.a + ", url=" + ((Object) com.yandex.passport.common.url.b.l(this.b)) + ')';
    }
}
