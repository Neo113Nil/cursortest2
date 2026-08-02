package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationMemberDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationMembersDto;
import com.vk.api.generated.messages.dto.MessagesIncognitoMemberDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.exceptions.chat.ChatNotExistsException;
import com.vk.im.engine.models.dialogs.DialogMember;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MessagesGetConversationMembersApiCmd.kt */
/* loaded from: classes2.dex */
public final class oe20 extends nx2<urb> {
    public final Peer b;
    public final Peer c;
    public final List<Peer> d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final int h;

    public oe20(Peer peer, Peer peer2, List list, boolean z, boolean z2, String str, int i) {
        list = (i & 4) != 0 ? null : list;
        z2 = (i & 16) != 0 ? false : z2;
        str = (i & 32) != 0 ? null : str;
        this.b = peer;
        this.c = peer2;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = str;
        this.h = 300;
    }

    @Override // xsna.nx2
    public final urb f(l7r0 l7r0Var) {
        Throwable apiAccessDeniedException;
        try {
            return g();
        } catch (VKApiExecutionException e) {
            if (e.P()) {
                com.vk.metrics.eventtracking.b.a.a(e);
                apiAccessDeniedException = new ApiAccessDeniedException(e);
            } else {
                if (!e.Q()) {
                    throw e;
                }
                com.vk.metrics.eventtracking.b.a.a(e);
                apiAccessDeniedException = new ChatNotExistsException(e);
            }
            throw apiAccessDeniedException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final urb g() {
        ArrayList arrayList;
        Peer peer;
        String str;
        Boolean n;
        Object obj;
        List<Peer> list;
        List<Peer> list2;
        boolean z = this.f;
        int i = this.h;
        List<Peer> list3 = this.d;
        vg20 vg20Var = new vg20();
        ArrayList arrayList2 = new ArrayList();
        UserId userId = new UserId(this.b.b);
        Peer peer2 = this.c;
        peer2.getClass();
        UserId userId2 = peer2.Ab(Peer.Type.GROUP) ? new UserId(peer2.d) : null;
        Integer valueOf = Integer.valueOf(i);
        if (z || ((list2 = list3) != null && !list2.isEmpty())) {
            valueOf = null;
        }
        Integer valueOf2 = (z && ((list = list3) == null || list.isEmpty())) ? Integer.valueOf(i) : null;
        String str2 = this.g;
        if (list3 != null) {
            List<Peer> list4 = list3;
            ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                long j = ((Peer) it.next()).b;
                gzs<s3q0> gzsVar = fkq0.a;
                dq.h(j, arrayList3);
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        MessagesGetConversationMembersDto messagesGetConversationMembersDto = (MessagesGetConversationMembersDto) bz2.l(sg20.h(vg20Var, userId, valueOf, null, null, userId2, arrayList, str2, valueOf2, 442), this.e);
        for (MessagesConversationMemberDto messagesConversationMemberDto : messagesGetConversationMembersDto.e()) {
            Peer a = com.vk.dto.common.a.a(messagesConversationMemberDto.i());
            UserId f = messagesConversationMemberDto.f();
            if (f == null || (peer = com.vk.dto.common.a.a(f)) == null) {
                peer = Peer.Unknown.e;
            }
            Peer peer3 = peer;
            Integer g = messagesConversationMemberDto.g();
            boolean z2 = false;
            long intValue = ((g == null && (g = messagesConversationMemberDto.j()) == null) ? 0 : g.intValue()) * 1000;
            Boolean l = messagesConversationMemberDto.l();
            boolean booleanValue = l != null ? l.booleanValue() : false;
            Integer e = messagesConversationMemberDto.e();
            List<MessagesIncognitoMemberDto> d = messagesGetConversationMembersDto.d();
            Integer e2 = messagesConversationMemberDto.e();
            if (e2 != null) {
                int intValue2 = e2.intValue();
                if (d != null) {
                    Iterator<T> it2 = d.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((MessagesIncognitoMemberDto) obj).getId() == intValue2) {
                            break;
                        }
                    }
                    MessagesIncognitoMemberDto messagesIncognitoMemberDto = (MessagesIncognitoMemberDto) obj;
                    if (messagesIncognitoMemberDto != null) {
                        str = messagesIncognitoMemberDto.d();
                        Boolean k = messagesConversationMemberDto.k();
                        boolean booleanValue2 = k == null ? k.booleanValue() : false;
                        Boolean d2 = messagesConversationMemberDto.d();
                        boolean booleanValue3 = d2 == null ? d2.booleanValue() : false;
                        n = messagesConversationMemberDto.n();
                        if (n == null) {
                            z2 = n.booleanValue();
                        }
                        arrayList2.add(new DialogMember(a, peer3, intValue, booleanValue, e, str, booleanValue2, booleanValue3, z2));
                    }
                }
            }
            str = null;
            Boolean k2 = messagesConversationMemberDto.k();
            if (k2 == null) {
            }
            Boolean d22 = messagesConversationMemberDto.d();
            if (d22 == null) {
            }
            n = messagesConversationMemberDto.n();
            if (n == null) {
            }
            arrayList2.add(new DialogMember(a, peer3, intValue, booleanValue, e, str, booleanValue2, booleanValue3, z2));
        }
        return new urb(new ohm(arrayList2), arrayList2.size(), messagesGetConversationMembersDto.f());
    }
}
