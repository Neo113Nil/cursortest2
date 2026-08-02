package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.commands.uploads.AttachUploadingEndpoint;
import java.io.FileNotFoundException;

/* compiled from: AttachPrefetchUploadCmd.kt */
/* loaded from: classes2.dex */
public final class e34 extends xl6<s3q0> {
    public final Attach b;
    public final Peer c;
    public final AttachUploadingEndpoint d;

    public e34(Attach attach, Peer peer, AttachUploadingEndpoint attachUploadingEndpoint) {
        this.b = attach;
        this.c = peer;
        this.d = attachUploadingEndpoint;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-attach-prefetch-upload";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        try {
            w2wVar.O0().d(new f34(l34.c(w2wVar, this.b), this.c, this.d));
        } catch (FileNotFoundException e) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            StringBuilder sb = new StringBuilder("Error while uploading ");
            sb.append(this.b);
            sb.append(", cause=[");
            mla mlaVar = this.a;
            if (mlaVar == null) {
                mlaVar = null;
            }
            sb.append(mlaVar);
            sb.append(']');
            bVar.a(new IllegalStateException(sb.toString(), e));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e34)) {
            return false;
        }
        e34 e34Var = (e34) obj;
        return epx.f(this.b, e34Var.b) && epx.f(this.c, e34Var.c) && this.d == e34Var.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + bh10.a(this.b.hashCode() * 31, 31, this.c.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "AttachPrefetchUploadCmd(attach=" + this.b + ", peer=" + this.c + ", endpoint=" + this.d + ')';
    }
}
