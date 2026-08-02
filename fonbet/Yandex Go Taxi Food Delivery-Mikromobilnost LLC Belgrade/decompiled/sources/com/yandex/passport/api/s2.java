package com.yandex.passport.api;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class s2 implements t2 {
    public final String a;

    public s2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2) && jl40.l(this.a, ((s2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("SendAdditionalData(data="), this.a, ')');
    }
}
