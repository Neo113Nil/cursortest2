package yads;

import xsna.efz;
import xsna.epx;

/* loaded from: classes10.dex */
public final class kj2 implements zp0 {
    public final Object a;
    public final Object b;
    public final long c;

    public kj2(oy0 oy0Var, Object obj, long j) {
        this.a = oy0Var;
        this.b = obj;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj2)) {
            return false;
        }
        kj2 kj2Var = (kj2) obj;
        return epx.f(this.a, kj2Var.a) && epx.f(this.b, kj2Var.b) && this.c == kj2Var.c;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return Long.hashCode(this.c) + ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Object obj = this.a;
        Object obj2 = this.b;
        long j = this.c;
        StringBuilder sb = new StringBuilder("CachedItem(params=");
        sb.append(obj);
        sb.append(", item=");
        sb.append(obj2);
        sb.append(", expiresAtTimestampMillis=");
        return efz.b(j, ")", sb);
    }
}
