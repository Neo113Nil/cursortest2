package xsna;

import com.vk.api.generated.messages.dto.MessagesDeleteConversationResponseDto;
import com.vk.api.generated.messages.dto.MessagesDeleteConversationSourceDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: MessagesDeleteConversationApiCmd.kt */
/* loaded from: classes2.dex */
public final class xd20 extends nx2<Integer> {
    public final Peer b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Peer f;
    public final MessagesDeleteConversationSourceDto g;

    public xd20(Peer peer, boolean z, boolean z2, boolean z3, Peer peer2, MessagesDeleteConversationSourceDto messagesDeleteConversationSourceDto) {
        this.b = peer;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = peer2;
        this.g = messagesDeleteConversationSourceDto;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r15.r().h.p() != false) goto L19;
     */
    @Override // xsna.nx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer f(l7r0 l7r0Var) {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        boolean z = true;
        if (a1wVar.r().h.p()) {
            if (this.d) {
                a1w a1wVar2 = q1w.a;
                if (a1wVar2 == null) {
                    a1wVar2 = null;
                }
            }
            z = false;
        }
        UserId userId = new UserId(this.b.b);
        boolean z2 = this.c;
        Peer peer = this.f;
        peer.getClass();
        UserId userId2 = peer.Ab(Peer.Type.GROUP) ? new UserId(this.f.d) : null;
        MessagesDeleteConversationSourceDto messagesDeleteConversationSourceDto = this.g;
        tfx tfxVar = new tfx("messages.deleteConversation", new io.reactivex.rxjava3.internal.operators.mixed.j(20), new io.reactivex.rxjava3.internal.operators.mixed.k(24));
        tfx.n(tfxVar, "peer_id", userId, 0L, 0L, 12);
        if (userId2 != null) {
            tfx.n(tfxVar, "group_id", userId2, 0L, 0L, 8);
        }
        tfxVar.j("is_spam", z2);
        tfxVar.j("leave_chat", z);
        if (messagesDeleteConversationSourceDto != null) {
            tfx.o(tfxVar, "source", messagesDeleteConversationSourceDto.i(), 0, 0, 12);
        }
        return Integer.valueOf(((MessagesDeleteConversationResponseDto) bz2.l(tfxVar, this.e)).d());
    }
}
