package xsna;

import com.vk.dto.attaches.Attach;

/* compiled from: OnAttachLoadDoneEvent.kt */
/* loaded from: classes2.dex */
public final class w080 extends sxp {
    public final Attach b;

    public w080(Attach attach) {
        this.b = attach;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return w080.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.b, ((b180) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OnAttachLoadDoneEvent(attachLocalId=" + this.b.xb() + ')';
    }
}
