package com.yandex.passport.internal.usecase.ui;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class a0 {
    public final com.yandex.passport.internal.b a;
    public final com.yandex.passport.internal.account.d b;

    public a0(com.yandex.passport.internal.b bVar, com.yandex.passport.internal.account.d dVar) {
        this.a = bVar;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return jl40.l(this.a, a0Var.a) && this.b == a0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(accountsSnapshot=" + this.a + ", relevantAccounts=" + this.b + ')';
    }
}
