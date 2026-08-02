package defpackage;

import java.util.Calendar;

/* loaded from: classes12.dex */
public final class pzm extends hz91 {
    public final Calendar c;

    public pzm(Calendar calendar) {
        this.c = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzm) && this.c.equals(((pzm) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
