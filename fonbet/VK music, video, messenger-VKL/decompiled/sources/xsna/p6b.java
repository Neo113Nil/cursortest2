package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: ChannelMsgUnpinLpTask.kt */
/* loaded from: classes2.dex */
public final class p6b extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;
    public Integer f;

    public p6b(w2w w2wVar, Peer peer, int i) {
        super("ChannelMsgUnpinLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Peer peer = this.d;
        z300Var.a(peer.b);
        Integer num = this.f;
        if (num != null) {
            z300Var.b(num.intValue(), peer.b);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.i, new Object[]{"ChannelMsgUnpinLpTask", "onGetEvents called"});
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.i, new Object[]{"ChannelMsgUnpinLpTask", "onSyncStorage : started"});
        }
        r3b y = this.c.I0().y();
        Peer peer = this.d;
        long j = peer.b;
        int i = this.e;
        Msg l2 = y.l(i, j);
        MsgFromChannel msgFromChannel = l2 != null ? (MsgFromChannel) l2 : null;
        if (msgFromChannel == null) {
            l.getClass();
            if (L.m(loggerOutputTarget)) {
                return;
            }
            L.u(l, L.LogType.i, new Object[]{"ChannelMsgUnpinLpTask", "onSyncStorage : ooops, no such msg"});
            return;
        }
        this.f = Integer.valueOf(msgFromChannel.b);
        y.E(i, peer.b, false);
        l.getClass();
        if (L.m(loggerOutputTarget)) {
            return;
        }
        L.u(l, L.LogType.i, new Object[]{"ChannelMsgUnpinLpTask", "onSyncStorage : succeed"});
    }
}
