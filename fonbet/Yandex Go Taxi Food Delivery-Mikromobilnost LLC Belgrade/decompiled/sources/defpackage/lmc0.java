package defpackage;

/* loaded from: classes2.dex */
public final class lmc0 implements nmc0 {
    public final String a;
    public final boolean b;

    public lmc0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmc0)) {
            return false;
        }
        lmc0 lmc0Var = (lmc0) obj;
        return jl40.l(this.a, lmc0Var.a) && this.b == lmc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleSwitch(widgetId=");
        sb.append(this.a);
        sb.append(", turnOn=");
        return unr0.u(sb, this.b, ')');
    }
}
