package xsna;

import xsna.hx7;

/* compiled from: BookingServicesScreenDependencies.kt */
/* loaded from: classes18.dex */
public final class mx7 {
    public final hx7.a a;
    public final dmv b;
    public final yy7 c;

    public mx7(hx7.a aVar, dmv dmvVar, yy7 yy7Var) {
        this.a = aVar;
        this.b = dmvVar;
        this.c = yy7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx7)) {
            return false;
        }
        mx7 mx7Var = (mx7) obj;
        return epx.f(this.a, mx7Var.a) && epx.f(this.b, mx7Var.b) && epx.f(this.c, mx7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BookingServicesScreenDependencies(screenSettings=" + this.a + ", servicesInteractor=" + this.b + ", settingsInteractor=" + this.c + ')';
    }
}
