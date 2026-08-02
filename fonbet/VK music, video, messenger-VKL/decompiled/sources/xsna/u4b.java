package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.reactions.ItemReactions;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: ChannelMsgEditLpTask.kt */
/* loaded from: classes2.dex */
public final class u4b extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;
    public final Msg f;
    public final long g;
    public Integer h;
    public boolean i;

    public u4b(w2w w2wVar, Peer peer, int i, Msg msg) {
        super("ChannelMsgEditLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
        this.f = msg;
        this.g = peer.b;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        r3b y = this.c.I0().y();
        int i = this.e;
        if (y.d(this.g, Collections.singletonList(Integer.valueOf(i))).get(i)) {
            if (this.f == null && f(c400Var) == null) {
                f400Var.b(i, this.g);
            }
            rte0.v(this.e, this.g, this.f, c400Var, f400Var);
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Integer num = this.h;
        long j = this.g;
        if (num != null) {
            int intValue = num.intValue();
            z300Var.c(j);
            z300Var.b(intValue, j);
        }
        if (this.i) {
            z300Var.a(j);
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        ItemReactions itemReactions;
        w2w w2wVar = this.c;
        r3b y = w2wVar.I0().y();
        int i = this.e;
        boolean z = y.d(this.g, Collections.singletonList(Integer.valueOf(i))).get(i);
        long j = this.g;
        if (!z) {
            L.l("ChannelMsgEditLpTask", "onSyncStorage: failed, no message found in cache with cnvMsgId=" + i + " for channelId=" + j);
            return;
        }
        Msg f = f(c400Var);
        if (f == null && (f = this.f) == null) {
            L.l("ChannelMsgEditLpTask", "onSyncStorage: failed, no message found in lpInfo with cnvMsgId=" + i + " for channelId=" + j);
            return;
        }
        Msg msg = f;
        Msg l = w2wVar.I0().y().l(i, j);
        if (l != null && (msg instanceof MsgFromChannel)) {
            MsgFromChannel msgFromChannel = (MsgFromChannel) msg;
            ItemReactions itemReactions2 = msgFromChannel.I.p;
            if (itemReactions2 != null) {
                ItemReactions itemReactions3 = ((MsgFromChannel) l).I.p;
                itemReactions = ItemReactions.a(itemReactions2, null, 0, itemReactions3 != null ? itemReactions3.e : null, 7);
            } else {
                itemReactions = null;
            }
            msgFromChannel.kc(itemReactions);
        }
        Msg msg2 = (Msg) j5g.b0(0, (List) new ChannelMsgHistoryFromServerMergeTask(this.d, msg, ChannelMsgHistoryFromServerMergeTask.HistorySource.WEBSOCKET, false, false).o(w2wVar));
        if (msg2 != null) {
            this.h = Integer.valueOf(msg2.b);
            MsgFromChannel msgFromChannel2 = msg2 instanceof MsgFromChannel ? (MsgFromChannel) msg2 : null;
            this.i = msgFromChannel2 != null ? msgFromChannel2.M : false;
        }
    }

    public final Msg f(c400 c400Var) {
        Map map = (Map) c400Var.j.get(Long.valueOf(this.d.b));
        if (map != null) {
            return (Msg) map.get(Integer.valueOf(this.e));
        }
        return null;
    }
}
