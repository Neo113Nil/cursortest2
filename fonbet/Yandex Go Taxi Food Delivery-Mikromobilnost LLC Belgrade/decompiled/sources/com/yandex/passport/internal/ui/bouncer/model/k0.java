package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class k0 implements n0 {
    public final String a;

    public k0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && jl40.l(this.a, ((k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("StorePhoneNumber(number="), this.a, ')');
    }
}
