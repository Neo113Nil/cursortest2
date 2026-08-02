package xsna;

import xsna.uuf;

/* compiled from: ClipsWrapperTooltipsMviState.kt */
/* loaded from: classes17.dex */
public final class kuf implements km50, uuf.k {
    public final iuf b;

    public kuf() {
        this(null);
    }

    @Override // xsna.uuf.k
    public final iuf a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kuf) && epx.f(this.b, ((kuf) obj).b);
    }

    public final int hashCode() {
        iuf iufVar = this.b;
        if (iufVar == null) {
            return 0;
        }
        return iufVar.hashCode();
    }

    public final String toString() {
        return "ClipsWrapperTooltipsMviState(tooltip=" + this.b + ')';
    }

    public kuf(iuf iufVar) {
        this.b = iufVar;
    }
}
