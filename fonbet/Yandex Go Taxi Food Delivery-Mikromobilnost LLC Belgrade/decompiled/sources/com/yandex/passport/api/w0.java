package com.yandex.passport.api;

import defpackage.b64;

/* loaded from: classes15.dex */
public final class w0 implements x0 {
    public final String a;

    public w0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && this.a.equals(((w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Success(taskId="), this.a, ')');
    }
}
