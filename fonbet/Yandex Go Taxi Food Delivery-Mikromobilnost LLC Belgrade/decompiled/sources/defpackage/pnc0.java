package defpackage;

/* loaded from: classes2.dex */
public final class pnc0 {
    public final String a;
    public final woc0 b;

    public pnc0(String str, woc0 woc0Var) {
        this.a = str;
        this.b = woc0Var;
    }

    public final woc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnc0)) {
            return false;
        }
        pnc0 pnc0Var = (pnc0) obj;
        return this.a.equals(pnc0Var.a) && this.b.equals(pnc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StartPoint(__typename=" + this.a + ", plaquePoint=" + this.b + ')';
    }
}
