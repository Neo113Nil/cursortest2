package defpackage;

/* loaded from: classes2.dex */
public final class psc0 {
    public final String a;
    public final irc0 b;

    public psc0(String str, irc0 irc0Var) {
        this.a = str;
        this.b = irc0Var;
    }

    public final irc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psc0)) {
            return false;
        }
        psc0 psc0Var = (psc0) obj;
        return this.a.equals(psc0Var.a) && this.b.equals(psc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SwitchWidget(__typename=" + this.a + ", plaqueSwitchWidget=" + this.b + ')';
    }
}
