package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ContainsRecentlyFailedMsgCmd.kt */
/* loaded from: classes2.dex */
public final class cfj extends le6<Map<Long, ? extends Boolean>> {
    public static final List<MsgSyncState> c = Collections.singletonList(MsgSyncState.ERROR);
    public final ArrayList b;

    public cfj(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.le6
    public final Map<Long, ? extends Boolean> e(w2w w2wVar) {
        d040 o = w2wVar.I0().o();
        long f1 = w2wVar.f1() - w2wVar.getConfig().o;
        w2wVar.getConfig().getClass();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((Peer) it.next()).b));
        }
        return o.d0(arrayList2, c, f1, 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfj) && epx.f(this.b, ((cfj) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ContainsRecentlyFailedMsgCmd(dialogs="), this.b);
    }
}
