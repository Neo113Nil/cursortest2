package xsna;

import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MsgDownloadShareFilesExternalCmd.kt */
/* loaded from: classes2.dex */
public final class oi30 extends xl6<s3q0> {
    public final Peer b;
    public final int c;

    public oi30(int i, Peer peer) {
        this.b = peer;
        this.c = i;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-attach-download-local";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        d040 o = w2wVar.I0().o();
        int i = this.c;
        Msg L = o.L(i);
        MsgFromUser msgFromUser = L instanceof MsgFromUser ? (MsgFromUser) L : null;
        if (msgFromUser != null) {
            ArrayList arrayList = new ArrayList();
            a.C1125a.f(msgFromUser, new tcu(11), new ni30(arrayList, 0));
            g5g.D(arrayList, true, new byo(10));
            if (!arrayList.isEmpty()) {
                o.o(msgFromUser);
            }
            if (arrayList.isEmpty()) {
                w2wVar.J0(this, new cj30(i));
            } else {
                w2wVar.S0().b(i, arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AttachWithDownload attachWithDownload = (AttachWithDownload) it.next();
                    w2wVar.S0().O(attachWithDownload);
                    w2wVar.S0().z(attachWithDownload, 0, 1000);
                    w2wVar.O0().a(new r14(this.b, msgFromUser.b, attachWithDownload));
                }
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi30)) {
            return false;
        }
        oi30 oi30Var = (oi30) obj;
        return epx.f(this.b, oi30Var.b) && this.c == oi30Var.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgDownloadShareFilesExternalCmd(peer=");
        sb.append(this.b);
        sb.append(", msgLocalId=");
        return vu5.b(sb, this.c, ')');
    }
}
