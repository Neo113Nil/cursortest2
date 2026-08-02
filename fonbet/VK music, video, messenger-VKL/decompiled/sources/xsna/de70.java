package xsna;

/* compiled from: NotificationMenuOption.kt */
/* loaded from: classes4.dex */
public final class de70 {
    public final tlo0 a;
    public final int b;
    public final boolean c;
    public final snv d;

    public de70(tlo0 tlo0Var, int i, boolean z, snv snvVar) {
        this.a = tlo0Var;
        this.b = i;
        this.c = z;
        this.d = snvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de70)) {
            return false;
        }
        de70 de70Var = (de70) obj;
        return epx.f(this.a, de70Var.a) && this.b == de70Var.b && this.c == de70Var.c && epx.f(this.d, de70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "NotificationMenuOption(title=" + this.a + ", icon=" + this.b + ", iconNegative=" + this.c + ", action=" + this.d + ')';
    }
}
