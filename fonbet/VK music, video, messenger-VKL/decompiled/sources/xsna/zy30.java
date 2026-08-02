package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.api.generated.messages.dto.MessagesSendServiceActionTypeDto;
import com.vk.api.generated.messages.dto.MessagesSendServiceResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.messages.Msg;
import com.vk.instantjobs.InstantJob;
import java.util.Collections;
import java.util.Map;
import xsna.b5w;
import xsna.gv30;
import xsna.u6x;

/* compiled from: MsgSendScreenshotNotifyJob.kt */
/* loaded from: classes.dex */
public final class zy30 extends u4w {
    public final long c;
    public final int d;

    /* compiled from: MsgSendScreenshotNotifyJob.kt */
    public static final class a implements s7x<zy30> {
        @Override // xsna.s7x
        public final zy30 a(ny90 ny90Var) {
            return new zy30(ny90Var.e("dialog_id"), ny90Var.c("msg_local_id"));
        }

        @Override // xsna.s7x
        public final void b(zy30 zy30Var, ny90 ny90Var) {
            zy30 zy30Var2 = zy30Var;
            ny90Var.n("dialog_id", zy30Var2.c);
            ny90Var.l("msg_local_id", zy30Var2.d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImMsgSendScreenshotNotifyJob";
        }
    }

    public zy30(long j, int i) {
        this.c = j;
        this.d = i;
    }

    @Override // xsna.u4w
    public final void E(w2w w2wVar) {
        w2wVar.Z0().k();
    }

    @Override // xsna.u4w
    public final String F(w2w w2wVar) {
        return w2wVar.Z0().a();
    }

    @Override // xsna.u4w
    public final int G(w2w w2wVar) {
        return w2wVar.Z0().l();
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        new InterruptedException();
        Q(w2wVar);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        Q(w2wVar);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        long j = this.c;
        d040 o = w2wVar.I0().o();
        int i = this.d;
        Msg L = o.L(i);
        if (L == null || L.Qb() || L.Pb()) {
            return;
        }
        gzs<s3q0> gzsVar = fkq0.a;
        UserId userId = new UserId(j);
        MessagesSendServiceActionTypeDto messagesSendServiceActionTypeDto = MessagesSendServiceActionTypeDto.CHAT_SCREENSHOT;
        int Eb = L.Eb();
        tfx tfxVar = new tfx("messages.sendService", new lr(22), new pn(25));
        tfx.n(tfxVar, "peer_id", userId, 0L, 0L, 8);
        tfx.o(tfxVar, "action_type", messagesSendServiceActionTypeDto.i(), 0, 0, 12);
        tfx.l(tfxVar, "random_id", Eb, 0, 0, 12);
        int d = ((MessagesSendServiceResponseDto) bz2.c(bz2.n(tfxVar, new k220(5)), "MsgSendScreenshotNotifyJob.messagesSendService")).d();
        if (o.p(i) == MsgSyncState.SENDING) {
            L.Q1(L.y());
            L.Tb(d);
            L.Xb(w2wVar.f1());
            L.Wb(MsgSyncState.DONE);
            new com.vk.im.engine.internal.merge.messages.b(com.vk.dto.common.b.e(j), L, false, false, 60).n(w2wVar);
            w2wVar.S0().W(i);
        }
    }

    @Override // xsna.u4w
    public final void O(w2w w2wVar, Map<InstantJob, ? extends InstantJob.a> map, NotificationCompat.h hVar) {
        w2wVar.Z0().f(hVar, map.size());
    }

    public final void Q(w2w w2wVar) {
        int i = this.d;
        long j = this.c;
        new ii30(gv30.b.a(i, j)).n(w2wVar);
        w2wVar.e1(this, new OnCacheInvalidateEvent(this, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE));
        w2wVar.e1(this, new r680(this, Collections.singleton(b5w.a.b(j))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy30)) {
            return false;
        }
        zy30 zy30Var = (zy30) obj;
        return this.c == zy30Var.c && this.d == zy30Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final long i() {
        return 500L;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.WHEN_APP_SUSPENDING;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return sa30.y(this.c);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MsgSendScreenshotNotifyJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgSendScreenshotNotifyJob(dialogId=");
        sb.append(this.c);
        sb.append(", msgLocalId=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean y() {
        return true;
    }
}
