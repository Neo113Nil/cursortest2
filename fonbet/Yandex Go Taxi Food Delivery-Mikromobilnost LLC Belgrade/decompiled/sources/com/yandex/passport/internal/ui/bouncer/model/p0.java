package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class p0 implements a1 {
    public final String a;

    public p0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && jl40.l(this.a, ((p0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("CreateNewProfile(registrationUrl="), this.a, ')');
    }
}
