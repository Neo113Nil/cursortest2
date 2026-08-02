package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class m implements n0 {
    public final ModernAccount a;

    public m(ModernAccount modernAccount) {
        this.a = modernAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && jl40.l(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeleteAccount(accountToDelete=" + this.a + ')';
    }
}
