package xsna;

import com.vk.api.generated.messages.dto.MessagesSetMemberRoleRoleDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import java.util.NoSuchElementException;

/* compiled from: MessagesSetChatMemberRoleApiCmd.kt */
/* loaded from: classes2.dex */
public final class xg20 extends nx2<Boolean> {
    public final Peer b;
    public final Peer c;
    public final String d;
    public final Peer e;
    public final boolean f;

    public xg20(Peer peer, Peer peer2, String str, Peer peer3, boolean z) {
        this.b = peer;
        this.c = peer2;
        this.d = str;
        this.e = peer3;
        this.f = z;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        long j = this.b.b;
        UserId b = com.vk.dto.common.a.b(this.c);
        UserId d = fto0.d(this.e);
        MessagesSetMemberRoleRoleDto[] values = MessagesSetMemberRoleRoleDto.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            MessagesSetMemberRoleRoleDto messagesSetMemberRoleRoleDto = values[i];
            if (brm0.w(messagesSetMemberRoleRoleDto.i(), this.d, true)) {
                tfx tfxVar = new tfx("messages.setMemberRole", new l4(26), new nq(18));
                tfx.m(tfxVar, "peer_id", j, 0L, 12);
                tfx.n(tfxVar, "member_id", b, 0L, 0L, 12);
                if (d != null) {
                    tfx.n(tfxVar, "group_id", d, 0L, 0L, 8);
                }
                tfx.o(tfxVar, "role", messagesSetMemberRoleRoleDto.i(), 0, 0, 12);
                bz2.l(tfxVar, this.f);
                return Boolean.TRUE;
            }
            i++;
            b = b;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
