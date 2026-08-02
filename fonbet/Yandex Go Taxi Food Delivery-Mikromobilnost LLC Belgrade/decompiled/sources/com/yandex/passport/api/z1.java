package com.yandex.passport.api;

import com.yandex.passport.api.exception.PassportException;

/* loaded from: classes15.dex */
public final class z1 implements b2 {
    public final PassportException a;

    public z1(PassportException passportException) {
        this.a = passportException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1) && this.a.equals(((z1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedWithException(throwable=" + this.a + ')';
    }
}
