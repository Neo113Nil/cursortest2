package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kcw {
    public final Calendar a;
    public final boolean b;

    public kcw(Calendar calendar, boolean z) {
        this.a = calendar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcw)) {
            return false;
        }
        kcw kcwVar = (kcw) obj;
        return jl40.l(this.a, kcwVar.a) && this.b == kcwVar.b;
    }

    public final int hashCode() {
        Calendar calendar = this.a;
        return Boolean.hashCode(this.b) + ((calendar == null ? 0 : calendar.hashCode()) * 31);
    }

    public final String toString() {
        return "IntercityDashboardDue(due=" + this.a + ", isOndemand=" + this.b + Extension.C_BRAKE;
    }
}
