package xsna;

import java.util.Map;

/* loaded from: classes11.dex */
public final class jl20 {
    public final String a;
    public final Map<String, String> b;
    public final long c;

    public jl20(String str, Map<String, String> map) {
        this(str, System.currentTimeMillis(), map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl20)) {
            return false;
        }
        jl20 jl20Var = (jl20) obj;
        return epx.f(this.a, jl20Var.a) && epx.f(this.b, jl20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public jl20(String str, long j, Map map) {
        this.a = str;
        this.b = map;
        this.c = j;
    }
}
