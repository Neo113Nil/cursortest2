package xsna;

import com.vk.dto.attaches.AttachWithId;

/* compiled from: ReplaceMsgsAttachesCmd.kt */
/* loaded from: classes2.dex */
public final class z0g0 extends le6<s3q0> {
    public final AttachWithId b;

    public z0g0(AttachWithId attachWithId) {
        this.b = attachWithId;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.O0().a(new a1g0(this.b));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0g0) && epx.f(this.b, ((z0g0) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ReplaceMsgsAttachesCmd(attach=" + this.b + ')';
    }
}
