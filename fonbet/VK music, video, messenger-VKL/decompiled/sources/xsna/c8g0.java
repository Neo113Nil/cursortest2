package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.Collections;
import xsna.ge20;

/* compiled from: RequestMsgTranscriptionCmd.kt */
/* loaded from: classes2.dex */
public final class c8g0 extends le6<s3q0> {
    public final int b;
    public final int c;
    public final boolean d = true;

    public c8g0(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        d040 o = w2wVar.I0().o();
        int i = this.b;
        Msg L = o.L(i);
        MsgFromUser msgFromUser = L instanceof MsgFromUser ? (MsgFromUser) L : null;
        Attach Q7 = msgFromUser != null ? com.vk.im.engine.models.messages.a.Q7(msgFromUser, new uh40(this, 20), true) : null;
        AttachWithTranscription attachWithTranscription = Q7 instanceof AttachWithTranscription ? (AttachWithTranscription) Q7 : null;
        if (msgFromUser != null && !msgFromUser.H6() && attachWithTranscription != null) {
            long j = msgFromUser.c;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Msg msg = ((ge20.a) fo50.v(new ge20(Collections.singletonList(Integer.valueOf(msgFromUser.d)), MsgIdType.CNV_ID, this.d, w2wVar.c(), Peer.a.b(j), w2wVar.Q0()), w2wVar, "RequestMsgTranscriptionCmd.MessagesGetByIdApiCmd", 2)).a.get(Integer.valueOf(msgFromUser.d));
            MsgFromUser msgFromUser2 = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
            Attach Q72 = msgFromUser2 != null ? com.vk.im.engine.models.messages.a.Q7(msgFromUser2, new yka0(attachWithTranscription, 7), true) : null;
            AttachWithTranscription attachWithTranscription2 = Q72 instanceof AttachWithTranscription ? (AttachWithTranscription) Q72 : null;
            if (attachWithTranscription2 == null || !attachWithTranscription2.I5() || (attachWithTranscription2 instanceof AttachVideoMsg)) {
                boolean z = attachWithTranscription2 instanceof AttachAudioMsg;
                if (z) {
                    long j2 = msgFromUser.c;
                    gzs<s3q0> gzsVar = fkq0.a;
                    bz2.c(new x9f0(msgFromUser.d, new UserId(j2), attachWithTranscription.q(), attachWithTranscription.getId(), w2wVar.Q0(), this.d), null);
                } else if (attachWithTranscription2 instanceof AttachVideoMsg) {
                    long j3 = msgFromUser.c;
                    gzs<s3q0> gzsVar2 = fkq0.a;
                    bz2.c(new y9f0(msgFromUser.d, new UserId(j3), attachWithTranscription.q(), attachWithTranscription.getId(), this.d), null);
                }
                int i2 = this.c;
                w2wVar.O0().c(new q130(this, 22));
                long j4 = w2wVar.getConfig().E;
                w2wVar.O0().a(z ? new si30(i, i2, j4) : new ui30(i, i2, j4));
            } else {
                new com.vk.im.engine.internal.merge.messages.b(msgFromUser2).o(w2wVar);
                w2wVar.S0().w(null, msgFromUser2);
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8g0)) {
            return false;
        }
        c8g0 c8g0Var = (c8g0) obj;
        return this.b == c8g0Var.b && this.c == c8g0Var.c && this.d == c8g0Var.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return qoy.b(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestMsgTranscriptionCmd(msgLocalId=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        return n23.b(sb, this.d, ", changerTag=null)");
    }
}
