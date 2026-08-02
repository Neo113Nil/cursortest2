package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MsgHistoryStorageManager.kt */
/* loaded from: classes2.dex */
public interface zj30 {
    lj30 G0(long j);

    Map<Long, lj30> R(Collection<Long> collection);

    uz50 e(int i, long j);

    Collection<lj30> f(long j, Collection<? extends MsgSyncState> collection);

    HashMap i();

    uz50<lj30> r0(Peer peer, gkx0 gkx0Var);

    ikx0 t(gv30 gv30Var);
}
