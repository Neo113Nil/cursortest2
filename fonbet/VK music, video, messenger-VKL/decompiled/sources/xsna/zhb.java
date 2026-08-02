package xsna;

import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: ChannelsRecommendationSetCollapsedVersionJob.kt */
/* loaded from: classes.dex */
public final class zhb extends u4w {
    public final int c;
    public final int d;

    /* compiled from: ChannelsRecommendationSetCollapsedVersionJob.kt */
    public static final class a implements s7x<zhb> {
        @Override // xsna.s7x
        public final zhb a(ny90 ny90Var) {
            return new zhb(ny90Var.c("new_version"), ny90Var.c("prev_version"));
        }

        @Override // xsna.s7x
        public final void b(zhb zhbVar, ny90 ny90Var) {
            zhb zhbVar2 = zhbVar;
            ny90Var.l("new_version", zhbVar2.c);
            ny90Var.l("prev_version", zhbVar2.d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelsRecommendationSetCollapsedVersionJob";
        }
    }

    public zhb(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        w2wVar.I0().a().E(this.d);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        w2wVar.I0().a().E(this.d);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        bz2.l(sd9.d().i(Long.valueOf(this.c)), true);
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
        return "ChannelsRecommendationSetCollapsedVersionJob";
    }
}
