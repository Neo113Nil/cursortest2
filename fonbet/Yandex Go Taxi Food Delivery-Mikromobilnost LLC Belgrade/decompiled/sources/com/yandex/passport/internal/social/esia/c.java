package com.yandex.passport.internal.social.esia;

import defpackage.b64;

/* loaded from: classes15.dex */
public final class c {
    public final String a;

    public c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a.equals(((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("BindResult(taskId="), this.a, ')');
    }
}
