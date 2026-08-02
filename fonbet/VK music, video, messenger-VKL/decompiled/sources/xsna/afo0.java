package xsna;

/* compiled from: TextElementConfig.kt */
/* loaded from: classes4.dex */
public final class afo0 {
    public final jio0 a;
    public final lw5 b;

    public afo0(jio0 jio0Var, lw5 lw5Var) {
        this.a = jio0Var;
        this.b = lw5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afo0)) {
            return false;
        }
        afo0 afo0Var = (afo0) obj;
        return epx.f(this.a, afo0Var.a) && epx.f(this.b, afo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextElementConfig(textInfo=" + this.a + ", backgroundInfo=" + this.b + ")";
    }
}
