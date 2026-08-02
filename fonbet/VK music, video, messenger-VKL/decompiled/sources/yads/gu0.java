package yads;

import xsna.epx;
import xsna.ss9;

/* loaded from: classes10.dex */
public final class gu0 {
    public final String a;
    public final String b;

    public gu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu0)) {
            return false;
        }
        gu0 gu0Var = (gu0) obj;
        return epx.f(this.a, gu0Var.a) && epx.f(this.b, gu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("Item(title=", this.a, ", url=", this.b, ")");
    }
}
