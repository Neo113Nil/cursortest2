package com.yandex.passport.api;

import com.yandex.passport.api.exception.PassportException;

/* loaded from: classes2.dex */
public final class w2 implements b3 {
    public final PassportException a;

    public w2(PassportException passportException) {
        this.a = passportException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2) && this.a.equals(((w2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.a + ')';
    }
}
