package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class w extends a0 {
    public final ModernAccount a;

    public w(ModernAccount modernAccount) {
        this.a = modernAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && jl40.l(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final ModernAccount m0() {
        return this.a;
    }

    public final String toString() {
        return "Account(account=" + this.a + ')';
    }
}
