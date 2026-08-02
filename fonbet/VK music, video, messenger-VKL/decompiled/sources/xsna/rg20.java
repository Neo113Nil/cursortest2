package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.messages.dto.MessagesConversationMemberDto;
import com.vk.api.generated.messages.dto.MessagesSearchConversationMembersResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.DialogMember;
import java.util.ArrayList;

/* compiled from: MessagesSearchConversationMembersApiCmd.kt */
/* loaded from: classes2.dex */
public final class rg20 extends nx2<urb> {
    public final Peer b;
    public final String c;
    public final Integer d;
    public final Peer e;
    public final boolean f;

    public rg20(Peer peer, String str, Integer num, Peer peer2, boolean z) {
        this.b = peer;
        this.c = str;
        this.d = num;
        this.e = peer2;
        this.f = z;
        if (str.length() <= 0) {
            throw new IllegalStateException("Query request was empty");
        }
    }

    @Override // xsna.nx2
    public final urb f(l7r0 l7r0Var) {
        Peer peer;
        ArrayList arrayList = new ArrayList();
        long j = this.b.b;
        Peer peer2 = this.e;
        peer2.getClass();
        UserId userId = peer2.Ab(Peer.Type.GROUP) ? new UserId(peer2.d) : null;
        tfx tfxVar = new tfx("messages.searchConversationMembers", new vr(21), new wr(26));
        tfx.m(tfxVar, "peer_id", j, 0L, 12);
        tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, this.c, 0, 96, 4);
        Integer num = this.d;
        if (num != null) {
            tfxVar.f(num.intValue(), 1, 200, "count");
        }
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
            tfxVar = tfxVar;
        }
        for (MessagesConversationMemberDto messagesConversationMemberDto : ((MessagesSearchConversationMembersResponseDto) bz2.l(tfxVar, this.f)).d()) {
            Peer a = com.vk.dto.common.a.a(messagesConversationMemberDto.i());
            UserId f = messagesConversationMemberDto.f();
            if (f == null || (peer = com.vk.dto.common.a.a(f)) == null) {
                peer = Peer.Unknown.e;
            }
            Peer peer3 = peer;
            Integer g = messagesConversationMemberDto.g();
            boolean z = false;
            long intValue = ((g == null && (g = messagesConversationMemberDto.j()) == null) ? 0 : g.intValue()) * 1000;
            Boolean l = messagesConversationMemberDto.l();
            boolean booleanValue = l != null ? l.booleanValue() : false;
            Integer e = messagesConversationMemberDto.e();
            Boolean k = messagesConversationMemberDto.k();
            boolean booleanValue2 = k != null ? k.booleanValue() : false;
            Boolean d = messagesConversationMemberDto.d();
            boolean booleanValue3 = d != null ? d.booleanValue() : false;
            Boolean n = messagesConversationMemberDto.n();
            if (n != null) {
                z = n.booleanValue();
            }
            arrayList.add(new DialogMember(a, peer3, intValue, booleanValue, e, null, booleanValue2, booleanValue3, z, 32, null));
        }
        return new urb(new ohm(arrayList), arrayList.size(), null);
    }
}
