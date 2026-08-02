package xsna;

import java.util.List;

/* compiled from: OnChannelUnarchivedEvent.kt */
/* loaded from: classes2.dex */
public final class q280 extends sxp {
    public final List<Long> b;

    public q280() {
        throw null;
    }

    public q280(List list) {
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
        return (obj instanceof q280) && epx.f(this.b, ((q280) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final String toString() {
        return vp.b(", changerTag=null)", new StringBuilder("OnChannelUnarchivedEvent(channelsIds="), this.b);
    }
}
