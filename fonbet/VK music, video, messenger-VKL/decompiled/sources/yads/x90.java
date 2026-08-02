package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class x90 extends ba0 {
    public final String a;
    public final x80 b;
    public final q50 c;

    public x90(String str, String str2) {
        this(str, new x80(str2, 0, null, 0, 14));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return epx.f(this.a, x90Var.a) && epx.f(this.b, x90Var.b) && epx.f(this.c, x90Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        x80 x80Var = this.b;
        int hashCode2 = (hashCode + (x80Var == null ? 0 : x80Var.hashCode())) * 31;
        q50 q50Var = this.c;
        return hashCode2 + (q50Var != null ? q50Var.hashCode() : 0);
    }

    public final String toString() {
        return "KeyValue(title=" + this.a + ", subtitle=" + this.b + ", text=" + this.c + ")";
    }

    public /* synthetic */ x90(String str, x80 x80Var) {
        this(str, x80Var, null);
    }

    public x90(String str, x80 x80Var, q50 q50Var) {
        super(0);
        this.a = str;
        this.b = x80Var;
        this.c = q50Var;
    }
}
