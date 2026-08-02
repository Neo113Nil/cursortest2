package xsna;

import java.util.Collection;

/* compiled from: OnChannelMsgAddEvent.kt */
/* loaded from: classes2.dex */
public final class i280 extends sxp {
    public final Object b;
    public final long c;
    public final Collection<Integer> d;

    public i280(Object obj, long j, Collection<Integer> collection) {
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
        if (!(obj instanceof i280)) {
            return false;
        }
        i280 i280Var = (i280) obj;
        return epx.f(this.b, i280Var.b) && this.c == i280Var.c && epx.f(this.d, i280Var.d);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.d.hashCode() + bh10.a((obj == null ? 0 : obj.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnChannelMsgAddEvent(changerTag=");
        sb.append(this.b);
        sb.append(", channelId=");
        sb.append(this.c);
        sb.append(", msgLocalIds=");
        return l4.h(sb, this.d, ')');
    }
}
