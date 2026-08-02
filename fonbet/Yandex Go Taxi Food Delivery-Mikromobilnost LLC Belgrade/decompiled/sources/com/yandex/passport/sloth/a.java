package com.yandex.passport.sloth;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class a implements a1 {
    public final String a;

    public a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && jl40.l(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("DeviceUnbinded(deviceId="), this.a, ')');
    }
}
