package com.yandex.passport.internal.autologin;

import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class a extends c {
    public final ModernAccount c;

    public a(ModernAccount modernAccount) {
        super(modernAccount.getUid(), modernAccount.getPhoneNumber());
        this.c = modernAccount;
    }

    public final ModernAccount c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && jl40.l(this.c, ((a) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Account(modernAccount=" + this.c + ')';
    }
}
