package com.yandex.passport.user_id.models;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class i implements k {
    public final String a;

    public i(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && jl40.l(this.a, ((i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ProcessBridge(command="), this.a, ')');
    }
}
