package com.yandex.passport.user_id.models;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class c implements d {
    public final String a;

    public c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && jl40.l(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("LoadUrl(url="), this.a, ')');
    }
}
