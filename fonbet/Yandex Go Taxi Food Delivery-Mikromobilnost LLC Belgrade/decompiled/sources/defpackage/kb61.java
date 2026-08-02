package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class kb61 {
    public final int a;
    public final int b;

    public kb61(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final Calendar a(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, this.a);
        calendar.set(2, this.b);
        calendar.set(5, i);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public final Calendar b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, this.a);
        calendar.set(2, this.b);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb61)) {
            return false;
        }
        kb61 kb61Var = (kb61) obj;
        return this.a == kb61Var.a && this.b == kb61Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "YearMonth(year=", ", index=", Extension.C_BRAKE);
    }
}
