package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.commands.uploads.AttachUploadingEndpoint;
import java.io.FileNotFoundException;

/* compiled from: ChannelAttachPrefetchUploadCmd.kt */
/* loaded from: classes2.dex */
public final class jua extends xl6<s3q0> {
    public final Attach b;
    public final long c;
    public final AttachUploadingEndpoint d;

    public jua(Attach attach, long j, AttachUploadingEndpoint attachUploadingEndpoint) {
        this.b = attach;
        this.c = j;
        this.d = attachUploadingEndpoint;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-attach-prefetch-upload";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [xsna.mla] */
    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Attach c;
        Long l;
        try {
            c = l34.c(w2wVar, this.b);
            bdb c2 = w2wVar.I0().a().c(this.c);
            l = c2 != null ? c2.w : null;
        } catch (FileNotFoundException e) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            StringBuilder sb = new StringBuilder("Error while uploading ");
            sb.append(this.b);
            sb.append(", cause=[");
            ?? r4 = this.a;
            sb.append(r4 != 0 ? r4 : null);
            sb.append(']');
            bVar.a(new IllegalStateException(sb.toString(), e));
        }
        if (l == null) {
            throw new IllegalStateException("Required value was null.");
        }
        x6x O0 = w2wVar.O0();
        long longValue = l.longValue();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        O0.d(new f34(c, Peer.a.b(longValue), this.d));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jua)) {
            return false;
        }
        jua juaVar = (jua) obj;
        return epx.f(this.b, juaVar.b) && this.c == juaVar.c && this.d == juaVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + bh10.a(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChannelAttachPrefetchUploadCmd(attach=" + this.b + ", channelId=" + this.c + ", endpoint=" + this.d + ')';
    }
}
