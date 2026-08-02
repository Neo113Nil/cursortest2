package xsna;

import android.util.SparseArray;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: CnvMessagesHistoryProcessingLogic.kt */
/* loaded from: classes2.dex */
public final class dxf implements lf20 {
    public final mf20 a;
    public final exf b;
    public final eyf c;
    public final w2w d;
    public final ArrayList e;

    public dxf(mf20 mf20Var, exf exfVar, eyf eyfVar, w2w w2wVar) {
        this.a = mf20Var;
        this.b = exfVar;
        this.c = eyfVar;
        this.d = w2wVar;
        List asList = Arrays.asList(MsgSyncState.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : asList) {
            if (((MsgSyncState) obj) != MsgSyncState.DONE) {
                arrayList.add(obj);
            }
        }
        this.e = arrayList;
    }

    @Override // xsna.lf20
    public final ArrayList a(Peer peer, Collection collection, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Collection<Msg> collection2 = collection;
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            int i2 = ((Msg) it.next()).d;
            if (i2 > 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        mf20 mf20Var = this.a;
        SparseArray<Msg> m0 = mf20Var.m0(peer, arrayList);
        for (Msg msg : collection2) {
            if (msg.f != 0 && !zik0.a(m0, msg.d)) {
                arrayList2.add(Integer.valueOf(msg.f));
            }
        }
        SparseArray<Msg> F = mf20Var.F(arrayList2, this.e);
        ArrayList arrayList3 = new ArrayList(c5g.u(collection2, 10));
        for (Msg msg2 : collection2) {
            Msg msg3 = m0.get(msg2.d);
            if (msg3 == null) {
                msg3 = F.get(msg2.f);
            }
            w2w w2wVar = this.d;
            if (msg3 == null) {
                cn30.a.getClass();
                cn30.a(w2wVar, msg2);
            } else {
                cn30.a.getClass();
                cn30.d(w2wVar, msg2, msg3, z);
            }
            arrayList3.add(msg2);
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Msg msg4 = (Msg) it2.next();
            msg4.p = this.c.d(msg4);
            msg4.u = i;
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.lf20
    public final List<Msg> b(Peer peer, List<? extends Msg> list, Boolean bool, Boolean bool2, boolean z, boolean z2) {
        c4g0.m(peer, list, bool, bool2, z, z2, this.b);
        return list;
    }

    @Override // xsna.lf20
    public final ArrayList c(Peer peer, List list) {
        return c4g0.l(list, new mn7(2, this, peer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.lf20
    public final List<Msg> d(List<? extends Msg> list) {
        j5g.V0(list, 3, 2, true, new x50(29));
        return list;
    }
}
