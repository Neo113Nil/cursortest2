package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lvm implements a4w {
    public final Calendar a;

    public lvm(Calendar calendar) {
        this.a = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvm) && jl40.l(this.a, ((lvm) obj).a);
    }

    public final int hashCode() {
        Calendar calendar = this.a;
        if (calendar == null) {
            return 0;
        }
        return calendar.hashCode();
    }

    public final String toString() {
        return "SelectTimeSlot(timeSlot=" + this.a + Extension.C_BRAKE;
    }

    public lvm() {
        this(null);
    }
}
