package com.yandex.passport.internal.usecase;

import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class u extends com.yandex.passport.internal.ui.sloth.e {
    public final ModernAccount a;

    public u(ModernAccount modernAccount) {
        this.a = modernAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && jl40.l(this.a, ((u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final ModernAccount s() {
        return this.a;
    }

    public final String toString() {
        return "Account(account=" + this.a + ')';
    }
}
