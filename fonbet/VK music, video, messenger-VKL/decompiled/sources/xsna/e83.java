package xsna;

/* compiled from: AppRedirectAdvice.kt */
/* loaded from: classes15.dex */
public final class e83 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public e83(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e83)) {
            return false;
        }
        e83 e83Var = (e83) obj;
        return this.a == e83Var.a && this.b == e83Var.b && this.c == e83Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppRedirectAdvice(canHandle=");
        sb.append(this.a);
        sb.append(", isPriorityHandler=");
        sb.append(this.b);
        sb.append(", isOverrideHandler=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
