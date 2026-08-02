package defpackage;

import java.util.Calendar;

/* loaded from: classes5.dex */
public final class mxm extends py91 {
    public final Calendar a;

    public mxm(Calendar calendar) {
        this.a = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxm) && this.a.equals(((mxm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
