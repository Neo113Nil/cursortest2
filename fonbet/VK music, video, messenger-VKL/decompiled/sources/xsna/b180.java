package xsna;

import com.vk.dto.attaches.Attach;

/* compiled from: OnAttachUploadEvent.kt */
/* loaded from: classes2.dex */
public abstract class b180 extends sxp {
    public final Attach b;

    public b180(Attach attach) {
        this.b = attach;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return getClass().equals(obj != null ? obj.getClass() : null) && epx.f(this.b, ((b180) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "OnAttachUploadEvent(attachLocalId=" + this.b.xb() + ')';
    }
}
