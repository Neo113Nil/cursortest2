package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

/* compiled from: ChannelMessagesInteractor.kt */
/* loaded from: classes16.dex */
public final class a3b implements of20 {
    public final long a;
    public final boolean b;
    public final izv c;
    public final lzv d;

    public a3b(long j, boolean z, izv izvVar, lzv lzvVar) {
        this.a = j;
        this.b = z;
        this.c = izvVar;
        this.d = lzvVar;
    }

    @Override // xsna.of20
    public final io.reactivex.rxjava3.internal.operators.single.f0 a(MsgFromChannel msgFromChannel, ChannelMsgSendConfig channelMsgSendConfig) {
        String uuid = UUID.randomUUID().toString();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return this.d.b(this, new m6b(Peer.a.b(this.a), channelMsgSendConfig, msgFromChannel, uuid)).l(new x34(new y2b(uuid, 0), 5)).q(asu0.a.c());
    }

    @Override // xsna.of20
    public final io.reactivex.rxjava3.internal.operators.completable.y b(Collection collection) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.d.b(this, new u3b(this.a, j5g.O0(collection)))).q(asu0.a.c());
    }

    @Override // xsna.of20
    public final io.reactivex.rxjava3.internal.operators.completable.p c(Msg msg, ChannelType channelType) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.d.b(this, new uxa(msg.getFrom(), msg.d, msg.b, channelType)).q(asu0.a.c()));
    }

    @Override // xsna.of20
    public final void d(int i) {
        this.c.b(this, new k1b(this.a, i));
    }

    @Override // xsna.of20
    public final io.reactivex.rxjava3.core.a e(MsgFromChannel msgFromChannel, ChannelType channelType) {
        if (msgFromChannel.Pb()) {
            return new io.reactivex.rxjava3.internal.operators.single.s(f(msgFromChannel.b, true), new d22(new m9(4, this, channelType), 9));
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.d.b(this, new b6b(msgFromChannel.I.d, msgFromChannel.b, Peer.a.b(this.a))).q(asu0.a.c()));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y f(int i, boolean z) {
        return this.d.b(this, new n2b(this.a, Collections.singletonList(Integer.valueOf(i)), MsgIdType.LOCAL_ID, Source.CACHE, false, z)).l(new jo3(new z2b(i, 0), 4));
    }
}
