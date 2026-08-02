package xsna;

import com.vk.channels.api.ChannelActionInProgress;
import com.vk.dto.common.Peer;
import com.vk.im.engine.ChannelSource;
import com.vk.im.engine.events.JoiningToChannelError;
import com.vk.im.engine.internal.merge.channels.ChannelsInfoMergeTask;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.instantjobs.InstantJob;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.p0b;
import xsna.u6x;

/* compiled from: ChannelJoinJob.kt */
/* loaded from: classes.dex */
public final class t0b extends u4w {
    public final Peer c;
    public final ChannelSource d;

    /* compiled from: ChannelJoinJob.kt */
    public static final class a implements s7x<t0b> {
        @Override // xsna.s7x
        public final t0b a(ny90 ny90Var) {
            return new t0b(com.vk.dto.common.b.e(ny90Var.e("channel_id")), ChannelSource.a.a(ny90Var.g("source") ? ny90Var.f("source") : "", ny90Var.g("track_code") ? ny90Var.f("track_code") : null));
        }

        @Override // xsna.s7x
        public final void b(t0b t0bVar, ny90 ny90Var) {
            t0b t0bVar2 = t0bVar;
            ny90Var.n("channel_id", t0bVar2.c.b);
            ChannelSource channelSource = t0bVar2.d;
            ny90Var.o("source", channelSource.d());
            if ((channelSource instanceof ChannelSource.GLobalBase ? (ChannelSource.GLobalBase) channelSource : null) != null) {
                ny90Var.o("track_code", ((ChannelSource.GLobalBase) channelSource).e());
            }
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelJoinJob";
        }
    }

    public t0b(Peer peer, ChannelSource channelSource) {
        this.c = peer;
        this.d = channelSource;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        Q(w2wVar);
        w2wVar.S0().H(this.c.b);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        Q(w2wVar);
        bzp S0 = w2wVar.S0();
        Peer peer = this.c;
        S0.H(peer.b);
        w2wVar.e1(this, new v680(peer.b, JoiningToChannelError.UNKNOWN));
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        String e;
        ChannelSource channelSource = this.d;
        boolean z = channelSource instanceof fbb;
        Peer peer = this.c;
        if (z) {
            gbb gbbVar = (gbb) w2wVar.I0().a().W().get(Long.valueOf(peer.b));
            if (gbbVar != null) {
                e = gbbVar.a();
            }
            e = null;
        } else {
            if (channelSource instanceof ChannelSource.GLobalBase) {
                e = ((ChannelSource.GLobalBase) channelSource).e();
            }
            e = null;
        }
        p0b.b bVar = (p0b.b) bz2.c(new p0b(peer, channelSource.d(), e), "ChannelJoinApiCmd");
        if (bVar instanceof p0b.b.C3484b) {
            p0b.b.C3484b.a aVar2 = (p0b.b.C3484b.a) dcq.b(((p0b.b.C3484b) bVar).a(), w2wVar, null, 6);
            new ChannelsInfoMergeTask(Collections.singletonList(aVar2.a()), null, false, null, null, 30).n(w2wVar);
            if (aVar2.d().Gb()) {
                ProfilesSimpleInfo d = aVar2.d();
                xuo0.a.getClass();
                new h1e0(d, xuo0.a()).n(w2wVar);
            }
            Q(w2wVar);
            w2wVar.e1(this, new w680(peer.b));
            w2wVar.S0().H(peer.b);
            return;
        }
        if (!(bVar instanceof p0b.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        p0b.b.a aVar3 = (p0b.b.a) bVar;
        Q(w2wVar);
        w2wVar.S0().H(peer.b);
        if (aVar3.a() == 7402) {
            return;
        }
        long j = peer.b;
        int a2 = aVar3.a();
        w2wVar.e1(this, new v680(j, a2 != 15 ? a2 != 7401 ? a2 != 103 ? a2 != 104 ? JoiningToChannelError.UNKNOWN : JoiningToChannelError.CHANNEL_NOT_FOUND : JoiningToChannelError.LIMITS : JoiningToChannelError.INVALID_INVITE_LINK : JoiningToChannelError.ACCESS_DENIED));
    }

    public final void Q(w2w w2wVar) {
        w2wVar.I0().a().q(this.c.b, ChannelActionInProgress.NONE, null);
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
        return "ChannelJoinJob";
    }
}
