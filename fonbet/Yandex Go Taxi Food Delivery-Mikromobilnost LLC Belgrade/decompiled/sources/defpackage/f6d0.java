package defpackage;

import java.util.Map;

/* loaded from: classes8.dex */
public final class f6d0 {
    public final String a;
    public final String b;
    public final Map c;

    public f6d0(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6d0)) {
            return false;
        }
        f6d0 f6d0Var = (f6d0) obj;
        return jl40.l(this.a, f6d0Var.a) && this.b.equals(f6d0Var.b) && this.c.equals(f6d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Meta(requestMethod=" + this.a + ",requestUrl=" + this.b + ",requestHeadersCount=" + this.c.size() + ')';
    }
}
