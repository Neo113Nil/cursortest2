package xsna;

import xsna.iw7;

/* compiled from: BookingRecordsScreenViewState.kt */
/* loaded from: classes18.dex */
public final class kw7 implements fm50<iw7.a> {
    public final yzt0<iw7.a> a;

    public kw7(h0u0 h0u0Var) {
        this.a = h0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kw7) && epx.f(this.a, ((kw7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr.c(new StringBuilder("Error(error="), this.a, ')');
    }
}
