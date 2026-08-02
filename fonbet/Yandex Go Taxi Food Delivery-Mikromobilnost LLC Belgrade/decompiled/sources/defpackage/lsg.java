package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class lsg {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public lsg(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsg)) {
            return false;
        }
        lsg lsgVar = (lsg) obj;
        return this.a == lsgVar.a && this.b == lsgVar.b && this.c == lsgVar.c && this.d == lsgVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", isLastDayOfMonth=", Extension.C_BRAKE, qv10.u("DayPosition(isFirstDayOfWeek=", ", isLastDayOfWeek=", ", isFirstDayOfMonth=", this.a, this.b), this.c, this.d);
    }
}
