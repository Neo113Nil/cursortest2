package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class s {
    public final ModernAccount a;

    public s(ModernAccount modernAccount) {
        this.a = modernAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && jl40.l(this.a, ((s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Params(account=" + this.a + ')';
    }
}
