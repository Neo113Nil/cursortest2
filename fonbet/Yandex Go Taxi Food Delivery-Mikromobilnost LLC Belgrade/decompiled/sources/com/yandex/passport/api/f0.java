package com.yandex.passport.api;

import com.yandex.passport.api.exception.PassportException;

/* loaded from: classes15.dex */
public final class f0 implements h0 {
    public final PassportException a;

    public f0(PassportException passportException) {
        this.a = passportException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.a.equals(((f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedWithException(throwable=" + this.a + ')';
    }
}
