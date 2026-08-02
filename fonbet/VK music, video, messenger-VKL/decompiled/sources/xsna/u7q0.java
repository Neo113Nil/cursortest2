package xsna;

import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/* compiled from: UpdateAudioMsgOpenTranscriptCmd.kt */
/* loaded from: classes2.dex */
public final class u7q0 extends le6<s3q0> {
    public final Msg b;

    public u7q0(Msg msg) {
        this.b = msg;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Object obj;
        AttachAudioMsg a7;
        if (!k9q0.p(w2wVar)) {
            MsgFromUser msgFromUser = (MsgFromUser) this.b;
            long j = msgFromUser.g;
            Collection U = w2wVar.I0().o().U(j - TimeUnit.HOURS.toMillis(1L), j, msgFromUser.c);
            if (!U.isEmpty()) {
                ArrayList E = g5g.E(U, MsgFromUser.class);
                ListIterator listIterator = E.listIterator(E.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((MsgFromUser) obj).i) {
                        break;
                    }
                }
                MsgFromUser msgFromUser2 = (MsgFromUser) obj;
                if (msgFromUser2 != null && (a7 = msgFromUser2.a7()) != null) {
                    AttachAudioMsg a72 = msgFromUser.a7();
                    if (a72 == null) {
                        throw new IllegalArgumentException(("Passed msg doesn't contain audio attachment: " + msgFromUser).toString());
                    }
                    if (a7.o && !a72.o) {
                        w2wVar.e1(this, new v980(msgFromUser));
                    }
                }
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7q0) && epx.f(this.b, ((u7q0) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "UpdateAudioMsgOpenTranscriptCmd(msg=" + this.b + ')';
    }
}
