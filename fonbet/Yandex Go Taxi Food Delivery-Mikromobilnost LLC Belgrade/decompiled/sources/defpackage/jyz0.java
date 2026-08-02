package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class jyz0 {
    public static final cyz0 Companion = new cyz0();
    public final String a;
    public final iyz0 b;

    public /* synthetic */ jyz0(int i, String str, iyz0 iyz0Var) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, byz0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = iyz0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyz0)) {
            return false;
        }
        jyz0 jyz0Var = (jyz0) obj;
        return jl40.l(this.a, jyz0Var.a) && jl40.l(this.b, jyz0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        iyz0 iyz0Var = this.b;
        return hashCode + (iyz0Var == null ? 0 : iyz0Var.hashCode());
    }

    public final String toString() {
        return "TopupScreenDto(actionScenario=" + this.a + ", widgetUrl=" + this.b + ')';
    }
}
