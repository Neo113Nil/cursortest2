package com.yandex.passport.internal.ui.social;

import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class o extends s {
    public final ModernAccount a;

    public o(ModernAccount modernAccount) {
        this.a = modernAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && jl40.l(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccountData(account=" + this.a + ')';
    }
}
