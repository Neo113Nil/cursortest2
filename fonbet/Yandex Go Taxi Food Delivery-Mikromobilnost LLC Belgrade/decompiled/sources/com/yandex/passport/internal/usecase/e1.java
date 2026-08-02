package com.yandex.passport.internal.usecase;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class e1 extends com.yandex.passport.internal.ui.sloth.e {
    public final String a;

    public e1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && jl40.l(this.a, ((e1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String s() {
        return this.a;
    }

    public final String toString() {
        return b64.p(new StringBuilder("ByKnownClientId(clientId="), this.a, ')');
    }
}
