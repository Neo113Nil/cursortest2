package defpackage;

/* loaded from: classes11.dex */
public final class alu0 extends vgb1 {
    public final String a;
    public final int b;

    public alu0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.vgb1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alu0)) {
            return false;
        }
        alu0 alu0Var = (alu0) obj;
        return jl40.l(this.a, alu0Var.a) && this.b == alu0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ColorStoredValue(name=" + this.a + ", value=" + ((Object) jdc.a(this.b)) + ')';
    }
}
