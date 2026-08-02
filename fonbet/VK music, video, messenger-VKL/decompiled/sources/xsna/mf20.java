package xsna;

import android.util.SparseArray;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: MessagesHistoryStorage.kt */
/* loaded from: classes2.dex */
public interface mf20 {
    lj30 A(Peer peer, gkx0 gkx0Var);

    void B0(int i, int i2, Peer peer);

    SparseArray<Msg> C(Collection<Integer> collection);

    uz50 C0(int i, Peer peer);

    List<Msg> D0(Peer peer, gkx0 gkx0Var, gkx0 gkx0Var2, int i);

    void E0(int i, gkx0 gkx0Var);

    SparseArray<Msg> F(Collection<Integer> collection, List<? extends MsgSyncState> list);

    void F0(int i, gkx0 gkx0Var);

    void H0(List<? extends Msg> list);

    gkx0 J(int i);

    void J0(Peer peer, gkx0 gkx0Var, gkx0 gkx0Var2, Integer num);

    Msg L(int i);

    SparseArray<Msg> T(Collection<Integer> collection);

    void X(int i, boolean z);

    void g0(int i, Peer peer, boolean z);

    Integer h(Peer peer, gkx0 gkx0Var);

    void j0(Peer peer, boolean z);

    SparseArray<Msg> m0(Peer peer, Collection<Integer> collection);

    ArrayList n(Peer peer, gkx0 gkx0Var, Direction direction, int i);

    yj30 q(Peer peer);

    void x(int i, boolean z);

    lj30 y(int i, Peer peer);
}
