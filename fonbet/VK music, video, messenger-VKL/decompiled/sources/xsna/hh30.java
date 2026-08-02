package xsna;

import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.exceptions.IllegalMsgTypeException;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.reporters.CancelReason;
import com.vk.instantjobs.InstantJob;
import java.util.Collections;
import xsna.ij20;
import xsna.u6x;

/* compiled from: MsgAudioMsgTranscriptEditJob.kt */
/* loaded from: classes.dex */
public final class hh30 extends u4w {
    public static final String f = "hh30";
    public final long c;
    public final int d;
    public final String e;

    /* compiled from: MsgAudioMsgTranscriptEditJob.kt */
    public static final class a implements s7x<hh30> {
        @Override // xsna.s7x
        public final hh30 a(ny90 ny90Var) {
            return new hh30(ny90Var.e("dialog_id"), ny90Var.c("local_msg_id"), ny90Var.f("transcription"));
        }

        @Override // xsna.s7x
        public final void b(hh30 hh30Var, ny90 ny90Var) {
            hh30 hh30Var2 = hh30Var;
            ny90Var.n("dialog_id", hh30Var2.c);
            ny90Var.l("local_msg_id", hh30Var2.d);
            ny90Var.o("transcription", hh30Var2.e);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "MsgAudioMsgTranscriptEditJob";
        }
    }

    public hh30(long j, int i, String str) {
        this.c = j;
        this.d = i;
        this.e = str;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        Q(w2wVar, new InterruptedException(), true);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        Q(w2wVar, th, false);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        MsgFromUser msgFromUser;
        Msg L = w2wVar.I0().o().L(this.d);
        if (L == null) {
            msgFromUser = null;
        } else {
            if (!(L instanceof MsgFromUser)) {
                throw new IllegalMsgTypeException("Message has wrong type msg = ".concat(qjg.a(L)));
            }
            msgFromUser = (MsgFromUser) L;
        }
        if (msgFromUser == null) {
            return;
        }
        ij20.a aVar2 = new ij20.a();
        aVar2.d = bz2.m();
        aVar2.c = "messages.editAudioMessageTranscription";
        aVar2.f.put("peer_id", Long.valueOf(this.c).toString());
        aVar2.f.put("conversation_message_id", Integer.valueOf(msgFromUser.Z5()).toString());
        aVar2.b("transcription", this.e);
        aVar2.i = true;
        bz2.h(new ij20(aVar2));
    }

    public final void Q(w2w w2wVar, Throwable th, boolean z) {
        d040 o = w2wVar.I0().o();
        int i = this.d;
        Msg L = o.L(i);
        if (L == null) {
            w2wVar.getConfig().g.a(new IllegalArgumentException(tgw.b(i, "Msg with localId = ", " not exist")));
            return;
        }
        fz30.a(w2wVar, i, MsgSyncState.ERROR, AttachSyncState.REJECTED);
        String str = f;
        long j = this.c;
        w2wVar.e1(this, new p980(str, j, i));
        w2wVar.S0().v(j, str);
        if (z) {
            w2wVar.K().d().i(Collections.singletonList(L), CancelReason.ATTACH_CANCEL);
            return;
        }
        w2wVar.K().d().k(i, j, th);
        w2wVar.e1(this, new i980(str, th, this.d, this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh30)) {
            return false;
        }
        hh30 hh30Var = (hh30) obj;
        return this.c == hh30Var.c && this.d == hh30Var.d && epx.f(this.e, hh30Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, Long.hashCode(this.c) * 31, 31);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MsgAudioMsgTranscriptEditJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgAudioMsgTranscriptEditJob(dialogId=");
        sb.append(this.c);
        sb.append(", msgLocalId=");
        sb.append(this.d);
        sb.append(", transcription=");
        return ho8.a(sb, this.e, ')');
    }
}
