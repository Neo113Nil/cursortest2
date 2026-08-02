package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.credentials.CredentialProvider;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes15.dex */
public final class e0 {
    public final Uid a;
    public final Uid b;
    public final CredentialProvider c;

    static {
        int i = Uid.$stable;
    }

    public e0(Uid uid, Uid uid2, CredentialProvider credentialProvider) {
        this.a = uid;
        this.b = uid2;
        this.c = credentialProvider;
    }

    public final Uid a() {
        return this.a;
    }

    public final CredentialProvider b() {
        return this.c;
    }

    public final Uid c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.a.equals(e0Var.a) && this.b.equals(e0Var.b) && jl40.l(this.c, e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Params(childUid=" + this.a + ", parentUid=" + this.b + ", credentialsProvider=" + this.c + ')';
    }
}
