package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ChannelAttachCancelUploadCmd.kt */
/* loaded from: classes2.dex */
public final class iua extends le6<s3q0> {
    public final Attach b;
    public final boolean c;

    public iua(Attach attach, boolean z) {
        this.b = attach;
        this.c = z;
        if (attach.xb() > 0) {
            return;
        }
        throw new IllegalArgumentException("Illegal attachLocalId value: " + attach + ".localId");
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Object obj;
        r3b e = this.c ? w2wVar.I0().e() : w2wVar.I0().y();
        Attach attach = this.b;
        List<Msg> b = e.b.b(Collections.singletonList(Integer.valueOf(attach.xb())));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : b) {
            if (obj2 instanceof MsgFromChannel) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g5g.y(((MsgFromChannel) it.next()).E, arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((Attach) obj).xb() == attach.xb()) {
                break;
            }
        }
        Attach attach2 = (Attach) obj;
        if (attach2 != null && !attach2.Ya()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                MsgFromChannel msgFromChannel = (MsgFromChannel) it3.next();
                w2wVar.O0().i(qjg.a(attach2).concat(" cancel upload"), new qso(msgFromChannel.b, 1));
                d6b.a.a(w2wVar, msgFromChannel.b, MsgSyncState.ERROR, AttachSyncState.REJECTED, "ChannelAttachCancelUploadCmd");
            }
            w2wVar.L0(this, new z04(attach2));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iua) && this.b.xb() == ((iua) obj).b.xb();
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.b.xb());
    }

    @Override // xsna.e1w
    public final String toString() {
        return "AttachCancelUploadCmd(attachLocalId=" + this.b.xb() + ')';
    }
}
