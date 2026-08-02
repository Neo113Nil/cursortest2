package xsna;

/* compiled from: BookingStartScreenDependencies.kt */
/* loaded from: classes18.dex */
public final class az7 {
    public final yy7 a;
    public final zq7 b;
    public final zu7 c;

    public az7(yy7 yy7Var, zq7 zq7Var, zu7 zu7Var) {
        this.a = yy7Var;
        this.b = zq7Var;
        this.c = zu7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az7)) {
            return false;
        }
        az7 az7Var = (az7) obj;
        return epx.f(this.a, az7Var.a) && epx.f(this.b, az7Var.b) && epx.f(this.c, az7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BookingStartScreenDependencies(settingsInteractor=" + this.a + ", mastersInteractor=" + this.b + ", recordInteractor=" + this.c + ')';
    }
}
