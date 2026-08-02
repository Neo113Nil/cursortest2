package xsna;

import com.vk.dto.common.Source;

/* compiled from: ContactsInvalidateCmd.kt */
/* loaded from: classes2.dex */
public final class jbj extends le6<s3q0> {
    public final Object b;

    public jbj(ibj ibjVar) {
        this.b = ibjVar;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.J0(this, new com.vk.im.engine.commands.contacts.a(Source.NETWORK, this.b, 8));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return jbj.class.equals(obj != null ? obj.getClass() : null) && System.identityHashCode(this) == obj.hashCode();
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ContactsInvalidateCmd()";
    }
}
