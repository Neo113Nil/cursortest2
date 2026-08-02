package xsna;

import com.vk.api.generated.messages.dto.MessagesChangeConversationMemberRestrictionsActionDto;
import com.vk.api.generated.messages.dto.MessagesChangeConversationMemberRestrictionsResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.y120;

/* compiled from: DialogMemberRestrictionsChangeApiCmd.kt */
/* loaded from: classes2.dex */
public final class hhm extends nx2<List<? extends Long>> {
    public final Peer b;
    public final List<Peer> c;
    public final y120 d;
    public final boolean e = true;

    public hhm(Peer peer, List list, y120 y120Var) {
        this.b = peer;
        this.c = list;
        this.d = y120Var;
        if (!peer.zb()) {
            throw new IllegalStateException(("Passed peer required to be chat (peer=" + peer + ')').toString());
        }
        List<Peer> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        for (Peer peer2 : list2) {
            peer2.getClass();
            if (!peer2.Ab(Peer.Type.USER) && !peer2.Ab(Peer.Type.CONTACT) && !peer2.Ab(Peer.Type.GROUP)) {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    @Override // xsna.nx2
    public final List<? extends Long> f(l7r0 l7r0Var) {
        MessagesChangeConversationMemberRestrictionsActionDto messagesChangeConversationMemberRestrictionsActionDto;
        Long l;
        long j = this.b.b;
        List<Peer> list = this.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            long j2 = ((Peer) it.next()).b;
            gzs<s3q0> gzsVar = fkq0.a;
            dq.h(j2, arrayList);
        }
        y120 y120Var = this.d;
        if (y120Var instanceof y120.b) {
            messagesChangeConversationMemberRestrictionsActionDto = MessagesChangeConversationMemberRestrictionsActionDto.RW;
        } else {
            if (!(y120Var instanceof y120.a)) {
                throw new NoWhenBranchMatchedException();
            }
            messagesChangeConversationMemberRestrictionsActionDto = MessagesChangeConversationMemberRestrictionsActionDto.RO;
        }
        MessagesChangeConversationMemberRestrictionsActionDto messagesChangeConversationMemberRestrictionsActionDto2 = messagesChangeConversationMemberRestrictionsActionDto;
        Integer num = null;
        y120.a aVar = y120Var instanceof y120.a ? (y120.a) y120Var : null;
        if (aVar != null && (l = aVar.a) != null) {
            num = Integer.valueOf((int) l.longValue());
        }
        Integer num2 = num;
        tfx tfxVar = new tfx("messages.changeConversationMemberRestrictions", new vq(23), new wq(24));
        tfx.m(tfxVar, "peer_id", j, 0L, 12);
        tfx.p(tfxVar, "member_ids_long", arrayList, 0L, 12);
        tfx.o(tfxVar, "action", messagesChangeConversationMemberRestrictionsActionDto2.i(), 0, 0, 12);
        if (num2 != null) {
            tfx.l(tfxVar, "for", num2.intValue(), 1, 0, 8);
        }
        List<UserId> d = ((MessagesChangeConversationMemberRestrictionsResponseDto) bz2.l(tfxVar, this.e)).d();
        ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
        Iterator<T> it2 = d.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((UserId) it2.next()).b));
        }
        return arrayList2;
    }
}
