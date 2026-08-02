package xsna;

import com.vk.im.engine.models.MsgRequestStatus;

/* compiled from: OnMsgRequestChangedEvent.kt */
/* loaded from: classes2.dex */
public final class j980 extends sxp {
    public final long b;
    public final MsgRequestStatus c;
    public final MsgRequestStatus d;

    public j980(long j, MsgRequestStatus msgRequestStatus, MsgRequestStatus msgRequestStatus2) {
        this.b = j;
        this.c = msgRequestStatus;
        this.d = msgRequestStatus2;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j980)) {
            return false;
        }
        j980 j980Var = (j980) obj;
        j980Var.getClass();
        return this.b == j980Var.b && this.c == j980Var.c && this.d == j980Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        return "OnMsgRequestChangedEvent(changerTag=null, dialogId=" + this.b + ", oldStatus=" + this.c + ", newStatus=" + this.d + ')';
    }
}
