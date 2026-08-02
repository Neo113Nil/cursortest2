package com.yandex.passport.common.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qv10;

@gsq0(with = q.class)
/* loaded from: classes8.dex */
public final class i<T> extends j {
    public static final h Companion = new h();
    public final Object a;

    public i(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && jl40.l(this.a, ((i) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("Ok(response="), this.a, ')');
    }
}
