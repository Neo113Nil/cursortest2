package xsna;

import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.instantjobs.InstantJob;
import java.util.Map;
import xsna.u6x;

/* compiled from: ChannelMsgSendJob.kt */
/* loaded from: classes.dex */
public final class w5b extends u4w {
    public final int c;
    public final Peer d;
    public final String e;
    public final MsgTextFormat f;
    public final String g;
    public final ChannelMsgSendConfig h;
    public final long i;
    public final boolean j;

    /* compiled from: ChannelMsgSendJob.kt */
    public static final class a implements s7x<w5b> {
        @Override // xsna.s7x
        public final w5b a(ny90 ny90Var) {
            ChannelMsgSendConfig b;
            String i = ny90Var.i("msg_body_format", "");
            if (i.length() <= 0) {
                i = null;
            }
            MsgTextFormat msgTextFormat = MsgTextFormat.d;
            MsgTextFormat a = MsgTextFormat.a.a(i);
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Peer b2 = Peer.a.b(ny90Var.e("dialog_id"));
            int c = ny90Var.c("msg_local_id");
            String f = ny90Var.f("msg_body");
            String i2 = ny90Var.i("msg_guid", "");
            if (ny90Var.g("send_config")) {
                Parcelable.Creator<ChannelMsgSendConfig> creator = ChannelMsgSendConfig.CREATOR;
                b = ChannelMsgSendConfig.a.a(ny90Var.f("send_config"));
            } else {
                Parcelable.Creator<ChannelMsgSendConfig> creator2 = ChannelMsgSendConfig.CREATOR;
                b = ChannelMsgSendConfig.a.b();
            }
            return new w5b(c, b2, f, a, i2, b, ny90Var.e("timeout"));
        }

        @Override // xsna.s7x
        public final void b(w5b w5bVar, ny90 ny90Var) {
            w5b w5bVar2 = w5bVar;
            ny90Var.n("dialog_id", w5bVar2.d.b);
            ny90Var.l("msg_local_id", w5bVar2.c);
            ny90Var.o("msg_body", w5bVar2.e);
            String zb = w5bVar2.f.zb();
            if (zb != null) {
                ny90Var.o("msg_body_format", zb);
            }
            ny90Var.o("msg_guid", w5bVar2.g);
            ny90Var.n("timeout", w5bVar2.i);
            ny90Var.o("send_config", w5bVar2.h.F());
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImChannelSendMsg";
        }
    }

    public w5b(int i, Peer peer, String str, MsgTextFormat msgTextFormat, String str2, ChannelMsgSendConfig channelMsgSendConfig, long j) {
        this.c = i;
        this.d = peer;
        this.e = str;
        this.f = msgTextFormat;
        this.g = str2;
        this.h = channelMsgSendConfig;
        this.i = j;
        this.j = channelMsgSendConfig.l() != null;
    }

    @Override // xsna.u4w
    public final void E(w2w w2wVar) {
        w2wVar.Z0().k();
    }

    @Override // xsna.u4w
    public final String F(w2w w2wVar) {
        return w2wVar.Z0().a();
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        Q(w2wVar, new InterruptedException(), true);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        Q(w2wVar, th, false);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        r3b y = w2wVar.I0().y();
        int i = this.c;
        Msg L = y.L(i);
        if (L == null) {
            L = w2wVar.I0().e().L(i);
        }
        MsgFromChannel msgFromChannel = L instanceof MsgFromChannel ? (MsgFromChannel) L : null;
        if (msgFromChannel == null || msgFromChannel.Qb()) {
            return;
        }
        MsgSyncState msgSyncState = MsgSyncState.SENDING;
        AttachSyncState attachSyncState = AttachSyncState.UPLOAD_REQUIRED;
        d6b d6bVar = d6b.a;
        d6bVar.a(w2wVar, this.c, msgSyncState, attachSyncState, "ChannelMsgSendJob");
        Serializer.c<MsgFromChannel> cVar = MsgFromChannel.CREATOR;
        w2wVar.I0().u(new v5b(this, ((Number) w2wVar.L0(this, new u5b(this.d, this.h, MsgFromChannel.a.b(i, this.e, this.f, msgFromChannel.K0()), this.g))).intValue(), 0));
        d6bVar.a(w2wVar, this.c, MsgSyncState.DONE, AttachSyncState.DONE, "ChannelMsgSendJob");
    }

    @Override // xsna.u4w
    public final void O(w2w w2wVar, Map<InstantJob, ? extends InstantJob.a> map, NotificationCompat.h hVar) {
        w2wVar.Z0().f(hVar, map.size());
    }

    public final void Q(w2w w2wVar, Throwable th, boolean z) {
        r3b y = w2wVar.I0().y();
        int i = this.c;
        Msg L = y.L(i);
        if (L == null) {
            L = w2wVar.I0().e().L(i);
        }
        if (L == null || !(L instanceof MsgFromChannel)) {
            w2wVar.getConfig().g.a(new IllegalStateException(tgw.b(i, "Channel msg with localId = ", " absent")));
            return;
        }
        MsgFromChannel msgFromChannel = (MsgFromChannel) L;
        if (!epx.f(msgFromChannel.cc(), this.g)) {
            w2wVar.getConfig().g.a(new IllegalStateException("Channel msg send failed with wrong GUID"));
            return;
        }
        MsgSyncState msgSyncState = MsgSyncState.ERROR;
        AttachSyncState attachSyncState = AttachSyncState.REJECTED;
        d6b d6bVar = d6b.a;
        d6bVar.a(w2wVar, this.c, msgSyncState, attachSyncState, "ChannelMsgSendJob");
        d6bVar.b(w2wVar, msgFromChannel, th, z);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final long i() {
        return 500L;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final long j() {
        return this.i;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.WHEN_APP_SUSPENDING;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return sa30.y(this.d.b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ChannelMsgSendJob";
    }
}
