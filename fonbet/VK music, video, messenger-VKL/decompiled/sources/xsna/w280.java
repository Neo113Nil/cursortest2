package xsna;

import java.util.Collection;

/* compiled from: OnChannelsMsgsInvalidateEvent.kt */
/* loaded from: classes2.dex */
public final class w280 extends sxp {
    public final Object b;
    public final Collection<Long> c;

    public w280(Object obj, Collection<Long> collection) {
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
        if (!(obj instanceof w280)) {
            return false;
        }
        w280 w280Var = (w280) obj;
        return epx.f(this.b, w280Var.b) && epx.f(this.c, w280Var.c);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnChannelsMsgsInvalidateEvent(changerTag=");
        sb.append(this.b);
        sb.append(", channelIds=");
        return l4.h(sb, this.c, ')');
    }
}
