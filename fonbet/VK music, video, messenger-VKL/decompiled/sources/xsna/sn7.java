package xsna;

/* compiled from: BookingCalendarScreenViewState.kt */
/* loaded from: classes18.dex */
public final class sn7 {
    public final String a;
    public final boolean b;

    public sn7(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn7)) {
            return false;
        }
        sn7 sn7Var = (sn7) obj;
        return epx.f(this.a, sn7Var.a) && this.b == sn7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasterFilter(masterName=");
        sb.append(this.a);
        sb.append(", filterEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
