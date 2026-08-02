package xsna;

import java.util.Collection;

/* compiled from: OnDialogsCountUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class t480 extends sxp {
    public final Collection<adm> b;

    public t480(Collection collection) {
        this.b = collection;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t480)) {
            return false;
        }
        t480 t480Var = (t480) obj;
        t480Var.getClass();
        return epx.f(this.b, t480Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return l4.h(new StringBuilder("OnDialogsCountUpdateEvent(changerTag=null, updates="), this.b, ')');
    }
}
