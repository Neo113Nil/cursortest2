package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import io.jsonwebtoken.JwtParser;
import java.util.Collections;
import java.util.List;
import xsna.c5b;

/* compiled from: ChannelDeleteMessageCmd.kt */
/* loaded from: classes2.dex */
public final class uxa extends le6<s3q0> {
    public final Peer b;
    public final int c;
    public final int d;
    public final ChannelType e;

    public uxa(Peer peer, int i, int i2, ChannelType channelType) {
        this.b = peer;
        this.c = i;
        this.d = i2;
        this.e = channelType;
        if (peer.Ab(Peer.Type.GROUP)) {
            return;
        }
        throw new IllegalStateException(("ChannelDeleteMessageCmd available only for a group! Called for " + peer + JwtParser.SEPARATOR_CHAR).toString());
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        BaseOkResponseDto baseOkResponseDto;
        w2w w2wVar2;
        g2b g2bVar = w2wVar.I0().y().b;
        int i = this.d;
        Msg e = g2bVar.e(i);
        if (e == null) {
            e = w2wVar.I0().e().b.e(i);
        }
        int i2 = 1;
        boolean z = e != null && e.H6();
        boolean B = ad0.B(this.e);
        Peer peer = this.b;
        int i3 = this.c;
        if (!B) {
            UserId userId = new UserId(peer.b);
            tfx tfxVar = new tfx("wall.delete", new dwm0(3), new sqe0(6));
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            tfx.l(tfxVar, "post_id", i3, 0, 0, 8);
            baseOkResponseDto = (BaseOkResponseDto) bz2.d(tfxVar);
        } else if (z) {
            w2wVar.O0().i("delete msg", new qso(i, i2));
            baseOkResponseDto = BaseOkResponseDto.OK;
        } else {
            UserId userId2 = new UserId(peer.b);
            tfx tfxVar2 = new tfx("channels.deleteMessage", new gq(7), new hq(6));
            tfx.l(tfxVar2, "cmid", i3, 0, 0, 8);
            tfx.n(tfxVar2, "channel_id", userId2, 0L, 0L, 12);
            baseOkResponseDto = (BaseOkResponseDto) bz2.d(tfxVar2);
        }
        if (baseOkResponseDto != BaseOkResponseDto.OK) {
            throw new IllegalStateException("Unexpected response.");
        }
        r3b y = w2wVar.I0().y();
        List singletonList = Collections.singletonList(Integer.valueOf(i3));
        y.getClass();
        long j = peer.b;
        long j2 = peer.b;
        Msg msg = (Msg) zik0.b(y.i(j, singletonList));
        MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
        boolean z2 = msgFromChannel != null ? msgFromChannel.M : false;
        if (z) {
            w2wVar.I0().e().e(i);
            w2wVar.I0().y().e(i);
            w2wVar2 = w2wVar;
        } else {
            w2wVar2 = w2wVar;
            new zd20(new c5b.b(i3, peer), new h2b(w2wVar.I0(), w2wVar.getExperiments()), true, false).a(w2wVar2);
            s3q0 s3q0Var = s3q0.a;
        }
        w2wVar2.S0().a(Collections.singletonList(Long.valueOf(j2)));
        w2wVar2.S0().Q(this, OnChannelsCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        if (z2) {
            w2wVar2.S0().q(j2);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxa)) {
            return false;
        }
        uxa uxaVar = (uxa) obj;
        return epx.f(this.b, uxaVar.b) && this.c == uxaVar.c && this.d == uxaVar.d && this.e == uxaVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, Long.hashCode(this.b.b) * 31, 31), 31);
        ChannelType channelType = this.e;
        return a + (channelType == null ? 0 : channelType.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChannelDeleteMessageCmd(peer=" + this.b + ", cnvMsgId=" + this.c + ", msgLocalId=" + this.d + ", channelType=" + this.e + ')';
    }
}
