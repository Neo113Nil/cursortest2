package defpackage;

import kotlinx.datetime.format.a;
import kotlinx.datetime.format.d;
import kotlinx.datetime.internal.format.b;

/* loaded from: classes9.dex */
public final class ksg extends b {
    public final d d;

    public ksg(d dVar) {
        super(a.b, dVar.a, "dayOfWeekName");
        this.d = dVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ksg) && this.d.a.equals(((ksg) obj).d.a);
    }

    public final int hashCode() {
        return this.d.a.hashCode();
    }
}
