package com.yandex.passport.common.value;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes8.dex */
public final class a {
    public final String a;

    public /* synthetic */ a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return jl40.l(this.a, ((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.l(')', "DeviceId(value=", this.a);
    }
}
