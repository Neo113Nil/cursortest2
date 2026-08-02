package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.Collections;
import java.util.List;

/* compiled from: ChannelMsgHistoryFromLocalMergeTask.kt */
/* loaded from: classes2.dex */
public final class v4b extends b920 {
    public final Peer c;
    public final MsgFromChannel d;
    public final String e;
    public final ChannelMsgSendConfig f;
    public final boolean g;

    public v4b(Peer peer, ChannelMsgSendConfig channelMsgSendConfig, MsgFromChannel msgFromChannel, String str) {
        this.c = peer;
        this.d = msgFromChannel;
        this.e = str;
        this.f = channelMsgSendConfig;
        this.g = channelMsgSendConfig.l() != null;
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        MsgFromChannel msgFromChannel = (MsgFromChannel) w2wVar.I0().u(new defpackage.c(11, this, w2wVar));
        xgl0 I0 = w2wVar.I0();
        long j = this.c.b;
        List singletonList = Collections.singletonList(Long.valueOf(j));
        return msgFromChannel;
    }
}
