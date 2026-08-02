package com.yandex.passport.user_id.models;

import defpackage.b64;

/* loaded from: classes2.dex */
public final class b implements d {
    public final String a;

    public b(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("EvaluateJs(script="), this.a, ')');
    }
}
