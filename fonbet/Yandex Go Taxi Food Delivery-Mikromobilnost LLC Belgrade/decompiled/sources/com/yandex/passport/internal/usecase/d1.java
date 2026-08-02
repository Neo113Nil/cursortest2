package com.yandex.passport.internal.usecase;

import android.accounts.Account;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class d1 extends com.yandex.passport.internal.ui.sloth.e {
    public final Account a;

    public d1(Account account) {
        this.a = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && jl40.l(this.a, ((d1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Account s() {
        return this.a;
    }

    public final String toString() {
        return "ByAccount(account=" + this.a + ')';
    }
}
