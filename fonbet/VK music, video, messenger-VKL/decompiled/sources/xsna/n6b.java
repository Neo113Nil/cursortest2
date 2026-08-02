package xsna;

import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;
import xsna.wab;
import xsna.z1b;

/* compiled from: ChannelMsgSetReactionJob.kt */
/* loaded from: classes.dex */
public final class n6b extends u4w {
    public final long c;
    public final int d;
    public final wab e;

    /* compiled from: ChannelMsgSetReactionJob.kt */
    public static final class a implements s7x<n6b> {
        @Override // xsna.s7x
        public final n6b a(ny90 ny90Var) {
            long e = ny90Var.e("channel_id");
            int c = ny90Var.c("msg_local_id");
            int c2 = ny90Var.c("reaction_id");
            return new n6b(e, c, c2 == -1 ? wab.b.a : new wab.a(c2));
        }

        @Override // xsna.s7x
        public final void b(n6b n6bVar, ny90 ny90Var) {
            n6b n6bVar2 = n6bVar;
            ny90Var.n("channel_id", n6bVar2.c);
            ny90Var.l("msg_local_id", n6bVar2.d);
            ny90Var.l("reaction_id", n6bVar2.e.a());
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelMsgSetReactionJob";
        }
    }

    public n6b(long j, int i, wab wabVar) {
        this.c = j;
        this.d = i;
        this.e = wabVar;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        r3b y = w2wVar.I0().y();
        int i = this.d;
        y.D(i, null);
        w2wVar.e1(this, new o280("ChannelMsgSetReactionJob", this.c, i));
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        r3b y = w2wVar.I0().y();
        int i = this.d;
        y.D(i, null);
        w2wVar.e1(this, new o280("ChannelMsgSetReactionJob", this.c, i));
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Object c;
        r3b y = w2wVar.I0().y();
        int i = this.d;
        Msg L = y.L(i);
        MsgFromChannel msgFromChannel = L != null ? (MsgFromChannel) L : null;
        if (msgFromChannel == null) {
            return;
        }
        c = bz2.c(new z1b(msgFromChannel.fc(), msgFromChannel.q(), this.e), null);
        w2wVar.I0().u(new hl1(5, this, ((z1b.a) c).a()));
        w2wVar.e1(this, new o280("ChannelMsgSetReactionJob", this.c, i));
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
        return "ChannelMsgSetReactionJob";
    }
}
