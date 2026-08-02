package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: ChannelShowInAllFolderJob.kt */
/* loaded from: classes.dex */
public final class tcb extends u4w {
    public final long c;

    /* compiled from: ChannelShowInAllFolderJob.kt */
    public static final class a implements s7x<tcb> {
        @Override // xsna.s7x
        public final tcb a(ny90 ny90Var) {
            return new tcb(ny90Var.e("channel_id"));
        }

        @Override // xsna.s7x
        public final void b(tcb tcbVar, ny90 ny90Var) {
            ny90Var.n("channel_id", tcbVar.c);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelShowInAllFolderJob";
        }
    }

    public tcb(long j) {
        this.c = j;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        Q(w2wVar);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        Q(w2wVar);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        UserId userId = new UserId(this.c);
        tfx tfxVar = new tfx("messages.unhideItem", new yq(21), new io.reactivex.rxjava3.internal.operators.mixed.j(19));
        tfx.o(tfxVar, "item_type", "channel", 0, 0, 12);
        tfx.n(tfxVar, "item_id", userId, 0L, 0L, 12);
        if (((BaseOkResponseDto) bz2.l(tfxVar, true)) != BaseOkResponseDto.OK) {
            Q(w2wVar);
        }
    }

    public final void Q(w2w w2wVar) {
        uib a2 = w2wVar.I0().a();
        long j = this.c;
        a2.H(j, false);
        w2wVar.S0().H(j);
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
        return "ChannelShowInAllFolderJob";
    }
}
