package xsna;

import java.util.Date;
import xsna.fmc0;

/* compiled from: PostingSideEffect.kt */
/* loaded from: classes4.dex */
public final class mmc0 implements fmc0.j {
    public final Date a;

    public mmc0(Date date) {
        this.a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmc0) && epx.f(this.a, ((mmc0) obj).a);
    }

    public final int hashCode() {
        Date date = this.a;
        if (date == null) {
            return 0;
        }
        return date.hashCode();
    }

    public final String toString() {
        return "OpenPostponeDatePicker(currentDate=" + this.a + ')';
    }
}
