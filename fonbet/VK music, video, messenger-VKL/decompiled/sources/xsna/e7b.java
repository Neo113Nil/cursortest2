package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: ChannelNotificationsSettingsChangeJob.kt */
/* loaded from: classes.dex */
public final class e7b extends u4w {
    public final Peer c;
    public final ChannelNotificationsSettings d;

    /* compiled from: ChannelNotificationsSettingsChangeJob.kt */
    public static final class a implements s7x<e7b> {
        @Override // xsna.s7x
        public final e7b a(ny90 ny90Var) {
            return new e7b(com.vk.dto.common.b.e(ny90Var.e("channel_id")), new ChannelNotificationsSettings(ny90Var.a("is_enabled"), ny90Var.e("durations_disabled")));
        }

        @Override // xsna.s7x
        public final void b(e7b e7bVar, ny90 ny90Var) {
            e7b e7bVar2 = e7bVar;
            ny90Var.n("channel_id", e7bVar2.c.b);
            ChannelNotificationsSettings channelNotificationsSettings = e7bVar2.d;
            ny90Var.j("is_enabled", channelNotificationsSettings.Ab());
            ny90Var.n("durations_disabled", channelNotificationsSettings.zb());
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelNotificationsSettingsChangeJob";
        }
    }

    public e7b(Peer peer, ChannelNotificationsSettings channelNotificationsSettings) {
        this.c = peer;
        this.d = channelNotificationsSettings;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        Q(w2wVar);
        w2wVar.S0().H(this.c.b);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        Q(w2wVar);
        w2wVar.S0().H(this.c.b);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Peer peer = this.c;
        w2wVar.I0().u(new d7b(((Boolean) bz2.c(new dcb(peer, this.d), "ChannelSetNotificationsModeApiCmd")).booleanValue(), this, w2wVar));
        w2wVar.S0().H(peer.b);
    }

    public final void Q(w2w w2wVar) {
        w2wVar.I0().a().r(this.c.b, null);
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
        return "ChannelNotificationsSettingsChangeJob";
    }
}
