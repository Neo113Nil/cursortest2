package xsna;

import com.vk.dto.attaches.Attach;

/* compiled from: OnAttachUploadProgressEvent.kt */
/* loaded from: classes2.dex */
public final class d180 extends b180 {
    public final int c;
    public final int d;

    public d180(Attach attach, int i, int i2) {
        super(attach);
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.b180
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d180.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        d180 d180Var = (d180) obj;
        return this.c == d180Var.c && this.d == d180Var.d;
    }

    @Override // xsna.b180
    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + this.d;
    }

    @Override // xsna.b180
    public final String toString() {
        StringBuilder sb = new StringBuilder("OnAttachUploadProgressEvent(attachLocalId=");
        sb.append(this.b.xb());
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", max=");
        return vu5.b(sb, this.d, ')');
    }
}
