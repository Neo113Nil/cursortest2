package xsna;

import android.net.Uri;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.DownloadState;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MsgGetAttachesUrisCmd.kt */
/* loaded from: classes2.dex */
public final class cj30 extends le6<s3q0> {
    public final int b;

    public cj30(int i) {
        this.b = i;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Msg L = w2wVar.I0().o().L(this.b);
        MsgFromUser msgFromUser = L instanceof MsgFromUser ? (MsgFromUser) L : null;
        if (msgFromUser != null) {
            ArrayList m9 = msgFromUser.m9(AttachWithDownload.class, true, false);
            ArrayList arrayList = new ArrayList();
            for (Object obj : m9) {
                AttachWithDownload attachWithDownload = (AttachWithDownload) obj;
                File i1 = attachWithDownload.i1();
                if (i1 != null && i1.exists() && attachWithDownload.T0() == DownloadState.DOWNLOADED) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File i12 = ((AttachWithDownload) it.next()).i1();
                Uri fromFile = i12 != null ? Uri.fromFile(i12) : null;
                if (fromFile != null) {
                    arrayList2.add(fromFile);
                }
            }
            w2wVar.S0().r(arrayList2);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cj30) && this.b == ((cj30) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.b(new StringBuilder("MsgGetAttachesUrisCmd(msgLocalId="), this.b, ')');
    }
}
