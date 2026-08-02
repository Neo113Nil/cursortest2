package defpackage;

import java.util.Calendar;

/* loaded from: classes14.dex */
public final class lfw {
    public final Calendar a;

    public lfw(Calendar calendar) {
        this.a = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfw) && this.a.equals(((lfw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
