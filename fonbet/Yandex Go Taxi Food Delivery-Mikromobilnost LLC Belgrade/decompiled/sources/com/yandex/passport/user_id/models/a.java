package com.yandex.passport.user_id.models;

import com.yandex.passport.api.b3;

/* loaded from: classes2.dex */
public final class a implements d {
    public final b3 a;

    public a(b3 b3Var) {
        this.a = b3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a.equals(((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallHost(hostEvent=" + this.a + ')';
    }
}
