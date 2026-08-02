package xsna;

import android.util.SparseArray;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: ChannelCnvMessagesHistoryProcessingLogic.kt */
/* loaded from: classes2.dex */
public final class dva implements lf20 {
    public final p3b a;
    public final exf b;
    public final hkx0 c;
    public final w2w d;
    public final List<MsgSyncState> e;

    public dva(p3b p3bVar, exf exfVar, hkx0 hkx0Var, w2w w2wVar) {
        List<MsgSyncState> list;
        this.a = p3bVar;
        this.b = exfVar;
        this.c = hkx0Var;
        this.d = w2wVar;
        MsgSyncState.Companion.getClass();
        list = MsgSyncState.NOT_SYNCED;
        this.e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    @Override // xsna.lf20
    public final ArrayList a(Peer peer, Collection collection, int i, boolean z) {
        Msg msg;
        Collection<Msg> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i2 = ((Msg) it.next()).d;
            Integer valueOf = i2 > 0 ? Integer.valueOf(i2) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        p3b p3bVar = this.a;
        SparseArray<Msg> m0 = p3bVar.m0(peer, arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collection2) {
            if (obj instanceof MsgFromChannel) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            MsgFromChannel msgFromChannel = (MsgFromChannel) it2.next();
            String str = msgFromChannel.P;
            if (str == null || str.length() <= 0 || zik0.a(m0, msgFromChannel.d)) {
                str = null;
            }
            if (str != null) {
                arrayList3.add(str);
            }
        }
        List<MsgFromChannel> z0 = p3bVar.z0(arrayList3, this.e);
        ArrayList arrayList4 = new ArrayList(c5g.u(collection2, 10));
        for (Msg msg2 : collection2) {
            if (msg2 instanceof MsgFromChannel) {
                Msg msg3 = m0.get(msg2.d);
                if (msg3 == null) {
                    Iterator it3 = z0.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            msg = 0;
                            break;
                        }
                        msg = it3.next();
                        if (epx.f(((MsgFromChannel) msg).P, ((MsgFromChannel) msg2).P)) {
                            break;
                        }
                    }
                    msg3 = msg;
                }
                w2w w2wVar = this.d;
                if (msg3 == null) {
                    cn30.a.getClass();
                    cn30.a(w2wVar, msg2);
                } else {
                    MsgFromChannel msgFromChannel2 = (MsgFromChannel) msg2;
                    if (msg3.o == MsgSyncState.SENDING && !msg3.H6() && (msg3 instanceof MsgFromChannel)) {
                        Long l = msgFromChannel2.N;
                        long longValue = l != null ? l.longValue() : 0L;
                        Long l2 = ((MsgFromChannel) msg3).N;
                        if ((l2 != null ? l2.longValue() : 0L) >= longValue) {
                            msg2 = msg3;
                        }
                    }
                    cn30.a.getClass();
                    cn30.d(w2wVar, msg2, msg3, false);
                }
            }
            arrayList4.add(msg2);
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Msg msg4 = (Msg) it4.next();
            msg4.p = this.c.d(msg4);
            msg4.u = i;
        }
        return arrayList4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.lf20
    public final List<Msg> b(Peer peer, List<? extends Msg> list, Boolean bool, Boolean bool2, boolean z, boolean z2) {
        c4g0.m(peer, list, bool, bool2, z, z2, this.b);
        return list;
    }

    @Override // xsna.lf20
    public final ArrayList c(Peer peer, List list) {
        return c4g0.l(list, new ip7(1, this, peer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.lf20
    public final List<Msg> d(List<? extends Msg> list) {
        j5g.V0(list, 3, 2, true, new x50(29));
        return list;
    }
}
