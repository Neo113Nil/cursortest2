package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.messages.dto.MessagesAddChatUserResponseDto;
import com.vk.api.generated.messages.dto.MessagesAddChatUserSourceDto;
import com.vk.api.generated.messages.dto.MessagesGetInviteLinkResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.user.ImAddChatUserSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: AddChatMembersCompoundRequest.kt */
/* loaded from: classes2.dex */
public final class yk0 extends awi<a> {
    public final Peer s;
    public final ArrayList t;
    public final List<String> u;
    public final int v;
    public final ImAddChatUserSource w;
    public final boolean x;

    /* compiled from: AddChatMembersCompoundRequest.kt */
    public static final class a {
        public final List<Long> a;
        public final String b;
        public final ArrayList c;

        public a(String str, ArrayList arrayList, List list) {
            this.a = list;
            this.b = str;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(invitees=");
            sb.append(this.a);
            sb.append(", link=");
            sb.append(this.b);
            sb.append(", failedMembers=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }
    }

    public yk0(Peer peer, ArrayList arrayList, List list, int i, ImAddChatUserSource imAddChatUserSource, boolean z) {
        this.s = peer;
        this.t = arrayList;
        this.u = list;
        this.v = i;
        this.w = imAddChatUserSource;
        this.x = z;
        if (!peer.zb()) {
            throw new IllegalStateException(("Passed peer required to be chat (peer=" + peer + ')').toString());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Peer peer2 = (Peer) it.next();
            peer2.getClass();
            if (!peer2.Ab(Peer.Type.USER) && !peer2.Ab(Peer.Type.CONTACT)) {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        MessagesAddChatUserSourceDto messagesAddChatUserSourceDto;
        Peer peer;
        dz2 x;
        MessagesAddChatUserSourceDto messagesAddChatUserSourceDto2;
        vg20 vg20Var = new vg20();
        ImAddChatUserSource imAddChatUserSource = this.w;
        if (imAddChatUserSource != null) {
            switch (kwv.$EnumSwitchMapping$0[imAddChatUserSource.ordinal()]) {
                case 1:
                    messagesAddChatUserSourceDto2 = MessagesAddChatUserSourceDto.CONTACTS;
                    break;
                case 2:
                    messagesAddChatUserSourceDto2 = MessagesAddChatUserSourceDto.CONVERSATION;
                    break;
                case 3:
                    messagesAddChatUserSourceDto2 = MessagesAddChatUserSourceDto.CREATE_CHAT;
                    break;
                case 4:
                    messagesAddChatUserSourceDto2 = MessagesAddChatUserSourceDto.OTHER;
                    break;
                case 5:
                    messagesAddChatUserSourceDto2 = MessagesAddChatUserSourceDto.PERSONAL;
                    break;
                case 6:
                    messagesAddChatUserSourceDto2 = MessagesAddChatUserSourceDto.PHONE;
                    break;
                case 7:
                    messagesAddChatUserSourceDto2 = MessagesAddChatUserSourceDto.SCREEN;
                    break;
                case 8:
                    messagesAddChatUserSourceDto2 = MessagesAddChatUserSourceDto.SEARCH;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            messagesAddChatUserSourceDto = messagesAddChatUserSourceDto2;
        } else {
            messagesAddChatUserSourceDto = null;
        }
        Peer peer2 = this.s;
        int i = (int) peer2.d;
        int i2 = this.v;
        Integer valueOf = i2 > 0 ? Integer.valueOf(i2) : null;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            boolean z = this.x;
            if (!hasNext) {
                Peer peer3 = peer2;
                if (!this.u.isEmpty()) {
                    dz2 x2 = yfb.x(sg20.i(vg20Var, i, null, valueOf, this.u, messagesAddChatUserSourceDto, 6));
                    x2.n = z;
                    x2.f(l7r0Var);
                }
                return new a(!arrayList.isEmpty() ? ((MessagesGetInviteLinkResponseDto) yfb.x(sg20.b(vg20Var, peer3.b, null, null, valueOf, 14)).f(l7r0Var)).d() : null, arrayList, EmptyList.b);
            }
            Peer peer4 = (Peer) it.next();
            try {
                peer = peer2;
                try {
                    x = yfb.x(sg20.i(vg20Var, i, new UserId(peer4.d), valueOf, null, messagesAddChatUserSourceDto, 18));
                    x.n = z;
                } catch (VKApiExecutionException e) {
                    e = e;
                    if (!e.H(981)) {
                        throw e;
                    }
                    arrayList.add(Long.valueOf(peer4.b));
                    peer2 = peer;
                }
            } catch (VKApiExecutionException e2) {
                e = e2;
                peer = peer2;
            }
            if (((MessagesAddChatUserResponseDto) x.f(l7r0Var)).d() == BaseBoolIntDto.YES) {
                peer2 = peer;
            }
            arrayList.add(Long.valueOf(peer4.b));
            peer2 = peer;
        }
    }
}
