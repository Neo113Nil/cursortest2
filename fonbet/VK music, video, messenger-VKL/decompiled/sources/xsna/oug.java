package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;
import xsna.wab;

/* compiled from: CommunityChannelMsgSetReactionJob.kt */
/* loaded from: classes.dex */
public final class oug extends u4w {
    public final long c;
    public final int d;
    public final wab e;

    /* compiled from: CommunityChannelMsgSetReactionJob.kt */
    public static final class a implements s7x<oug> {
        @Override // xsna.s7x
        public final oug a(ny90 ny90Var) {
            long e = ny90Var.e("channel_id");
            int c = ny90Var.c("msg_local_id");
            int c2 = ny90Var.c("reaction_id");
            return new oug(e, c, c2 == -1 ? wab.b.a : new wab.a(c2));
        }

        @Override // xsna.s7x
        public final void b(oug ougVar, ny90 ny90Var) {
            oug ougVar2 = ougVar;
            ny90Var.n("channel_id", ougVar2.c);
            ny90Var.l("msg_local_id", ougVar2.d);
            ny90Var.l("reaction_id", ougVar2.e.a());
        }

        @Override // xsna.s7x
        public final String getType() {
            return "CommunityChannelMsgSetReactionJob";
        }
    }

    public oug(long j, int i, wab wabVar) {
        this.c = j;
        this.d = i;
        this.e = wabVar;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        R(w2wVar);
        Q(w2wVar);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        R(w2wVar);
        Q(w2wVar);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Object c;
        Msg L = w2wVar.I0().y().L(this.d);
        MsgFromChannel msgFromChannel = L != null ? (MsgFromChannel) L : null;
        if (msgFromChannel == null) {
            return;
        }
        c = bz2.c(new nug(msgFromChannel.fc(), new UserId(this.c), this.e), null);
        if (((BaseBoolIntDto) c) == BaseBoolIntDto.YES) {
            w2wVar.I0().u(new l00(this, 25));
            Q(w2wVar);
        } else {
            R(w2wVar);
            Q(w2wVar);
        }
    }

    public final void Q(w2w w2wVar) {
        w2wVar.e1(this, new o280("CommunityChannelMsgSetReactionJob", this.c, this.d));
    }

    public final void R(w2w w2wVar) {
        w2wVar.I0().y().D(this.d, null);
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
        return sa30.p(this.c);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "CommunityChannelMsgSetReactionJob";
    }
}
