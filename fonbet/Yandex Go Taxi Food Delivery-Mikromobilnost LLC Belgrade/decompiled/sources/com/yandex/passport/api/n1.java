package com.yandex.passport.api;

import com.yandex.passport.api.exception.PassportException;

/* loaded from: classes15.dex */
public final class n1 implements o1 {
    public final PassportException a;

    public n1(PassportException passportException) {
        this.a = passportException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1) && this.a.equals(((n1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedWithException(throwable=" + this.a + ')';
    }
}
