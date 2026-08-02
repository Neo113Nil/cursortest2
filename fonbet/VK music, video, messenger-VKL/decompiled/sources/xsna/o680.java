package xsna;

import java.util.List;

/* compiled from: OnHintsUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class o680 extends sxp {
    public final List<qtd0> b;

    public o680(List list) {
        this.b = list;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o680) && epx.f(this.b, ((o680) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final String toString() {
        return vp.b(", changerTag=null)", new StringBuilder("OnHintsUpdateEvent(hints="), this.b);
    }
}
