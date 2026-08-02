package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: MsgRequestChangeStatusJob.kt */
/* loaded from: classes.dex */
public final class sv30 extends u4w {
    public final Peer c;
    public final MsgRequestStatus d;
    public final boolean e;
    public final boolean f;

    /* compiled from: MsgRequestChangeStatusJob.kt */
    public static final class a implements s7x<sv30> {
        @Override // xsna.s7x
        public final sv30 a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Peer b = Peer.a.b(ny90Var.e("dialog_id"));
            MsgRequestStatus.a aVar = MsgRequestStatus.Companion;
            int c = ny90Var.c("status");
            aVar.getClass();
            return new sv30(b, MsgRequestStatus.a.a(c), ny90Var.h("is_spam"), ny90Var.h("can_show_message_request_in_list"));
        }

        @Override // xsna.s7x
        public final void b(sv30 sv30Var, ny90 ny90Var) {
            sv30 sv30Var2 = sv30Var;
            ny90Var.n("dialog_id", sv30Var2.c.b);
            ny90Var.l("status", sv30Var2.d.j());
            ny90Var.j("is_spam", sv30Var2.e);
            ny90Var.j("can_show_message_request_in_list", sv30Var2.f);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "MsgRequestChangeStatusJob";
        }
    }

    /* compiled from: MsgRequestChangeStatusJob.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgRequestStatus.values().length];
            try {
                iArr[MsgRequestStatus.ACCEPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgRequestStatus.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sv30(Peer peer, MsgRequestStatus msgRequestStatus, boolean z, boolean z2) {
        this.c = peer;
        this.d = msgRequestStatus;
        this.e = z;
        this.f = z2;
        if (e43.l(MsgRequestStatus.ACCEPTED, MsgRequestStatus.REJECTED).contains(msgRequestStatus)) {
            return;
        }
        throw new IllegalArgumentException("Unsupported status " + msgRequestStatus);
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        sn.c(w2wVar).t(this.c.b);
        w2wVar.S0().u("sv30", OnCacheInvalidateEvent.Reason.FORCED_FROM_CMD);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        sn.c(w2wVar).t(this.c.b);
        w2wVar.S0().u("sv30", OnCacheInvalidateEvent.Reason.FORCED_FROM_CMD);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        nx2 jd20Var;
        int[] iArr = b.$EnumSwitchMapping$0;
        MsgRequestStatus msgRequestStatus = this.d;
        int i = iArr[msgRequestStatus.ordinal()];
        Peer peer = this.c;
        if (i == 1) {
            jd20Var = new jd20(peer, true);
        } else {
            if (i != 2) {
                throw new UnsupportedOperationException("MsgRequestStatus change is not supported for status: " + msgRequestStatus);
            }
            jd20Var = new kg20(peer, this.e, true);
        }
        bz2.c(jd20Var, null);
        if (!this.f) {
            w2wVar.I0().u(new uv20(this, 3));
        }
        w2wVar.S0().v(peer.b, "sv30");
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
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "msg-request-change-status-job";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MsgRequestChangeStatusJob";
    }
}
