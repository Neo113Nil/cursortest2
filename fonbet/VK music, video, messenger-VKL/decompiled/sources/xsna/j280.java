package xsna;

import java.util.Collection;

/* compiled from: OnChannelMsgDeleteEvent.kt */
/* loaded from: classes2.dex */
public final class j280 extends sxp {
    public final Object b;
    public final long c;
    public final Collection<Integer> d;

    public j280(Object obj, long j, Collection<Integer> collection) {
        this.b = obj;
        this.c = j;
        this.d = collection;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j280)) {
            return false;
        }
        j280 j280Var = (j280) obj;
        return epx.f(this.b, j280Var.b) && this.c == j280Var.c && epx.f(this.d, j280Var.d);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.d.hashCode() + bh10.a((obj == null ? 0 : obj.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnChannelMsgDeleteEvent(changerTag=");
        sb.append(this.b);
        sb.append(", channelId=");
        sb.append(this.c);
        sb.append(", cnvMsgIds=");
        return l4.h(sb, this.d, ')');
    }
}
