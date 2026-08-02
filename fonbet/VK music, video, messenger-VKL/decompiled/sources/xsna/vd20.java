package xsna;

import com.vk.api.generated.messages.dto.MessagesDeleteFullResponseItemDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MessagesDeleteApiCmd.kt */
/* loaded from: classes2.dex */
public final class vd20 extends nx2<List<? extends MessagesDeleteFullResponseItemDto>> {
    public final UserId b;
    public final ArrayList c;
    public final boolean d;
    public final boolean e;
    public final Integer f;
    public final Peer g;

    public vd20(UserId userId, ArrayList arrayList, boolean z, boolean z2, Integer num, Peer peer) {
        this.b = userId;
        this.c = arrayList;
        this.d = z;
        this.e = z2;
        this.f = num;
        this.g = peer;
    }

    @Override // xsna.nx2
    public final List<? extends MessagesDeleteFullResponseItemDto> f(l7r0 l7r0Var) {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return EmptyList.b;
        }
        Peer peer = this.g;
        peer.getClass();
        UserId userId = peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null;
        tfx tfxVar = new tfx("messages.delete", new ar(24), new br(24));
        tfxVar.j("spam", this.e);
        Integer num = this.f;
        if (num != null) {
            tfx.l(tfxVar, "reason", num.intValue(), 0, 0, 8);
        }
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
            tfxVar = tfxVar;
        }
        tfxVar.j("delete_for_all", this.d);
        UserId userId2 = this.b;
        if (userId2 != null) {
            tfx.n(tfxVar, "peer_id", userId2, 0L, 0L, 12);
        }
        if (arrayList != null) {
            tfxVar.i("cmids", arrayList);
        }
        return (List) bz2.l(tfxVar, false);
    }
}
