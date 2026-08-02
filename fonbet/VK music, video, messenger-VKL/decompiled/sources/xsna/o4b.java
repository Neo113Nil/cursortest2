package xsna;

import android.util.ArraySet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.merge.channels.ChannelsInfoMergeTask;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: ChannelMsgAddBatchLpTask.kt */
/* loaded from: classes2.dex */
public final class o4b extends e500 {
    public final w2w c;
    public final Peer d;
    public final SparseArray<Msg> e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final qs20 i;
    public final rte0 j;
    public List<? extends Msg> k;
    public SparseBooleanArray l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4b(w2w w2wVar, Peer peer, SparseArray sparseArray, boolean z, int i) {
        super("ChannelMsgAddBatchLpTask");
        z = (i & 8) != 0 ? false : z;
        boolean z2 = (i & 16) == 0;
        this.c = w2wVar;
        this.d = peer;
        this.e = sparseArray;
        this.f = z;
        this.g = z2;
        this.h = peer.b;
        this.i = new qs20(w2wVar);
        this.j = new rte0();
        this.k = EmptyList.b;
        this.l = new SparseBooleanArray();
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        Msg msg;
        Peer H0;
        LinkedHashMap linkedHashMap = c400Var.i;
        long j = this.h;
        p4g.a(Long.valueOf(j), f400Var.i, (linkedHashMap.containsKey(Long.valueOf(j)) || ((Boolean) this.c.I0().c(new n4b(j, 0))).booleanValue()) ? false : true);
        SparseArray<Msg> sparseArray = this.e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            Msg valueAt = sparseArray.valueAt(i);
            Map map = (Map) c400Var.j.get(Long.valueOf(j));
            if (map == null || (msg = (Msg) map.get(Integer.valueOf(keyAt))) == null) {
                msg = valueAt;
            }
            if (msg == null) {
                f400Var.b(keyAt, j);
            } else {
                ltx0 ltx0Var = msg instanceof ltx0 ? (ltx0) msg : null;
                qs20 qs20Var = this.i;
                if (ltx0Var != null && (H0 = ltx0Var.H0()) != null) {
                    qs20Var.a(H0, c400Var, f400Var);
                }
                Peer from = msg.getFrom();
                if (from != null) {
                    qs20Var.a(from, c400Var, f400Var);
                }
            }
            this.j.getClass();
            rte0.v(keyAt, this.h, valueAt, c400Var, f400Var);
        }
        if (!this.g || c400Var.a()) {
            return;
        }
        f400Var.k = true;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        String str;
        for (Msg msg : this.k) {
            if (this.l.get(msg.d)) {
                z300Var.b(msg.b, this.h);
            } else {
                long j = this.h;
                int i = msg.b;
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i));
                if (z300Var.Q == null) {
                    z300Var.Q = new HashMap();
                }
                Collection collection = (Collection) z300Var.Q.get(Long.valueOf(j));
                if (collection == null) {
                    collection = new ArraySet();
                    z300Var.Q.put(Long.valueOf(j), collection);
                }
                collection.addAll(arrayList);
                long j2 = this.h;
                if (msg instanceof MsgFromChannel) {
                    List<Attach> list = ((MsgFromChannel) msg).E;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Attach) it.next()) instanceof AttachChannelStub) {
                                    this.c.K().m().a(j2);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
            if (msgFromChannel != null && (str = msgFromChannel.P) != null) {
                this.c.K().n().d().e(str);
            }
        }
        z300Var.c(this.h);
        if (this.g) {
            z300Var.X = true;
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        Msg msg;
        SparseArray sparseArray = new SparseArray();
        SparseArray<Msg> sparseArray2 = this.e;
        int size = sparseArray2.size();
        int i = 0;
        while (true) {
            long j = this.h;
            if (i >= size) {
                if (zik0.c(sparseArray)) {
                    return;
                }
                ArrayList g = zik0.g(sparseArray);
                int intValue = ((Number) j5g.q0(zik0.d(sparseArray))).intValue();
                boolean z = this.f;
                w2w w2wVar = this.c;
                r3b e = z ? w2wVar.I0().e() : w2wVar.I0().y();
                ArrayList arrayList = new ArrayList(c5g.u(g, 10));
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Msg) it.next()).d));
                }
                this.l = e.d(j, arrayList);
                List<? extends Msg> list = this.g ? (List) new ChannelMsgHistoryFromServerMergeTask(this.d, intValue, (List) g, ChannelMsgHistoryFromServerMergeTask.HistorySource.WEBSOCKET, this.f, false, false, 384).o(w2wVar) : (List) new ChannelMsgHistoryFromServerMergeTask(this.d, intValue, (List) g, ChannelMsgHistoryFromServerMergeTask.HistorySource.WEBSOCKET, this.f, false, false, 224).o(w2wVar);
                this.k = list;
                eeb eebVar = (eeb) c400Var.i.get(Long.valueOf(j));
                if (eebVar != null) {
                    new ChannelsInfoMergeTask(Collections.singletonList(eebVar), null, false, null, ChannelsInfoMergeTask.InfoSource.WEBSOCKET, 14).o(w2wVar);
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    w2wVar.I0().a().v(((Msg) j5g.i0(list)).d, j);
                    return;
                }
            }
            int keyAt = sparseArray2.keyAt(i);
            Msg valueAt = sparseArray2.valueAt(i);
            Map map = (Map) c400Var.j.get(Long.valueOf(j));
            if (map != null && (msg = (Msg) map.get(Integer.valueOf(keyAt))) != null) {
                valueAt = msg;
            } else if (valueAt == null) {
                throw new IllegalStateException(("No message found onSyncStorage, msgCnvId: " + keyAt).toString());
            }
            sparseArray.put(keyAt, valueAt);
            i++;
        }
    }
}
