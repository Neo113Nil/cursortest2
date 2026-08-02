package xsna;

/* compiled from: StorefrontViewState.kt */
/* loaded from: classes18.dex */
public final class sll0 {
    public final boolean a;
    public final ja9 b;
    public final boolean c;
    public final boolean d;

    public sll0() {
        this(false, null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sll0)) {
            return false;
        }
        sll0 sll0Var = (sll0) obj;
        return this.a == sll0Var.a && epx.f(this.b, sll0Var.b) && this.c == sll0Var.c && this.d == sll0Var.d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        ja9 ja9Var = this.b;
        return Boolean.hashCode(this.d) + qoy.b((hashCode + (ja9Var == null ? 0 : ja9Var.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorefrontCtaState(canMessage=");
        sb.append(this.a);
        sb.append(", callToAction=");
        sb.append(this.b);
        sb.append(", isMember=");
        sb.append(this.c);
        sb.append(", bookingEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public sll0(boolean z, ja9 ja9Var, boolean z2, boolean z3) {
        this.a = z;
        this.b = ja9Var;
        this.c = z2;
        this.d = z3;
    }
}
