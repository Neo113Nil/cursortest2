package xsna;

import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.ArrayList;

/* compiled from: MsgStorageChangesHandlerCmd.kt */
/* loaded from: classes2.dex */
public final class c040 extends xl6 {
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final f9w e = e9w.b("MsgStorageChangesHandlerCmd");

    public c040(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
    }

    @Override // xsna.m2w
    public final String a() {
        return "storage-changes-handlers";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        AttachWithTranscription attachWithTranscription;
        long max;
        for (Msg msg : ((wpp) w2wVar.L0(this, new dj30(MsgIdType.LOCAL_ID, this.b, null, Source.CACHE, false, null, 52))).c.values()) {
            MsgSyncState msgSyncState = msg.o;
            MsgSyncState msgSyncState2 = MsgSyncState.DONE;
            if (msgSyncState == msgSyncState2 && msg.Ib()) {
                w2wVar.O0().c(new vl30(msg, 1));
                if (msg.D) {
                    max = 0;
                } else {
                    long j = msg.g;
                    Long l = msg.v;
                    max = Math.max(0L, (j + (l != null ? l.longValue() : 0L)) - w2wVar.f1());
                }
                w2wVar.O0().a(new ri30(msg.b, max));
            }
            if (msg.o == msgSyncState2 && msg.w != null) {
                w2wVar.O0().c(new h630(msg, 3));
                Long l2 = msg.w;
                w2wVar.O0().a(new hi30(msg.b, Math.max(0L, (msg.g + (l2 != null ? l2.longValue() : 0L)) - w2wVar.f1())));
            }
            if (msg.o == msgSyncState2 && (msg instanceof MsgFromUser) && (attachWithTranscription = (AttachWithTranscription) j5g.a0(((com.vk.im.engine.models.messages.a) msg).m9(AttachWithTranscription.class, false, false))) != null && attachWithTranscription.Ya() && attachWithTranscription.J3()) {
                w2wVar.O0().c(new wik(msg, 26));
                long j2 = w2wVar.getConfig().E;
                AttachWithTranscription bc = ((MsgFromUser) msg).bc();
                if (bc != null) {
                    w2wVar.O0().a(new si30(msg.b, bc.xb(), j2));
                }
            }
            if (msg.o == msgSyncState2 && (msg instanceof MsgFromUser)) {
                ((MsgFromUser) msg).N.getClass();
            }
            if (msg instanceof MsgFromUser) {
                int length = dni0.b(msg).length;
                f9w f9wVar = this.e;
                if (length >= 8388608) {
                    StringBuilder b = ji.b(length, "Msg size bigger than cursor window. sizeOf = ", " msg.id = ");
                    b.append(msg.b);
                    b.append(" msg.dialogId = ");
                    b.append(msg.c);
                    b.append(" msg.attachList.size = ");
                    MsgFromUser msgFromUser = (MsgFromUser) msg;
                    b.append(msgFromUser.H.size());
                    b.append(" msg.getFwd().size = ");
                    b.append(msgFromUser.X1().size());
                    f9wVar.a(new IllegalStateException(b.toString()));
                } else {
                    ((bki0) msg).h7(w2wVar.getConfig().o0);
                    f9wVar.debug(new l2(length, msg.toString()));
                }
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c040)) {
            return false;
        }
        c040 c040Var = (c040) obj;
        return epx.f(this.b, c040Var.b) && epx.f(this.c, c040Var.c) && epx.f(this.d, c040Var.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + qr.a(this.c, this.b.hashCode() * 31, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgStorageChangesHandlerCmd(replacedMsgLocalIds=");
        sb.append(this.b);
        sb.append(", updatedMsgLocalIds=");
        sb.append(this.c);
        sb.append(", deletedMsgLocalIds=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
    }
}
