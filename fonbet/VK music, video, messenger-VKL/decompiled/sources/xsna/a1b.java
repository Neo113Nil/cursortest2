package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.dto.common.Peer;
import com.vk.instantjobs.InstantJob;
import kotlin.NoWhenBranchMatchedException;
import xsna.u6x;

/* compiled from: ChannelLeaveJob.kt */
/* loaded from: classes.dex */
public final class a1b extends u4w {
    public final Peer c;

    /* compiled from: ChannelLeaveJob.kt */
    public static final class a implements s7x<a1b> {
        @Override // xsna.s7x
        public final a1b a(ny90 ny90Var) {
            return new a1b(com.vk.dto.common.b.e(ny90Var.e("channel_id")));
        }

        @Override // xsna.s7x
        public final void b(a1b a1bVar, ny90 ny90Var) {
            ny90Var.n("channel_id", a1bVar.c.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelLeaveJob";
        }
    }

    /* compiled from: ChannelLeaveJob.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BaseBoolIntDto.values().length];
            try {
                iArr[BaseBoolIntDto.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseBoolIntDto.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a1b(Peer peer) {
        this.c = peer;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        uib a2 = w2wVar.I0().a();
        Peer peer = this.c;
        a2.q(peer.b, ChannelActionInProgress.NONE, null);
        w2wVar.S0().H(peer.b);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        uib a2 = w2wVar.I0().a();
        Peer peer = this.c;
        a2.q(peer.b, ChannelActionInProgress.NONE, null);
        w2wVar.e1(this, new y680(peer.b));
        w2wVar.S0().H(peer.b);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Peer peer = this.c;
        x0b x0bVar = new x0b(peer);
        long j = peer.b;
        int i = b.$EnumSwitchMapping$0[((BaseBoolIntDto) bz2.c(x0bVar, "ChannelLeaveApiCmd")).ordinal()];
        if (i == 1) {
            w2wVar.I0().u(new com.vk.movika.sdk.base.logic.interactor.p(this, 17));
            bdb c = w2wVar.I0().a().c(j);
            if (c != null) {
                w2wVar.I0().u(new vs(c, 16));
            }
            w2wVar.e1(this, new z680(j));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            w2wVar.I0().a().q(peer.b, ChannelActionInProgress.NONE, null);
            w2wVar.e1(this, new y680(peer.b));
        }
        w2wVar.S0().H(peer.b);
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
        return sa30.p(this.c.b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ChannelLeaveJob";
    }
}
