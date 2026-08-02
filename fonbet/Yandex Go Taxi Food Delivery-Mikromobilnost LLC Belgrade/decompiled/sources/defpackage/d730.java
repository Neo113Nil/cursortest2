package defpackage;

import kotlinx.datetime.format.e;
import kotlinx.datetime.format.i;
import kotlinx.datetime.internal.format.b;

/* loaded from: classes9.dex */
public final class d730 extends b {
    public final e d;

    public d730(e eVar) {
        super(i.b, eVar.a, "monthName");
        this.d = eVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d730) && this.d.a.equals(((d730) obj).d.a);
    }

    public final int hashCode() {
        return this.d.a.hashCode();
    }
}
