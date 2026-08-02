package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.instantjobs.InstantJob;
import java.util.Collections;
import xsna.u6x;

/* compiled from: DialogMarkAsReadJob.kt */
/* loaded from: classes.dex */
public final class sgm extends u4w {
    public final Peer c;
    public final int d;
    public final Boolean e;

    /* compiled from: DialogMarkAsReadJob.kt */
    public static final class a implements s7x<sgm> {
        @Override // xsna.s7x
        public final sgm a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new sgm(Peer.a.b(ny90Var.e("dialog_id")), ny90Var.c("till_msg_cnv_id"), ny90Var.g("mark_conversation_as_read") ? Boolean.valueOf(ny90Var.a("mark_conversation_as_read")) : null);
        }

        @Override // xsna.s7x
        public final void b(sgm sgmVar, ny90 ny90Var) {
            sgm sgmVar2 = sgmVar;
            ny90Var.n("dialog_id", sgmVar2.c.b);
            Boolean bool = sgmVar2.e;
            if (bool != null) {
                ny90Var.j("mark_conversation_as_read", bool.booleanValue());
            }
            ny90Var.l("till_msg_cnv_id", sgmVar2.d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImDialogMarkAsRead";
        }
    }

    public sgm(Peer peer, int i, Boolean bool) {
        this.c = peer;
        this.d = i;
        this.e = bool;
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        xgl0 I0 = w2wVar.I0();
        Peer peer = this.c;
        if (his0.o(I0, peer.b, this.d)) {
            w2wVar.S0().V(peer.b);
        }
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) throws ApiAccessDeniedException {
        Peer peer = this.c;
        if (!sn.c(w2wVar).K(Collections.singletonList(Long.valueOf(peer.b))).isEmpty()) {
            throw new ApiAccessDeniedException(0);
        }
        bz2.c(new rgm(peer, this.d, this.e, w2wVar.Q0()), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgm)) {
            return false;
        }
        sgm sgmVar = (sgm) obj;
        return epx.f(this.c, sgmVar.c) && this.d == sgmVar.d && epx.f(this.e, sgmVar.e);
    }

    public final int hashCode() {
        int a2 = shy.a(this.d, Long.hashCode(this.c.b) * 31, 31);
        Boolean bool = this.e;
        return a2 + (bool == null ? 0 : bool.hashCode());
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
        return sa30.u(this.c.b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogMarkAsReadJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogMarkAsReadJob(peer=");
        sb.append(this.c);
        sb.append(", tillMsgCnvId=");
        sb.append(this.d);
        sb.append(", markConversationAsRead=");
        return tn.a(sb, this.e, ')');
    }
}
