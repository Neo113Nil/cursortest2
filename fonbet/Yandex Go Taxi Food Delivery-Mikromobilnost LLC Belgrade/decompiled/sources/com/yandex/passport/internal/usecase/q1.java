package com.yandex.passport.internal.usecase;

import android.accounts.Account;
import com.yandex.passport.common.core.Environment;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class q1 {
    public final Account a;
    public final Environment b;

    public q1(Account account, Environment environment) {
        this.a = account;
        this.b = environment;
    }

    public final Account a() {
        return this.a;
    }

    public final Environment b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return jl40.l(this.a, q1Var.a) && this.b == q1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(account=" + this.a + ", environment=" + this.b + ')';
    }
}
