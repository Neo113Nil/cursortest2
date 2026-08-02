package xsna;

import java.util.Collection;

/* compiled from: OnMsgDeleteEvent.kt */
/* loaded from: classes2.dex */
public final class f980 extends q490 {
    public final Object c;
    public final long d;
    public final Collection<Integer> e;

    public f980(Object obj, long j, Collection<Integer> collection) {
        this.c = obj;
        this.d = j;
        this.e = collection;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f980)) {
            return false;
        }
        f980 f980Var = (f980) obj;
        return epx.f(this.c, f980Var.c) && this.d == f980Var.d && epx.f(this.e, f980Var.e);
    }

    public final int hashCode() {
        Object obj = this.c;
        return this.e.hashCode() + bh10.a((obj == null ? 0 : obj.hashCode()) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMsgDeleteEvent(changerTag=");
        sb.append(this.c);
        sb.append(", dialogId=");
        sb.append(this.d);
        sb.append(", msgCnvIds=");
        return l4.h(sb, this.e, ')');
    }
}
