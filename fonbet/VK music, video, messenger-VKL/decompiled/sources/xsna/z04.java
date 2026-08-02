package xsna;

import com.vk.dto.attaches.Attach;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: AttachCancelPrefetchUploadCmd.kt */
/* loaded from: classes2.dex */
public final class z04 extends le6<s3q0> {
    public final Attach b;

    public z04(Attach attach) {
        this.b = attach;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        File i1;
        Attach attach = this.b;
        try {
            attach = l34.c(w2wVar, attach);
        } catch (FileNotFoundException unused) {
        }
        ftx0 ftx0Var = attach instanceof ftx0 ? (ftx0) attach : null;
        if (ftx0Var != null && (i1 = ftx0Var.i1()) != null) {
            w2wVar.O0().c(new com.vk.movika.sdk.base.hooks.p(i1, 8));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z04) && epx.f(this.b, ((z04) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "AttachCancelPrefetchUploadCmd(attach=" + this.b + ')';
    }
}
