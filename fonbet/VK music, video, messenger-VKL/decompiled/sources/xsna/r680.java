package xsna;

import java.util.Collection;

/* compiled from: OnImItemUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class r680 extends sxp {
    public final Object b;
    public final Collection<b5w> c;

    public r680(Object obj, Collection<b5w> collection) {
        this.b = obj;
        this.c = collection;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r680)) {
            return false;
        }
        r680 r680Var = (r680) obj;
        return epx.f(this.b, r680Var.b) && epx.f(this.c, r680Var.c);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnImItemUpdateEvent(changerTag=");
        sb.append(this.b);
        sb.append(", ids=");
        return l4.h(sb, this.c, ')');
    }
}
