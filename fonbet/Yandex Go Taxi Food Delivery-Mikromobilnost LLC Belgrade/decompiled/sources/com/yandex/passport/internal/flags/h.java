package com.yandex.passport.internal.flags;

import defpackage.jl40;
import defpackage.qv10;

/* loaded from: classes15.dex */
public final class h {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return jl40.l(this.a, hVar.a) && jl40.l(this.b, hVar.b) && jl40.l(this.c, hVar.c) && jl40.l(this.d, hVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.d;
        return hashCode3 + (obj4 != null ? obj4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllValues(sessionValue=");
        sb.append(this.a);
        sb.append(", overrideValue=");
        sb.append(this.b);
        sb.append(", networkCacheValue=");
        sb.append(this.c);
        sb.append(", defaultValue=");
        return qv10.r(sb, this.d, ')');
    }
}
