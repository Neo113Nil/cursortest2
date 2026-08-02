package xsna;

/* compiled from: ViewParamsFromParent.kt */
/* loaded from: classes7.dex */
public final class szt0 {
    public final int a;
    public final boolean b;

    public szt0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szt0)) {
            return false;
        }
        szt0 szt0Var = (szt0) obj;
        return this.a == szt0Var.a && this.b == szt0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewParamsFromParent(bottomInset=");
        sb.append(this.a);
        sb.append(", isVisible=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public szt0(int i) {
        this.a = i;
        this.b = true;
    }
}
