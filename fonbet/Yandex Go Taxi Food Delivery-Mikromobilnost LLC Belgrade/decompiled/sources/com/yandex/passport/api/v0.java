package com.yandex.passport.api;

import com.yandex.passport.api.exception.PassportException;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class v0 implements x0 {
    public final PassportException a;

    public v0(PassportException passportException) {
        this.a = passportException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && jl40.l(this.a, ((v0) obj).a);
    }

    public final int hashCode() {
        PassportException passportException = this.a;
        if (passportException == null) {
            return 0;
        }
        return passportException.hashCode();
    }

    public final String toString() {
        return "Failure(passportException=" + this.a + ')';
    }
}
