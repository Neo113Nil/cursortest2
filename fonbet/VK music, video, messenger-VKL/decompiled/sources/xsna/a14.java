package xsna;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.reporters.CancelReason;
import com.vk.im.engine.reporters.performance.events.LogType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: AttachCancelUploadCmd.kt */
/* loaded from: classes2.dex */
public final class a14 extends le6<s3q0> {
    public final Attach b;

    public a14(Attach attach) {
        this.b = attach;
        if (attach.xb() > 0) {
            return;
        }
        throw new IllegalArgumentException("Illegal attachLocalId value: " + attach + ".localId");
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Attach attach;
        ArrayList arrayList;
        Object obj;
        d040 o = w2wVar.I0().o();
        Attach attach2 = this.b;
        Msg v = o.v(attach2.xb());
        MsgFromUser msgFromUser = v instanceof MsgFromUser ? (MsgFromUser) v : null;
        if (msgFromUser == null || (arrayList = msgFromUser.H) == null) {
            attach = null;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Attach) obj).xb() == attach2.xb()) {
                    break;
                }
            }
            attach = (Attach) obj;
        }
        if (msgFromUser != null && attach != null && !msgFromUser.Nb() && !attach.Ya()) {
            w2wVar.K().d().i(Collections.singletonList(msgFromUser), CancelReason.ATTACH_CANCEL);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            LogType logType = LogType.IM_CANCEL_MSG_SEND;
            Boolean bool = Boolean.TRUE;
            new r3w0(logType, null, "start", null, null, null, bool, null, null, null, null, 16314).q();
            w2wVar.O0().i(qjg.a(attach).concat(" cancel upload"), new qso(msgFromUser.b, 1));
            new r3w0(logType, null, TtmlNode.END, null, null, null, bool, Integer.valueOf((int) (SystemClock.elapsedRealtime() - elapsedRealtime)), null, null, null, 16186).q();
            w2wVar.L0(this, new z04(attach));
            fz30.a(w2wVar, msgFromUser.b, MsgSyncState.ERROR, AttachSyncState.REJECTED);
            w2wVar.e1(this, new z080(attach));
            w2wVar.e1(this, new p980((Object) null, msgFromUser.c, msgFromUser.b));
            w2wVar.S0().v(msgFromUser.c, null);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a14) && this.b.xb() == ((a14) obj).b.xb();
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
