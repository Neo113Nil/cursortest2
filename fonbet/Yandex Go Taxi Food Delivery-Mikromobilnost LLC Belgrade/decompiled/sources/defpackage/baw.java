package defpackage;

import java.util.Calendar;

/* loaded from: classes14.dex */
public final class baw extends faw {
    public final Calendar a;

    public baw(Calendar calendar) {
        this.a = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof baw) && this.a.equals(((baw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
