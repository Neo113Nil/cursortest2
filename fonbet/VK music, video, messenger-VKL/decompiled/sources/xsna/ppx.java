package xsna;

import com.vk.im.engine.models.attaches.AttachStory;

/* compiled from: InvalidateMsgsWithAttachesCmd.kt */
/* loaded from: classes2.dex */
public final class ppx extends le6<s3q0> {
    public final AttachStory b;

    public ppx(AttachStory attachStory) {
        this.b = attachStory;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.O0().a(new qpx(this.b.b.d, r1.c, j14.b(AttachStory.class)));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppx) && epx.f(this.b, ((ppx) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "InvalidateMsgsWithAttachesCmd(attach=" + this.b + ')';
    }
}
