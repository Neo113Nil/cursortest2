package xsna;

import java.util.Map;

/* compiled from: ApiResponseRule.kt */
/* loaded from: classes2.dex */
public final class c03 {
    public final String a;
    public final Map<String, String> b;
    public final a03 c;

    public c03(String str, Map<String, String> map, a03 a03Var) {
        this.a = str;
        this.b = map;
        this.c = a03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c03)) {
            return false;
        }
        c03 c03Var = (c03) obj;
        return epx.f(this.a, c03Var.a) && epx.f(this.b, c03Var.b) && epx.f(this.c, c03Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v11.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ApiResponseRule(urlPart=" + this.a + ", params=" + this.b + ", response=" + this.c + ')';
    }
}
