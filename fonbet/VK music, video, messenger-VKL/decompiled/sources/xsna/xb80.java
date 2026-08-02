package xsna;

import java.util.List;

/* compiled from: OnStencilsUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class xb80 extends sxp {
    public final List<j0l0> b;

    public xb80(List<j0l0> list) {
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
        return (obj instanceof xb80) && epx.f(this.b, ((xb80) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("OnStencilsUpdateEvent(list="), this.b);
    }
}
