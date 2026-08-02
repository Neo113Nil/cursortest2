package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: ChannelMsgPinLpTask.kt */
/* loaded from: classes2.dex */
public final class a5b extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;
    public final Msg f;
    public Integer g;

    public a5b(w2w w2wVar, Peer peer, int i, Msg msg) {
        super("ChannelMsgPinLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
        this.f = msg;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        r3b y = this.c.I0().y();
        Peer peer = this.d;
        long j = peer.b;
        int i = this.e;
        if (!y.d(j, Collections.singletonList(Integer.valueOf(i))).get(i)) {
            if (this.f == null && f(c400Var) == null) {
                f400Var.b(i, peer.b);
                return;
            }
            return;
        }
        boolean v = rte0.v(this.e, peer.b, this.f, c400Var, f400Var);
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.i, new Object[]{"ChannelMsgPinLpTask", zhy0.a("onFindMissed: containsMessageInCache && found missed = ", v)});
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Peer peer = this.d;
        z300Var.a(peer.b);
        Integer num = this.g;
        if (num != null) {
            z300Var.b(num.intValue(), peer.b);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.i, new Object[]{"ChannelMsgPinLpTask", "onGetEvents: succeed"});
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        Msg f = f(c400Var);
        if (f == null && (f = this.f) == null) {
            L.l("ChannelMsgPinLpTask", "onSyncStorage: failed, no message found in lpInfo with cnvMsgId=" + this.e + " for channelId=" + this.d.b);
            return;
        }
        Msg msg = (Msg) j5g.b0(0, (List) new ChannelMsgHistoryFromServerMergeTask(this.d, f, ChannelMsgHistoryFromServerMergeTask.HistorySource.WEBSOCKET, false, false).o(this.c));
        this.g = msg != null ? Integer.valueOf(msg.b) : null;
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.i, new Object[]{"ChannelMsgPinLpTask", "onSyncStorage: succeed"});
    }

    public final Msg f(c400 c400Var) {
        Map map = (Map) c400Var.j.get(Long.valueOf(this.d.b));
        if (map != null) {
            return (Msg) map.get(Integer.valueOf(this.e));
        }
        return null;
    }
}
