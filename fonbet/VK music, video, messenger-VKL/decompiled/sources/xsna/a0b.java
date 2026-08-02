package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: ChannelHideInAllFolderJob.kt */
/* loaded from: classes.dex */
public final class a0b extends u4w {
    public final long c;

    /* compiled from: ChannelHideInAllFolderJob.kt */
    public static final class a implements s7x<a0b> {
        @Override // xsna.s7x
        public final a0b a(ny90 ny90Var) {
            return new a0b(ny90Var.e("channel_id"));
        }

        @Override // xsna.s7x
        public final void b(a0b a0bVar, ny90 ny90Var) {
            ny90Var.n("channel_id", a0bVar.c);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelHideInAllFolderJob";
        }
    }

    public a0b(long j) {
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
        tfx tfxVar = new tfx("messages.hideItem", new zq(20), new com.vk.movika.sdk.android.defaultplayer.interactive.c(20));
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
        return "ChannelHideInAllFolderJob";
    }
}
