package xsna;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: MsgStorageManager.kt */
/* loaded from: classes2.dex */
public interface d040 extends mf20, zj30, jv30, fh30, m040 {
    SparseArray<Msg> A0(long j, long j2);

    void B(int i);

    void H(long j, gkx0 gkx0Var, gkx0 gkx0Var2, MsgSyncState msgSyncState);

    SparseArray<Msg> I0(long j, Collection<Integer> collection);

    boolean M(int i, int i2, int i3, long j);

    int S(int i, long j);

    void W(Collection collection);

    void a(Collection collection);

    Integer a0(int i, long j);

    SparseArray<MsgSyncState> b0(Collection<Integer> collection);

    Integer c(long j);

    Map d0(ArrayList arrayList, Collection collection, long j, int i);

    List<Msg> f0(long j, gkx0 gkx0Var, gkx0 gkx0Var2, int i);

    boolean h0(Collection<Integer> collection);

    SparseArray i0(ArrayList arrayList);

    void j(long j, gkx0 gkx0Var, gkx0 gkx0Var2);

    void k(int i, int i2, long j);

    void m(Msg msg);

    void n0(long j);

    void o(Msg msg);

    int o0(int i, int i2, long j);

    MsgSyncState p(int i);

    void p0(long j, gkx0 gkx0Var, gkx0 gkx0Var2);

    void q0(Collection<? extends Attach> collection);

    SparseBooleanArray s(long j, ArrayList arrayList);

    void s0(Attach attach);

    Msg t0(int i, long j);

    Map u(ArrayList arrayList, Collection collection);

    List<Integer> v0(long j, List<Integer> list);

    void w(int i, long j);

    void w0(int i, long j, boolean z);

    List x0(Peer peer, Direction direction, int i);

    boolean y0(int i, long j);

    void z(int i, Boolean bool);
}
