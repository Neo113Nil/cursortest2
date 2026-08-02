package xsna;

import android.util.ArraySet;
import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.merge.channels.ChannelsInfoMergeTask;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.c5b;

/* compiled from: ChannelMsgDeleteLpTask.kt */
/* loaded from: classes2.dex */
public final class s4b extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;
    public boolean f;

    public s4b(w2w w2wVar, Peer peer, int i) {
        super("ChannelMsgDeleteLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashSet linkedHashSet = f400Var.i;
        LinkedHashMap linkedHashMap = c400Var.i;
        Peer peer = this.d;
        long j = peer.b;
        long j2 = peer.b;
        if (!linkedHashMap.containsKey(Long.valueOf(j))) {
            bdb bdbVar = (bdb) this.c.I0().c(new mb(this, 18));
            if (bdbVar == null) {
                linkedHashSet.add(Long.valueOf(j2));
            } else {
                p4g.a(Long.valueOf(j2), linkedHashSet, bdbVar.c == this.e);
            }
        }
        if (c400Var.a()) {
            return;
        }
        f400Var.k = true;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.b = Boolean.TRUE;
        long j = this.d.b;
        int i = this.e;
        if (z300Var.R == null) {
            z300Var.R = new HashMap(1);
        }
        Collection collection = (Collection) z300Var.R.get(Long.valueOf(j));
        if (collection == null) {
            collection = new ArraySet();
            z300Var.R.put(Long.valueOf(j), collection);
        }
        collection.add(Integer.valueOf(i));
        z300Var.X = true;
        if (this.f) {
            z300Var.a(this.d.b);
        }
        z300Var.h(new b5w(this.d.b, ImItemType.CHANNEL));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        r3b y = w2wVar.I0().y();
        Peer peer = this.d;
        long j = peer.b;
        int i = this.e;
        Msg l = y.l(i, j);
        MsgFromChannel msgFromChannel = l != null ? (MsgFromChannel) l : null;
        this.f = msgFromChannel != null && msgFromChannel.M;
        eeb eebVar = (eeb) c400Var.i.get(Long.valueOf(peer.b));
        Msg msg = eebVar != null ? eebVar.b : null;
        if (eebVar == null || msg != null) {
            new zd20(new c5b.b(i, peer), new h2b(w2wVar.I0(), w2wVar.getExperiments()), true, false).a(w2wVar);
            s3q0 s3q0Var = s3q0.a;
            if (msg != null) {
                new ChannelMsgHistoryFromServerMergeTask(this.d, msg, ChannelMsgHistoryFromServerMergeTask.HistorySource.WEBSOCKET, false, true).o(w2wVar);
            }
        } else {
            new zd20(new c5b.a(peer, false), new h2b(w2wVar.I0(), w2wVar.getExperiments()), true, false).a(w2wVar);
            s3q0 s3q0Var2 = s3q0.a;
        }
        if (eebVar != null) {
            new ChannelsInfoMergeTask(Collections.singletonList(eebVar), Integer.valueOf(i), false, null, ChannelsInfoMergeTask.InfoSource.WEBSOCKET, 12).o(w2wVar);
        }
    }
}
