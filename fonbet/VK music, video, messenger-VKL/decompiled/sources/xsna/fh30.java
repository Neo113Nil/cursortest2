package xsna;

import android.util.ArraySet;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Direction;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: MsgAttachStorageManager.kt */
/* loaded from: classes2.dex */
public interface fh30 {
    List E(int i, long j, Long l);

    void K0(int i, long j, boolean z);

    ArrayList N(long j, int i, int i2, Long l);

    List O(long j);

    Collection U(long j, long j2, long j3);

    List<Msg> Y(Class<? extends Attach> cls, UserId userId, Long l);

    ArraySet Z(UserId userId, Collection collection);

    Attach b(int i);

    Integer e0(int i);

    List<Msg> g(Collection<Integer> collection);

    List<Msg> k0(int i, UserId userId, Long l);

    List<Attach> r(long j, int i, int i2, Direction direction, List<Integer> list);

    Msg v(int i);
}
