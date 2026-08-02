package xsna;

import com.vk.dto.attaches.Attach;

/* compiled from: OnAttachUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class y080 extends sxp {
    public final Attach b;
    public final Object c;

    public y080(Attach attach, String str) {
        this.b = attach;
        this.c = str;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y080)) {
            return false;
        }
        y080 y080Var = (y080) obj;
        return epx.f(this.b, y080Var.b) && epx.f(this.c, y080Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Object obj = this.c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnAttachUpdateEvent(attach=");
        sb.append(this.b);
        sb.append(", changerTag=");
        return k73.c(sb, this.c, ')');
    }
}
