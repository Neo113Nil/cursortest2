package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.MessagesType;

/* compiled from: AttachDownloadCmd.kt */
/* loaded from: classes2.dex */
public final class p14 extends xl6<s3q0> {
    public final Peer b;
    public final int c;
    public final int d;
    public final MessagesType e;

    public p14(Peer peer, int i, int i2, MessagesType messagesType) {
        this.b = peer;
        this.c = i;
        this.d = i2;
        this.e = messagesType;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-attach-download-local";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        MessagesType messagesType = this.e;
        l64 a = m64.a(w2wVar, messagesType);
        Attach b = a.b(this.d);
        if (b instanceof AttachWithDownload) {
            AttachWithDownload attachWithDownload = (AttachWithDownload) b;
            if (!attachWithDownload.Q8()) {
                DownloadState downloadState = DownloadState.DOWNLOADING;
                if (!e43.l(downloadState, DownloadState.DOWNLOADED).contains(attachWithDownload.T0())) {
                    a.c(attachWithDownload, downloadState, null);
                    w2wVar.S0().z(b, 0, 1000);
                    w2wVar.O0().a(new r14(this.b, this.c, attachWithDownload, messagesType));
                }
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p14)) {
            return false;
        }
        p14 p14Var = (p14) obj;
        return epx.f(this.b, p14Var.b) && this.c == p14Var.c && this.d == p14Var.d && this.e == p14Var.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, shy.a(this.c, Long.hashCode(this.b.b) * 31, 31), 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "AttachDownloadCmd(peer=" + this.b + ", msgLocalId=" + this.c + ", attachLocalId=" + this.d + ", messagesType=" + this.e + ')';
    }
}
