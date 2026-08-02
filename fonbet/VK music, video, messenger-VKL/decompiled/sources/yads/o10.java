package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class o10 {
    public final n10 a;
    public final String b;

    public o10(n10 n10Var, String str) {
        this.a = n10Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o10)) {
            return false;
        }
        o10 o10Var = (o10) obj;
        return this.a == o10Var.a && epx.f(this.b, o10Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CoreNativeCloseButton(type=" + this.a + ", text=" + this.b + ")";
    }
}
